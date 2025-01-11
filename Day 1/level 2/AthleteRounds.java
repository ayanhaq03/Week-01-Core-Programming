import java.util.*;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input sides of the triangular park
        System.out.print("Enter side1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = sc.nextDouble();
        
        // Calculate perimeter and rounds
        double perimeter = side1 + side2 + side3;
        int rounds = (int)(5000 / perimeter);
        
        // Print result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
    }
}
