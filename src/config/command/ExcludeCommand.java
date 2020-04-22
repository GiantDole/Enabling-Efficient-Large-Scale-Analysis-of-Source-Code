package config.command;

public class ExcludeCommand {

	private String path;
	
	public ExcludeCommand()
	{
		path = null;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public boolean checkValidity()
	{
		if(path == null)
			return true;
		return false;
	}
}
