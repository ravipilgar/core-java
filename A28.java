//Initialize one String type of array and print the elements using for each loop.

import java.util.Scanner;
class A28
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int N = sc.nextInt();
		String[] arr = new String[N];
		System.out.println("Enter array element");
		for(int i=0; i<N; i++){
			arr[i] = sc.nextLine();
		}
		for(String s: arr){
			System.out.println(s+" ");
		}
	}
}
