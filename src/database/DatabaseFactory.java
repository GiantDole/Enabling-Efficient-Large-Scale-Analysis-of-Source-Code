package database;


import config.command.DatabaseCommand;

public class DatabaseFactory {

	public static DatabaseHandler selectDatabase(DatabaseCommand database)
	{
		String dname = database.getDatabase();
		dname = dname.toLowerCase();
		DatabaseHandler handler;
		switch(dname)
		{
		case "neo4j":
			DatabaseQueryCypher cypher = new DatabaseQueryCypher();
			CommandBroker broker = new CommandBroker();
			DatabaseWriterNeo4j.setDatabaseConnection(database.getUri(), database.getUser(), database.getPassword());
			//DatabaseWriterNeo4j neo4j = new DatabaseWriterNeo4j(database.getUri(), database.getUser(), database.getPassword(), broker);
			DatabaseThreadController threadPool = new DatabaseThreadController(1);
			threadPool.execute(DatabaseWriterNeo4j.class, broker);
//			threadPool.execute(new DatabaseWriterNeo4j(broker));
//			threadPool.execute(new DatabaseWriterNeo4j(broker));
			
			handler = new DatabaseHandler(cypher, broker, threadPool);
			return handler;
		default:
			System.out.println("This type of Database is not implemented!");
			System.exit(0);
		}
		
		return null;
	}
}
