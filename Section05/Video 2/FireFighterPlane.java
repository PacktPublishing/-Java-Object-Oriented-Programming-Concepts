package inheritance.polymorphism;

public class FireFighterPlane extends AeroPlane{

	public FireFighterPlane(double con, double aut, int cap) {
		super(con, aut, cap, Cargo.WATER);
	}

	public void dropWater(){
		System.out.println("water dropped");
	}



	
}
