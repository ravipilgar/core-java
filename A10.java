//Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]

import java.util.*;
class A10
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tempreture in Fahrenheit");
		
		float temp = sc.nextFloat();
		float celcius = 5*(temp-32)/9;
		
		System.out.println("Temp:"+celcius);
	}
}
