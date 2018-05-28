package Association.Aggregaion.Composition;

public class Driver {

	private Vehicle availableVehicle;
	
	public void rentVehicle(Vehicle v){
		this.availableVehicle = v;
		System.out.println("driver has now a vehicle to drive");
	}

	public void driveVehicle(double miles){
		if(this.availableVehicle != null){
			this.availableVehicle.goToDestination(miles);
			System.out.println("driver drives the vehicle safely");
		}
	}

	public void returnVehicle(){
		this.availableVehicle = null;
		System.out.println("driver returns the vehicle");
	}
	
}