package config;

import java.util.ArrayList;
import java.util.List;

import GraphHandling.EdgeData;
import GraphHandling.EdgeHandler;
import GraphHandling.VertexData;

public abstract class ConnectedOrder {
	
	protected String edgeName;
	protected String label;

	public ConnectedOrder()
	{
		label = null;
	}
	
	/**
	 * This method sorts the List of directories and uses the method createEdges to create the List of EdgeData
	 * @param directories The directories on the same hierarchy level to be connected
	 * @return The edges which connect the given directories
	 */
	public abstract List<EdgeData> getEdges(List<DirectoryData> directories);
	
//	public void setFilesStartingWith(List<String> filesStartingWith)
//	{
//		this.filesStartingWith = filesStartingWith;
//	}
	
	public void setLabel(String label)
	{
		this.label = label;
	}
	
	public String getLabel()
	{
		return label;
	}
	
	protected List<EdgeData> createEdges(List<DirectoryData> directories)
	{
		if(directories.size()<2 || !(directories.get(0) instanceof Directory))
			return new ArrayList<EdgeData>();
		
		List<EdgeData> edges = new ArrayList<EdgeData>();
		VertexData previousD = null;
		
		
		for(int i=0;i<directories.size();i++)
		{
			Directory d = (Directory) directories.get(i);
			if(d.getLabel() == label)
			{
				if(previousD == null)
					previousD=d.getVertex();
				else {
					VertexData currentD = d.getVertex();
					edges.add(EdgeHandler.connectDirectoriesSameLevel(currentD, previousD, edgeName));
					previousD = currentD;
				}
			}
		}
		
		return edges;
	}
	
//	private boolean startingWith(String name)
//	{
//		if(filesStartingWith == null)
//			return true;
//		for(String s : filesStartingWith)
//		{
//			if(name.startsWith(s))
//				return true;
//		}
//		return false;
//	}
}
