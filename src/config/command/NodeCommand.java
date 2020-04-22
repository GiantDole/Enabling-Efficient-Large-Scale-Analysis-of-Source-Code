package config.command;

import java.util.LinkedList;
import java.util.List;

import config.Directory;
import config.PropertyFormatter;

public class NodeCommand {
	
	private String label;
	private String edgeLabel;
	private String path;
	private PropertyFormatter property;
	private List<String> filesStartingWith;
	private String connected;
	private boolean includedinTree;
	
	public NodeCommand(boolean included)
	{
		includedinTree = included;
		filesStartingWith = new LinkedList<String>();
		label = null;
		edgeLabel = null;
		path = null;
		property = null;
		setConnected(null);
	}
	
	public boolean isIncludedinTree() {
		return includedinTree;
	}

	public void setIncludedinTree(boolean includedinTree) {
		this.includedinTree = includedinTree;
	}

	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public List<String> fileStartsWith() {
		return filesStartingWith;
	}
	public void addFileStartingWith(String filesStartingWith) {
		this.filesStartingWith.add(filesStartingWith);
	}

	public String getEdgeLabel() {
		return edgeLabel;
	}

	public void setEdgeLabel(String edgeLabel) {
		this.edgeLabel = edgeLabel;
	}

	public PropertyFormatter getProperty() {
		return property;
	}

	public void setProperty(PropertyFormatter property) {
		this.property = property;
	}
	
	public boolean checkValidity()
	{
		if(label == null || path == null)
			return false;

		if(includedinTree && (property == null || edgeLabel == null))
			return false;
		return true;
	}

	public String getConnected() {
		return connected;
	}

	public void setConnected(String connected) {
		this.connected = connected;
	}
	
	public void executeCommand(Directory dir)
	{
		dir.setProperty(property);
		//dir.setInclude(includedinTree);
		dir.setConnected(connected);
	}
	
	@Override
	public String toString()
	{
		return "NodeCommand: "
				+ "label: "+label
				+ " edgeLabel: "+edgeLabel
				+ " path: "+path;
	}

}
