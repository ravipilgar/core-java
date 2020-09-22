//Write a program to reverse a given number.

import java.util.Scanner;
class A17
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		while(num!=0){
			int  l = num%10;
			System.out.print(l);
			num = num/10;
		}
	}
}
