import java.util.*;

public class NumberFormatExcep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number as a string: ");
        String numberStr = scanner.nextLine();

        // Method to generate the exception
        try {
            generateException(numberStr);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        // Method to handle the exception
        handleException(numberStr);

        
    }

    static void generateException(String str) {
        System.out.println("Parsing string to number:");
        int num = Integer.parseInt(str); // This will throw NumberFormatException
        System.out.println("Parsed number: " + num);
    }

    static void handleException(String str) {
        try {
            System.out.println("Parsing string to number:");
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e.getMessage());
        }
    }
}
