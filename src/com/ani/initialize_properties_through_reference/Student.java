package com.ani.initialize_properties_through_reference;

public class Student {
	String name;
	int age;
	double height;
	
	public void talk()
	{
		System.out.println("Hello learner my name is : "+name);
		System.out.println("My age is : "+age);
		System.out.println("And my height is : "+height);
	}
	
	public void writeExam()
	{
		System.out.println("Every saturday "+name+" is writin the java exam in NIT");
	}

}
