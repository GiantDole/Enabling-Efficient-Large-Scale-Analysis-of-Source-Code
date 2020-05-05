package database;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import GraphHandling.AttributePair;
import GraphHandling.EdgeData;
import GraphHandling.VertexData;



public class DatabaseQueryBuilderCypher implements DatabaseQueryBuilder{
	
	Map<Integer, String> vertexMap = new HashMap<>();

	@Override
	public String createVertexCommand(String label, List<AttributePair> attributes) {
		StringBuilder query = new StringBuilder();
		query.append("CREATE (x:");// + label+" { ");
		query.append(label);
		query.append(" { ");
		
		appendAttributes(query, attributes);
		
		query.delete(query.length()-2, query.length());
		query.append(" });\n");
		return query.toString();
	}
	
//	private String createVertexQuery(int attributeSize) {
//		StringBuilder query = new StringBuilder();
//		query.append("CREATE (x: $label");
//		query.append(" { ");
//		
//		for(int i = 0)
//		{
//			query.append(a.getKey());// +": '" + a.getValue() + "' , ");
//			query.append(": ");
//			if(!a.getInteger())
//			{
//				query.append('\'');
//				query.append(a.getValue());
//				query.append('\'');
//			}
//			else
//			{
//				query.append(a.getValue());
//			}
//			query.append(" ,");	
//		}
//		
//		query.delete(query.length()-2, query.length());
//		query.append(" });\n");
//		return query.toString();
//	}
	
//	public DatabaseQueryNeo4j createVertexCommand(String label, List<AttributePair> attributes)
//	{
//		int attributeSize = attributes.size();
//		if (vertexMap.containsKey(attributeSize))
//		{
//			Map<String, Object> params = new HashMap<>();
//			params.put("label", label);
//			for(int i = 0; i<attributeSize;i++)
//			{
//				params.put("attribute"+i, attributes.get(i));
//			}
//			return new DatabaseQueryNeo4j(vertexMap.get(attributeSize), params);
//		}
//		else
//		{
//			
//		}
//	}
	

	@Override
	public String createEdgeCommand(String label, List<AttributePair> attributes, String vertex1, String vertex2) {
		StringBuilder query = new StringBuilder();
		query.append("MATCH (alpha),(omega) WHERE alpha.UID="); //+vertex1+"' AND omega.UID='"+vertex2
				//+ "' CREATE (alpha)-[r:" + label + " { ");
		query.append(vertex1);
		query.append(" AND omega.UID=");
		query.append(vertex2);
		query.append(" CREATE (alpha)-[r:");
		query.append(label);
		query.append(" { ");
		
		appendAttributes(query, attributes);
		
		if(!attributes.isEmpty())
			query.delete(query.length()-2, query.length());
		query.append(" }]->(omega);\n");
		return query.toString();
	}
	
	private void appendAttributes(StringBuilder query, List<AttributePair> attributes)
	{
		for(AttributePair a : attributes)
		{
			query.append(a.getKey());// +": '" + a.getValue() + "' , ");
			query.append(": ");
			if(!a.getInteger())
			{
				query.append('\'');
				query.append(a.getValue());
				query.append('\'');
			}
			else
			{
				query.append(a.getValue());
			}
			query.append(" ,");	
		}
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