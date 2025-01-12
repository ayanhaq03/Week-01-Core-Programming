
import java.util.*;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // 2D array to store height, weight, and BMI
        double[][] personData = new double[n][3]; // [height, weight, BMI]
        String[] weightStatus = new String[n];   // Array to store weight status

        // Input height and weight for each person
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            // Validate height input
            do {
                System.out.print("Enter height (in meters): ");
                personData[i][0] = sc.nextDouble(); // Height is stored in the 1st column
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (personData[i][0] <= 0);

            // Validate weight input
            do {
                System.out.print("Enter weight (in kg): ");
                personData[i][1] = sc.nextDouble(); // Weight is stored in the 2nd column
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI and store it in the 3rd column
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status based on BMI
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the details
        System.out.println("\nBMI Report:");
        System.out.println("Person\tHeight (m)\tWeight (kg)\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + personData[i][0] + "\t\t" + personData[i][1] + "\t\t" + personData[i][2] + "\t" + weightStatus[i]);
        }
    }
}

