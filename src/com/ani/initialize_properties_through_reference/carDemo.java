package com.ani.initialize_properties_through_reference;

public class carDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		c1.brand = "BMW";
		c1.topSpeed = 220;
		c1.engineType = "Diesel";
		c1.price = 65_00_000;
		
		c1.carInfo();
		c1.canDrive();

	}

}
