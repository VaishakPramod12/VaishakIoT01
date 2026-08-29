package package7;
import java.util.Scanner;
class Employee
{
	    String name; 
	    public Employee(String name) 
	    {
	        this.name = name; 
	    }
	    public void displayDetails() 
	    {
	        System.out.println("Employee Name: " + this.name);
	    }
}

public class own 
{
	  public static void main(String[] args)
	  {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter employee name: ");
	        String userName = scanner.nextLine(); 
	        Employee emp = new Employee(userName);
	        emp.displayDetails();
	  }
}


