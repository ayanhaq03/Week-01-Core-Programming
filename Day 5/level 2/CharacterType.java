import java.util.*;

public class CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Identify character types
        String[][] result = identifyCharacterTypes(text);

        // Display result in tabular format
        System.out.println("Character\tType");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static String[][] identifyCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);

            if (Character.isLetter(ch)) {
                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    result[i][1] = "Vowel";
                } else {
                    result[i][1] = "Consonant";
                }
            } else {
                result[i][1] = "Not a Letter";
            }
        }

        return result;
    }
}
