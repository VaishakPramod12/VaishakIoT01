package package9;
import java.util.*;
public class time 
{
	public static void main(String[] args)
	{
		String[] patient = {"A", "B", "C", "D", "E"};
 int[] arr= {9,9,9,10,10};
 int[] dep= {10,11,10,11,12};
 int lastDeparture = dep[0];
 System.out.println("Selected Patient: " + patient[0]);
 System.out.println("Arrival: " + arr[0]);
 System.out.println("Departure: " + dep[0]);
 for (int i = 1; i < arr.length; i++) {
     if (arr[i] >= lastDeparture) {

         System.out.println("\nSelected Patient: " + patient[i]);
         System.out.println("Arrival: " + arr[i]);
         System.out.println("Departure: " + dep[i]);
         lastDeparture = dep[i];
     }
 }
}
}
