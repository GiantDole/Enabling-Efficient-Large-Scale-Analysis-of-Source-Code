package GraphHandling;

import java.util.List;

public class EdgeData{

	private List<AttributePair> attributePairs;
	private List<String> labels;
	private VertexData from;
	private VertexData to;
	
	public EdgeData(List<String> labels, List<AttributePair> attributes, VertexData from, VertexData to)
	{
		this.labels = labels;
		attributePairs = attributes;
		this.from = from;
		this.to = to;
	}

	public List<AttributePair> getAttributePairs() {
		return attributePairs;
	}

	public List<String> getLabels() {
		return labels;
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