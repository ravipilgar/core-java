//Write the program to find the sum of even elements and sum of odd elements present in the array of integer type.

import java.util.Scanner;
class A25
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int N = sc.nextInt();
		int sum = 0;
		int[] array = new int[N];
		System.out.println("Enter array elements");
		for(int i=0; i<N; i++){
			array[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i+=2){
			sum = sum + array[i];
		}
		System.out.println("Even sum-->"+sum);
		sum = 0;
		
		for(int i=1; i<N; i+=2){
			sum = sum + array[i];
		}
		System.out.println("Odd sum-->"+sum);
	}
}
