package database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import GraphHandling.AttributePair;
import GraphHandling.EdgeData;
import GraphHandling.VertexData;

//TODO: maybe another interface managing Handler and ThreadController?
public class DatabaseHandler {
	
	private DatabaseQueryBuilder language;
	//private DatabaseWriter database;
//	private StringBuilder cummulatedVertexCommand;
//	private StringBuilder cummulatedEdgeCommand;
	private List<DatabaseQuery> cummulatedCommands;
	private CommandBroker broker;
	private DatabaseThreadController threadPool;
	
	//private List<String> indexListDone = new ArrayList<String>();
	
	//TODO: rename to DatabaseController?
	public DatabaseHandler(DatabaseQueryBuilder language, CommandBroker broker, DatabaseThreadController pool)
	{
		//this.database = database;
		this.language = language;
//		cummulatedVertexCommand = new StringBuilder();
//		cummulatedEdgeCommand = new StringBuilder();
		cummulatedCommands = new ArrayList<>();
		this.broker = broker;
		threadPool = pool;
	}
	
	//This method is added so we don't have to handle Exceptions in every other method
//	private void addVertexToBroker(String command)
//	{
//		try {
//			broker.putVertexCommand(command);
//		} catch (InterruptedException e) {
//			System.out.println("Couldn't add Vertex command " +command);
//			e.printStackTrace();
//		}
//	}
//	
//	private void addEdgeToBroker(String command)
//	{
//		try {
//			broker.putEdgeCommand(command);
//		} catch (InterruptedException e) {
//			System.out.println("Couldn't add Edge command " +command);
//			e.printStackTrace();
//		}
//	}
	

	public void addThread(int threadamount)
	{
		threadPool.addThread(threadamount);
	}
	
	public void addSingleThread()
	{
		threadPool.addThread(1);
	}
	
	public void awaitThreads()
	{
		threadPool.waitForThreads();
	}
	
	private void addCommandsToBroker(List<DatabaseQuery> commands)
	{
		try {
			broker.putCommands(commands);
		} catch (InterruptedException e) {
			System.out.println("Couldn't add Edge command " +commands);
			e.printStackTrace();
		}
	}
	
	private void addCommandToBroker(DatabaseQuery command)
	{
		List<DatabaseQuery> list = new ArrayList<>();
		list.add(command);
		addCommandsToBroker(list);
	}
	
//	private void checkListed(String label)
//	{
//		if(!indexListDone.contains(label))
//		{
//			indexListDone.add(label);
//			addCommandToBroker(language.createIndexCommand(label));
//		}
//	}
	
	public void writeVertex(String label, List<AttributePair> attributes)
	{
		//database.writeCommand(language.createVertexCommand(label, attributes));
//		addVertexToBroker(language.createVertexCommand(label, attributes));
		addCommandToBroker(language.createVertexCommand(new ArrayList<>(Arrays.asList(label)), attributes));
//		checkListed(label);
	}
	
	public void writeVertex(List<String> labels, List<AttributePair> attributes)
	{
		addCommandToBroker(language.createVertexCommand(labels, attributes));
	}
	
	public void writeVertex(VertexData vertex)
	{
		//database.writeCommand(language.createVertexCommand(vertex));
//		addVertexToBroker(language.createVertexCommand(vertex));
		addCommandToBroker(language.createVertexCommand(vertex));
//		checkListed(vertex.getLabel());
	}
	
	public void writeVertexQueue(VertexData vertex)
	{
//		cummulatedVertexCommand.append(language.createVertexCommand(vertex));
		cummulatedCommands.add(language.createVertexCommand(vertex));
//		checkListed(vertex.getLabel());
	}
	
	public void writeEdgeQueue(EdgeData edge)
	{
//		cummulatedEdgeCommand.append(language.createEdgeCommand(edge));
		cummulatedCommands.add(language.createEdgeCommand(edge));
	}
	
	public void flushCommands()
	{
		//database.writeCommand(cummulatedVertexCommand.toString());
//		addVertexToBroker(cummulatedVertexCommand.toString());
//		cummulatedVertexCommand.setLength(0);
		//ERROR happened here:
		//as Commands were not copied the same list was used by several threads at the same time
		List<DatabaseQuery> copyOfCommands = new ArrayList<>();
		copyOfCommands.addAll(cummulatedCommands);
		addCommandsToBroker(copyOfCommands);
		List<DatabaseQuery> newList = new ArrayList<>();
		cummulatedCommands = newList;
	}
	
//	public void flushEdgeCommands()
//	{
//		//database.writeCommand(cummulatedEdgeCommand.toString());
//		addEdgeToBroker(cummulatedEdgeCommand.toString());
//		cummulatedEdgeCommand.setLength(0);
//	}
	
	public void writeEdge(String label, List<AttributePair> attributes, VertexData vertex1, VertexData vertex2)
	{
		//database.writeCommand(language.createEdgeCommand(label, attributes, vertex1, vertex2));
//		addEdgeToBroker(language.createEdgeCommand(label, attributes, vertex1, vertex2));
		addCommandToBroker(language.createEdgeCommand(new ArrayList<>(Arrays.asList(label)), attributes, vertex1, vertex2));
	}
	
	public void writeEdge(List<String> labels, List<AttributePair> attributes, VertexData vertex1, VertexData vertex2)
	{
		addCommandToBroker(language.createEdgeCommand(labels, attributes, vertex1, vertex2));
	}
	
	public void writeEdge(EdgeData edge)
	{
		//database.writeCommand(language.createEdgeCommand(edge));
//		addEdgeToBroker(language.createEdgeCommand(edge));
		addCommandToBroker(language.createEdgeCommand(edge));
	}
	
	public void close()
	{
		try {
			threadPool.close();
		} catch (Exception e) {
			System.out.println("Couldn't close Threads and Connections");
			e.printStackTrace();
		}
	}

}
