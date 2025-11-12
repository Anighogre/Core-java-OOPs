package com.ani.validation_nsf;

public class product 
{
	private int productId;
	private String productName;
	private double productPrice;
	
	public product(int productId, String productName, double productPrice) 
	{
		if(productId < 0)
		{
			System.err.println("product id can not be negative");
			System.exit(0);
		}
		if(productName == null || productName.trim().isEmpty() || productName.equals("null"))
		{
			System.err.println("Product Name can not be null or empty");
			System.exit(0);
		}
		if(productPrice <0)
		{
			System.err.println("Product price can not be negative");
			System.exit(0);
		}
		
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() 
	{
		return "product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
	

}
