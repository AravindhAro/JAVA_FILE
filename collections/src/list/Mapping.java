package list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapping {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "apple");
		map.put(2, "orange");
		map.put(4, "grapes");
		map.put(3, "apple");
		map.put(5, "pineapple");
		map.put(7, "litchi");
		map.put(6, "dragonfruit");
		map.put(9, "kiwi");
		map.put(10, "orange");
		map.put(8, "apple");
		
		Set ss= map.entrySet();
		Iterator it = ss.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry entry = (Map.Entry) it.next();
//			System.out.println("no :"+entry.getKey()+" is "+entry.getValue());
			String target = "Apple";
			String value = (String) entry.getValue();
			if(target.equalsIgnoreCase(value)) {
				System.out.println("no :"+entry.getKey()+" is "+entry.getValue());
			}
		}
		
	}

}
