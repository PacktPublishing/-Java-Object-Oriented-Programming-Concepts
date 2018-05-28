package whatisaclasse.one;

import whatisaclasse.two.ClassC;

public class ClassB {
	
	public int instanceVariable = 5;
	
	public static void main(String[] args) {
		ClassC c = new ClassC();
		c.doSomething();
		
	}
	
	public void myMethod(int localVariable1){
		int localVariable2 = localVariable1;
		System.out.print("local varaibles live in methods");
		System.out.print("tha value of the local variable localVariable2 is: "+localVariable2);
	}
	
}