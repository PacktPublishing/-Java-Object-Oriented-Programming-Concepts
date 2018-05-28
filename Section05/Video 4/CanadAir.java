package mixins.traits;

import inheritance.polymorphism.Cargo;

public /*abstract*/  class CanadAir implements FireFighterPlane{

	private double consumption;
	private double autonomy;
	private int capacity;
	private Cargo cargo;
	
	public CanadAir(double con, double aut, int cap, Cargo water) {
		this.consumption = con;
		this.autonomy = aut;
		this.capacity = cap;
		this.cargo = water;
	}
	
	public void stopFire(){
		
	}
}
