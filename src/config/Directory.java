package config;

import java.io.File;
import java.util.List;

import dao.AttributePair;

public class Directory extends DirectoryData{
	
	private String label;
	private PropertyFormatter property;
	private String connected;
	
	public Directory(String label, String edgeLabel, File f) {
		super(f);
		this.label = label;
		this.edgeLabel = edgeLabel;
	}


//	@Override
//	public List<DirectoryData> getLastFiles() {
//		
//		List<DirectoryData> ret = new ArrayList<DirectoryData>();
//		
//		if(directories.isEmpty())
//		{
//			ret.add(this);
//			return ret;
//		}
//		
//		for(DirectoryData d : directories)
//		{
//			ret.addAll(d.getLastFiles());
//		}
//		return ret;
//	}

	
	public void setProperty(PropertyFormatter property)
	{
		this.property = property;
	}
	
	public List<AttributePair> getProperties()
	{
		return property.getProperties(thisFile.getName());
	}
	
	public String getLabel()
	{
		return label;
	}

	public String getConnected() {
		return connected;
	}


	public void setConnected(String connected) {
		this.connected = connected;
	}
	
}
