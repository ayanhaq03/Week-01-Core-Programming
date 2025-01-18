import java.util.Scanner;

public class GCDLCMCalculator {
    public static void main(String[] args) {
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    // Function to take input from the user
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Function to calculate GCD
    public static int calculateGCD(int a, int b) {
        return (b == 0) ? a : calculateGCD(b, a % b);
    }

    // Function to calculate LCM
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
