package config;

import java.util.ArrayList;
import java.util.List;

import GraphHandling.AttributePair;

public class SubmissionPropertyFormatter extends PropertyFormatter{

	@Override
	public List<AttributePair> getProperties(String filename) {
		List<AttributePair> ret = new ArrayList<AttributePair>();
		String[] splitter = filename.split("(");
		ret.add(new AttributePair("Abgabe", splitter[0]));
		ret.add(new AttributePair("Punkte", Integer.getInteger(splitter[1])));
		return ret;
	}

}
