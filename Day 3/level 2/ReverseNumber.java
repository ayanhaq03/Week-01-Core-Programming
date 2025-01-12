
import java.util.*;

public class ReverseNumber {
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

        // Print the reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
}

