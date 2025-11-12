package com.ani.initialize_properties_through_reference;

public class Car {
	String brand;
	double topSpeed;
	String engineType;
	double price;
	
	public void carInfo()
	{
		System.out.println("Brand name is :"+brand);
		System.out.println("Car top speed is :"+topSpeed);
		System.out.println("Type of the car engine :"+engineType);
		System.out.println("Price of the car :"+price);
	}

	public void canDrive()
	{
		System.out.println("You can drive this car on "+topSpeed+"km/h top dpeed");
	}
}
