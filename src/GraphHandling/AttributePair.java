package GraphHandling;

public class AttributePair {
	
	private String key;
	private Object value;
	//Is this attribute an integer?
//	private boolean integer;
	
	public AttributePair(String k, Object v)//, boolean integer)
	{
		key = k;
		value = v;
//		this.integer = integer;
	}
	
	public String getKey()
	{
		return key;
	}
	
	public Object getValue()
	{
		return value;
	}
	
//	public boolean getInteger()
//	{
//		return integer;
//	}
}
