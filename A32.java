//Modify the above program (no. 30) to count the no of A32 objects created. [ In this program static variable is required ]

public class A32
{
	static int count = 0;
	A32(){
			count++;
		}	
	
	public static void main(String[] args){
		A32 s1 = new A32();
		A32 s2 = new A32();
		A32 s3 = new A32();
		A32 s4 = new A32();
		System.out.println("Number of object-->"+count);
	}
}
