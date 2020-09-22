//Write a program to swap two numbers without using third variable.

import java.util.*;
class A11
{
	public static void main(String[] args){
		System.out.println("Enter A and B");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		 
		 b=a+b;
		 a=b-a;
		 b=b-a;
		 
		 System.out.println("A = "+a);
		 System.out.println("B = "+b);
	}
}
