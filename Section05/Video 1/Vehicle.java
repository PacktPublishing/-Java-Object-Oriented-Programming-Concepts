package Association.Aggregaion.Composition;

import java.util.ArrayList;

public class Vehicle {

	public double fuel;
	public double fuelCapacity;
	public double fuelConsumtion;
	public double mileage;
	public double lifespan;
	public ArrayList<Part> parts;
	
	public Vehicle(double lifespan, double mileage, double fuelCapacity, double fuelConsumtion, ArrayList<Part> parts) {
		this.mileage = mileage;
		this.lifespan = lifespan;
		this.fuelCapacity = fuelCapacity;
		this.fuelConsumtion = fuelConsumtion;
		this.parts = parts;
	}
	
	public void goToDestination(double miles) {
		this.mileage = this.mileage + miles;
		this.fuel = this.fuel - this.fuelConsumtion * miles;
	}

}