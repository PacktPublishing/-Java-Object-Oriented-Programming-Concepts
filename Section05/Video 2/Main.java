package inheritance.polymorphism;

public class Main {

	public static void main(String[] args) {
		
		AeroPlane myPlane = new AeroPlane(0.2, 200, 2, Cargo.PASSENGERS);
		
		System.out.println("myPlane is-a Object "+(myPlane instanceof Object));
		System.out.println("myPlane is-a AeroPlane "+(myPlane instanceof AeroPlane));
		System.out.println("myPlane is-a FireFighterPlane "+(myPlane instanceof FireFighterPlane));

		myPlane.goTo(50, 2);
		
		
		
		

		AeroPlane fireFighterPlane = new FireFighterPlane(0.2, 200, 250); // :) 
		//FireFighterPlane fireFighterPlane = new FireFighterPlane(0.2, 200, 250);
		
		System.out.println("\nfireFighterPlane is-a AeroPlane "+(fireFighterPlane instanceof AeroPlane));
		System.out.println("fireFighterPlane is-a FireFighterPlane "+(fireFighterPlane instanceof FireFighterPlane));
		
		fireFighterPlane.goTo(200, 100);
		//fireFighterPlane.dropWater();
		
		( (FireFighterPlane) fireFighterPlane ).dropWater();
		
		FireFighterPlane fireFighterPlane2 = (FireFighterPlane) fireFighterPlane;
		fireFighterPlane2.dropWater();
	}
}
