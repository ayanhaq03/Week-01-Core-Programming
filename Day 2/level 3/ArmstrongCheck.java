
import java.util.*;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int originalNumber = number;

        // Loop to calculate the sum of cubes of digits
        while (originalNumber != 0) {
            int remainder = originalNumber % 10; // Get last digit
            sum += Math.pow(remainder, 3); // Add cube of the digit to sum
            originalNumber /= 10; // Remove the last digit
        }

        // Check if the number is Armstrong
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }
    }
}

