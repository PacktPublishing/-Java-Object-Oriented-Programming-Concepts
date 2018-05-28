package mixins.traits;

public interface FireFighterPlane extends AeroPlane{

//	void dropWater();

	default void dropWater(){
		System.out.println("Dropping water...");
	}
	
//	void pickUpWater();
	
	default void pickUpWater(){
		System.out.println("Picking up water...");
	}
	
}