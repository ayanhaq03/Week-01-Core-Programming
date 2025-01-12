import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // Arrays to store height, weight, BMI, and weight status
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input height and weight of each person
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            // Validate height input
            do {
                System.out.print("Enter height (in meters): ");
                height[i] = sc.nextDouble();
                if (height[i] <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (height[i] <= 0);

            // Validate weight input
            do {
                System.out.print("Enter weight (in kg): ");
                weight[i] = sc.nextDouble();
                if (weight[i] <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (weight[i] <= 0);

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display the details
        System.out.println("BMI Report:");
        System.out.println("Person\tHeight (m)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("", (i + 1), height[i], weight[i], bmi[i], status[i]);
        }
    }
}

