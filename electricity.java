package package3;

public class electricity
{
public static void main(String[] args)
{
	int total=0;
	int[] units= {10,20,30,40,50};
	for (int i : units) {
	total=total+i;}
	System.out.println("The sum is:"+ total);
}
}
