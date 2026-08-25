package package4;
import java.util.Arrays;
public class anagram
{
public static void main(String[] args)
{
	 String s1 = "silent";
     String s2 = "listen";
     if (s1.length() != s2.length()) 
     {
         System.out.println("Not anagrams");
         return;
     }
     char[] array1 = s1.toCharArray();
     char[] array2 = s2.toCharArray();
     Arrays.sort(array1);
     Arrays.sort(array2);
     if (Arrays.equals(array1, array2)) {
         System.out.println("They are anagrams!");
     } else {
         System.out.println("Not anagrams");
     }
 }
}
