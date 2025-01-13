import java.util.*; 

public class TrigonometricFunctions {
    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Converting angle to radians
        double sine = Math.sin(radians);       // Calculating sine
        double cosine = Math.cos(radians);     // Calculating cosine
        double tangent = Math.tan(radians);    // Calculating tangent
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for angle
        System.out.println("Enter an angle in degrees: ");
        double angle = sc.nextDouble();

        
        double[] results = calculateTrigonometricFunctions(angle);

        // Displaying the results System.out.println("Sine of " + angle + "° is " + results[0]);
        System.out.println("Cosine of " + angle + "° is " + results[1]);
        System.out.println("Tangent of " + angle + "° is " + results[2]);
    }
}
