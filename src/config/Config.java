package config;


import config.command.DatabaseCommand;
import config.command.ParseCommand;

public class Config {
	
	private DatabaseCommand database;
	private ParseCommand parser;
	private TopDirectory firstDirectory;

	public DatabaseCommand getDatabase() {
		return database;
	}

	public void setDatabase(DatabaseCommand database) {
		this.database = database;
	}

	public ParseCommand getParser() {
		return parser;
	}

	public void setParser(ParseCommand parser) {
		this.parser = parser;
	}

	public TopDirectory getFirstDirectory() {
		return firstDirectory;
	}

	public void setFirstDirectory(TopDirectory firstDirectory) {
		this.firstDirectory = firstDirectory;
	}

	@Override
	public String toString()
	{
		return "Database: "+database+", Parser: "+parser+", FirstDirectory: "+firstDirectory.toString();
	}
}
