/*Create a class Person with properties (name and age) with following features. 
        a. Default age of person should be 18.
        b. A person object can be initialized with name and age.
        c. Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.*/

import java.util.*;
class person{
	private String name;
	private int age = 18;
	
	person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void display(){
		System.out.println("Name-->"+name);
		System.out.println("Age-->"+age);
	}
}

class A37
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre name and age");
		String name = sc.nextLine();
		int age = sc.nextInt();
		person p = new person(name,age);
		p.display();	
	}
}
