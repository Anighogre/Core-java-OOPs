package com.ani.initialize_properties_through_reference;

public class Dog {
	String name;
	double height;
	int age;
	
	public void getDogInformation() 
	{
		System.out.println("Name of the dog is :"+name);
		System.out.println("Height of the dog is :"+height);
		System.out.println("Age of the dog :"+age);
	}
	
	
	public void bark()
	{	
		System.out.println(name+" can be bark when he saw somenone new");
	}

}
