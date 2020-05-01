package config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import GraphHandling.VertexData;


public abstract class DirectoryData {


	protected File thisFile;

	List<DirectoryData> files;
	
	protected VertexData thisVertex;
	
	protected String edgeLabel;
	
//	/**
//	 * is the property of every file in the file variable
//	 * prevents creating a property instance for every directory, although a complete hierarchy level has the same one
//	 */
//	protected PropertyFormatter nextProperty;
//	
//	/**
//	 * see Description of PropertyFormatter
//	 */
//	protected ConnectedOrder nextOrder;
	
	//public abstract List<DirectoryData> getLastFiles();

	
	public DirectoryData(File f) {
		thisFile  = f;
		files = new ArrayList<DirectoryData>();
		thisVertex = null;
		edgeLabel = null;
	}
	
	public String getEdgeLabel()
	{
		return edgeLabel;
	}
	
	public void addElement(DirectoryData t) {
		files.add(t);
	}

	public VertexData getVertex() {
		return thisVertex;
	}

	public void setVertex(VertexData Vertex) {
		thisVertex = Vertex;
	}

	public List<DirectoryData> getSuccessors()
	{
		return files;
	}

	public File getFile()
	{
		return thisFile;
	}
	
	public String getPath()
	{
		return thisFile.getAbsolutePath();
	}
	
	public abstract void debugDirectoryTree(int round);
}
