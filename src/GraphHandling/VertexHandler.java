package GraphHandling;

import java.util.ArrayList;
import java.util.List;

import config.Directory;
import dao.AttributePair;
import de.uni_koblenz.jgralab.schema.Attribute;
import de.uni_koblenz.jgralab.schema.VertexClass;
import de.uni_koblenz.jgralab.Vertex;

public class VertexHandler {
	
	private static int idCounter = -1;

	public static VertexData createFromDirectory(Directory dir)
	{
		idCounter++;
		List<AttributePair> attributes = dir.getProperties();
		attributes.add(new AttributePair("UID",String.valueOf(idCounter)));
		return new VertexData(dir.getLabel(),attributes, idCounter);
	}
	
	public static VertexData createfromVertex(Vertex v)
	{
		idCounter++;
		VertexClass x = v.getAttributedElementClass();
		List<Attribute> attributes = x.getAttributeList();
		
		List<AttributePair> newAttributes = new ArrayList<AttributePair>();
		
		for(Attribute a:attributes)
		{
			String attributename = a.getName();
			String value = "";
			
			Object o = v.getAttribute(attributename);
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
		newAttributes.add(new AttributePair("UID",String.valueOf(idCounter)));
		String name = x.getQualifiedName();
		VertexData vd = new VertexData(name, newAttributes, idCounter);
		MappingData.addVertexMapping(v, vd);
		return vd;
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
