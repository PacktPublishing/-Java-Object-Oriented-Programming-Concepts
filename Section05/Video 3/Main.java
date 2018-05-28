package abstratc.interfaces;

import inheritance.polymorphism.Cargo;

public class Main {

	public static void main(String[] args) {
		
		//AeroPlane plane = new AeroPlane();
		//FireFighterPlane ffp = new FireFighterPlane();
		
		CanadAir caAir = new CanadAir(0.2, 200, 250, Cargo.WATER);
			
		System.out.println("caAir is-a AeroPlane "+(caAir instanceof AeroPlane));
		System.out.println("caAir is-a FireFighterPlane "+(caAir instanceof FireFighterPlane));
		System.out.println("caAir is-a CanadAir "+(caAir instanceof CanadAir));

		caAir.goTo(100, 150);
		caAir.comeBack();
		caAir.dropWater();
		caAir.stopFire();
		
		//(()caAir).stopFire();
		//(()caAir).dropWater();
		
		//FireFighterPlane anotherInst = (FireFighterPlane) caAir;
		//anotherInst.dropWater();
		//FireFighterPlane anotherInst2 = (FireFighterPlane) caAir;
		//anotherInst2.dropWater();
	}
}
