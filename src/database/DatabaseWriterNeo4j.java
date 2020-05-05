package database;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;
import org.neo4j.driver.exceptions.ServiceUnavailableException;


public class DatabaseWriterNeo4j extends DatabaseWriter{

//	private static String uri;
//	private static String password;
//	private static String user;
	private DatabaseConnectorNeo4j connector;
	private static final Logger logger = Logger.getRootLogger();
	
//	public DatabaseWriterNeo4j(String uri, String user, String password, CommandBroker broker)
//	{
//		this.uri = uri;
//		this.user = user;
//		this.password = password;
//		connector =  new DatabaseConnectorNeo4j(uri,user,password);
//		this.broker = broker;
//	}
	
	public DatabaseWriterNeo4j(CommandBroker broker, DatabaseConnector connector)
	{
		super(broker, connector);
		this.connector = (DatabaseConnectorNeo4j) connector;
	}
	
//	public static void setDatabaseConnection(String uri, String user, String password)
//	{
//		DatabaseWriterNeo4j.uri = uri;
//		DatabaseWriterNeo4j.user = user;
//		DatabaseWriterNeo4j.password = password;
//	}
	
	@Override
	public void writeCommand(String command) {
		
//		if(command.contains("in_semester"))
//		{
//			System.out.println(command);
//			try(Session session = connector.getDriver().session())
//			{
//				Result r = session.run("Match (a) WHERE a.UID='0' RETURN a");
//				System.out.println(r.single().get(0));
//			}
//		}
		
		try(Session session = connector.getDriver().session())
		{
			//session.run(command);
			try(Transaction tx = session.beginTransaction())
			{
				tx.run(command);
				tx.commit();
			}
		}
//		try(Session session = connector.getDriver().session())
//		{
//			session.writeTransaction(new TransactionWork<Integer>()
//			{
//				@Override
//				public Integer execute(Transaction tx)
//				{
//					tx.run(command);
//					
//					return 1;
//				}
//				
//			});
//		}
			
	}
	
	private List<String> getReturnValues(Result result)
	{
		List<String> returnValues = new ArrayList<String>();
		
		while(result.hasNext())
		{
			returnValues.add(result.next().get(0).asString());
		}
		
		return returnValues;
	}
	
	//https://neo4j.com/docs/driver-manual/1.7/sessions-transactions/
	//transactions are thread confined
	public void writeMultipleCommands(List<String> commands)
	{
		try(Session session = connector.getDriver().session())
		{
			session.writeTransaction(new TransactionWork<Integer>()
			{
				@Override
				public Integer execute(Transaction tx)
				{
					for(String s : commands)
					{
						tx.run(s);
						logger.info("The following command has been written: \t"+s);
					}
					return 1;
				}
				
			});
		}
		//network or database problem
		//driver is no longer able to establish communication
		catch(ServiceUnavailableException e) 
		{
			logger.error("Queries couldn't be written because of connection problems: \t" + e);
		}
		//catch any exception; retry getting session
		catch(Exception e)
		{
			logger.error("An error occured while writing to database: \t"+e);
		}
		//deadlock or memory issue
		//driver automatically retries this exception
//		catch(TransientException e)
//		{
//			
//		}
	}
	
	@Override
	public void close() throws Exception
	{
		connector.close();
	}

	@Override
	public void run() {
		List<String> data;
		//TODO: good condition?
		try {
			while ((data = broker.getNextCommandList()) != null)
			{
			    //Thread.sleep(1000);
			    //System.out.println("Consumer " + this.name + " processed data from broker: " + data);
				if(!data.isEmpty())
					writeMultipleCommands(data);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(lock != null)
		{
			synchronized(lock)
			{
				lock.notifyAll();
			}
		}
    }
	

}
