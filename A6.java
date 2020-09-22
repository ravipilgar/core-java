//Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.
import java.util.*;
class A6
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius ");
		int radius = sc.nextInt();
		double Area = (22/7)*radius*radius;
		double Circum  =2*(22/7)*radius;
		System.out.println("Area is "+Area);
		System.out.println("Circumferance is "+Circum);
	}
}
