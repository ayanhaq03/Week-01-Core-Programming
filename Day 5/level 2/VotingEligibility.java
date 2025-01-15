import java.util.*;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generate random ages
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        int[] ages = generateAges(n);

        // Check voting eligibility
        String[][] result = checkVotingEligibility(ages);

        // Display result in tabular format
        System.out.println("Age\tCan Vote");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(50) + 10; // Age between 10 and 60
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "True" : "False";
        }

        return result;
    }
}
