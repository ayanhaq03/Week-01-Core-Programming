import java.util.*; 

public class SpringSeasonChecker {
    // Method to check if the given month and day fall in the spring season
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for month and day
        System.out.println("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.println("Enter day (1-31): ");
        int day = sc.nextInt();

        
        boolean isSpring = isSpringSeason(month, day);

        
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
