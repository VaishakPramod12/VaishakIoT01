package package3;

public class salary 
{
public static void main(String[] args)
{
	int emp1=1000,emp2=1500,emp3=2000,emp4=2500,emp5=3000,i;
	double total, avg;
	for(i=emp1;i<emp5;i++)
		total=total+i;
	avg=total/5;
	System.out.println("Total salary:"+total);
	System.out.println("Average:"+avg);
	
		
}
}
