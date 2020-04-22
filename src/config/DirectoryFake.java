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
}
