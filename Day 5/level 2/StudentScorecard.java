import java.util.*;

public class StudentScorecard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        // Generate random scores
        int[][] scores = generateScores(n);

        // Calculate results
        double[][] results = calculateResults(scores);

        // Calculate grades
        String[] grades = calculateGrades(results);

        // Display scorecard
        displayScorecard(scores, results, grades);
    }

    public static int[][] generateScores(int n) {
        Random random = new Random();
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = random.nextInt(51) + 50; // Physics
            scores[i][1] = random.nextInt(51) + 50; // Chemistry
            scores[i][2] = random.nextInt(51) + 50; // Math
        }

        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double percentage = (double) total / 3;
            results[i][0] = total;
            results[i][1] = percentage;
        }

        return results;
    }

    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][1];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            }
			else if (percentage >= 50) {
                grades[i] = "D";
            }
			else if (percentage >= 40) {
                grades[i] = "E";
            }
			else {
                grades[i] = "R";
            }
        }

        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Physics\tChemistry\tMath\tTotal\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.0f\t%.2f\t\t%s%n",
                scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], grades[i]);
        }
    }
}
