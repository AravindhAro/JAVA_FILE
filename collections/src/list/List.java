package list;
import java.util.*;  

public class List {
	
	public static void main(String[] args) {
		
//		ArrayList<Object> list=new ArrayList<Object>();//Creating arraylist
//		LinkedList<Object> list=new LinkedList<Object>(); 
//		Vector<Object> list =new Vector<Object>();  
//		list.add("aro");//Adding object in arraylist  
//		list.add("Vijay");  
//		list.add(100);  
//		list.add("aro");  
//		System.out.println(list); 
//		//Traversing list through Iterator  
//		Iterator itr=list.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}  
		//...............stack////////////////////////////////////////////
		
//		Stack<String> stack = new Stack<String>();  
//		stack.push("Ayush");  
//		stack.push("Garvit");  
//		stack.push("Amit"); 
//		stack.pop();
//		stack.push("Ashish");  
//		stack.push("Garima");  
//		stack.pop();  
//		System.out.println(stack);
//		Iterator<String> itrr=stack.iterator();  
//		while(itrr.hasNext()){  
//		System.out.println(itrr.next());  
//		}  
		
		//...................priority queue.............................................
//		
//		PriorityQueue<String> queue=new PriorityQueue<String>();  
//		queue.add("aro");  
//		queue.add("Vijay Raj");  
//		queue.add("sai");  
//		queue.add("Raj");  
////		System.out.println("head:"+queue.element());  
//		System.out.println("head:"+queue.peek());  
//		System.out.println("iterating the queue elements:");  
//		Iterator itr=queue.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}  
////		queue.remove();  
////		queue.poll();  
//		System.out.println("after removing two elements:");  
//		Iterator<String> itr2=queue.iterator();  
//		while(itr2.hasNext()){  
//		System.out.println(itr2.next());  
//		}  
		
		//............hashset.....................................................
		
		HashSet<String> set=new HashSet<String>();  
//		LinkedHashSet<String> set=new LinkedHashSet<String>(); 
//		TreeSet<String> set=new TreeSet<String>();  
//
//
		set.add("Broooo");  
		set.add(null);
		set.add("aro");  
		set.add("vijay");  
		set.add(null);
		set.add("Vijay"); 
		set.add(null);
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		
		
		
		
//		   ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
//           list.add("Ravi");//Adding object in arraylist  
//           list.add("Vijay");  
//           list.add("Ravi");  
//           list.add("Ajay");  
//            
//           System.out.println("Traversing list through List Iterator:");  
//           //Here, element iterates in reverse order  
//              ListIterator<String> list1=list.listIterator(list.size());  
//              while(list1.hasPrevious())  
//              {  
//                  String str=list1.previous();  
//                  System.out.println(str);  
//              }  
	}

}
