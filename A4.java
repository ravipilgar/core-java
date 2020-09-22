//Write a program that initializes 2 byte type of variables. Add the values of these variables and store in a byte type of variable. [Note: primitive down casting is required in this program ] .

class A4
{
	public static void main(String[] args){
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1 + b2);
		System.out.println("b3-->"+b3);
	}
}
