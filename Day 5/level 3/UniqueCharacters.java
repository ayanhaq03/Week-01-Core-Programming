import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Display unique characters
        System.out.println("Unique Characters:");
        for (char c : uniqueChars) {
            if (c != '\0') {
                System.out.print(c + " ");
            }
        }
    }

    public static int getLength(String text) {
        int length = 0;
        for (char ignored : text.toCharArray()) {
            length++;
        }
        return length;
    }

    public static char[] findUniqueCharacters(String text) {
        int length = getLength(text);
        char[] result = new char[length];
        int resultIndex = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                result[resultIndex++] = currentChar;
            }
        }

        return result;
    }
}
