import java.util.*;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        
        // Swap numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;
        
        // Print result
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
