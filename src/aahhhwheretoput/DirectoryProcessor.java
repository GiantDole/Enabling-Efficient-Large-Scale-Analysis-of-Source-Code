package aahhhwheretoput;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import GraphHandling.EdgeData;
import GraphHandling.EdgeHandler;
import GraphHandling.GraphWriter;
import GraphHandling.VertexHandler;
import code.parser.Parser;
import code.parser.ParserFactory;
import config.Config;
import config.ConnectedOrder;
import config.Directory;
import config.DirectoryData;
import config.JavaFile;
import config.TopDirectory;
import database.DatabaseFactory;
import database.DatabaseHandler;
import de.uni_koblenz.jgralab.Graph;

public class DirectoryProcessor {
	
	private TopDirectory firstDirectory;
	private Class<?> parserClass;
	private DatabaseHandler handler;
	private GraphWriter graphWriter;

	
	public DirectoryProcessor(Config config)
	{
		firstDirectory = config.getFirstDirectory();
		parserClass = ParserFactory.selectParser(config.getParser());
		handler = DatabaseFactory.selectDatabase(config.getDatabase());
		graphWriter = new GraphWriter(handler);
	}
	
	
	public void writeGraphs(int threadamount)
	{
		List<DirectoryData> directories = firstDirectory.getSuccessors();
		handler.addThread(threadamount);
		writeGraphsHelper(directories, firstDirectory);
		handler.close();
	}
	
	private void writeGraphsHelper(List<DirectoryData> directories, DirectoryData previousDirectory)
	{
		if(directories.isEmpty())
			return;
		if(directories.get(0) instanceof JavaFile)
		{
			Parser parser = null;
			try {
				//takes very long!!
				parser = (Parser) parserClass.getDeclaredConstructor().newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				System.out.println("Couldn't create new Parser instance");
				System.exit(1);
			}
			parser.parseDirectoryData(directories);
			Graph g = parser.getGraph();
			
			//if the previous Directory was a TopDirectory we will only write the Graph with no connection to any Directory
			if(previousDirectory instanceof TopDirectory)
				graphWriter.writeGraph(g);
			else
				graphWriter.writeGraph(g, previousDirectory);
		}
		else
		{
			for(DirectoryData d : directories)
			{
				List<DirectoryData> nextDirectories = d.getSuccessors();
				writeGraphsHelper(nextDirectories, d);
			}
		}
	}
	
	public void writeDirectoryStructure()
	{
		List<DirectoryData> directories = firstDirectory.getSuccessors();
		handler.addSingleThread();
		writeDirectoryStructureHelper(directories, firstDirectory);
		handler.awaitThreads();
	}
	
	private void writeDirectoryStructureHelper(List<DirectoryData> directories, DirectoryData previousDirectory)
	{
		if(directories.isEmpty())
			return;
		if(!(directories.get(0) instanceof JavaFile))
		{
			for(DirectoryData d : directories)
			{
				List<DirectoryData> nextDirectories = d.getSuccessors();
				d.setVertex(VertexHandler.createFromDirectory( (Directory) d));
				handler.writeVertex(d.getVertex());
				if(!(previousDirectory instanceof TopDirectory))
				{
					handler.writeEdge(EdgeHandler.connectDirectoriesDifferentLevel(previousDirectory, d.getVertex()));
					//System.out.println("Creating Edge from "+d.getFile().getName()+ " to "+previousDirectory.getFile().getName());
				}
				writeDirectoryStructureHelper(nextDirectories, d);
			}
			if(directories.get(0) instanceof Directory)
			{
				//Directory d = (Directory) directories.get(0);
				List<ConnectedOrder> connectedOrders = getDifferentConnectedOrders(directories);
				if(!connectedOrders.isEmpty())//&&connectedOrders!=null)
				{
					List<EdgeData> connectorEdges = new ArrayList<EdgeData>();
					for(ConnectedOrder c : connectedOrders)
					{
						List<EdgeData> addEdges = c.getEdges(directories);
						connectorEdges.addAll(addEdges);
					}
					for(EdgeData e : connectorEdges)
					{
						handler.writeEdge(e);
					}
				}
			}
		}
	}
	
	/**
	 * every directory in the same hierarchy might have different ConnectedOrders 
	 * this method returns all different ones existing
	 * @param directories
	 * @return
	 */
	private List<ConnectedOrder> getDifferentConnectedOrders(List<DirectoryData> directories)
	{
		List<ConnectedOrder> differentConnectedOrders = new ArrayList<ConnectedOrder>();
		ConnectedOrder lastOne = null;
		for(DirectoryData dirD : directories)
		{
			Directory d = (Directory) dirD;
			if(lastOne == null || !(lastOne == d.getConnectedOrder()))
			{
				lastOne = d.getConnectedOrder();
				if(lastOne!=null)
					differentConnectedOrders.add(d.getConnectedOrder());
			}
		}
		return differentConnectedOrders;
	}
}
