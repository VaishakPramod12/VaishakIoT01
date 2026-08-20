package package3;
import java.util.Scanner;
public class factorial 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int num, sum=0, i;
	System.out.println("Enter the number");
	num=sc.nextInt();
	for(i=1;i<=num;i++)
		sum=i+sum;
	System.out.println("The sum is:"+sum);
}
}
