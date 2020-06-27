package com.hdfc.loan.carloans;

public class Thirdclass {
	
	int a=10,b=20,c; //Properties
	
	void add()
	{
		c=a+b;
		System.out.println("Addition of A and B is "+c);
	}
	
	void substraction()
	{
		c=a-b;
		System.out.println("Substraction of A and B is "+c);
		
	}

	public static void main(String[] args) 
	{
		Thirdclass obj = new Thirdclass(); // create class ref varibale to access class objects/properties
		obj.add();
		obj.substraction();
		
	}

}
