package config;

import java.io.File;
import java.util.List;

import GraphHandling.AttributePair;

public class Directory extends DirectoryData{
	
	private String label;
	//refers to the property of this directory
	private PropertyFormatter property;
	//refers to the connectedness of other directories on same hierarchy level
	private ConnectedOrder connectedOrder;
	
	public Directory(String label, String edgeLabel, File f) {
		super(f);
		this.label = label;
		this.edgeLabel = edgeLabel;
		connectedOrder = null;
		property = null;
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

	public ConnectedOrder getConnectedOrder() {
		return connectedOrder;
	}


	public void addConnectedOrder(ConnectedOrder connected) {
		connectedOrder = connected;
	}


	@Override
	public void debugDirectoryTree(int round) {
		System.out.println("");
		for(int i=0;i<=round;i++)
		{
			System.out.print("\t");
		}
		
		System.out.print(thisFile.getName());
		
		for(DirectoryData d : files)
		{
			d.debugDirectoryTree(round + 1);
		}
	}
	
}
