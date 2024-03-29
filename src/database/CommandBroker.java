package database;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class CommandBroker {

//	private ArrayBlockingQueue<String> vertexCommandQueue = new ArrayBlockingQueue<String>(400);
//	private ArrayBlockingQueue<String> edgeCommandQueue = new ArrayBlockingQueue<String>(400);
	private ArrayBlockingQueue<List<DatabaseQuery>> commandQueue = new ArrayBlockingQueue<List<DatabaseQuery>>(1000);
	
//	public void putVertexCommand(String command) throws InterruptedException
//	{
////		String nextPoll = commandQueue.poll(1, TimeUnit.SECONDS);
////		System.out.println("nextPoll: "+ nextPoll);
//		vertexCommandQueue.put(command);
//	}
	
//	public void putEdgeCommand(String command) throws InterruptedException
//	{
//		vertexCommandQueue.put(command);
//		//edgeCommandQueue.put(command);
//	}
	
	public void putCommands(List<DatabaseQuery> commands) throws InterruptedException
	{
		commandQueue.put(commands);
	}
	
//	public synchronized String get() throws InterruptedException
//	{
//
//		if(vertexCommandQueue.isEmpty())
//		{
//			return edgeCommandQueue.poll(1, TimeUnit.SECONDS);
//		}
//		
//		return vertexCommandQueue.poll(1, TimeUnit.SECONDS);
//	}
	
	public synchronized List<DatabaseQuery> getNextCommandList() throws InterruptedException
	{
		return commandQueue.poll(1, TimeUnit.SECONDS);
	}
	
}
