package unused_old;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import org.neo4j.driver.Driver;

import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.parser.Parser;
import de.uni_koblenz.jgralab.Edge;
import de.uni_koblenz.jgralab.Graph;
import de.uni_koblenz.jgralab.GraphIO;
import de.uni_koblenz.jgralab.ImplementationType;
import de.uni_koblenz.jgralab.Vertex;
import de.uni_koblenz.jgralab.exception.GraphIOException;


public class TestDatabase {
	
	private static DatabaseWriter writer;

	//TODO: variable path input and server connection
	public static void main(String args[]) throws Exception
	{
//		String rootDirectory = inputDirectory();
//		FileTreeWalker walker = new FileTreeWalker(rootDirectory);
//		String semester = "";
//		String miniprojekt = "";
//		String student = "";
//		List<char []> sources = new LinkedList<char []>();
		
		
		try (DatabaseHandler handler = new DatabaseHandler("bolt://localhost:7687", "neo4j", "YesSir")){
			Driver driver = handler.getDriver();
			writer = new DatabaseWriter(driver);
			Map<String, String> semesterMap = new HashMap<String, String>();
			
			//We assume the semesters are given chronologically
			//or we use a map + array and sort the array in the end and connect the semesters in the end -- DECIDED
			//or we rewrite our FileTreeWalker to return all semesters ordered chronologically at once
//			while((semester = walker.getNextSemester()) != null)
//			{
//				String[] semesterProperties = new String[1];
//				semesterProperties[0] = "semester: '"+semester+"'";
//				String semesterID = String.valueOf(writer.addVertex("Semester", semesterProperties));
//				semesterMap.put(semester, semesterID);
//
//				while((miniprojekt = walker.getNextMiniprojekt()) != null)
//				{
//					String[] mProperties = new String[1];
//					mProperties[0] = "miniprojekt: '"+miniprojekt+"'";
//					String miniprojektID = String.valueOf(writer.addVertex("Miniprojekt", mProperties));
//					writer.addEdge("TOOK_PLACE_IN_SEMESTER", new String[0], miniprojektID, semesterID);
//					
//					while((student = walker.getNextStudent()) != null)
//					{
//						String[] studentProperties = new String[1];
//						studentProperties[0] = "student: '"+student+"'";
//						String studentID = String.valueOf(writer.addVertex("Student", studentProperties));
//						writer.addEdge("RESULT_OF_PROJECT", new String[0], studentID, miniprojektID);
//						
//						while((sources = walker.getNextSubmission()) != null)
//						{
//							//TODO: make use of further properties
//							String submission = String.valueOf(sources.get(sources.size()-1));
//							sources.remove(sources.size()-1);
//							
//							Parser p = new Parser();
//							p.parseFiles(sources);
//							Graph g = p.getGraph();
//							String firstVertexID = String.valueOf(writeGraphtoDatabase(g, driver));
//							
//							String[] submissionProperties = new String[1];
//							submissionProperties[0] = "submission: '"+submission+"'";
//							String submissionID = String.valueOf(writer.addVertex("Submission", submissionProperties));
//							
//							writer.addEdge("PROGRAMMED_BY", new String[0], submissionID, studentID);
//							writer.addEdge("IS_SUBMISSION", submissionProperties, firstVertexID, submissionID);
//						}
//					
//
//
//						
//
//					}
//				}
//			}
			
			//TODO: doesn't work
			//https://mkyong.com/java/how-to-sort-a-map-in-java/
			Map<String, String> semestersSorted = new TreeMap<String, String>(
					new Comparator<String>() {
						
						@Override
						public int compare(String s1, String s2)
						{
							String split1 = splitbyS(s1);
							String split2 = splitbyS(s2);
							String compareable1 = removeuntilInt(split1);
							String compareable2 = removeuntilInt(split2);
							
							return compareable2.compareTo(compareable1);
						}
						
						private String splitbyS(String s)
						{
							String[] splitted = s.split("S");
							return splitted[splitted.length-1];
						}
						
						private String removeuntilInt(String s)
						{
							while(!Character.isDigit(s.charAt(0)))
							{
								s = s.substring(1);
							}
							return s;
						}
						
					});
		
			String lastSemesterID = null;
			for(Map.Entry<String, String> entry : semestersSorted.entrySet())
			{
				String sID = entry.getValue();
				if(lastSemesterID == null)
				{
					lastSemesterID = sID;
				}
				else {
					
					writer.addEdge("PRECEDES", new String[0], lastSemesterID, sID);
					lastSemesterID = sID;
				}
			}
//			int count = 1;
//			int total = sources.size();
//			for(String source : sources)
//			{
				//Assuming source is correct
				//f = new File(source);
				//p = new Parser();
				
//				System.out.println("Graph "+count+" of "+total+" written to database.");
//				count++;
//			}
			
		}
	}
	
	/**
	 * 
	 * @param g Graph to write
	 * @param driver driver which is connected to the database
	 * @return returns ID of first node in order to connect to "Miniprojekt" node
	 */
	public static int writeGraphtoDatabase(Graph g, Driver driver)
	{
		Map<Vertex, Integer> idmap = new HashMap<Vertex, Integer>();
		int firstID = -1;
		for(Vertex v : g.vertices())
		{
			Integer vid;
			try
			{
				vid = writer.addVertex(v);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				//TODO: provide details about node
				System.out.println("Error while writing node");
				break;
			}
			idmap.put(v, vid);
			if(firstID != -1)
				firstID = vid;
		}
		
		for(Edge e : g.edges())
		{
			writer.addEdge(e, idmap);
			//TODO: better to set a map instead of providing idmap with every call?
		}
		return firstID;
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
	
	public static Graph readGraphfromTGFile(String path)
	{
		Graph g = null;
		try {
			g = GraphIO.loadGraphFromFile(path, ImplementationType.GENERIC, null);
		} catch(GraphIOException e)
		{
			System.out.println(e);
			System.out.println("Graph couldn't be loaded from file " + path);
		}
		return g;
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
	
	public static String inputPath(){
		JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		fc.setDialogTitle("Select one or more .tg file");
		int returnValue = fc.showOpenDialog(null);
		
		String path = "";
		
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFiles = fc.getSelectedFile();
			path = selectedFiles.getAbsolutePath();
			}
		
		return path;
	}
	
	public static String inputDirectory()
	{
		
		JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		fc.setDialogTitle("Select the root directory 'Daten'");
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int returnValue = fc.showOpenDialog(null);
		
		String rootDirectory = "";
		
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fc.getSelectedFile();
			rootDirectory = selectedFile.getAbsolutePath();
		}
		return rootDirectory;
	}

}
