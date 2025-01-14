import java.util.*;

 class ArrayIndexOutOfBoundsExcep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] names = new String[size];

        System.out.println("Enter names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.nextLine();
        }

        // Method to generate the exception
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Method to handle the exception
        handleException(names);

        
    }

    static void generateException(String[] names) {
        System.out.println("Accessing index " + names.length + ":");
        String name = names[names.length]; // This will throw ArrayIndexOutOfBoundsException
        System.out.println("Name: " + name);
    }

    static void handleException(String[] names) {
        try {
            System.out.println("Accessing index " + names.length + ":");
            String name = names[names.length];
            System.out.println("Name: " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
