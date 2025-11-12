package com.ani.initialize_properties_through_reference;

public class Fan {
	String name;
	String coil;
	int wings;
	
	public void switchOn() 
	{
		System.out.println("Fan Name :"+name);
		System.out.println("Fan coil :"+coil);
		System.out.println("Fan wings :"+wings);
		System.out.println("Fan is switched ON");
	}
	
	public void switchOff()
	{
		System.out.println("Fan is switched OFF");
	}

}
