//Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ]  

import java.util.*;
class A13
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		/*if(a>b && a>c) System.out.println(a+" is bigger");
		else if(b>a && b>c) System.out.println(b+" is bigger");
		else System.out.println(c+" is bigger");*/
		
		String str =  (a>b && a>c) ? a+" is bigger" : (b>a && b>c)     ? b+" is bigger" : c+" is bigger";
		System.out.println(str);
	}
}
