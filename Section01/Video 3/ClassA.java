package howobjectsinteract.one;

import howobjectsinteract.two.ClassD;

public class ClassA {
	
	public static int staticVariable = 5;
	public static void staticMethod(){int result = 5+5; System.out.println("Result: "+result);}
	
	public void method(){
		
		ClassC someInstance = new ClassC();
		someInstance.publicMethod();
		someInstance.protectedMethod();
		someInstance.privateMethod();
		someInstance.defaultMethod();
		
		ClassA.staticVariable = 8;
		ClassA.staticMethod();
	}
	
}