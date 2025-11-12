package com.ani.initialize_properties_through_reference;

public class PenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen p1 = new Pen();
		p1.name = "Cello";
		p1.isWrite = true;
		p1.type = "Ball pen";
		p1.colour = "Blue";
		
		p1.write();

	}

}
