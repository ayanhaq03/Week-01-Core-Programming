import java.util.*;

public class TrimSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string with leading/trailing spaces:");
        String text = sc.nextLine();

        // Trim spaces
        String trimmedText = trimSpaces(text);

        // Display result
        System.out.println("Trimmed Text: '" + trimmedText + "'");
    }

    public static String trimSpaces(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return text.substring(start, end + 1);
    }
}
