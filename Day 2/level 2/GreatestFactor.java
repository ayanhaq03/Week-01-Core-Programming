import java.util.*;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int greatestFactor = 1;

        // Find greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Output result
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

       
    }
}

