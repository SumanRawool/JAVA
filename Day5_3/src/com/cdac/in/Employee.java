package com.cdac.in;
import java.util.*;
class EmployeeDetails{
	public static void setEmployeeDetails(String name, int age , float salary) {	
		System.out.println( name +"  "+age+"  "+salary+"  ");

	}
	
	public static void setEmployeeDetails(String name, int age) {
		System.out.println( name +"  "+age);	
	}
	
}

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name	:	");
		String name =sc.nextLine();
		
		System.out.println("Enter the id	:	");
		int id = sc.nextInt();
		
		System.out.println("Enter the salary	:	");
		float salary=sc.nextFloat();
		EmployeeDetails.setEmployeeDetails(name,id,salary);
		EmployeeDetails.setEmployeeDetails("suman" , 24);

	}

}
