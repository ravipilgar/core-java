//Create an integer type 2-D array of size [3X3]. Take the elements from the user and then calculate the sum of the elements present in the diagonal.

import java.util.Scanner;
class A30
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int sum = 0;
		System.out.println("Enter array element");
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
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(i==j) sum = sum + arr[i][j];
			}
		}
		System.out.println("Sum-->"+sum);
	}
}
