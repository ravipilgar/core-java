//Program to show sum and average of 10 element array. Accept array elements from user.

import java.util.Scanner;
class A21
{
	public static void main(String[] args){
		int[] array = new int[10];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 elements");
		for(int i=0; i<10; i++){
			array[i] = sc.nextInt(); 
		}
		for(int i=0; i<10; i++){
			sum = sum + array[i]; 
		}
		float avg = sum/11;
		
		System.out.println("Sum-->"+sum);
		System.out.println("Avg-->"+avg);
	}
}
