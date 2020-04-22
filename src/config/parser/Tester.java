package config.parser;

import aahhhwheretoput.DirectoryWalker;
import config.Config;

public class Tester {
	
	public static void main(String args[])
	{
		long timeStart = System.currentTimeMillis();
		
		
		String path = "D:\\Uni\\Bachelorarbeit\\Tree2.txt";
		ConfigInterpreter cr1 = new ConfigInterpreter(path);
		Config c = cr1.createConfig();

		DirectoryWalker walker = new DirectoryWalker();
		walker.walkDirectories(c);
		
		
		long timeEnd = System.currentTimeMillis(); 
		System.out.println("Verlaufszeit: " + (timeEnd - timeStart) + " Millisek.");
	}

}
