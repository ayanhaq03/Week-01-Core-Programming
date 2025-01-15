import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // 2D array for weight and height

        //  Taking user input for weight and height
        System.out.println("Enter the weight (kg) and height (cm) of 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        // calculating BMI and status
        String[][] bmiResults = computeBMI(data);

     
        displayResults(bmiResults);
    }

    // Method to calculate BMI and status
    public static String[][] computeBMI(double[][] data) {
        String[][] results = new String[10][4]; // Columns: Height, Weight, BMI, Status

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);

            results[i][0] = String.format("%.2f", data[i][1]); // Height in cm
            results[i][1] = String.format("%.2f", weight); // Weight in kg
            results[i][2] = String.format("%.2f", bmi); // BMI value
            results[i][3] = getStatus(bmi); // BMI status
        }

        return results;
    }

    // Method to get BMI status
    public static String getStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to display the results
    public static void displayResults(String[][] results) {
        System.out.println("\nPerson Height (cm)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + "\t\t\t" +
                               results[i][1] + "\t\t" +
                               results[i][2] + "\t\t" +
                               results[i][3]);
        }
    }
}
