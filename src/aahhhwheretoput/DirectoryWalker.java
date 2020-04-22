package aahhhwheretoput;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import GraphHandling.EdgeHandler;
import GraphHandling.GraphWriter;
import GraphHandling.VertexHandler;
import code.parser.Parser;
import code.parser.ParserFactory;
import config.Config;
import config.Directory;
import config.DirectoryData;
import config.JavaFile;
import config.TopDirectory;
import database.DatabaseFactory;
import database.DatabaseHandler;
import de.uni_koblenz.jgralab.Graph;

public class DirectoryWalker {

	private Parser parser;
	private DatabaseHandler handler;
	private GraphWriter graphWriter;
	
	public DirectoryWalker()
	{
	}
	
	public void walkDirectories(Config config)
	{
		TopDirectory firstDirectory = config.getFirstDirectory();
		List<DirectoryData> dir = firstDirectory.getSuccessors();
		parser = ParserFactory.selectParser(config.getParser());
		handler = DatabaseFactory.selectDatabase(config.getDatabase());
		graphWriter = new GraphWriter(handler);
		walkHelper(dir, firstDirectory);
		try {
			handler.close();
		} catch (Exception e) {
			System.out.println("Error while closing connection to database!");
		}
	}
	
	private void walkHelper(List<DirectoryData> directories, DirectoryData previousDirectory)
	{
		if(directories.isEmpty())
			return;
		if(directories.get(0) instanceof JavaFile)
		{
			List<char []> fileContents = new LinkedList<char []>();
			for(DirectoryData je : directories)
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
			parser.parseFiles(fileContents);
			Graph g = parser.getGraph();
			
			//if the previous Directory was a TopDirectory we will only write the Graph with no connection to any Directory
			if(previousDirectory instanceof TopDirectory)
				graphWriter.writeGraph(g);
			else
				graphWriter.writeGraph(g, previousDirectory);
		}
		else if(directories.get(0) instanceof Directory)
		{
			for(DirectoryData d : directories)
			{
				List<DirectoryData> newDirectories = d.getSuccessors();
				d.setVertex(VertexHandler.createFromDirectory((Directory) d));
				handler.writeVertex(d.getVertex());
				if(!(previousDirectory instanceof TopDirectory))
				{
					handler.writeEdge(EdgeHandler.createFromDirectory(previousDirectory, d.getVertex()));
					System.out.println("Creating Edge from "+d.getFile().getName()+ " to "+previousDirectory.getFile().getName());
				}
				walkHelper(newDirectories, d);
			}
		}
	}
}
