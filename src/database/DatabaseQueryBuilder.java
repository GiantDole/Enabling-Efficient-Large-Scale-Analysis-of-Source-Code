package database;

import java.util.List;

import GraphHandling.AttributePair;
import GraphHandling.EdgeData;
import GraphHandling.VertexData;

//TODO make a DAO interface for different objects
public interface DatabaseQueryBuilder {

	public DatabaseQuery createVertexCommand(List<String> labels, List<AttributePair> attributes);
	public DatabaseQuery createVertexCommand(VertexData vertex);
	public DatabaseQuery createEdgeCommand(List<String> labels, List<AttributePair> attributes, VertexData vertex1, VertexData vertex2);
	public DatabaseQuery createEdgeCommand(EdgeData edge);
	public DatabaseQuery createIndexCommand(String label);
}
