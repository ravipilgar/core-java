//Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.
import java.util.*;
class A7
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects");
		int[] marks = new int[5];
		int sum = 0;
		for(int i=0;i<5;i++){
			marks[i] = sc.nextInt();
			sum = sum + marks[i];
		}
		 float percent = sum/5;
		 System.out.println("percentage marks = "+percent+"%");
	}
}
