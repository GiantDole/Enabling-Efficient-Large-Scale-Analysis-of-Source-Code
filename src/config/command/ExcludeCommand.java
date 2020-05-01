package config.command;

import java.io.File;

public class ExcludeCommand {

	private String path;
	private File file;
	
	public ExcludeCommand()
	{
		path = null;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
		file = new File(path);
	}
	
	public File getFile()
	{
		return file;
	}
	
	public boolean checkValidity()
	{
		if(path == null)
			return false;
		return true;
	}
}
