package abstraction;

public class Vehicle {

	public Vehicle(double con, double aut, int cap, Cargo car) {
		this.consumption = con;
		this.autonomy = aut;
		this.capacity = cap;
		this.cargo = car;
	}
	
	private double consumption;
	private double autonomy;
	private int capacity;
	private Cargo cargo;
	
	public void goTo(int distance, int load){
		if(load > this.capacity)
			return;
		this.autonomy = this.autonomy - this.consumption * distance;
		System.out.println("Autonomy is down to: "+this.autonomy);
	}	
}