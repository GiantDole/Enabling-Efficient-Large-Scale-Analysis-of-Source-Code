package database;

public interface DatabaseConnector extends AutoCloseable{
	
	
	void setConnection(String uri, String user, String password);
	 
	public void setConnectionPoolSize(int size);
}
