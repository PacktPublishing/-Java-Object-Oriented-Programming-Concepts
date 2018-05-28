package valueobjects;

public class Main {

	public static void main(String[] args) {
		
		Parameter p1 = new Parameter(100.568965);
		Parameter p2 = new Parameter(100.778899);
		
		System.out.println(p1.getParameter());
		System.out.println(p2.getParameter());
		
		System.out.println("\n"+p1.equals(p2));
		
		Engine e1 = new Engine(p1);
		Engine e2 = new Engine(p2);

		System.out.println(e1.equals(e2));

	}

}
