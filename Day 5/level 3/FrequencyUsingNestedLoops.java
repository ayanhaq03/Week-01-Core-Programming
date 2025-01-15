import java.util.*;

public class FrequencyUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Find frequencies
        String[][] frequencies = findFrequenciesWithNestedLoops(text);

        // Display results
        System.out.println("Character\tFrequency");
        for (String[] frequency : frequencies) {
            if (frequency != null) {
                System.out.println(frequency[0] + "\t\t" + frequency[1]);
            }
        }
    }

    public static String[][] findFrequenciesWithNestedLoops(String text) {
        char[] characters = text.toCharArray();
        boolean[] counted = new boolean[characters.length];
        String[][] result = new String[characters.length][2];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (counted[i]) {
                continue;
            }

            char currentChar = characters[i];
            int frequency = 1;

            for (int j = i + 1; j < characters.length; j++) {
                if (characters[j] == currentChar) {
                    frequency++;
                    counted[j] = true;
                }
            }

            result[index][0] = String.valueOf(currentChar);
            result[index][1] = String.valueOf(frequency);
            index++;
        }

        return result;
    }
}
