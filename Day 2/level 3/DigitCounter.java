
import java.util.*;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;

        // Loop to count digits
        while (number != 0) {
            number /= 10; // Remove the last digit
            count++; // Increment count
        }

        System.out.println("The number of digits is: " + count);
    }
}

