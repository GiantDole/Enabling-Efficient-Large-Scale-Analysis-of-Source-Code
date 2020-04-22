package database;

import java.util.List;

import GraphHandling.EdgeData;
import GraphHandling.VertexData;
import dao.AttributePair;

public class DatabaseHandler {
	
	private DatabaseQueryBuilder language;
	//private DatabaseWriter database;
	private StringBuilder cummulatedVertexCommand;
	private StringBuilder cummulatedEdgeCommand;
	private CommandBroker broker;
	private DatabaseThreadController threadPool;
	
	//TODO: rename to DatabaseController?
	public DatabaseHandler(DatabaseQueryBuilder language, CommandBroker broker, DatabaseThreadController pool)
	{
		//this.database = database;
		this.language = language;
		cummulatedVertexCommand = new StringBuilder();
		cummulatedEdgeCommand = new StringBuilder();
		this.broker = broker;
		threadPool = pool;
	}
	
	//This method is added so we don't have to handle Exceptions in every other method
	private void addVertexToBroker(String command)
	{
		try {
			broker.putVertexCommand(command);
		} catch (InterruptedException e) {
			System.out.println("Couldn't add Vertex command " +command);
			e.printStackTrace();
		}
	}
	
	private void addEdgeToBroker(String command)
	{
		try {
			broker.putEdgeCommand(command);
		} catch (InterruptedException e) {
			System.out.println("Couldn't add Edge command " +command);
			e.printStackTrace();
		}
	}
	
	public void writeVertex(String label, List<AttributePair> attributes)
	{
		//database.writeCommand(language.createVertexCommand(label, attributes));
		addVertexToBroker(language.createVertexCommand(label, attributes));
	}
	
	public void writeVertex(VertexData vertex)
	{
		//database.writeCommand(language.createVertexCommand(vertex));
		addVertexToBroker(language.createVertexCommand(vertex));
	}
	
	public void writeVertexQueue(VertexData vertex)
	{
		cummulatedVertexCommand.append(language.createVertexCommand(vertex));
	}
	
	public void writeEdgeQueue(EdgeData edge)
	{
		cummulatedEdgeCommand.append(language.createEdgeCommand(edge));
	}
	
	public void flushVertexCommands()
	{
		//database.writeCommand(cummulatedVertexCommand.toString());
		addVertexToBroker(cummulatedVertexCommand.toString());
		cummulatedVertexCommand.setLength(0);
	}
	
	public void flushEdgeCommands()
	{
		//database.writeCommand(cummulatedEdgeCommand.toString());
		addEdgeToBroker(cummulatedEdgeCommand.toString());
		cummulatedEdgeCommand.setLength(0);
	}
	
	public void writeEdge(String label, List<AttributePair> attributes, String vertex1, String vertex2)
	{
		//database.writeCommand(language.createEdgeCommand(label, attributes, vertex1, vertex2));
		addEdgeToBroker(language.createEdgeCommand(label, attributes, vertex1, vertex2));
	}
	
	public void writeEdge(EdgeData edge)
	{
		//database.writeCommand(language.createEdgeCommand(edge));
		addEdgeToBroker(language.createEdgeCommand(edge));
	}
	
	public void close() throws Exception
	{
		threadPool.close();
	}

}
