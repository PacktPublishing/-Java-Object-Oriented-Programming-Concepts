package whatisanobject;

public class ClassB {

	/* State */
	public String greeting = "Hello World !! ";
	
	/* Behaviour */
	public void methodOne(){
		System.out.println("\""+greeting+"\" says methodOne");
	}
	
	public void methodTwo() {
		int variableOne = 1;
		int variableTwo = 2;
		int total = variableOne + variableTwo;
		System.out.println("\"variableOne + variableTwo = " +
				total + "\" says methodTwo");
	}
}
