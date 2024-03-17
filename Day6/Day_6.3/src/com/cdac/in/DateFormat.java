package com.cdac.in;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println("===============   Format Date    ====================");
		
		String pattern="dd/mm/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String stringDate = sdf.format(date);
		System.out.println(stringDate);
		
		System.out.println("=================================================");
		
		String format2="mm/dd/yyyy";
		SimpleDateFormat sdf1 = new SimpleDateFormat(format2);
		String stringDate1 = sdf1.format(date);
		System.out.println(stringDate1);
		
		System.out.println("=================================================");
		
		String format3="yyyy/mm/dd";
		SimpleDateFormat sdf2 = new SimpleDateFormat(format3);
		String stringDate2 = sdf2.format(date);
		System.out.println(stringDate2);
		
		System.out.println("===============   Format Time    ====================");
		String format4="hh:mm:ss";
		SimpleDateFormat sdf3 = new SimpleDateFormat(format4);
		String stringTime=sdf3.format(date);
		System.out.println(stringTime);
		
		System.out.println("=================================================");
		
		String format5 = "hh:mm:ss a";
		SimpleDateFormat sdf4 = new SimpleDateFormat(format5);
		String stringTime1 = sdf4.format(date);
		System.out.println(stringTime1);
		
		System.out.println("=================================================");
		String format6 = "hh:mm";
		SimpleDateFormat sdf5 = new SimpleDateFormat(format6);
		String stringTime2=sdf5.format(date);
		System.out.println(stringTime2);
		
		System.out.println("===============   Format Date and Time    ====================");
		String format7="dd/mm/yyyy hh:mm:ss";
		SimpleDateFormat sdf6 = new SimpleDateFormat(format7);
		String stringDateTime = sdf6.format(date);
		System.out.println(stringDateTime);
		System.out.println("=================================================");
		
		String format8="mm/dd/yyyy hh:mm:ss a";
		SimpleDateFormat sdf7 = new SimpleDateFormat(format8);
		String stringDateTime1 = sdf7.format(date);
		System.out.println(stringDateTime1);
		System.out.println("=================================================");
		
		String format9="yyyy/mm/dd hh:mm";
		SimpleDateFormat sdf8 = new SimpleDateFormat(format9);
		String stringDateTime2 = sdf8.format(date);
		System.out.println(stringDateTime2);
	}

}
