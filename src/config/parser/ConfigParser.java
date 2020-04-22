package config.parser;

import java.util.LinkedList;
import java.util.Queue;

import config.PropertyFactory;
import config.command.*;

public class ConfigParser {
	
	Queue<Command> commands;
	ConfigReader reader;
	
	public ConfigParser(String path)
	{
		commands = new LinkedList<Command>();
		reader = new ConfigReader(path);
	}

	public void parseCommands()
	{
		//parse optional config start containing DatabaseType and ParserType
		String command;
		command = reader.readNextCommandString();
		if(command.contains("database"))
		{
			String database = splitColon(command);
			commands.add(new DatabaseCommand(database));
			command = reader.readNextCommandString();
		}
		else //default Database: neo4j
		{
			commands.add(new DatabaseCommand("neo4j"));
		}
		
		if(command.contains("parser"))
		{
			String parser = splitColon(command);
			commands.add(new ParseCommand(parser));
			command = reader.readNextCommandString();
		}
		else //default Parser: java
		{
			commands.add(new ParseCommand("java"));
		}
		
		
		
		if(!(command.contains("begindirectories")))
		{
			System.out.println("No obligatory \"beginDirectories\" command in config file!");
			System.exit(0);
		}
		
		Queue<String> c;
		DirectoryCommand directory = new DirectoryCommand();
		commands.add(directory);
		while(!(c = reader.readNextCommandQueue()).element().contains("enddirectories"))
		{
			boolean included = isIncludedNode(c.element());			
			NodeCommand  nc = new NodeCommand(included);
			directory.addNode(nc);
			
			String nextCommand = "";
			//TODO TODO TODO
			while((nextCommand = c.poll())!=null)
			{
				String[] splitted = nextCommand.split(":",2);
				String input = splitted[splitted.length-1];
				switch(splitted[0])
				{
				case "label":
				case "name":
					nc.setLabel(input);
					break;
				case "path":
					nc.setPath(formatPath(input));
					break;
				case "startswith":
					String[] splitbyComma = input.split(",");
					for(String s : splitbyComma)
					{
						nc.addFileStartingWith(s);
					}
					break;
				case "property":
					nc.setProperty(PropertyFactory.selectFormatter(input));
					break;
				case "edgelabel":
				case "edgename":
					nc.setEdgeLabel(input);
					break;
				case "connected":
					nc.setConnected(input);
					break;
				default:
					System.out.println("The command "+splitted[0]+" doesn't exist for the Directory Section.\n Please check your config file!");
					System.exit(0);
				}
			}
			
			if(!nc.checkValidity())
			{
				System.out.println("The format of your Directories segment is incorrect! Some obligatory attributes are missing!");
				System.exit(0);
			}
		}
		
		
		command = reader.readNextCommandString();
		if(command!= null && command.contains("beginexcludes"))
		{
			ExcludeCommand ec = new ExcludeCommand();
			directory.addExcludes(ec);
			while(!(c = reader.readNextCommandQueue()).element().contains("endexcludes"))
			{
				String[] splitted = command.split(":");
				String input = splitted[splitted.length-1];
				switch(splitted[0])
				{
				case "path":
					ec.setPath(input);
					break;
				default:
					System.out.println("The command "+splitted[0]+" doesn't exist for the Excluded Section.\n Please check your config file!");
					System.exit(0);
				}
			}
			
			if(!ec.checkValidity())
			{
				System.out.println("The format of your Excludes segment is incorrect! Some obligatory attributes are missing!");
				System.exit(0);
			}
		}
		

	}
	
	private String formatPath(String s)
	{
		if(s.charAt(0) == '\"')
		{
			return s.substring(1,s.length()-1);
		}
		
		return s;
	}
	
	private boolean isIncludedNode(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				continue;
			else if(s.charAt(i)=='!')
			{
				return false;
			}
			else
				return true;
		}
		return true;
	}

	private String splitColon(String command)
	{
		String[] splitted = command.split(":");
		String ret = splitted[splitted.length-1];
		while(ret.charAt(0) == ' ')
		{
			ret = ret.substring(1);
		}
		return ret;
	}

	public Queue<Command> getCommands() {
		return commands;
	}
	
}
