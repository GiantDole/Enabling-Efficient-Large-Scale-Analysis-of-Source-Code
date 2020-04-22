package GraphHandling;

import java.util.HashMap;
import java.util.Map;

import de.uni_koblenz.jgralab.Vertex;

public class MappingData {
	
	private static Map<Vertex, VertexData> vertexMap = new HashMap<Vertex,VertexData>();
	
	public static void addVertexMapping(Vertex v, VertexData vd)
	{
		vertexMap.put(v,vd);
	}
	
	public static Map<Vertex, VertexData> getVertexMapping()
	{
		return vertexMap;
	}
	
	public static VertexData getVertex(Vertex v)
	{
		return vertexMap.get(v);
	}


}
