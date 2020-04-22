package config;

public class PropertyFactory {
	
	public static PropertyFormatter selectFormatter(String input)
	{
		switch(input)
		{
		//case "submission":
		//	return new SubmissionFormatter();
		default:
			return new StandardFormatter(input);
		}
	}
}
