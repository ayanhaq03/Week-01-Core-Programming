import java.util.*;

public class Factorial {
    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        // taking input 
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Checking if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1;
            int i = 1;

            // calculating factorial using a while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
       
    }
}
