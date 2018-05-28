package identity.equality;

public class Main {

	public static void main(String[] args) {
		
		ClassA a1 = new ClassA(5);
		ClassA a2 = new ClassA(5);
		
		ClassA a3 = a2; 
		
		System.out.println(a1 == a2);
		System.out.println(a3 == a2);
		
		//System.out.println(a1.equals(a2));
		//System.out.println(a3.equals(a2));

	}

}
