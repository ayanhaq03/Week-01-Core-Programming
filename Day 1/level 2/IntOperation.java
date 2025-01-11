import java.util.*;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input values for a, b, and c
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();
        System.out.print("Enter value for c: ");
        int c = sc.nextInt();
        
        // Perform operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        
        // Print results
        System.out.println("The results of Int Operations are: " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
