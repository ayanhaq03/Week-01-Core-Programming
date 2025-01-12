
import java.util.*;

public class FizzBuzzFizzBuzzFizzBuzzFizzBuzzFizzBuzzFizzBuzzFizzBuzzFizzBuzzFizzBuzzFizzBuzzFizzBuzzFizzBuzzFizzBuzzFizzBuzzFizzBuzzFizzBuzzFizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Not a positive number.");
            return;
        }

        String[] results = new String[number + 1];

        // FizzBuzz logic
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Displaying results
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}

