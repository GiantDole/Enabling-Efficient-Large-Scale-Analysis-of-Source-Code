package unused_old;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;



public class DatabaseHandler implements AutoCloseable{

	private final Driver driver;
	
	public DatabaseHandler(String uri, String user, String password)
    {
        driver = GraphDatabase.driver( uri, AuthTokens.basic( user, password ) );
    }
	
	public Driver getDriver()
	{
		return driver;
	}
	
	/*public static Driver createHandler(String uri, String user, String password)
	{
		DatabaseHandler handler = new DatabaseHandler(uri, user, password);
		return handler.getDriver();
	}*/
	
	@Override
	public void close() throws Exception {
		driver.close();
	}

}
