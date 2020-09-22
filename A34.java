//Create a class Circle that has two data members, one to store the radius and another to store area and three methods first init() method to input radius from user, second calculateArea() method to calculate area of circle and third display() method to display values of radius and area. Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.

import java.util.Scanner;
class circle{
	private int radius;
	private double area;
	
	public void init(int r){
		this.radius = r;
	}
	
	public void calculate(){
		area = 3.14*radius*radius;
	}
	
	public void display(){
		System.out.println("Radius-->"+radius);
		System.out.println("Area-->"+area);
	}
}

class A34
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		circle c = new circle();
		System.out.println("Enter radius");
		int Radius = sc.nextInt();
		c.init(Radius);
		c.calculate();
		c.display();
	}
}
