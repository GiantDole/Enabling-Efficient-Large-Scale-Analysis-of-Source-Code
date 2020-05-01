package config.command;

import config.Config;

public class DatabaseCommand implements Command{
	
	private String database;
	private String uri;
	private String user;
	private String password;
	
	public DatabaseCommand(String database){
		this.database = database;
//		uri = "bolt://localhost:"+port;//7687";
//		this.user = user;//"neo4j";
//		this.password = password;
		uri = null;
		user = null;
		password = null;
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
	
	/**
	 * if this method is used we assume the database runs on localhost with uri bolt://localhost:port
	 * if uri is already set, the port command will simply be ignored
	 * @param port port for localhost uri
	 */
	public void setPort(String port)
	{
		if(uri == null)
			uri = "bolt://localhost:"+port;
		else
			System.out.println("Database command contains uri and port; append port to uri! \nPort will be ignored.");
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
	
	
	/**
	 * sets missing parameters to standard values
	 */
	public void createMissingParameters()
	{
		if(uri == null)
		{
			uri = "bolt://localhost:7687";
		}
		if(user == null)
		{
			user = "neo4j";
		}
		if(password == null)
		{
			password = "neo4j";
		}
	}
}
