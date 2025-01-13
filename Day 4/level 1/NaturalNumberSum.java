import java.util.*; 

public class NaturalNumberSum {
    // Method to calculate the sum of n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0; // Initializing the sum
        for (int i = 1; i <= n; i++) {
            sum += i; // Adding each number to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for the value of n
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

      
        int sum = sumOfNaturalNumbers(n);

        // Displaying the result
        System.out.println("The sum of first " + n + " natural numbers is " + sum);
    }
}
