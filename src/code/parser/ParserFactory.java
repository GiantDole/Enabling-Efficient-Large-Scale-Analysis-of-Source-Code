package code.parser;

import config.command.ParseCommand;

public class ParserFactory {

	public static Class<?> selectParser(ParseCommand p)
	{
		String parser = p.getParser();
		parser = parser.toLowerCase();
		switch(parser)
		{
		case "java":
			return JavaParser.class;
		default:
			System.out.println("There exists no implementation of an "+parser+" Parser");
			System.exit(0);
		}
		
		return null;
	}
}
