package package2;

public class multi extends Thread
{
public void run()
{
	for(int i=0;i<5;i++)
		System.out.println("method"+i);
}
public static void main(String[] args)
{
	multi b=new multi();
	b.start();
	for(int i=0;i<5;i++)
		System.out.println("main method"+i);
}
}
