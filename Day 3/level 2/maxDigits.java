
import java.util.*;

public class maxDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Count the number of digits
        int temp = number;
        int digitCount = 0;
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        // Create an array to store the digits
        int[] digits = new int[digitCount];
        int index = 0;

        // Populate the array with digits
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Find the largest and second largest digits
        int largest = 0, secondLargest = 0;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit < largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}

