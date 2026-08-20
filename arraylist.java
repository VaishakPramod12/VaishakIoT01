package package3;
import java.util.ArrayList;
public class arraylist 
{
	public static void main(String[] args) {
        // create an ArrayList
        ArrayList list = new ArrayList();

        System.out.println("Initial size of ArrayList before adding elements: " + list.size());
        System.out.println("ArrayList is empty before adding values: " + list.isEmpty());
        System.out.println("Contents of ArrayList before adding values: " + list);

        // adding elements or values to the ArrayList
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");
         list.add("A");
        list.add(null);

        System.out.println("Size of ArrayList after adding elements: " + list.size());
        System.out.println("Arraylist is empty after adding values"+list.isEmpty());
        System.out.println("Contents of Arraylist after adding values" + list);
        boolean b1=list.contains("E");
        System.out.println("E is present" + b1);
    }
}
