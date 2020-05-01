package config.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class ConfigReader {
	
	private BufferedReader config;
	
	public ConfigReader(String path)
	{

//		try {
//			f = new FileReader(path);
//		} catch (FileNotFoundException e) {
//			System.out.println("The .config File couldn't be found!");
//			System.exit(0);
//      }
		
		File f = new File(path);
		try {
			config = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(f), "UTF8"));
		} catch (UnsupportedEncodingException e) {
			System.out.println("The coding of the config File must be utf-8!");
			System.exit(0);
		} catch (FileNotFoundException e) {
			System.out.println("The config File couldn't be found!");
			System.exit(0);
		}
	}


	public Queue<String> readNextCommandQueue()
	{
		String s = readNextCommand();
		return stringtoQueue(s);
	}
	
	private String readNextCommand()
	{
		StringBuilder command = new StringBuilder();
		String line;
		try {
			while ((line = config.readLine()) != null)
			{
				if(line.isEmpty() || line.startsWith("//"))
				{
					continue;
				}
				else if(line.charAt(line.length()-1) == ';')
				{
					if(command.length() != 0)
						command.append(" ");
					command.append(line.substring(0, line.length()-1));
					return command.toString();
				}
				else
				{
					command.append(" " + line);
				}
			}
		} catch (IOException e) {
			System.out.println("File coulnd't be read!");
			System.exit(0);
		}
		return null;
	}
	
	/**
	 * 
	 * @return Next Command (Lines until next Semikolon) without the Semikolon and without WhiteSpace
	 */
	public String readNextCommandString()
	{
		return removeWhitespace(readNextCommand());
	}
	
	private String removeWhitespace(String s)
	{
		if(s == null)
			return null;
		StringBuilder x = new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)==' '))
			{
				x.append(s.charAt(i));
			}
		}
		return x.toString();
	}
	
	
	//TODO Stringbuilder statt += 
	private Queue<String> stringtoQueue(String s)
	{
		if(s==null)
			return null;
		Queue<String> ret = new LinkedList<String>();
//		String nextString = "";
//		boolean sameCommand = false;
//		for(int i=0;i<s.length();i++)
//		{
//			char c = s.charAt(i);
//			if(c == ' ' && !sameCommand)
//			{
//				if(!nextString.equals(""))
//				{
//					ret.add(nextString);
//					nextString = "";
//				}
//			}
//			else if(c != ' '){
//				if(c == ':' || c == ',')
//					sameCommand = true;
//				else
//					sameCommand = false;
//				nextString += c;
//			}
//		}
//		ret.add(nextString);	

		String next = "";
		boolean save = true;
		boolean space = false;
		boolean apostrophe = false;
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c == '"')
			{
				next +=c;
				if(apostrophe)
				{
					apostrophe = false;
					ret.add(next);
					next = "";
				}
				else
					apostrophe = true;
			}
			else if(apostrophe)
			{
				next += c;
			}
			else if(c == ' ')
			{
				space = true;
				continue;
			}
			else if(c == ':' || c == ',')
			{
				next += c;
				save = false;
				space = false;
				continue;
			}
			else 
			{
				if(space && save && !apostrophe && next!= "")
				{
					ret.add(next);
					next = "" +c;
				}
				else
				{
					next += c;
				}
				space = false;
				save = true;
			}			
		}
		if(!next.equals(""))
			ret.add(next);
		return ret;
	}
	
}
