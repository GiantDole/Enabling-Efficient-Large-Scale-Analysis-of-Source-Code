package config;

import dao.AttributePair;

import java.util.ArrayList;
import java.util.List;

public class SubmissionFormatter extends PropertyFormatter{

	@Override
	public List<AttributePair> getProperties(String filename) {
		List<AttributePair> ret = new ArrayList<AttributePair>();
		String[] splitter = filename.split("(");
		ret.add(new AttributePair("Abgabe", splitter[0]));
		ret.add(new AttributePair("Punkte", splitter[1]));
		return ret;
	}

}
