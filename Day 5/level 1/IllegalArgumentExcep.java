import java.util.*;

public class IllegalArgumentExcep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string for substring: ");
        String str = scanner.nextLine();

        // Method to generate the exception
        try {
            generateException(str);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        // Method to handle the exception
        handleException(str);

        
    }

    static void generateException(String str) {
        System.out.println("Creating substring with start index > end index:");
        String sub = str.substring(5, 2); // This will throw IllegalArgumentException
        System.out.println("Substring: " + sub);
    }

    static void handleException(String str) {
        try {
            System.out.println("Creating substring with start index > end index:");
            String sub = str.substring(5, 2);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());
        }
    }
}
