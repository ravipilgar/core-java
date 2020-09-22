//In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]

import java.util.*;
class A12
{
	public static void main(String[] args){
		System.out.println("Enter basic salary");
		Scanner sc = new Scanner(System.in);
		int basicSalary = sc.nextInt();
		float HRA,DA,GS;
		if(basicSalary < 10000){
			HRA=10*(basicSalary/100);
			DA=90*(basicSalary/100);
			GS = basicSalary + HRA + DA;
			System.out.println("Gross salary="+GS);
		}
		else{
			HRA=2000;
			DA=98*(basicSalary/100);
			GS = basicSalary + HRA + DA;
			System.out.println("Gross salary="+GS);
		}
	}
}
