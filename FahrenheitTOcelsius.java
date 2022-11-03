import java.util.*;
class FahrenheitTOcelsius{
	public static void main(String[]args)
	{
		int temparature;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the current temparature");
		temparature = sc.nextInt();
		System.out.println("Current room temparature is :"+temparature);
		temparature = ((temparature -32)*5)/9;
		System.out.println("Temparature in celsius :"+temparature);
	}
}
		