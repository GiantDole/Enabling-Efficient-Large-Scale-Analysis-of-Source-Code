package database;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;

public class DatabaseConnectorNeo4j implements AutoCloseable{

	private final Driver driver;
	
	public DatabaseConnectorNeo4j(String uri, String user, String password)
    {
        driver = GraphDatabase.driver( uri, AuthTokens.basic( user, password ) );
    }
	
	public Driver getDriver()
	{
		return driver;
	}
	
	@Override
	public void close() throws Exception {
		driver.close();
	}
}
