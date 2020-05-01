package config;

import java.util.ArrayList;
import java.util.List;

import GraphHandling.AttributePair;

public class StandardPropertyFormatter extends PropertyFormatter{

	private String propertyKey;
	
	public StandardPropertyFormatter(String propertyKey)
	{
		this.propertyKey = propertyKey;
	}
	
	@Override
	public List<AttributePair> getProperties(String filename) {
		List<AttributePair> x = new ArrayList<AttributePair>();
		x.add(new AttributePair(propertyKey, filename, false));
		return x;
	}

}
