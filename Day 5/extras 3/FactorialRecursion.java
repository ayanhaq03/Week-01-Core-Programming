import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        int number = getInput("Enter a number: ");
        System.out.println("The factorial of " + number + " is: " + factorial(number));
    }

    // Function to take input from the user
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Recursive function to calculate factorial
    public static int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        return num * factorial(num - 1);
    }
}
