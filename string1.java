package package5;
import java.util.*;
public class string1 
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); 
        sb.insert(6, "Beautiful "); 
        sb.delete(6, 16);
        sb.reverse(); 
        String result = sb.toString();
        System.out.println(result);
    }
}


