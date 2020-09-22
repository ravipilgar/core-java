//Print all prime numbers between two given numbers. [ break continue ]

import java.util.Scanner;
class A20
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		boolean isPrime = true;
		for(int i=n1; i<=n2; i++){
			if (i == 1 || i == 0) continue;
            isPrime = true;//important step update isPrime
			for(int j=2; j<i/2; j++){
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime == true) System.out.print(i+" ");
		}
	}
}
