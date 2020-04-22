package config;

import java.util.ArrayList;
import java.util.List;

import dao.AttributePair;

public class StandardFormatter extends PropertyFormatter{

	private String propertyKey;
	
	public StandardFormatter(String propertyKey)
	{
		this.propertyKey = propertyKey;
	}
	
	@Override
	public List<AttributePair> getProperties(String filename) {
		List<AttributePair> x = new ArrayList<AttributePair>();
		x.add(new AttributePair(propertyKey, filename));
		return x;
	}

}
