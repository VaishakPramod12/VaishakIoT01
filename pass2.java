package package6;
import java.util.Scanner;
public class pass2 
{

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter password");
	    	String pass=sc.nextLine();

	        switch (pass) {

	            case "123":
	                System.out.println("Trying: " + pass);
	                System.out.println("Wrong password. Go back and try another.");
	                break;

	            case "132":
	                System.out.println("Trying: " + pass);
	                System.out.println("Wrong password. Go back and try another.");
	                break;

	            case "213":
	                System.out.println("Trying: " + pass);
	                System.out.println("Wrong password. Go back and try another.");
	                break;

	            case "231":
	                System.out.println("Trying: " + pass);
	                System.out.println("Password found: " + pass);
	                break;

	            default:
	                System.out.println("Invalid password");
	        }
	    }
}
