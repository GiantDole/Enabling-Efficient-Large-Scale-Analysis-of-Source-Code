package config;

import java.util.Comparator;
import java.util.List;

import GraphHandling.EdgeData;


/**
 * 
 * Connects a List of Nodes in the order they appear in their directory
 *
 */
public class StandardConnectedOrder extends ConnectedOrder{

	public StandardConnectedOrder(String edgeName) {
		this.edgeName = edgeName;
	}

	@Override
	public List<EdgeData> getEdges(List<DirectoryData> directories) {
		directories.sort(new Comparator<DirectoryData>() {
			
			@Override
			public int compare(DirectoryData d1, DirectoryData d2)
			{
				return d2.getFile().getName().compareTo(d1.getFile().getName());
			}
		});
		return createEdges(directories);
	}

}
