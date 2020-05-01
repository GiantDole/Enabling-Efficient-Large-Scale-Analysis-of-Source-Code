package database;

public abstract class DatabaseWriter implements Runnable{
	
	protected CommandBroker broker;
	//protected DatabaseConnector connector;
	protected Object lock = null;
	
	public DatabaseWriter(CommandBroker broker, DatabaseConnector connector)
	{
		this.broker = broker;
		//this.connector = connector;
	}
	
	public void setLock(Object lock)
	{
		this.lock = lock;
	}
	
	public void removeLock()
	{
		lock = null;
	}
	
	public abstract void writeCommand(String command);
	public abstract void close() throws Exception;
}
