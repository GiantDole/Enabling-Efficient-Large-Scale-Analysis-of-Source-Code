package config;

import java.util.List;

import GraphHandling.AttributePair;

public abstract class PropertyFormatter {

	public abstract List<AttributePair> getProperties(String filename);
}
