package everything.is.a.reference;

public class ClassA {
	  
	public static void main(String [] args) {
		int lovar1 = 5;
		ClassA ref1 = new ClassA();
		ref1.someMethod(lovar1);
		System.out.println(lovar1); // still is 5
	}

	public void someMethod(int  lovar2  ){
		lovar2 = 7; // change the value
		System.out.println(lovar2); // 7
	}
}