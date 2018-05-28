package everythingisanobject;

public class ClassA {

	public static void main(String[] args) {
		
		String myString = new String("someString");
		
		System.out.println("myString instanceof Object? "+(myString instanceof Object));
		System.out.println("myString instanceof String? "+(myString instanceof String));
		System.out.println(myString.equals("anotherString"));
		System.out.println(myString.toString());
		
		TrainingP ins1 = new TrainingP("Programing in Java", 200);
		TrainingP ins2 = new TrainingP("Programing in Java", 100);
		
		System.out.println("ins1 instanceof Object? "+(ins1 instanceof Object));
		System.out.println("ins1 instanceof TrainingP? "+(ins1 instanceof TrainingP));
		System.out.println(ins1.equals(ins2));
		System.out.print(ins2.toString());
	}
}