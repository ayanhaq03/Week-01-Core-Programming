import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner object to read user input

       //taking input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking if the number is positive
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        // Checking if the number is negative
        else if (number < 0) {
            System.out.println("The number is negative.");
        }
        // If the number is neither positive nor negative, it is zero
        else {
            System.out.println("The number is zero.");
        }
    }
}
