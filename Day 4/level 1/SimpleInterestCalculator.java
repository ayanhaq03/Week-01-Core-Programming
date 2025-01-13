import java.util.*;

public class SimpleInterestCalculator {
    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for principal, rate, and time
        System.out.println("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.println("Enter Rate: ");
        double rate = sc.nextDouble();
        System.out.println("Enter Time: ");
        double time = sc.nextDouble();

        // Calculating simple interest using the method
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

       
        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           " and Time " + time);
    }
}
