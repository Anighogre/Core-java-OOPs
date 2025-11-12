package com.ani.initialize_properties_through_reference;

public class FanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fan f1 = new Fan();
		f1.name = "Usha";
		f1.coil = "Copper";
		f1.wings = 3;
		f1.switchOn();
		f1.switchOff();
	}
}
