package unused_failed;

import java.util.List;

import dao.AttributePair;

public class Data {
	
	private List<AttributePair> attributePairs;
	private String name;
	
	public Data(String name, List<AttributePair> attributes)
	{
		this.name = name;
		attributePairs = attributes;
	}

	public String getName() {
		return name;
	}

	public List<AttributePair> getAttributePairs() {
		return attributePairs;
	}

}
