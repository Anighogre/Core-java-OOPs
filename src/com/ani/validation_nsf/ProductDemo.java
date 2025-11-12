package com.ani.validation_nsf;

import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter product Id :");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter product Name :");
		String name = sc.nextLine();
		
		System.out.print("Enter product Price :");
		double price = Double.parseDouble(sc.nextLine());
		
		product p1 = new product(id,name,price);
		System.out.println(p1);
		
		sc.close();

	}

}
