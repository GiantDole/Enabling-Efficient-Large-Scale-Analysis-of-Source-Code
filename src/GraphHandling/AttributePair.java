package GraphHandling;

public class AttributePair {
	
	private String key;
	private String value;
	//Is this attribute an integer?
	private boolean integer;
	
	public AttributePair(String k, String v, boolean integer)
	{
		key = k;
		value = v;
		this.integer = integer;
	}
	
	public String getKey()
	{
		return key;
	}
	
	public String getValue()
	{
		return value;
	}
	
	public boolean getInteger()
	{
		return integer;
	}
}
