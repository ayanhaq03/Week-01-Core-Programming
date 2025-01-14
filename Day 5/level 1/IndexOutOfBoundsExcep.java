import java.util.*;

public class IndexOutOfBoundsExcep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Method to generate the exception
        try {
            generateException(str);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }

        // Method to handle the exception
        handleException(str);

        
    }

    static void generateException(String str) {
        System.out.println("Accessing character at index " + (str.length() + 1) + ":");
        char ch = str.charAt(str.length() + 1); // This will throw StringIndexOutOfBoundsException
        System.out.println("Character: " + ch);
    }

    static void handleException(String str) {
        try {
            System.out.println("Accessing character at index " + (str.length() + 1) + ":");
            char ch = str.charAt(str.length() + 1);
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
