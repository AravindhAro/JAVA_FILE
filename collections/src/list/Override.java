package list;

public class Override {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		System.out.println(parent.name(11, 11));
		
		Over over = new Over();
		System.out.println(over.name(11, 11));
		
		Load load = new Load();
		System.out.println(load.name(11, 11));
	}
}
