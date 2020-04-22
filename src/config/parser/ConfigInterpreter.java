package config.parser;


import java.util.Queue;

import config.Config;
import config.command.Command;

public class ConfigInterpreter {
	
	ConfigParser parser;
	
	public ConfigInterpreter(String path)
	{
		parser = new ConfigParser(path);
		parser.parseCommands();
	}
	
	public Config createConfig()
	{
		Queue<Command> commands = parser.getCommands();
		Config config = new Config();
		while(!commands.isEmpty())
		{
			Command c = commands.poll();
			c.executeCommand(config);
		}
		return config;
	}

	/*private DirectoryData readDirectories()
	{
		List<String> command;
		while(!((command = reader.readNextCommand()).get(0).equals("endDirectories")))
		{
			if(command.size()<3)
			{
				System.out.println("Illegal format in beginDirectories");
				System.exit(0);
			}
			
			String label = command.get(0);
			String relativePath = command.get(1);
			relativePath = formatPath(relativePath);
			
			for(DirectoryData d : lastFiles)
			{
				String filePath = d.getPath();
				String path = appendPath(filePath,relativePath);
				
				File head = new File(path);
				File[] files = head.listFiles();
				
				for(File f : files)
				{
					
				}
			}
		}
		
		return null;
	}
	
	
	private String appendPath(String path, String relativePath)
	{
		if(relativePath.charAt(0)=='\\')
		{
			return path + relativePath;
		}
		return path + '\\' + relativePath;
	}
	
	private void readRootDirectory()
	{
		List<String> command;
		command = reader.readNextCommand();
		
		if(command.size()<3)
		{
			System.out.println("Illegal format in beginDirectories");
			System.exit(0);
		}	
		
		String label = command.get(0);
		String path = command.get(1);
		
		path = formatPath(path);
		File rootFile = new File(path);
		
		root = new Directory(label, rootFile);
		readProperties(root);
	}
	
	//TODO
	private void readProperties(DirectoryData d)
	{
		
	}
	
	
	private String formatPath(String s)
	{
		if(s.charAt(0) == '\"')
		{
			return s.substring(1,s.length()-2);
		}
		
		return s;
	}

	
	private String getAndRemove(List<String> list)
	{
		String s = list.get(0);
		list.remove(0);
		return s;
	}*/
}
