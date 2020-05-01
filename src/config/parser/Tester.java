package config.parser;

import java.util.Queue;

import aahhhwheretoput.DirectoryProcessor;
import config.Config;

public class Tester {
	
	public static void main(String args[])
	{
		long timeStart = System.currentTimeMillis();
		
		
		String path = "D:\\Uni\\Bachelorarbeit\\TreeTest.txt";
		ConfigInterpreter cr1 = new ConfigInterpreter(path);
		Config c = cr1.createConfig();

		c.getFirstDirectory().debugDirectoryTree(0);
		
		
		DirectoryProcessor p = new DirectoryProcessor(c);
		p.writeDirectoryStructure();
		p.writeGraphs();
//		
//		ConfigReader reader = new ConfigReader(path);
//		Queue<String> c;
//		while((c=reader.readNextCommandQueue())!=null)
//		{
//			String x;
//			while((x=c.poll())!=null)
//				System.out.println(x);
//		}
		
		long timeEnd = System.currentTimeMillis(); 
		System.out.println("Verlaufszeit: " + (timeEnd - timeStart) + " Millisek.");
	}

}
