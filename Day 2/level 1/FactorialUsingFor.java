import java.util.*;

public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1;

            // Calculating factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

           
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        scanner.close();
    }
}
