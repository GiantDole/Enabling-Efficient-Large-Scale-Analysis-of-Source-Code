package database;

public abstract class DatabaseWriter implements Runnable{
	
	protected CommandBroker broker;
	
	public DatabaseWriter(CommandBroker broker)
	{
		this.broker = broker;
	}
	
	public abstract void writeCommand(String command);
	public abstract void close() throws Exception;
}
