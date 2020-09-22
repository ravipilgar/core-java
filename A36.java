/*    36. Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
        a.  two integers 
        b.  three floats 
        c.  all elements of array 
        d. one double and one integer */

import java.util.*;  
class MathOperation{
	public void multiply(int a,int b){
		int ans = a*b;
		System.out.println("multiply-->"+ans);
	}
	public void multiply(float a, float b, float c){
		float ans = a*b*c;
		System.out.println("multiply-->"+ans);
	}
	public void multiply(int[] arr){
		int mul=1;
		for(int x:arr){
			mul=mul*x;
		}
		System.out.println("multiply-->"+mul);
	}
	public void multiply(double d,int i){
		double ans = d*i;
		System.out.println("multiply-->"+ans);
	}
}

class A36
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		MathOperation m = new MathOperation();
		System.out.println("Enter values");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		m.multiply(a,b);
		
		float c = sc.nextFloat();
		float d = sc.nextFloat();
		float e = sc.nextFloat();
		m.multiply(c,d,e);
		
		int[] arr = {2,3,6};
		m.multiply(arr);
		
		double f = sc.nextDouble();
		int g = sc.nextInt();
		m.multiply(f,g);
	}
}
