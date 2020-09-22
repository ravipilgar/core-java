//Create a class Student with 2 data members rno and name. Create one method setData() that takes roll number and student name as parameter and stores them in data members rno and name. Create one more method showData() to print the data member values. Create another class ( main class) StudentDemo that creates Student class object and calls setData() and showData() methods.

import java.util.Scanner;

class student
{
	private int rno;
	private String name;
	
	public void setData(int rollNo, String Name){
		rno = rollNo;
		name = Name;
		System.out.println("Data set");
	}
	
	public void showData(){
		System.out.println("Roll no-->"+rno);
		System.out.println("Name-->"+name);
		
	}
}

class A31
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		student s = new student();
		System.out.println("Enter roll no & student");
		int rollNo = sc.nextInt();
		String Name = sc.nextLine();
		s.setData(rollNo,Name);
		s.showData();
	}
}
