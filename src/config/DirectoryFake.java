package config;

import java.io.File;

public class DirectoryFake extends DirectoryData{
	
	private DirectoryData predecessor;

	public DirectoryFake(File f, DirectoryData predecessor) {
		super(f);
		this.predecessor = predecessor;
	}
	
	@Override
	public void addElement(DirectoryData t) {
		predecessor.addElement(t);
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