package com.cdac.in;

class VehicleInfo{
	void VehicleInfo( String name ) {
		System.out.println("Name of car is :"+name);
	} 
	void VehicleInfo(String name, double price) {
		System.out.println("Name of car is "+name+" and price is "+ price);
	} 
	void VehicleInfo(String name, double price, float avg) {
		
		System.out.println("Name of car is "+name+", price is "+ price+" and average is "+ avg);
	}
}
public class Vehicle {
	
	public static void main(String[] args) {
		VehicleInfo v = new VehicleInfo();
		v.VehicleInfo("Alto 800");
		v.VehicleInfo("BMW X6",78521);
		v.VehicleInfo("Audi A6",7852011,78.36f);

	}

}
