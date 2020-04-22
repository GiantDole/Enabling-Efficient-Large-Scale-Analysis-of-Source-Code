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
	
	//https://neo4j.com/developer/java/
	//https://neo4j.com/docs/driver-manual/1.7/sessions-transactions/
	//TODO: Integers are added as Strings to Database
	public static Integer addVertex(Vertex v, Driver driver)
	{
		VertexClass x = v.getAttributedElementClass();
		List<Attribute> attributes = x.getAttributeList();
		
		String run = "CREATE (x:" + x.getQualifiedName() + " { ";
		
		//add all attributes to properties in Cypher statement
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
			}
			else 
				value = String.valueOf(o);
			
			run += attributename + ": '" + value + "' , ";
		}
		
		//return last ","
		if (!attributes.isEmpty())
			run = run.substring(0, run.length() -2);
		
		
		//run += "id: " + v.getId() +"})";
		run += "}) RETURN ID(x)";
		
		//TODO: no exception catched
		try ( Session session = driver.session() )
        {
            /*session.writeTransaction( new TransactionWork<String>()
            {
                @Override
                public String execute( Transaction tx )
                {
                    Result result = tx.run( "CREATE (a:" + label + ")");
                    return result.single().get( 0 ).asString();
                }
            } );*/
			

			Result result = session.run(run);
			return result.single().get(0).asInt();
        }
	}
	
	public static void addEdge(Edge e, Map<Vertex, Integer> idmap, Driver driver)
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
		
		try ( Session session = driver.session() )
        {
			session.run(run);
        }
	}
	
	

}
