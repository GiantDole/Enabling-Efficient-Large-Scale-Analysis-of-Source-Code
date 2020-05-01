package database;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DatabaseThreadController{

	private List<DatabaseWriter> threads;
	private ExecutorService executor;
//	private int threadamount;
	private Class<?> databaseWriter;
	private CommandBroker broker;
	private DatabaseConnector connector;
	
	public DatabaseThreadController(Class<?> databaseWriter, CommandBroker broker, DatabaseConnector connector)
	{
		executor = Executors.newFixedThreadPool(10);
		threads = new ArrayList<DatabaseWriter>();
		this.databaseWriter = databaseWriter;	
		this.broker = broker;
		this.connector = connector;
	}

	public void addThread(int threadamount)
	{
		for(int i=0;i<threadamount;i++)
		{
			DatabaseWriter writer;
			try {
				writer = (DatabaseWriter) databaseWriter.getDeclaredConstructor(CommandBroker.class, DatabaseConnector.class).newInstance(broker, connector);
				threads.add(writer);
				executor.execute(writer);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				System.out.println("Couldn't create instance of DatabaseWriter");
				e.printStackTrace();
			}
			
		}

	}
	
	/**
	 * Waiting for every Thread to finish their run at least once
	 * Only used if one Thread exists to await it to finish, but can be later used to make sure all data is processed
	 */
	public void waitForThreads()
	{
		Object lock = new Object();
		for(DatabaseWriter thread : threads)
		{
			thread.setLock(lock);
			synchronized(lock)
			{
				try {
					lock.wait();
				} catch (InterruptedException e) {
					System.out.println("Interrupted while waiting on lock in ThreadController");
				}
			}
			thread.removeLock();
		}
	}
	
	public void close() throws Exception
	{
		executor.shutdown();
		while(!executor.awaitTermination(60, TimeUnit.SECONDS))
		{
			System.out.println("Waiting for Database writers to finish...");
		}
		
		for(DatabaseWriter thread : threads)
		{
			thread.close();
		}
	}
}
