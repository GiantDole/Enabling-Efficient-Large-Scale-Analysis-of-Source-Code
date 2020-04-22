package GraphHandling;


import java.util.ArrayList;
import java.util.List;

import config.DirectoryData;
import dao.AttributePair;
import de.uni_koblenz.jgralab.Edge;
import de.uni_koblenz.jgralab.Vertex;
import de.uni_koblenz.jgralab.schema.Attribute;
import de.uni_koblenz.jgralab.schema.EdgeClass;

public class EdgeHandler {
	
	
	public static EdgeData createFromEdge(Edge e)
	{
		EdgeClass x = e.getAttributedElementClass();
		List<Attribute> attributes = x.getAttributeList();
		String name = x.getQualifiedName();
		
		List<AttributePair> newAttributes = new ArrayList<AttributePair>();
		
		for(Attribute a:attributes)
		{
			String attributename = a.getName();
			String value = "";
			
			Object o = e.getAttribute(attributename);
			if (o instanceof Integer)
			{
				Integer i = (int) o;
				value = Integer.toString(i);

			}
			else 
			{
				value = String.valueOf(o);
				value = escapeCharacters(value);
			}
			
			newAttributes.add(new AttributePair(a.getName(),value));
		}
		
		Vertex v1 = e.getAlpha();
		Vertex v2 = e.getOmega();
		
		return new EdgeData(name, newAttributes, MappingData.getVertex(v1), MappingData.getVertex(v2));
	}
	
	
	//Label to dir
	public static EdgeData createFromDirectory(DirectoryData dir,VertexData from)
	{
		String label = dir.getEdgeLabel();
		if(label == null)
			return null;
		return new EdgeData(label, new ArrayList<AttributePair>(), from ,dir.getVertex());
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
