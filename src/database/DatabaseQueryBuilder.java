package database;

import java.util.List;

import GraphHandling.EdgeData;
import GraphHandling.VertexData;
import dao.AttributePair;

//TODO make a DAO interface for different objects
public interface DatabaseQueryBuilder {

	public String createVertexCommand(String label, List<AttributePair> attributes);
	public String createVertexCommand(VertexData vertex);
	public String createEdgeCommand(String label, List<AttributePair> attributes, String vertex1, String vertex2);
	public String createEdgeCommand(EdgeData edge);
}
