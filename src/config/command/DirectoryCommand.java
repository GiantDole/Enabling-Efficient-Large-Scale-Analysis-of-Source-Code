package config.command;

import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import config.Config;
import config.Directory;
import config.DirectoryData;
import config.DirectoryFake;
import config.JavaFile;
import config.TopDirectory;

public class DirectoryCommand implements Command{
	
	private Queue<NodeCommand> nodes;
	private List<ExcludeCommand> excludes; 
	
	public DirectoryCommand() {
		nodes = new LinkedList<NodeCommand>();
	}

	public void addNode(NodeCommand node) {
		nodes.add(node);
	}
	
	public Queue<NodeCommand> getNodes()
	{
		return nodes;
	}

	@Override
	public void executeCommand(Config config) {
		
		NodeCommand firstC = nodes.element();
		String path = firstC.getPath();
		File firstFile = new File(path);
		TopDirectory firstDir = new TopDirectory(firstFile);
		firstC.setPath("");
		
//		firstC.getProperty().setFileName(firstFile.getName());
//		firstDir.setProperty(firstC.getProperty());
//		firstDir.setInclude(firstC.isIncludedinTree());
			
		List<DirectoryData> firstList = new ArrayList<DirectoryData>();
		firstList.add(firstDir);
		config.setFirstDirectory(firstDir);
		commandHelper(firstList);		
	}
	
	private void commandHelper(List<DirectoryData> directoryList) {
		if(nodes.isEmpty())
		{
			for(DirectoryData dir : directoryList)
			{
				File[] content = dir.getFile().listFiles();
				for(File f : content)
				{
					String fileName = f.getName();
					if(fileName.contains("."))
					{
						String[] splitted = fileName.split("\\.");
						if(splitted.length > 1 && splitted[splitted.length-1].compareTo("java")==0)
						{
							JavaFile je = new JavaFile(f);
							dir.addElement(je);
						}
					}
				}
			}
			return;
		}
		
		List<DirectoryData> nextList = new ArrayList<DirectoryData>();
		NodeCommand nextCommand = nodes.poll();
		boolean include = nextCommand.isIncludedinTree();
		
		for(DirectoryData dir : directoryList)
		{
			String newPath = appendPath(dir.getPath(),nextCommand.getPath());
			File pathFile = new File(newPath);
			File[] subDirectories = pathFile.listFiles();
			if(subDirectories == null)
				continue;
			List<String> startsWith = nextCommand.fileStartsWith();
			for(File f : subDirectories)
			{
				if(startsWith.isEmpty())
					setSuccessors(include, nextCommand, f, nextList, dir);
				else
					setSuccessorsStartingWith(startsWith, include, nextCommand, f, nextList, dir);
			}
		}
		commandHelper(nextList);
	}
	
	private void setSuccessors(boolean include, NodeCommand nextCommand, File f, List<DirectoryData> nextList, DirectoryData dir)
	{
		if(include)
		{
			Directory newDir = new Directory(nextCommand.getLabel(),nextCommand.getEdgeLabel(),f);
			//TODO: set a new Property instance for the Directory; return after to outer loop
			//or same instance but providing file name to property when it's needed
			//nextCommand.getProperty().setFileName(f.getName());
			nextCommand.executeCommand(newDir);
			nextList.add(newDir);
			dir.addElement(newDir);
		}
		else
		{
			DirectoryFake newDir = new DirectoryFake(f, dir);
			nextList.add(newDir);
			dir.addElement(newDir);
		}
	}
	
	private void setSuccessorsStartingWith(List<String> startsWith, boolean include, NodeCommand nextCommand, File f, List<DirectoryData> nextList, DirectoryData dir)
	{
		for(String s : startsWith)
		{
			String compareFileName = f.getName().toLowerCase();
			if(compareFileName.startsWith(s))
			{
				setSuccessors(include,nextCommand,f, nextList, dir);
				return;
			}
		}
	}
	
	private String appendPath(String path, String relativePath)
	{
		if(relativePath == "")
			return path + '\\';
		if(relativePath.charAt(0)=='\\')
		{
			return path + relativePath;
		}
		return path + '\\' + relativePath;
	}

	public List<ExcludeCommand> getExcludes() {
		return excludes;
	}

	public void addExcludes(ExcludeCommand excludes) {
		this.excludes.add(excludes);
	}
	
	@Override
	public String toString()
	{
		String ret = "DirectoryCommand:\n";
		for(NodeCommand n : nodes)
		{
			ret += n.toString() +"\n";
		}
		return ret;
	}
	
	
//	private File getFile(NodeCommand n)
//	{
//		String path = n.getPath();
//		File f = new File(path);
//		return f;
//	}
	
}
