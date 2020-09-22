//Write a program to fine the smallest and greatest number present in the array of integer type.

import java.util.Scanner;
class A27
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int N = sc.nextInt();
		int[] arr = new int[N];
		System.out.println("Enter array element");
		for(int i=0; i<N; i++){
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
			if(arr[i]>max){
				max = arr[i];
			}
		}
	System.out.println("Smallest number-->"+min);
	System.out.println("Greatest number-->"+max);
		
	}
}
