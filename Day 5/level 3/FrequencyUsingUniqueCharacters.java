import java.util.*;

public class FrequencyUsingUniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Find frequencies using unique characters
        String[][] frequencies = findFrequencies(text, uniqueChars);

        // Display results
        System.out.println("Character\tFrequency");
        for (String[] frequency : frequencies) {
            if (frequency != null) {
                System.out.println(frequency[0] + "\t\t" + frequency[1]);
            }
        }
    }

    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int index = 0;

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
                uniqueChars[index++] = currentChar;
            }
        }

        return uniqueChars;
    }

    public static String[][] findFrequencies(String text, char[] uniqueChars) {
        int length = uniqueChars.length;
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            if (uniqueChars[i] != '\0') {
                char currentChar = uniqueChars[i];
                int frequency = 0;

                for (int j = 0; j < text.length(); j++) {
                    if (text.charAt(j) == currentChar) {
                        frequency++;
                    }
                }

                result[i][0] = String.valueOf(currentChar);
                result[i][1] = String.valueOf(frequency);
            }
        }

        return result;
    }
}
