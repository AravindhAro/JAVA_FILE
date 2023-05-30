package list;

public class Overload {
	
	public static void main(String[] args) {
		
		Overload over = new Overload();
		over.name();
		System.out.println(over.name(5, 6f));
		System.out.println(over.name(5, 10));
		System.out.println(over.name(5, 50, 10));
		
	}
	public  int  name(int a,int b ) {
		return a+b;
	}
	public  void  name() {
		int a = 1;
		int b = 2;
		System.out.println(a+b);
	}
	public  int  name(int a,int b,int c ) {
		return a+b-c;
	}
	public  double  name(double a,float b ) {
		return a+b;
	}
	

}
