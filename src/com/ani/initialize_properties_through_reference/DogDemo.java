package com.ani.initialize_properties_through_reference;

public class DogDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1 = new Dog();
		d1.name = "Moti";
		d1.height = 4.5;
		d1.age = 14;
		d1.getDogInformation();
		d1.bark();

	}

}
