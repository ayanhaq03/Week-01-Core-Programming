import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Find frequency of characters
        int[][] frequencies = findCharacterFrequencies(text);

        // Display results
        System.out.println("Character\tFrequency");
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i][1] > 0) {
                System.out.println((char) frequencies[i][0] + "\t\t" + frequencies[i][1]);
            }
        }
    }

    public static int[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256];
        int[][] result = new int[256][2];

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[i][0] = i;
                result[i][1] = frequency[i];
            }
        }

        return result;
    }
}
