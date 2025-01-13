import java.util.*; 

public class AthleteRoundsCalculator {
    // Method to calculate the number of rounds needed to complete a given distance
    public static double calculateRounds(double side1, double side2, double side3, double distance) {
        double perimeter = side1 + side2 + side3; // Calculating the perimeter of the triangle
        return distance / perimeter; // Calculating the number of rounds
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for the sides of the triangle
        System.out.println("Enter side1: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter side2: ");
        double side2 = sc.nextDouble();
        System.out.println("Enter side3: ");
        double side3 = sc.nextDouble();

        // Calculating the number of rounds 
        double rounds = calculateRounds(side1, side2, side3, 5000);

       
        System.out.println("The athlete must complete " + rounds + " rounds to complete a 5 km run.");
    }
}
