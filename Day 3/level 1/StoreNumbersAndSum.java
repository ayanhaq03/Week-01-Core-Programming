
import java.util.*;

public class StoreNumbersAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Taking user input until a condition is met
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();
            if (input <= 0 || index == 10) break;
            numbers[index++] = input;
        }

        // Calculating the sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Displaying results
        System.out.println("Numbers entered: " + Arrays.toString(Arrays.copyOf(numbers, index)));
        System.out.println("Sum of numbers: " + total);
    }
}

