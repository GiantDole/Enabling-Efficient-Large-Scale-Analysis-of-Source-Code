package config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import config.command.ExcludeCommand;
import config.command.NodeCommand;

public class DirectoryTreeConstructor {
	
	private Queue<NodeCommand> nodeCommands;
	private List<ExcludeCommand> excludes;
	private String fileEnding;
	
	public DirectoryTreeConstructor(Queue<NodeCommand> nodes, List<ExcludeCommand> excludes)
	{
		nodeCommands = nodes;
		this.excludes = excludes;
	}
	
	public void constructTree(Config config)
	{
		fileEnding=config.getParser().getParser();
		NodeCommand firstC = nodeCommands.element();
		String path = firstC.getPath();
		File firstFile = new File(path);
		TopDirectory firstDirectory = new TopDirectory(firstFile);
		firstC.setPath("");
		
//		firstC.getProperty().setFileName(firstFile.getName());
//		firstDir.setProperty(firstC.getProperty());
//		firstDir.setInclude(firstC.isIncludedinTree());
			
		List<DirectoryData> firstList = new ArrayList<DirectoryData>();
		firstList.add(firstDirectory);
		choosePreviousNodes(firstList, firstDirectory);
		//commandHelper(firstList);		
		
		config.setFirstDirectory(firstDirectory);
	}
	
	/**
	 * determines which nodes are the predecessors of this nodecommand in hierarchy
	 * then inserts to the nodecommand matching directories after the found predecessors through method buildNextHierarchyLevel
	 * then inserts program files if contained in the directories
	 * @param command
	 * @param previousDirectories
	 */
	private void choosePreviousNodes(List<DirectoryData> previousDirectories, TopDirectory firstDirectory)
	{
		if(nodeCommands.isEmpty())
			return;
		
		List<DirectoryData> newPreviousDirectories = new ArrayList<DirectoryData>();
		
		NodeCommand command = nodeCommands.poll();
		if(checkParent(command.getParent(), previousDirectories))
		{
			newPreviousDirectories = buildNextHierarchyLevel(command, previousDirectories);
		}
		else
		{
			newPreviousDirectories = matchPreviousDirectories(command.getParent(), firstDirectory);
			newPreviousDirectories = buildNextHierarchyLevel(command, newPreviousDirectories);
		}
		
		if(command.isoptional())
		{
//			NodeCommand optionalCommand = nodeCommands.peek();
//			List<DirectoryData> optionalPreviousDirectories = new ArrayList<DirectoryData>();
//			if(optionalCommand != null)
//			{
//				if(checkParent(optionalCommand.getParent(), previousDirectories))
//				{
//					optionalPreviousDirectories = buildNextHierarchyLevel(optionalCommand, previousDirectories);
//				}
//				else
//				{
//					optionalPreviousDirectories = matchPreviousDirectories(optionalCommand.getParent(), firstDirectory);
//					optionalPreviousDirectories = buildNextHierarchyLevel(optionalCommand, optionalPreviousDirectories);
//				}
//			}
			newPreviousDirectories.addAll(previousDirectories);
			
//			checkForProgramFiles(optionalCommand, optionalPreviousDirectories);
//			choosePreviousNodes(optionalPreviousDirectories, firstDirectory);
//			newPreviousDirectories.addAll(optionalPreviousDirectories);
		}
		
//		//previousDirectories is already updated here to newly inserted ones
//		if(command.getContainsPrograms())
//		{
//			for(DirectoryData dir : previousDirectories)
//			{
//				File[] content = dir.getFile().listFiles();
//				for(File f : content)
//				{
//					String fileName = f.getName();
//					if(fileName.contains("."))
//					{
//						String[] splitted = fileName.split("\\.");
//						if(splitted.length > 1 && splitted[splitted.length-1].compareTo(fileEnding)==0)
//						{
//							JavaFile je = new JavaFile(f);
//							dir.addElement(je);
//						}
//					}
//				}
//			}
//		}
		checkForProgramFiles(command, newPreviousDirectories);
		
		choosePreviousNodes(newPreviousDirectories, firstDirectory);
	}
	
