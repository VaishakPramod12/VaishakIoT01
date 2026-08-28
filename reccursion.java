package package6;

public class reccursion
{
	 static void withdraw(int balance) 
	 {
	        if (balance < 2000) 
	        {
	            System.out.println("Remaining balance: ₹" + balance);
	            return;
	        }
	        balance = balance - 2000;
	        System.out.println("Withdrew ₹2000");
	        System.out.println("Remaining balance: ₹" + balance);
	        withdraw(balance);
	    }

	    public static void main(String[] args) {
	        int balance = 10000;
	        withdraw(balance);
	    }
}
