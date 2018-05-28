package inheritance.polymorphism;

public  class AeroPlane {

	private double consumption;
	private double autonomy;
	private int capacity;
	private Cargo cargo;
	
	public AeroPlane(double con, double aut, int cap, Cargo car) {
		this.consumption = con;
		this.autonomy = aut;
		this.capacity = cap;
		this.cargo = car;
	}
	
	public final void goTo(int distance, int load){
		if(load > this.capacity)
			return;
		this.autonomy = this.autonomy - this.consumption * distance;
		System.out.println("Autonomy is down to: "+this.autonomy);
	}
	
	//public abstract void comeBack();
	
}