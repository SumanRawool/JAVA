package com.cdac.in;

import java.util.Scanner;

class BMICalculator{
	private double height;
	private double weight;
	
	public BMICalculator(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return this.height;
	}
	public double getWeight() {
		return this.weight;
	}
	
	public double calculateBMI() {
		return weight / (height * height);
	}
	
}
public class program {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter your height : ");
		double height =sc.nextDouble();
		
		System.out.println("Enter your weight : ");
		double weight =sc.nextDouble();
		
		BMICalculator bmi = new BMICalculator(height, weight);
		
		System.out.println("Your BMI is : "+ bmi.calculateBMI());

	}

}
