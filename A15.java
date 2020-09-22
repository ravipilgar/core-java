//Accept person’s gender (character m for male and f for female), age (integer), as input and then check whether person is eligible for marriage or not.

import java.util.*;
class A15
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender and age");
		String gender = sc.nextLine();
		byte age = sc.nextByte();
		System.out.print(gender+" ");
		System.out.println(age);
		
		if(gender.equals('m')){
			if(age >= 21) System.out.println("Eligible for merriage");
			else System.out.println("Not eligible for merriage");
		}
		else{
			if(age >= 18) System.out.println("Eligible for merriage");
			else System.out.println("Not eligible for merriage");
		}
		
	}
}
