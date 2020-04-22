package unused_failed;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TailDirectory extends DirectoryData{

	private List<File> files;
	
	public TailDirectory(String label, File f) {
		super(label, f);
		files = new ArrayList<File>();
	}
	
	public void addFile(File t) {
		files.add(t);
	}

	@Override
	public List<DirectoryData> getLastFiles() {
		List<DirectoryData> ret = new ArrayList<DirectoryData>();
		ret.add(this);
		return ret;
	}
}

