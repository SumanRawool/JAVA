package com.cdac.in;
import java.util.*;


//This program is for getter of setter methods
class Information{
	private String name;
	private int age;
	private float marks;
	
	
	//Getter method/selector method/inspector method
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public float getMarks() {
		return this.marks;
	}
	
	//setter methods / mutator methods /modifier method
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setMarks(float marks) {
		this.marks=marks;
	}
	
}
public class Student {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Information info =  new Information();
		
		System.out.println("Name : ");
		info.setName(sc.nextLine());
		System.out.println("Age : ");
		info.setAge(sc.nextInt());
		System.out.println("Marks : ");
		info.setMarks(sc.nextFloat());
		
		String name = info.getName();
		int age = info.getAge();
		float marks = info.getMarks();
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Marks : "+marks);
	}
}
