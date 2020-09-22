//Write a program to print the total number of one-D arrays in a two-D array and the number of elements in every one-D array present in the two-D arrays.

import java.util.Scanner;
class A29
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];
		int count = 0;
		for(int[] a:arr){
			count++;
		}
		System.out.println("Number of 1D array "+count);
		System.out.println("Enter element");
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int[] a:arr){
			for(int x:a){
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}
