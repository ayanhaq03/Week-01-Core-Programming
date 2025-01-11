
import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first number, operator, and second number
        System.out.print("Enter the first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter the operator (+, -, *, /): ");
        String operator = sc.next();
        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();

        double result;

        // Perform the operation based on the operator
        switch (operator) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
        }
    }
}

