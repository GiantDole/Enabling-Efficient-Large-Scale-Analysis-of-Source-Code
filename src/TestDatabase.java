import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import org.neo4j.driver.Driver;

import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.parser.Parser;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8;
import de.uni_koblenz.jgralab.Edge;
import de.uni_koblenz.jgralab.Graph;
import de.uni_koblenz.jgralab.GraphIO;
import de.uni_koblenz.jgralab.ImplementationType;
import de.uni_koblenz.jgralab.Vertex;
import de.uni_koblenz.jgralab.exception.GraphIOException;


public class TestDatabase {
	

	//TODO: variable path input and server connection
	public static void main(String args[]) throws Exception
	{
		//get Path from User + Graph of File
		/*List<Graph> graphs = readGraphsfromTGFiles();
		if(graphs.isEmpty())
		{
			System.out.println("Please check the entered files - None of them contains a valid Graph");
			return;
		}*/
		List<char[]> sources = new LinkedList<char[]>();
		String path1 = "D:\\Uni\\Bachelorarbeit\\Beispiele\\0A163F68\\2018-10-29T20-31-26 (100 Punkte - 9040 Bytes)\\Matrix";
		String path2 = "D:\\Uni\\Bachelorarbeit\\Beispiele\\0A163F68\\2018-10-29T20-31-26 (100 Punkte - 9040 Bytes)\\Measurement";
		
		sources.add(path1.toCharArray());
		sources.add(path2.toCharArray());
		
		Parser p = new Parser();
		p.parseFiles(sources);
		
		Graph g = p.getGraph();
		//GraphIO.saveGraphToStream(graph, arg1, null);
		//GraphIO io = new GraphIO(graph.getSchema().getClass()
		//		.getClassLoader());
		
		//connect to database and create table
		try (DatabaseHandler handler = new DatabaseHandler("bolt://localhost:7687", "neo4j", "YesSir")){
			Driver driver = handler.getDriver();

				Map<Vertex, Integer> idmap = new HashMap<Vertex, Integer>();
				
				for(Vertex v : g.vertices())
				{
					//String label = getLabel(v);
					//System.out.println(label);	
					Integer vid = DatabaseWriter.addVertex(v, driver);	
					idmap.put(v, vid);
				}
				
				for(Edge e : g.edges())
				{
					//TODO: better to set a map instead of providing idmap with every call?
					DatabaseWriter.addEdge(e, idmap, driver);
				}
			
		}
		
		//loads Schema and prints Attributes of every VertexClass
		/*Schema schema = readSchema();
		GraphClass graphClass = schema.getGraphClass();
		List<VertexClass> vertexClasses = graphClass.getVertexClasses();
		int count = 1;
		for(VertexClass x:vertexClasses)
		{
			count++;
			System.out.print("\nQualifiedName: " +x.getQualifiedName());
			System.out.print(" SimpleName: "+x.getSimpleName());
			System.out.print(" Attributes: "+x.getAttributeList());
			
		}
		System.out.println(count);
		vertexClasses.g*/
	}

	//just removes the Node number
	//Example; Input: v21 SimpleName -> Output: SimpleName
	public static String getLabel(Vertex x)
	{
		String v = x.toString();
		String[] splittedString = v.split(" ");
		return splittedString[1];
	}
	
	
	public static List<Graph> readGraphsfromTGFiles()
	{
		//String pathToTgFile = "D:\\Uni\\Bachelorarbeit\\Informationen\\ast.tg";
		
		String[] pathsToTgFiles = inputPaths();

		List<Graph> graphs = new ArrayList<Graph>();
		for(int i=0;i<pathsToTgFiles.length;i++)
		{
			Graph g = null;
			String pathToTgFile = pathsToTgFiles[i];
			System.out.println(pathToTgFile);
			try {
				g = GraphIO.loadGraphFromFile(
					pathToTgFile, ImplementationType.GENERIC, null);
			} catch (GraphIOException e) {
				System.out.println(e);
				System.out.println("Graph couldn't be loaded from file " + pathToTgFile);
			}
			if(g!=null)
				graphs.add(g);
		}
		return graphs;
	}
	
	//TODO: variable path input
	/*public static Schema readSchema(String pathToTgFile)
	{
		Schema s = null;
		try {
			s = GraphIO.loadSchemaFromFile(pathToTgFile);
		} catch (GraphIOException e) {
			System.out.println("Schema couldn't be loaded from file");
		}
		return s;
	}*/
	
	public static String[] inputPaths()
	{
		
		JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		fc.setMultiSelectionEnabled(true);
		int returnValue = fc.showOpenDialog(null);
		
		String[] pathsToTgFiles = null;
		
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File[] selectedFiles = fc.getSelectedFiles();
			pathsToTgFiles = new String[selectedFiles.length];
			for(int i=0;i<pathsToTgFiles.length;i++)
			{
				pathsToTgFiles[i] = selectedFiles[i].getAbsolutePath();
			}
		}
		return pathsToTgFiles;
	}

}