	private void checkForProgramFiles(NodeCommand command, List<DirectoryData> previousDirectories)
	{
		//previousDirectories is already updated here to newly inserted ones
			if(command.getContainsPrograms())
			{
				for(DirectoryData dir : previousDirectories)
				{
					File[] content = dir.getFile().listFiles();
					for(File f : content)
					{
						String fileName = f.getName();
						if(fileName.contains("."))
						{
							String[] splitted = fileName.split("\\.");
							if(splitted.length > 1 && splitted[splitted.length-1].compareTo(fileEnding)==0)
							{
								JavaFile je = new JavaFile(f);
								dir.addElement(je);
							}
						}
					}
				}
			}
	}
	
	private List<DirectoryData> matchPreviousDirectories(String name, TopDirectory firstDirectory)
	{
		List<DirectoryData> matchedDirectories = new ArrayList<DirectoryData>();
		matchPreviousDirectoriesHelper(name, firstDirectory.getSuccessors(), matchedDirectories);
		return matchedDirectories;
	}
	
	private void matchPreviousDirectoriesHelper(String name, List<DirectoryData> nextSearching, List<DirectoryData> matchedDirectories)
	{
		for(DirectoryData dat  : nextSearching)
		{
			Directory dir = (Directory) dat;
			if(dir.getLabel().equals(name))
			{
				matchedDirectories.add(dir);
			}
			else
			{
				matchPreviousDirectoriesHelper(name, dir.getSuccessors(), matchedDirectories);
			}
		}
	}
	
	private List<DirectoryData> buildNextHierarchyLevel(NodeCommand command, List<DirectoryData> previousDirectories)
	{
		List<DirectoryData> nextList = new ArrayList<DirectoryData>();
		boolean include = command.isIncludedinTree();
		
		for(DirectoryData dir : previousDirectories)
		{
			String newPath = appendPath(dir.getPath(),command.getPath());
			File pathFile = new File(newPath);
			if(!checkExclusion(pathFile))
				continue;
			File[] subDirectories = pathFile.listFiles();
			if(subDirectories == null)
				continue;
			List<String> startsWith = command.fileStartsWith();
			for(File f : subDirectories)
			{
				if(!checkExclusion(f))
					continue;
				if(startsWith.isEmpty())
					setSuccessors(include, command, f, nextList, dir);
				else
					setSuccessorsStartingWith(startsWith, include, command, f, nextList, dir);
			}
		}
		
		return nextList;
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
	
	/**
	 * checks if the previous Directories match the hierarchy level of the given parent
	 * if parent is null the previously processed directories are the parent
	 * @param parent label of the parent nodes hierarchy
	 * @param previousDirectories previously processed directories
	 * @return true if the previously processed directories are the parent or the parent is null
	 */
	private boolean checkParent(String parent, List<DirectoryData> previousDirectories)
	{
		if(parent == null)
			return true;
		DirectoryData dir = previousDirectories.get(0);
		if(dir instanceof TopDirectory)
			return true;
		if(dir instanceof Directory)
		{
			if(((Directory) dir).getLabel().equals(parent))
				return true;
		}
		return false;
	}
	
	private void setSuccessorsStartingWith(List<String> startsWith, boolean include, NodeCommand nextCommand, File f, List<DirectoryData> nextList, DirectoryData dir)
	{
		for(String s : startsWith)
		{
			String compareFileName = f.getName();
			if(compareFileName.startsWith(s))
			{
				setSuccessors(include,nextCommand,f, nextList, dir);
				return;
			}
		}
	}
	
	private boolean checkExclusion(File testFile)
	{
		if(excludes.isEmpty())
			return true;
		for(ExcludeCommand e : excludes)
		{
			File excludeFile = e.getFile();
			if(excludeFile.compareTo(testFile)==0)
			{
				System.out.println("Excluding: "+ testFile.getAbsolutePath());
				return false;
			}
				
		}
		return true;
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

}
