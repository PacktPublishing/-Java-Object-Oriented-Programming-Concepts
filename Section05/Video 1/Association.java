package Association.Aggregaion.Composition;

import java.util.ArrayList;

public class Association {

	public static void main(String[] args) {
		
		/* 
		 * Build cars (2 of them)>> Composition
		 */
		ArrayList<Part> bMWParts = new ArrayList<Part>();
		Part bMWEngine = new Part();
		Part bMWBody = new Part();
		
		bMWParts.add(bMWEngine);
		bMWParts.add(bMWBody);
		
		Vehicle bmw = new Vehicle(1500, 500, 50, 0.7, bMWParts);
		
		ArrayList<Part> volvoParts = new ArrayList<Part>();
		Part volvoEngine = new Part();
		Part volvoBody = new Part();
		
		volvoParts.add(volvoEngine);
		volvoParts.add(volvoBody);
		
		Vehicle volvo = new Vehicle(1400, 300, 50, 0.6, volvoParts);

		/* 
		 * Build a vehicle pool >> Aggregation
		 */
		ArrayList<Vehicle> vehiclePool1 = new ArrayList<Vehicle>();
		
		vehiclePool1.add(volvo); 
		vehiclePool1.add(bmw);
		
		/* 
		 * Have a driver rent a car >> Association
		 */
		
		Driver driver = new Driver();
		
		driver.rentVehicle(vehiclePool1.get(0));
		
		driver.driveVehicle(5);
		
		driver.returnVehicle();	
	}

}
