//Program to check that entered year is a leap year or not.

import java.util.*;
class A14
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();
		if( (year%100) == 0){
				if((year%400) == 0) System.out.println("Leap year");
				else System.out.println("Not Leap year");
			}
		else if((year%4)==0) System.out.println("Leap year");
		else System.out.println("Not Leap year");
		}
		
}
