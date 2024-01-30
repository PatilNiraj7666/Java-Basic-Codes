import java.util.*;
class ScannerDemo
{
	public static void main(String args[])
	{
		float a,b,c;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 2 Integer Numbers:");	

		a = sc.nextFloat();

		b = sc.nextFloat();

		c = a + b;

		System.out.println("Addition="+c);
	
	}
}