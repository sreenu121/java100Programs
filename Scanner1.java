import java.util.*;
class Scanner1{
	public static void main(String []args){
		int a;
		float b;
		double c;
		String x;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integer number");
		a = sc.nextInt();
		System.out.println("your enterd interger number"+a);
		System.out.println("enter the float number ");
		b=sc.nextFloat();
		System.out.println("your enterd float number"+b);
		System.out.println("Enter the double value");
		c = sc.nextDouble();
		System.out.println("your entered double value"+c);
		System.out.println("Enter the String value");
		x = sc.nextLine();
		System.out.println("Entered String value"+x);
		int ax= a+b;
		System.out.println("the addition of two numbers"+ax);
		
		
	}
}
