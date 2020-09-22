//Write a program to search an element in the array.


import java.util.Scanner;
class A24
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		boolean found = false;
		System.out.println("Enter array elements");
		for(int i=0; i<10; i++){
			array[i] = sc.nextInt();
		}
		System.out.println("Enter element to search");
		int N = sc.nextInt();
		for(int i=0; i<10; i++){
			if(array[i] == N){
				System.out.println("Found at index:"+i);
				found = true;
				break;
			}
		}
		if(found == false) System.out.println("Not Found");
	}
}
