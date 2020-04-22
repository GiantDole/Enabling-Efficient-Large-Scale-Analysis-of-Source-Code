package config.command;

import config.Config;

public class ParseCommand implements Command{
	
	private String parser;
	
	public ParseCommand(String parser)
	{
		this.parser = parser;
	}

	public String getParser() {
		return parser;
	}

	@Override
	public void executeCommand(Config config) {
		config.setParser(this);
	}
	
	@Override
	public String toString()
	{
		return "ParseCommand: "+parser;
	}
}
