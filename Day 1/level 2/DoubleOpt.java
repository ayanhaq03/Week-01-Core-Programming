import java.util.*;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input double values
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();
        
        // Perform operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        
        // Print results
        System.out.println("The results of Double Operations are: " + result1 + ", " + result2 + ", and " + result3);
    }
}
