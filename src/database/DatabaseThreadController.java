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
	private int threadamount;
	
	public DatabaseThreadController(int threadamount)
	{
		this.threadamount = threadamount;
		executor = Executors.newFixedThreadPool(threadamount);
		threads = new ArrayList<DatabaseWriter>();
	}

	public void execute(Class<?> o, CommandBroker broker)
	{
		for(int i=0;i<threadamount;i++)
		{
			DatabaseWriter writer;
			try {
				writer = (DatabaseWriter) o.getDeclaredConstructor(CommandBroker.class).newInstance(broker);
				threads.add(writer);
				executor.execute(writer);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				System.out.println("Couldn't create instance of DatabaseWriter");
				e.printStackTrace();
			}
			
		}

	}
	
	public void close() throws Exception
	{
		executor.shutdown();
		while(!executor.awaitTermination(500, TimeUnit.MICROSECONDS))
		{
			System.out.println("Still waiting...");
		}
		
		for(DatabaseWriter thread : threads)
		{
			thread.close();
		}
	}
}
