package package3;

public class passorfail
{
public static void main(String[] args)
{
	int[] marks= {35,67,89,22,45,30,76};
	int pass=marks[0];
	for(int i=0;i<marks.length;i++)
		if(i > 40)
			System.out.println("Pass"+i);
		else
			System.out.println("Fail"+i);
		
}
}
