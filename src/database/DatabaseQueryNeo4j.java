package database;

import java.util.HashMap;
import java.util.Map;

public class DatabaseQueryNeo4j implements DatabaseQuery{
	
	private String query;
	private Map<String, Object> params;
	
	public DatabaseQueryNeo4j(String query)
	{
		this.query = query;
		params = new HashMap<>();
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Map<String, Object> getParams() {
		return params;
	}

//	public void setParams(Map<String, Object> params) {
//		this.params = params;
//	}
	
	public void addParam(String label, Object value)
	{
		params.put(label, value);
	}
	

}
