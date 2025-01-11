import java.util.*;

public class CalculateBMI{
    public static void main(String[] args) {
            // taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
		
        double weight = sc.nextDouble(); 
		
		 
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble(); 
		
        // Converting height from cm to meters
        double heightM = heightCm / 100;  
		
		// Calculating BMI
        double bmi = weight / (heightM * heightM);  

        System.out.println("BMI: " + bmi);  
		
        // Determine the BMI category
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } 
		else if (bmi < 24.9) {
            System.out.println("Normal weight");
        } 
		else if (bmi < 29.9) {
            System.out.println("Overweight");
        } 
		else {
            System.out.println("Obese");
        }
      
    }
}

