package Association.Aggregaion.Composition;

import java.util.ArrayList;

public class Composition {

	public static void main(String[] args) {

		/* 
		 * Build cars (2 of them)>> Composition
		 */
		ArrayList<Part> bmwParts = new ArrayList<Part>();
		Part bMWEngine = new Part();
		Part bMWBody = new Part();
		
		bmwParts.add(bMWEngine);
		bmwParts.add(bMWBody);
		
		Vehicle bmw = new Vehicle(1500, 500, 50, 0.7, bmwParts);
		
		ArrayList<Part> volvoParts = new ArrayList<Part>();
		Part volvoEngine = new Part();
		Part volvoBody = new Part();
		
		volvoParts.add(volvoEngine);
		volvoParts.add(volvoBody);
		
		Vehicle volvo = new Vehicle(1400, 300, 50, 0.6, volvoParts);	
	}

}
