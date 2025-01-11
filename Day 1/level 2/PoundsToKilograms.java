import java.util.*;

public class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input weight in pounds
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        
        // Convert to kilograms
        double kilograms = pounds / 2.2;
        
        // Print result
        System.out.println("The weight of the person in pounds is " + pounds + " and in kilograms is " + kilograms);
    }
}
