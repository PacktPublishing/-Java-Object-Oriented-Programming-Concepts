package inheritance;

import abstraction.Cargo;
import abstraction.Vehicle;

public class Bicycle extends Vehicle {

	private String brand;
	private BicycleType type;
	
	public Bicycle(int con, int aut, int cap, Cargo car, String brand, BicycleType type) {
		// first instruction of a subClass constructor must be to invoke the parent constructor !!
		super(con, aut, cap, car); 
		this.type = type;
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		//super.toString();
		return "Brand: "+this.brand+", type: "+this.type;
	}
	
	public void deliverPackage(int fromDistance, int toDistance){
		installCarier();
		// uses the goto() implementation provided by Vehicle 
		super.goTo(fromDistance, 1); 
		pickUpItem();
		// uses the goto() implementation provided by Bicycle if it exists
		this.goTo(toDistance, 1);  
		dropItem();
		removeCarier();
	}
	
	private void removeCarier() {}
	private void installCarier(){}
	private void pickUpItem() {}
	private void dropItem() {}
}
