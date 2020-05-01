package database;

import java.util.List;

import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;
import org.neo4j.driver.exceptions.ServiceUnavailableException;
import org.neo4j.driver.exceptions.TransientException;

public class DatabaseWriterNeo4j extends DatabaseWriter{

//	private static String uri;
//	private static String password;
//	private static String user;
	private DatabaseConnectorNeo4j connector;
	
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
			session.run(command);
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
					}
					return 1;
				}
				
			});
		}
		//network or database problem
		//driver is no longer able to establish communication
		catch(ServiceUnavailableException e) 
		{
			
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
