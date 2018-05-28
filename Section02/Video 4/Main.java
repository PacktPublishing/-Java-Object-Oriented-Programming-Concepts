package polymorphism;

import abstraction.Cargo;
import abstraction.Vehicle;
import inheritance.Bicycle;
import inheritance.BicycleType;

public class Main {

	public static void main(String[] args) {
		
		// A reference variable can only be of the declared  type 
		Bicycle b1 = new Bicycle(0, -1, 1, Cargo.PASSENGERS, "Bt'win", BicycleType.MOUNTAIN_BIKE);
		
		// Unless declared final a reference can be reassigned to other objects
		//final Bicycle b1 = new Bicycle(0, -1, 1, Cargo.PASSENGERS, "Bt'win", BicycleType.MOUNTAIN_BIKE);
		//b1 = new Bicycle(0, -1, 1, Cargo.PASSENGERS, "BMX", BicycleType.STUNT);
		
		// A reference variable can refer to any other object of the same declared 
		// type or any subtype of the declared type
		// a reference of type "Vehicle" referencing a "Bicycle" Object, this is polymorphism !!
		Vehicle veh1 = b1; 

		// A polymorphic Object
		System.out.println(veh1 instanceof Vehicle); // true
		System.out.println(veh1 instanceof Bicycle); // true
		System.out.println(b1 instanceof Vehicle); // true
		System.out.println(b1 instanceof Bicycle); // true
		
		// A reference’s variable type determines the method that can be invoked 
		// on the referenced object
		b1.goTo(100, 1);
		b1.deliverPackage(15, 5);
		
		veh1.goTo(200, 1);
		//veh1.deliverPackage(15, 5);
		((Bicycle) veh1).deliverPackage(15, 5);
	}
}
