package database;

import java.util.List;

import GraphHandling.EdgeData;
import GraphHandling.VertexData;
import dao.AttributePair;

//TODO write multiple Vertices?
public class DatabaseQueryCypher implements DatabaseQueryBuilder{

	@Override
	public String createVertexCommand(String label, List<AttributePair> attributes) {
		String query = "CREATE (x:" + label+" { ";
		
		for(AttributePair a : attributes)
		{
			query += a.getKey() +": '" + a.getValue() + "' , ";
			
		}
		query = query.substring(0, query.length()-2);
		query += " });\n";
		return query;
	}

	@Override
	public String createEdgeCommand(String label, List<AttributePair> attributes, String vertex1, String vertex2) {
		String query = "MATCH (alpha),(omega) WHERE alpha.UID='"+vertex1+"' AND omega.UID='"+vertex2
				+ "' CREATE (alpha)-[r:" + label + " { ";
		
		for(AttributePair a : attributes)
		{
			query += a.getKey() +": '" + a.getValue() + "' , ";
			
		}
		if(!attributes.isEmpty())
			query = query.substring(0, query.length()-2);
		query += " }]->(omega);\n";
		return query;
	}

	@Override
	public String createVertexCommand(VertexData vertex) {
		return createVertexCommand(vertex.getLabel(),vertex.getAttributePairs());
	}

	@Override
	public String createEdgeCommand(EdgeData edge) {
		return createEdgeCommand(edge.getName(),edge.getAttributePairs(),edge.getFromID(),edge.getToID());
	}

}
