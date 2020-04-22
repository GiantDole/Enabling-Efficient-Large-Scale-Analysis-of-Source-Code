package dao;

public class AttributePair {
	
	private String key;
	private String value;
	
	public AttributePair(String k, String v)
	{
		key = k;
		value = v;
	}
	
	public String getKey()
	{
		return key;
	}
	
	public String getValue()
	{
		return value;
	}
}
