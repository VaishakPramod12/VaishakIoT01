import java.util.*;
public class segment {

    public static void main(String[] args) {

        int[] numbers = {12, 25, 32, 45, 52, 67};

        int search = 2;

        ArrayList<Integer> result = new ArrayList<>();

        for (int number : numbers) {

            if (String.valueOf(number).contains(String.valueOf(search))) {
                result.add(number);
            }
        }

        System.out.println("Search results:");

        for (int number : result) {
            System.out.println(number);
        }
    }
}

