package exception.runtime;

public class Runtime {

	public static void main(String[] args) {
		Runtime rc = new Runtime();
//		rc.arithemetic();
//		rc.nullpoint();
//		rc.indexbound();
//		rc.illegalargument();
		rc.classcast();
//		rc.illegalState();

	}

	public void arithemetic() {
		int a = 10;
		int b = 0;
		int result = 0;
		try {
			result = a / b; // This line will throw an ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero." + e);
		}

		System.out.println(result);
	}

	public void nullpoint() {

		String str = null;
		int length = 0;
		try {
			length = str.length(); // This line will throw a Null Pointer Exception
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception caught: " + e.getMessage());
		}
		System.out.println(length);
	}
	public void indexbound() {
	    String str = "FA SOFTWARE";
	    char ch = ' ';
	    try {
	        ch = str.charAt(30); // This line will throw a StringIndexOutOfBoundsException
	    } catch (StringIndexOutOfBoundsException e) {
	        System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
	    }
	    System.out.println(ch);
	    
	    int[] arr = { 1, 2, 3 };
	    int element =0 ;
	    try {
	         element = arr[3]; // This line will throw an ArrayIndexOutOfBoundsException
	    } catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
	    }
	    System.out.println(element);
	}
	public void illegalargument() {
		
		 try {
		        int age = -1;
		        if (age < 0) {
		            throw new IllegalArgumentException("Age cannot be negative.");
		        }
		    } catch (IllegalArgumentException e) {
		        System.out.println("IllegalArgumentException caught: " + e.getMessage());
		    }
	}
	
	public void classcast() {
		 try {
		        Object obj = 42;
		        String str = (String) obj; // This line will throw a ClassCastException
		    } catch (ClassCastException e) {
		    	e.printStackTrace();
		        System.out.println("ClassCastException caught: " + e.getMessage());
		    }
	}
	
	public void illegalState() {
	    String str = "hello";
	    if (str.length() > 5) {
	        throw new IllegalStateException("String length cannot be greater than 5.");
	    }
	    System.out.println(str);
	}

	
}
