package inheritance;

import abstraction.Cargo;
import abstraction.Vehicle;

public class Main {

	public static void main(String[] args) {
		
		Bicycle b1 = new Bicycle(0, -1, 1, Cargo.PASSENGERS, "BMX", BicycleType.STUNT);
		
		System.out.println(b1 instanceof Vehicle);
		System.out.println(b1 instanceof Bicycle);
		System.out.println(b1.toString());
		
		b1.goTo(20, 1);
		b1.deliverPackage(50, 15);
		
	}
}