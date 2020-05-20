package GraphHandling;

import java.util.List;

public class VertexData{

	private List<AttributePair> attributePairs;
	private List<String> labels;
	private long id;
	
	public VertexData(List<String> labels, List<AttributePair> attributes, long id)
	{
		this.labels = labels;
		attributePairs = attributes;
		this.id = id;
	}

	public List<AttributePair> getAttributePairs() {
		return attributePairs;
	}

	public List<String> getLabels() {
		return labels;
	}

	public long getId() {
		return id;
	}
	
	public void addLabel(String label)
	{
		labels.add(label);
	}

}
