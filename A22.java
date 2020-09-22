//Sort a ten element array in descending order.

import java.util.Scanner;
class A22
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = 10;
		int[] array = new int[N];
		System.out.print("Enter array number");
		for(int i=0; i<N; i++){
			array[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<N-i;j++){
				if(N > j+1){
					if(array[j] < array[j+1]){
						int temp = array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
				}
			}
		}
		
		for(int i=0; i<N; i++){
			System.out.print(array[i]+" ");
		}
	}
}
