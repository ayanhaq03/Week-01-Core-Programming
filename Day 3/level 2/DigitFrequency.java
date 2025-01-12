
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        // Initialize the frequency array
        int[] frequency = new int[10];

        // Extract digits and update frequency
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            frequency[digit]++;
            number /= 10; // Remove the last digit
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}

