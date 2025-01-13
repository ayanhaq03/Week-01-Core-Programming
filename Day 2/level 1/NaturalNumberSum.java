import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner object to read user input
 
 
       //taking input from user
       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); 

        // Checking if the number is a natural number (0 or positive integer)
        if (number >= 0) {
            // Calculating the sum of natural numbers using the formula n * (n + 1) / 2
            int sum = number * (number + 1) / 2; 
            
           
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            
            System.out.println("The number " + number + " is not a natural number.");
        }
    }
}
