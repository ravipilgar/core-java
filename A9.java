//Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the entered days into complete years, months and days and print them.

import java.util.*;
class A9
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days");
		int days = sc.nextInt();
		int year = days/365;
		int month = (days%365)/30;
		int day = (days%365)%30;
		
		System.out.println("Year:"+year);
		System.out.println("Month:"+month);
		System.out.println("Day:"+day);
	}
}
