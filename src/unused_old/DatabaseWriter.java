package unused_old;

import java.util.List;
import java.util.Map;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;

import de.uni_koblenz.jgralab.Edge;
import de.uni_koblenz.jgralab.Vertex;
import de.uni_koblenz.jgralab.schema.Attribute;
import de.uni_koblenz.jgralab.schema.EdgeClass;
import de.uni_koblenz.jgralab.schema.VertexClass;

public class DatabaseWriter {
	
	final private Driver driver;
	
	public DatabaseWriter(Driver driver)
	{
		this.driver = driver;
	}

	//TODO: create class GraphFormatHandler to translate this input in expected input for method belov
	public Integer addVertex(Vertex v) throws Exception
	{
		VertexClass x = v.getAttributedElementClass();
		List<Attribute> attributes = x.getAttributeList();
		
		String run = "CREATE (x:" + x.getQualifiedName() + " { ";
		
		//add all attributes to properties in Cypher statement
		//TODO: Escape characters in properties if it contains '
		for(Attribute a:attributes)
		{
			String attributename = a.getName();
			String value = "";
			
			//TODO: all cases covered? 
			Object o = v.getAttribute(attributename);
			if (o instanceof Integer)
			{
				Integer i = (int) o;
				value = Integer.toString(i);
				value = escapeCharacters(value);
				run += attributename + ": " + value + " , ";
			}
			else 
			{
				value = String.valueOf(o);
				value = escapeCharacters(value);
				run += attributename + ": '" + value + "' , ";
			}
			
			
		}
		
		//return last ","
		if (!attributes.isEmpty())
			run = run.substring(0, run.length() -2);
		
		
		//run += "id: " + v.getId() +"})";
		run += "}) RETURN ID(x)";
		
		return runCypherStatement(run);
	}
	
	
	/** Used for adding a Vertex which is NOT extracted out of a created Graph
	 * 
	 * @param label Node's label
	 * @param properties Node's properties in the following format:
	 * 		             exampleStringProperty: 'value'
	 *                   exampleIntegerProperty: value
	 * @return ID of node for later identification when adding an edge
	 */
	public int addVertex(String label, String[] properties) throws Exception
	{
		String run = "CREATE (x:" + label+" { ";
		
		for(int i=0;i<properties.length-1;i++)
		{
			run += properties[i] + " , ";
		}
		run += properties[properties.length-1] + " }) RETURN ID(x)";
		

		return runCypherStatement(run);

//		catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println("Vertex with label "+label+" and Properties "+properties.toString()+" couldn't be written to the database");
//			return -1;
//		}
	}
	
	/** Used for adding an Edge which is NOT extracted out of a created Graph
	 * 
	 * @param label Edge's label
	 * @param properties Edge's properties in the following format:
	 * 		             exampleStringProperty: 'value'
	 *                   exampleIntegerProperty: value
	 * @param vertex1 The "from" vertex's ID
	 * @param vertex2 The "to" vertex's ID
	 */
	public void addEdge(String label, String[] properties, String vertex1, String vertex2)
	{
		String run = "MATCH (alpha),(omega) WHERE ID(alpha)="+vertex1+" AND ID(omega)="+vertex2
		+ " CREATE (alpha)-[r:" + label + " { ";
		
		for(int i=0;i<properties.length-1;i++)
		{
			run += properties[i] + " , "; 
		}
		if(properties.length != 0)
		{
			run += properties[properties.length-1] + " }]->(omega)";
		}
		else
		{
			run += " }]->(omega)";
		}
		
		runCypherStatementWithoutReturn(run);
	}
	
	//TODO: create class GraphFormatHandler to translate this input in expected input for above method
	public void addEdge(Edge e, Map<Vertex, Integer> idmap)
	{
		EdgeClass x = e.getAttributedElementClass();
		List<Attribute> attributes = x.getAttributeList();
		
		Vertex alpha = e.getAlpha();
		Vertex omega = e.getOmega();
//		VertexClass alphaclass = alpha.getAttributedElementClass();
//		VertexClass omegaclass = omega.getAttributedElementClass();
		Integer alphaID = idmap.get(alpha);
		Integer omegaID = idmap.get(omega);
		
		String run = "MATCH (alpha),(omega) WHERE ID(alpha)="+alphaID.toString()+" AND ID(omega)="+omegaID.toString()
			+ " CREATE (alpha)-[r:" + x.getQualifiedName() + " { ";
		
		for(Attribute a:attributes)
		{
			String attributename = a.getName();
			String value = "";
			
			//TODO: all cases covered?
			Object o = e.getAttribute(attributename);
			if (o instanceof Integer)
			{
				Integer i = (int) o;
				value = Integer.toString(i);
			}
			else 
				value = String.valueOf(o);
			
			run += attributename + ": '" + value + "' , ";
		}
		
		//return last ","
		if (!attributes.isEmpty())
			run = run.substring(0, run.length() -2);
		
		run += " }]->(omega)";
		
		//TODO: maybe error because nothing is returned by neo4j?
		runCypherStatementWithoutReturn(run);
	}
	
	//https://neo4j.com/developer/java/
	//https://neo4j.com/docs/driver-manual/1.7/sessions-transactions/
	//TODO: advantages of writing via Transactions? No exception catching yet
	private int runCypherStatement(String run) throws Exception
	{
			Session session = driver.session();
  			Result result = session.run(run);
			return result.single().get(0).asInt();

	}
	
	private void runCypherStatementWithoutReturn(String run)
	{
		try ( Session session = driver.session() )
        {
			session.run(run);
        }
	}
	
	private String escapeCharacters(String s)
	{
		if(s.contains("'"))				
		{
			String x = "";
			for(char c : s.toCharArray())
			{
				if (c == '\'')
				{
					x += "\\\'";
				}
				else
					x += c;
			}
			return x;
		}
		else
			return s;
	}

}
