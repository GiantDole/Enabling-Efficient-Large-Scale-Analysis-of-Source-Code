package database;

import java.util.List;

import GraphHandling.AttributePair;
import GraphHandling.EdgeData;
import GraphHandling.VertexData;

//TODO make a DAO interface for different objects
public interface DatabaseQueryBuilder {

	public DatabaseQuery createVertexCommand(String label, List<AttributePair> attributes);
	public DatabaseQuery createVertexCommand(VertexData vertex);
	public DatabaseQuery createEdgeCommand(String label, List<AttributePair> attributes, long vertex1, long vertex2);
	public DatabaseQuery createEdgeCommand(EdgeData edge);
}
