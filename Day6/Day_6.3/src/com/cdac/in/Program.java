package com.cdac.in;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		Date currentdate=new Date();
		int day=currentdate.getDate();
		int month=currentdate.getMonth()+1;
		int year=currentdate.getYear()+1900;
		
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
		

	}

}
