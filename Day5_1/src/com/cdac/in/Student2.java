package com.cdac.in;
import java.util.*;

class StudentInfo{
	String name;
	int rollno;
}
public class Student2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentInfo stuinfo=new StudentInfo();
		System.out.println("Enter name of Student: ");
		stuinfo.name=sc.nextLine();
		System.out.println("Enter roll number of student: ");
		stuinfo.rollno=sc.nextInt();
		System.out.println("Name of student is :"+ stuinfo.name);
		System.out.println("Roll no of Student is :"+ stuinfo.rollno);
		sc.close();
		
	}

}
