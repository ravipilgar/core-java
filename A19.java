//Calculate  series : 12+22+32+42+.........+n2

import java.util.Scanner;
class A19
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int res = num*(num+1)*(2*num+1)/6;
		System.out.println(res);
	}
}
