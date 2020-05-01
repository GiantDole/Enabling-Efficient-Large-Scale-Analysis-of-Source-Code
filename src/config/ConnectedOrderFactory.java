package config;

public class ConnectedOrderFactory {

	public static ConnectedOrder selectOrder(String input)
	{
		switch(input)
		{
		case "SEMESTER":
			return new SemesterConnectedOrder();
		default:
			return new StandardConnectedOrder(input);
		}
	}
}
