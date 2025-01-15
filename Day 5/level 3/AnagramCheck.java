import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user inputs
        System.out.println("Enter the first string:");
        String text1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String text2 = sc.nextLine();

        // Check if anagrams
        boolean isAnagram = areAnagrams(text1, text2);

        // Display result
        System.out.println("Are the strings anagrams? " + isAnagram);
    }

    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) return false;

        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) return false;
        }

        return true;
    }
}
