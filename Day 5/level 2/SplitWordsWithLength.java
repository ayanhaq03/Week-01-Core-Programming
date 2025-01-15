import java.util.*;

public class SplitWordsWithLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a text:");
        String text = sc.nextLine();

        // Splitting words and calculating lengths
        String[][] result = wordsWithLength(text);

        // Display result in tabular format
        System.out.println("Word\tLength");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static String[][] wordsWithLength(String text) {
        String[] words = customSplit(text);
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static String[] customSplit(String text) {
        // Split logic from the previous program
        return text.split(" "); // Replace with manual split if needed
    }

    public static int findLength(String word) {
        int length = 0;
        for (char c : word.toCharArray()) {
            length++;
        }
        return length;
    }
}
