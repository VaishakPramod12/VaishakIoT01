package package4;

public class repeat 
{
public static void main(String[] args)
{
	String st = "programmer";
	int repeat = countRepeat(st);
	System.out.println("\nInput String: " + st);
    System.out.println("Number of repeated characters: " + repeat);
}

public static int countRepeat(String str) {
    if (str == null || str.isEmpty()) {
        return 0;
    }

    char[] chars = str.toCharArray();
    int duplicate = 0;

    for (int i = 0; i < chars.length; i++) {
        if (chars[i] == '\0') {
            continue;
        }

        int matchCount = 1;

        for (int j = i + 1; j < chars.length; j++) {
            if (chars[i] == chars[j]) {
                matchCount++;
                chars[j] = '\0'; 
            }
        }

        if (matchCount > 1) {
            duplicate++;
            System.out.println("'" + chars[i] + "' is repeated " + matchCount + " times.");
        }
    }

    return duplicate;
}
}

