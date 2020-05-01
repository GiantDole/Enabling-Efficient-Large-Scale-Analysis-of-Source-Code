package GraphHandling;

import java.util.List;

public class VertexData{

	private List<AttributePair> attributePairs;
	private String label;
	private long id;
	
	public VertexData(String name, List<AttributePair> attributes, long id)
	{
		this.label = name;
		attributePairs = attributes;
		this.id = id;
	}

	public List<AttributePair> getAttributePairs() {
		return attributePairs;
	}

	public String getLabel() {
		return label;
	}

	public long getId() {
		return id;
	}

}
