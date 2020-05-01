package GraphHandling;

import java.util.ArrayList;
import java.util.List;

import config.DirectoryData;
import database.DatabaseHandler;
import de.uni_koblenz.jgralab.Edge;
import de.uni_koblenz.jgralab.Graph;
import de.uni_koblenz.jgralab.Vertex;


public class GraphWriter {
	
	private DatabaseHandler handler;
	
	public GraphWriter(DatabaseHandler handler)
	{
		this.handler = handler;
	}

	
	/**
	 * 
	 * @param g The Graph produced by a Parser
	 * @param previousDirectory The next higher node in hierarchy the (top-level vertices of a) Graph shall be connected to
	 */
	public void writeGraph(Graph g, DirectoryData previousDirectory)
	{
		List<VertexData> topVertices = writeGraphContent(g);
		
		for(VertexData v : topVertices)
		{
			EdgeData newEdge = EdgeHandler.connectDirectoriesDifferentLevel(previousDirectory, v);
			if(newEdge != null)
				handler.writeEdgeQueue(newEdge);
		}
		
		handler.flushCommands();
	}
	
	/**
	 * This method is used if solely a Graph shall be put into a database without any hierarchy or connection
	 * @param g The Graph produced by a Parser
	 */
	public void writeGraph(Graph g)
	{
		writeGraphContent(g);
		handler.flushCommands();
	}
	
	/**
	 * 
	 * @param g The Graph produced by a Parser
	 * @return All Vertices with the label "TypeDeclaration" are considered top-level vertices of a graph and shall be connected to the next higher node in hierarchy
	 */
	private List<VertexData> writeGraphContent(Graph g)
	{
//		VertexData lastVertex = lastDirectory.getVertex();
		List<VertexData> topVertices = new ArrayList<VertexData>();
		
		for(Vertex v : g.vertices())
		{
			VertexData vertex = VertexHandler.createfromVertex(v);
			handler.writeVertexQueue(vertex);
			if(vertex.getLabel().equals("TypeDeclaration"))
			{
				topVertices.add(vertex);
			}
		}
		
		for(Edge e : g.edges())
		{
			EdgeData edge = EdgeHandler.createFromEdge(e);
			handler.writeEdgeQueue(edge);
		}
		
		return topVertices;
	}
	
}
