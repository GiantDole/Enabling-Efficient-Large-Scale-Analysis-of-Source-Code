package config;

import java.util.Comparator;
import java.util.List;

import GraphHandling.EdgeData;

public class SemesterConnectedOrder extends ConnectedOrder{

	public SemesterConnectedOrder() {
		edgeName = "PRECEDES_SEMESTER";
	}

	@Override
	public List<EdgeData> getEdges(List<DirectoryData> directories) {
		
		directories.sort(new Comparator<DirectoryData>() {
			
			@Override
			public int compare(DirectoryData d1, DirectoryData d2)
			{
				String s1 = d1.getFile().getName();
				String s2 = d2.getFile().getName();
				String split1 = splitbyS(s1);
				String split2 = splitbyS(s2);
				String compareable1 = removeuntilInt(split1);
				String compareable2 = removeuntilInt(split2);
				
				return compareable2.compareTo(compareable1);
			}
			
			private String splitbyS(String s)
			{
				String[] splitted = s.split("S");
				return splitted[splitted.length-1];
			}
			
			private String removeuntilInt(String s)
			{
				while(!Character.isDigit(s.charAt(0)))
				{
					s = s.substring(1);
				}
				return s;
			}
		});
		
		return createEdges(directories);
	}

}
