package config;

import java.util.List;

import dao.AttributePair;

public abstract class PropertyFormatter {

	public abstract List<AttributePair> getProperties(String filename);
}
