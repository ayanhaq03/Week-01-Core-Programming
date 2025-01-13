import java.util.*;

public class FootballTeam {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Array to store heights of players
        int[] heights = new int[11];
        Random random = new Random();

        // Generate random heights between 150 and 250 cms
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101);
        }

     
        System.out.println("Heights of players: " + Arrays.toString(heights));

      
        System.out.println("Shortest height: " + findShortest(heights) + " cms");
        System.out.println("Tallest height: " + findTallest(heights) + " cms");
        System.out.println("Mean height: " + findMean(heights) + " cms");
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int min = Integer.MAX_VALUE;
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int max = Integer.MIN_VALUE;
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    // Method to calculate the mean height
    public static double findMean(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return (double) sum / heights.length;
    }
}
