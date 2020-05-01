package config;

import java.io.File;

public class TopDirectory extends DirectoryData{

	public TopDirectory(File f) {
		super(f);
	}

	@Override
	public String toString()
	{
		return "File: " + thisFile.getAbsolutePath();
	}

	@Override
	public void debugDirectoryTree(int round) {
		for(DirectoryData d : files)
		{
			d.debugDirectoryTree(0);
		}
	}
}
