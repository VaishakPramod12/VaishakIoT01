package package2;

public class exception2 
{
	public static void main(String[] args) {
		try {
			System.out.println("anand");
			System.out.println(10 / 0);
		} catch (ArithmeticException ne) {
			System.out.println("u r getting ne" + ne);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code"); 
	}
}
