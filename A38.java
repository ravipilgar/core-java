import java.util.*;

class Employee
{
	static int Empno = 0;
	private double Salary ;
	static double TotalSalary = 0;
	int count = 0;
	
	Employee(double Salary)
	{
		Empno = Empno + 1;
		this.Salary = Salary;
		TotalSalary += Salary;
		count++;
	}
	
	void display()
	{
		System.out.println("Total Employee :- "+Empno);
		System.out.println("Total Salary of All Employee :- "+TotalSalary);
	}
}

class Q38
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double sal;
		Employee[] e1 = new Employee[2];
		
		for(int i=0; i<e1.length; i++)
		{
			System.out.print("Employee Salary :- ");
			sal = sc.nextInt();
			e1[i] = new Employee(sal);
		}
		
			e1[0].display();
	}
}
