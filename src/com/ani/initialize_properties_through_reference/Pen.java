package com.ani.initialize_properties_through_reference;

public class Pen {
	String name;
	boolean isWrite;
	String type;
	String colour;
	
	public void write()
	{
		System.out.println("Name of the pen :"+name);
		System.out.println("We can write with the help of pen :"+isWrite);
		System.out.println("Type of the pen :"+type);
		System.out.println("this pen is "+colour+" colour pen");
	}
	

}
