package com.cdac.in;
import java.util.*;

public class Student {
	String name;
	int rollno;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Student st=new Student();
		System.out.println("Enter name of Student: ");
		st.name=sc.nextLine();
		System.out.println("Enter roll number of student: ");
		st.rollno=sc.nextInt();
		System.out.println("Name of student is :"+ st.name);
		System.out.println("Roll no of Student is :"+ st.rollno);
		sc.close();
	}

}
