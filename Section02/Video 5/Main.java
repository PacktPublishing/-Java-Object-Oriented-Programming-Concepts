package identity;

import abstraction.Cargo;
import abstraction.Vehicle;
import inheritance.Bicycle;
import inheritance.BicycleType;

public class Main {

	public static void main(String[] args) {
		
		Bicycle b1 = new Bicycle(0, -1, 1, Cargo.PASSENGERS, "Bt'win", BicycleType.MOUNTAIN_BIKE);
		Bicycle b2 = new Bicycle(0, -1, 1, Cargo.PASSENGERS, "Bt'win", BicycleType.MOUNTAIN_BIKE);
		
		Vehicle veh1 = b1;

		System.out.println(b1 == b2); // false
		System.out.println(veh1 == b1); // true
		System.out.println(veh1 == b2); // false
	}
}
