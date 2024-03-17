package com.cdac.in;

import java.util.Scanner;

public class Student1 {
	static String name;
	static int rollno;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name of Student: ");
		Student1.name=sc.nextLine();
		System.out.println("Enter roll number of student: ");
		Student1.rollno=sc.nextInt();
		System.out.println("Name of student is :"+ Student1.name);
		System.out.println("Roll no of Student is :"+ Student1.rollno);
		sc.close();

	}

}
