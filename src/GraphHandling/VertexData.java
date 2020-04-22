package GraphHandling;

import java.util.List;

import dao.AttributePair;

public class VertexData{

	private List<AttributePair> attributePairs;
	private String label;
	private int id;
	
	public VertexData(String name, List<AttributePair> attributes, int id)
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

	public int getId() {
		return id;
	}

}
