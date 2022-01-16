package Maps;

import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {
		
		  TreeMap TM = new TreeMap();
		  TM.put("Student1", 120);
		  TM.put("Student5", 99);
		  TM.put("Student6", 130);
		  TM.put("Student2", 190);
		  TM.put("Student3", 89);
		  TM.put("Student4", 142);
	        
	        for(String key: TM.keySet())
	        {
				System.out.println(key  +" : "+ TM.get(key));
    	}
	}
}
