package abstratc.interfaces;

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

	@Override
	public final void goTo(int distance, int load){

	}

	@Override
	public void comeBack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropWater() {
		// TODO Auto-generated method stub
		
	}
	
	public void stopFire(){
		
	}
}
