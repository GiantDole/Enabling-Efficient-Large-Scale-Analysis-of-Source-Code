import java.util.List;
import java.util.Map;
import java.lang.Integer;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Session;
import org.neo4j.driver.Result;

import de.uni_koblenz.jgralab.Edge;
import de.uni_koblenz.jgralab.Vertex;
import de.uni_koblenz.jgralab.schema.Attribute;
import de.uni_koblenz.jgralab.schema.EdgeClass;
import de.uni_koblenz.jgralab.schema.VertexClass;


public class DatabaseHandler implements AutoCloseable{

	private final Driver driver;
	
	public DatabaseHandler( String uri, String user, String password )
    {
        driver = GraphDatabase.driver( uri, AuthTokens.basic( user, password ) );
    }
	
	public Driver getDriver()
	{
		return driver;
	}
	
	@Override
	public void close() throws Exception {
		driver.close();
	}

}
