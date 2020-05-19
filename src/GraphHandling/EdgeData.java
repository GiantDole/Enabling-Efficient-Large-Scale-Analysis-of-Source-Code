package GraphHandling;

import java.util.List;

public class EdgeData{

	private List<AttributePair> attributePairs;
	private String name;
	private VertexData from;
	private VertexData to;
	
	public EdgeData(String name, List<AttributePair> attributes, VertexData from, VertexData to)
	{
		this.name = name;
		attributePairs = attributes;
		this.from = from;
		this.to = to;
	}

	public List<AttributePair> getAttributePairs() {
		return attributePairs;
	}

	public String getName() {
		return name;
	}

	public VertexData getFrom() {
		return from;
	}

	public VertexData getTo() {
		return to;
	}
	
	public long getFromID()
	{
		return from.getId();
	}
	
	public long getToID()
	{
		return to.getId();
	}
}