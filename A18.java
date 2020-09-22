//Program to check whether number is prime or not.

import java.util.Scanner;
class A18
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		boolean isPrime = true;
		if(num == 0 || num == 1) System.out.println("Not prime number");
		else{
			for(int i=2;i<num/2;i++){
				if(num % i == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime == false) System.out.println(num+" Is not prime");
		else System.out.println(num+" Is prime");
		}
	}
}
