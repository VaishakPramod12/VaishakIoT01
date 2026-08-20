package package3;
import java.util.Scanner;
public class calculator
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int sum, sub, mul,div;
	System.out.println("Enter calculation");
	int i=sc.nextInt();
	switch(i)
	{
	case 1:
		sum=a+b;
		System.out.println("Sum is:" + sum);
		break;
	case 2:
		sub=a-b;
		System.out.println("Sub is:" + sub);
		break;
	case 3:
		mul=a*b;
	    System.out.println("Mul is:" + mul);
	    break;
	case 4:
		div=a/b;
		System.out.println("Div is" + div);
		break;
    default:
    	System.out.println("Invalid");
    	break;
}
}
}
