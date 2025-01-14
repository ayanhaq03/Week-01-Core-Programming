public class NullPointerExcep {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; 
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {
        String text = null; 
        try {
            
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            // Handle the exception
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException:");
        try {
            generateException(); // Call the method that generates the exception
        } catch (NullPointerException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }

        System.out.println("\nDemonstrating handling of NullPointerException:");
        handleException(); // Call the method that handles the exception
    }
}