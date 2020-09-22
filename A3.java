/*Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]*/

class A3
{
	public static void main(String[] args){
		// A
		/*int y,x=10;
		y=(x*x) + 3*x - 7;
		System.out.println(y);*/
		
		// B
		/*int y,x=10;
		y = x++ - ++x;
		System.out.println("Y = "+y);
		System.out.println("X = "+x);*/
		
		// C
		/*int z,y=10,x=20;
		z = x++ - --y - --x  +  x++;
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		System.out.println("Z = "+z);*/
		
		// D
		boolean x=true,y=false,z;
		z = x && y || !(x || y);
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		System.out.println("Z = "+z);
	}
}
