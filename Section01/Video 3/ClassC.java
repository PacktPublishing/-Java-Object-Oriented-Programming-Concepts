package howobjectsinteract.one;

public class ClassC {
	
	public void publicMethod(){
		System.out.println("I am public");
	}
	
	protected void protectedMethod(){
		System.out.println("I am protected");
	}
	
	private void privateMethod(){
		System.out.println("I am private");
	}

	void defaultMethod(){
		System.out.println("I am default");
	}
	
	// abstract public  void someMethod();
}