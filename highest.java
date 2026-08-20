package package3;

public class highest
{
public static void main(String[] args)
{
	int[] students= {78,65,89,92,71};
	int max = students[0]; 
    
    for (int i = 1; i < students.length; i++) {
        if (students[i] > max) {
            max = students[i];
        }
    }
    System.out.println("Highest number: " + max); 
	
}
}
