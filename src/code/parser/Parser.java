package code.parser;

import java.util.List;

import de.uni_koblenz.jgralab.Graph;

public interface Parser{

	void parseFiles(List<char[]> sources);
	Graph getGraph();
}
