package database;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Config;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Logging;

public class DatabaseConnectorNeo4j implements DatabaseConnector{

	private Driver driver;
	private static int connectionPoolSize = 10;

	@Override
	public void setConnection(String uri, String user, String password)
    {
		Config config = Config.builder()
				.withMaxConnectionPoolSize(connectionPoolSize)
				.withConnectionTimeout(60, TimeUnit.SECONDS)
				.withMaxTransactionRetryTime(30, TimeUnit.SECONDS)
				.withConnectionAcquisitionTimeout(90, TimeUnit.SECONDS) //must be higher than connection timeout
				//.withLogging(Logging.console(Level.FINER))				//logging to System.out
				.build();
		
        driver = GraphDatabase.driver( uri, AuthTokens.basic( user, password ) , config);
    }
	
	public Driver getDriver()
	{
		return driver;
	}
	
	public void setConnectionPoolSize(int size)
	{
		connectionPoolSize = size;
	}

	
	@Override
	public void close() throws Exception {
		driver.close();
	}
}
