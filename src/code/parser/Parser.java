package code.parser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import config.DirectoryData;
import de.uni_koblenz.jgralab.Graph;

public abstract class Parser{
	


	public void parseDirectoryData(List<DirectoryData> javaFiles)
	{
		List<char []> fileContents = new LinkedList<char []>();
		for(DirectoryData je : javaFiles)
		{
			File f = je.getFile();
			String s = "";
			try {
				s = new String(Files.readAllBytes(Paths.get(f.toURI())));
			} catch (IOException e) {
				System.out.println("Couldn't read File at " + f.getAbsolutePath());
				System.exit(0);
			}
			fileContents.add(s.toCharArray());
		}
		parseFiles(fileContents);
	}
	
	public abstract void parseFiles(List<char[]> sources);
	public abstract Graph getGraph();
}
