package abstraction;

public class Car {

	public Car(int con, int aut, int cap, Cargo car) {
		this.consumption = con;
		this.autonomy = aut;
		this.capacity = cap;
		this.cargo = car;
	}
	
	int consumption;
	int autonomy;
	int capacity;
	Cargo cargo;
	
	void goTo(int distance, int load){
		if(load > this.capacity)
			return;
		this.autonomy = this.autonomy - this.consumption * distance;
	}
}
