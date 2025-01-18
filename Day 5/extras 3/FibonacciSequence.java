import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        int terms = getInput("Enter the number of terms for the Fibonacci sequence: ");
        generateFibonacci(terms);
    }

    // Function to take input from the user
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Function to generate the Fibonacci sequence
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
