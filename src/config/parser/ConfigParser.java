package config.parser;

import java.util.LinkedList;
import java.util.Queue;

import config.ConnectedOrder;
import config.ConnectedOrderFactory;
import config.PropertyFormatterFactory;
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
		Queue<String> command;
		command = reader.readNextCommandQueue();
		if(command.element().toLowerCase().contains("database"))
		{
			String nextCommand = command.poll();
			String database = splitColon(nextCommand);
			DatabaseCommand dc = new DatabaseCommand(database);
			
			while((nextCommand = command.poll()) != null)
			{
				String[] splitted = nextCommand.split(":",2);
				String input = splitted[splitted.length-1];
				switch(splitted[0].toLowerCase())
				{
				case "uri": 
					dc.setUri(input);
					break;
				case "port":
					dc.setPort(input);
					break;
				case "user":
					dc.setUser(input);
					break;
				case "password":
					dc.setPassword(input);
					break;
				default:
					System.out.println(splitted[0] + " is not a valid Database Command! Exiting program...");
					System.exit(0);		
				}
			}
			dc.createMissingParameters();
			commands.add(dc);
			command = reader.readNextCommandQueue();
		}
		else //default Database: neo4j
		{
			DatabaseCommand dc = new DatabaseCommand("neo4j");
			dc.createMissingParameters();
			commands.add(dc);
		}
		
		if(command.element().toLowerCase().contains("parser"))
		{
			String c = command.poll();
			String parser = splitColon(c);
			commands.add(new ParseCommand(parser));
			command = reader.readNextCommandQueue();
		}
		else //default Parser: java
		{
			commands.add(new ParseCommand("java"));
		}
		
		
		
		if(!(command.element().toLowerCase().contains("begindirectories")))
		{
			System.out.println("No obligatory \"beginDirectories\" command in config file!");
			System.exit(0);
		}
		
		DirectoryCommand directory = new DirectoryCommand();
		commands.add(directory);
		while(!(command = reader.readNextCommandQueue()).element().toLowerCase().contains("enddirectories"))
		{
			boolean included = isIncludedNode(command.element());			
			NodeCommand  nc = new NodeCommand(included);
			directory.addNode(nc);
			
			String nextCommand = "";
			//TODO TODO TODO
			while((nextCommand = command.poll())!=null)
			{
				String[] splitted = nextCommand.split(":",2);
				String input = splitted[splitted.length-1];
				switch(splitted[0].toLowerCase())
				{
				case "label":
				case "name":
					nc.setLabel(input);
					if(nc.getConnected()!=null)
					{
						nc.getConnected().setLabel(input);
					}
					break;
				case "path":
					nc.setPath(formatQuotationMarks(input));
					break;
				case "startswith":
					String[] splitbyComma = input.split(",");
					for(String s : splitbyComma)
					{
						nc.addFileStartingWith(formatQuotationMarks(s));
					}
//					if(nc.getConnected()!=null)
//					{
//						nc.getConnected().setFilesStartingWith(nc.getFilesStartingWith());
//					}
					break;
				case "property":
					nc.setProperty(PropertyFormatterFactory.selectFormatter(input));
					break;
				case "edgelabel":
				case "edgename":
					nc.setEdgeLabel(input);
					break;
				case "contained":
					if(input.contains("true"))
					{
						nc.setContainsPrograms();
					}
					break;
				case "parent":
					nc.setParent(input);
					break;
				case "connected":
					ConnectedOrder connected = ConnectedOrderFactory.selectOrder(input);
					if(nc.getLabel()!=null)
						connected.setLabel(nc.getLabel());
					nc.setConnected(connected);				
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
		
		
		command = reader.readNextCommandQueue();
		if(command!= null && command.element().toLowerCase().contains("beginexcludedirectories"))
		{
			
			while(!(command = reader.readNextCommandQueue()).element().toLowerCase().contains("endexcludedirectories"))
			{
				ExcludeCommand ec = new ExcludeCommand();
				directory.addExcludes(ec);
				String nextCommand = "";
				
				while((nextCommand = command.poll())!=null)
				{
					String[] splitted = nextCommand.split(":",2);
					String input = splitted[splitted.length-1];
					switch(splitted[0].toLowerCase())
					{
					case "path":
						ec.setPath(formatQuotationMarks(input));
						break;
					default:
						System.out.println("The command "+splitted[0]+" doesn't exist for the Exclude Directory Section.\n Please check your config file!");
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
		

	}
	
	private String formatQuotationMarks(String s)
	{
		if(s.charAt(0) == '\"')
		{
			return s.substring(1,s.length()-1);
		}
		return s;
//		else //given path has a predecessor
//		{
//			String[] splitted = s.split("\"",2);
//			nc.setPathPredecessor(splitted[0]);
//			nc.setPath(splitted[1].substring(0, splitted[1].length()-1));
//		}
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
