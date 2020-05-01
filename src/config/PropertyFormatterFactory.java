package config;

public class PropertyFormatterFactory {
	
	public static PropertyFormatter selectFormatter(String input)
	{
		switch(input)
		{
		//case "SUBMISSION":
		//	return new SubmissionFormatter();
		default:
			return new StandardPropertyFormatter(input);
		}
	}
}
