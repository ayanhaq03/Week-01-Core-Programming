import java.util.*;

public class SplitTextComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a text:");
        String text = sc.nextLine();

        // User-defined split
        String[] userSplit = customSplit(text);

        // Built-in split
        String[] builtInSplit = text.split(" ");

        // Compare the two arrays
        boolean areEqual = compareArrays(userSplit, builtInSplit);

        // Display results
        System.out.println("User-defined split result: " + Arrays.toString(userSplit));
        System.out.println("Built-in split result: " + Arrays.toString(builtInSplit));
        System.out.println("Comparison result: " + (areEqual ? "Equal" : "Not Equal"));
    }

    public static String[] customSplit(String text) {
        // Count spaces to determine the number of words
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }

        String[] words = new String[count + 1];
        int start = 0, index = 0;

        // Extract words using charAt
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start);

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
