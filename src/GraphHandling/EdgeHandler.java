package GraphHandling;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import config.DirectoryData;
import de.uni_koblenz.jgralab.Edge;
import de.uni_koblenz.jgralab.Vertex;
import de.uni_koblenz.jgralab.schema.Attribute;
import de.uni_koblenz.jgralab.schema.EdgeClass;

public class EdgeHandler {
	
	/**
	 * used to convert an Edge object programmed by Uni Essen to an EdgeData object
	 * @param e Edge object programmed by Uni Essen
	 * @return EdgeData object to write in Database
	 */
	public static EdgeData createFromEdge(Edge e)
	{
		EdgeClass x = e.getAttributedElementClass();
		List<Attribute> attributes = x.getAttributeList();
		String name = x.getQualifiedName();
		
		List<AttributePair> newAttributes = new ArrayList<AttributePair>();
		
		for(Attribute a:attributes)
		{
			String attributename = a.getName();
//			String value = "";
//			boolean integer = false;
			
			Object o = e.getAttribute(attributename);
//			if (o instanceof Integer)
//			{
//				Integer i = (int) o;
//				value = Integer.toString(i);
//				integer = true;
//			}
//			else 
//			{
//				value = String.valueOf(o);
//				value = escapeCharacters(value);
//			}
			if(o instanceof String)
			{
				o = escapeCharacters((String) o);
			}
			
			newAttributes.add(new AttributePair(attributename,o));
		}
		
		Vertex v1 = e.getAlpha();
		Vertex v2 = e.getOmega();
		
		return new EdgeData(new ArrayList<>(Arrays.asList(name)), newAttributes, MappingData.getVertex(v1), MappingData.getVertex(v2));
	}
	
	/**
	 * This method is used to connect nodes in different hierarchy levels
	 * @param dir the node in higher hierarchy level; specifies the edgeLabel
	 * @param from node in lower hierarchy level will be connected to parameter dir
	 * @return created Edge from given parameters
	 */
	public static EdgeData connectDirectoriesDifferentLevel(DirectoryData dir,VertexData from)
	{
		String label = dir.getEdgeLabel();
		if(label == null)
			return null;
		return new EdgeData(new ArrayList<>(Arrays.asList(label)), new ArrayList<AttributePair>(), from ,dir.getVertex());
	}
	
	/**
	 * This method is used to connect nodes on same hierarchy levels
	 * @param from from node
	 * @param to to node
	 * @param label label of the connected edge
	 * @return created Edge
	 */
	public static EdgeData connectDirectoriesSameLevel(VertexData from, VertexData to, String label)
	{
		return new EdgeData(new ArrayList<>(Arrays.asList(label)), new ArrayList<AttributePair>(), from, to);
	}
	
	private static String escapeCharacters(String s)
	{
		if(s.contains("'"))				
		{
			String x = "";
			for(char c : s.toCharArray())
			{
				if (c == '\'')
				{
					x += "\\\'";
				}
				else
					x += c;
			}
			return x;
		}
		else
			return s;
	}

}
