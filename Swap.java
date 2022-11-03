import java.util.*;
class Swap{
	public static void main(String []args)
	{
		int x,y,tem;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE X VALUE:");
		x= sc.nextInt();
		System.out.println("ENTER THE Y VALUE:");
		y = sc.nextInt();
		System.out.println("before swaping the two numbers"+x+"\n"+ y );
		
		x = y;
		y = x;
		tem = x;
		System.out.println("after swaping the values"+x+"\n"+y+"\n "+tem);
	}
}