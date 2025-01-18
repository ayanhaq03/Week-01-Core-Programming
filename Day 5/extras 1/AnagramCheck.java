
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        // Input strings
        String string1 = "listen";
        String string2 = "silent";

        // Check lengths first
        if (string1.length() != string2.length()) {
            System.out.println("The strings are not anagrams.");
            return;
        }

        // Convert strings to character arrays
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();

        // Sort the arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare sorted arrays
        if (Arrays.equals(array1, array2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
