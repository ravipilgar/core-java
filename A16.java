//Write a program to print table of any entered number using loop.

import java.util.Scanner;
class A16
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nuber");
		int mul;
		int num = sc.nextInt();
		for(int i=1;i<=10;i++){
			mul = num*i;
			System.out.println(num+"X"+i+"="+mul);
		}
	}
}
