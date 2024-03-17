package com.cdac.in;
import java.util.*;


//This program is for getter of setter methods using static method
class Information{
	private String name;
	private int age;
	private float marks;
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public float getMarks() {
		return this.marks;
	}
	
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
	private static void acceptRecord(Information information) {
		System.out.println("Name = ");
		information.setName(sc.nextLine());
		sc.nextLine();
		System.out.println("Age = ");
		information.setAge(sc.nextInt());
		
		System.out.println("Marks = ");
		information.setMarks(sc.nextFloat());

	}
	private static void printRecord(Information information) {
		System.out.println("Name : "+information.getName());
		System.out.println("Age : "+information.getAge());
		System.out.println("Marks : "+information.getMarks());
	}
	
	public static void main(String[] args) {
		Information information= new Information();
		Student.acceptRecord(information);
		Student.printRecord(information);
	}
}
