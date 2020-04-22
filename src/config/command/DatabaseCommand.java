package config.command;

import config.Config;

public class DatabaseCommand implements Command{
	
	private String database;
	private String uri;
	private String user;
	private String password;
	
	public DatabaseCommand(String database){
		this.database = database;
		uri = "bolt://localhost:7687";
		user = "neo4j";
		password = "YesSir";
	}

	public String getDatabase() {
		return database;
	}

	@Override
	public void executeCommand(Config config) {
		config.setDatabase(this);
	}
	
	@Override
	public String toString()
	{
		return "DatabaseCommand: " + database;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
