package unused_failed;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;


//conditions for correct traversion of Filetree:
//The directory "Daten" must be chosen
//Subdirectories of "Daten" must be different semesters
//One Subdirectory of a semester must be called "Miniprojekte"
//Subdirectories of "Miniprojekte" must be different miniprojects
//One Subdirectory of a miniproject must be called "Lösungen"
//Subdirectories of "Lösungen" must be different students
//Subdirectories of a student should be different Submission directories
public class FileTreeWalker {
	
	private File[] semesters;
	private int currentSemester;
	private File[] miniprojekte;
	private int currentMiniprojekt;
	private File[] students;
	private int currentStudent;
	private File[] submissions;
	private int currentSubmission;
	
	
	//TODO: throw error if wrong directory structure
	public FileTreeWalker(String path)
	{
		//TODO: allow any root directory of "Daten"
		File rootDirectory = new File(path);
		if (rootDirectory.isDirectory() && rootDirectory.getName().compareTo("Daten") == 0)
		{
			semesters = rootDirectory.listFiles();
			if(semesters.length==0)
			{
				System.out.println("There are no directories in the 'Daten' directory");
			}
		}
		else
		{
			System.out.println("The given Filetree doesn't match the expected structure");
		}
		currentSemester = 0;
	}
	
	public String getNextSemester()
	{
		if(currentSemester >= semesters.length)
			return null;
		File semester = semesters[currentSemester];
		currentSemester++;
		File[] subdirectories = semester.listFiles();
		if(subdirectories.length == 0)
		{
			miniprojekte = new File[0];
			currentMiniprojekt = 0;
			return semester.getName();
		}
		for(File f : subdirectories)
		{
			if(f.isDirectory() && f.getName().compareTo("Miniprojekte") == 0)
			{
				miniprojekte = f.listFiles();
				currentMiniprojekt = 0;
				break;
			}
		}
		return semester.getName();
	}
	
	public String getNextMiniprojekt()
	{
		if(currentMiniprojekt >= miniprojekte.length)
			return null;
		File miniprojekt = miniprojekte[currentMiniprojekt];
		currentMiniprojekt++;
		File[] subdirectories = miniprojekt.listFiles();
		if(subdirectories.length == 0)
		{
			students = new File[0];
			currentStudent = 0;
			return miniprojekt.getName();
		}
		for(File f : subdirectories)
		{
			if(f.isDirectory() && f.getName().compareTo("Lösungen") == 0)
			{
				students = f.listFiles();
				currentStudent = 0;
				break;
			}
		}
		return miniprojekt.getName();
	}
	
	public String getNextStudent()
	{
		if(currentStudent >= students.length)
			return null;
		File student = students[currentStudent];
		currentStudent++;
		submissions = student.listFiles();
		currentSubmission = 0;
		return student.getName();
	}
	
	/**
	 * 
	 * @return returns the .java files of a Submission in a LinkedList; last Element is the name of the submission
	 */
	public List<char []> getNextSubmission()
	{
		if(currentSubmission >= submissions.length)
			return null;
		List<char []> fileContents = new LinkedList<char []>();
		File submission = submissions[currentSubmission];
		currentSubmission++;
		File[] files = submission.listFiles();
		for(File f : files)
		{
			String name = f.getName();
			if(f.isFile() && name.contains("."))
				{
					String[] splitted = name.split("\\.");
					if(splitted.length > 1 && splitted[splitted.length-1].compareTo("java")==0)
					{
						try {
							String s = new String(Files.readAllBytes(Paths.get(f.toURI())));
							fileContents.add(s.toCharArray());
						} catch (IOException e) {
							System.out.println("Something went wrong with file "+f.getAbsolutePath());
						}

					}
				}

		}
		String submissionName = submission.getName().split(" ")[0];
		fileContents.add(submissionName.toCharArray());
		//System.out.println(fileContents.toString());
		return fileContents;
	}
	
	public String getCurrentSemester()
	{
		return semesters[currentSemester-1].getName();
	}
	
	public String getCurrentMiniprojekt()
	{
		return miniprojekte[currentMiniprojekt-1].getName();
	}
	
	public String getCurrentStudent()
	{
		return students[currentStudent-1].getName();
	}
	
	public String getCurrentSubmission()
	{
		return submissions[currentSubmission-1].getName();
	}

	
	/*public void setRootDirectory(String path)
	{
		rootDirectory = new File(path);
	}*/

}
