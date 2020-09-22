//Write a program to reverse the array elements.

import java.util.Scanner;
class A23
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = 10;
		int[] array = new int[N];
		System.out.println("Enter array number");
		for(int i=0; i<N; i++){
			array[i] = sc.nextInt();
		}
		for(int i=N-1; i>=0; i--){
			System.out.print(array[i]+" ");
		}
	}
}
