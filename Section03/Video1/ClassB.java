package everything.is.a.reference;

public class ClassB {
	  
	public int myPrim = 5;

	public static void main(String [] args) {
		ClassB lovar1 = new ClassB();
		lovar1.someMethod(lovar1);
		System.out.println(lovar1.myPrim); // 7
	}

	public void someMethod(ClassB  lovar2  ){
		lovar2.myPrim = 7;   
		System.out.println(lovar2.myPrim); // 7
	}
}