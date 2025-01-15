import java.util.*;

public class ShortestLongestWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a text:");
        String text = sc.nextLine();

        // Splitting words
        String[] words = customSplit(text);

        // Finding shortest and longest words
        String[] result = findShortestAndLongest(words);

        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
    }

    public static String[] customSplit(String text) {
        return text.split(" ");
    }

    public static String[] findShortestAndLongest(String[] words) {
        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return new String[]{shortest, longest};
    }
}
