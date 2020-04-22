package aahhhwheretoput;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class UserInput {
	
	public static String getConfigPath(){
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

}
