package list;
import java.util.Collection;
import java.util.Comparator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Map {
	

	public static void main(String[] args) {
		
//		java.util.Map<Integer, String > map=new HashMap<>(); //////////////////////////////////////////////////////////// 
//		 LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>(); 
//		 TreeMap<String, Integer> map = new TreeMap<String, Integer>();         

		    //Adding elements to map  
//		    map.put(1,"Amit");  
//		    map.put(5,"Rahul");  
//		    map.put(10,"Jaai");  
//		    map.put(3,"Rahul"); 
//		    
//		    //Traversing Map  
//		    Set set=map.entrySet();//Converting to Set so that we can traverse  
//		    Iterator itr=set.iterator();  
//		    while(itr.hasNext()){  
//		        //Converting to Map.Entry so that we can get key and value separately  
//		     java.util.Map.Entry<Integer, String >   entry=(java.util.Map.Entry<Integer, String >)itr.next();  
//		        System.out.println(entry.getKey()+" "+entry.getValue());  
//		    }  
//		    java.util.Map<Integer,String> map=new HashMap<Integer,String>();          
//		      map.put(100,"Amit");    
//		      map.put(101,"Vijay");    
//		      map.put(102,"Rahul");   
//		      //Returns a Set view of the mappings contained in this map        
//		      map.entrySet()  
//		      //Returns a sequential Stream with this collection as its source  
//		      .stream()  
//		      //Sorted according to the provided Comparator  
//		      .sorted(java.util.Map.Entry.comparingByKey(Comparator.reverseOrder()))  
//		      //Performs an action for each element of this stream  
//		      .forEach(System.out::println);  ///////////////////////////////////////////////////////////////////////////
		    
		    
		    HashMap<Integer, String> hm=new HashMap<Integer, String>();  //////////////////////////////////////////////////////////////////////////////////
		  //addding keys and values to HashMap  
		    
		  hm.put(25, "Yash"); 
		  hm.put(11, "Arun");  
		  hm.put(15, "Swarit");  
		  hm.put(12, "Neelesh");  
		  
//		  System.out.println(hm.get(11));
//		  System.out.println(hm.size());
		  
		  Set set=hm.entrySet();
		  
//		  Set ss=hm.keySet();
//		  System.out.println(ss);
		  
//		  Set entry=hm.entrySet();
//		  System.out.println(entry);
		  
		 
		  
		  Iterator  it = set.iterator();         
		  System.out.println("Before Sorting");  
		  while(it.hasNext())  
		  {  
		  java.util.Map.Entry<Integer, String> key=(java.util.Map.Entry<Integer, String>)it.next();  
		  System.out.println("Roll no:  "+key.getKey()+"     name:   "+key.getValue()+"     hashcode :"+key.hashCode());  
		  }  
		  System.out.println("\n");  // additional adding ////////////////////
		  hm.putIfAbsent(1, "arav");//.......remove using key//////////////////////
		  hm.remove(25);
//		  hm.clear();              //./...........clear the full map after using this method////////////////////////////
		    TreeMap<Integer, String> mapp=new TreeMap<Integer, String>(hm);
		    Iterator<Integer> itt=mapp.keySet().iterator();
		    System.out.println("after sorting");
		    while(itt.hasNext()) {
		    	int key= (int)itt.next();
		    	System.out.println("roll no :"+key+"  name :"+mapp.get(key));
		    }///////////////////////////////////////////////////////////////////////////////////////////////////////////

	}

	

}
