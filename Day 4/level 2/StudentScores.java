import java.util.*;

public class StudentScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random scores for Physics, Chemistry, and Math
        int[][] pcmScores = generateRandomScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] calculatedData = calculateScores(pcmScores);

        // Display the results in a tabular format
        displayResults(pcmScores, calculatedData);
    }

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // [students][0: physics, 1: chemistry, 2: math]
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40 + (int) (Math.random() * 61); // Random scores between 40 and 100
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateScores(int[][] pcmScores) {
        double[][] data = new double[pcmScores.length][3]; // [students][0: total, 1: average, 2: percentage]
        for (int i = 0; i < pcmScores.length; i++) {
            int total = 0;
            for (int score : pcmScores[i]) {
                total += score;
            }
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            data[i][0] = total;
            data[i][1] = Math.round(average * 100.0) / 100.0; // Round off to 2 decimal places
            data[i][2] = Math.round(percentage * 100.0) / 100.0; // Round off to 2 decimal places
        }
        return data;
    }

    // Method to display the results
    public static void displayResults(int[][] pcmScores, double[][] calculatedData) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < pcmScores.length; i++) {
            int physics = pcmScores[i][0];
            int chemistry = pcmScores[i][1];
            int math = pcmScores[i][2];
            double total = calculatedData[i][0];
            double average = calculatedData[i][1];
            double percentage = calculatedData[i][2];
            String grade = getGrade(percentage);

            System.out.println(
                (i + 1) + "\t" +
                physics + "\t" +
                chemistry + "\t\t" +
                math + "\t" +
                total + "\t" +
                average + "\t" +
                percentage + "\t\t" +
                grade
            );
        }
    }

    // Method to determine the grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }
}
