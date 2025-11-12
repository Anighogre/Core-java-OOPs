package com.ani.initialize_properties_through_reference;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ani = new Student();
		ani.name = "Anirudh Ghogre";
		ani.age = 23;
		ani.height = 5.9;
		
		ani.talk();
		ani.writeExam();
		
		System.out.println("\n=====================================================================\n");
		
		Student vai = new Student();
		vai.name = "Vaibhav aute";
		vai.age = 27;
		vai.height = 5.8;
		
		vai.talk();
		vai.writeExam();
	}

}
