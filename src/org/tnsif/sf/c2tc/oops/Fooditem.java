package org.tnsif.sf.c2tc.oops;

public class Fooditem {

	
	String name;
	double price;
	String category;
	
	void displayDetails()
	{
		System.out.println("Food name "+name);
		System.out.println("Food price "+price);
		System.out.println("Food category "+category);

	}
	public static void main(String[] args) {
		
		Fooditem obj = new Fooditem();
		obj.name = "burger";
		obj.price = 50.6;
		obj.category = "Fast Food";
		
		Fooditem obj1 = new Fooditem();
		obj1.name = "paneer pizza";
		obj1.price = 239.7;
		obj1.category = "italian";
		
		obj.displayDetails();
		obj1.displayDetails();
		
	}

}
