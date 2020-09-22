//Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.

import java.util.*;
class A8
{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter principle amount, rate of interest and time ");
		int p = sc.nextInt();
		float r = sc.nextInt();
		float t = sc.nextInt();
		
		float SI = p*r*t/100;
		System.out.println("simple interest "+SI);
	}
}
