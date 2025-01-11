import java.util.*;

public class LeapYearMultipleIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Checking if the year is valid for the Gregorian calendar
        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } else {
            // Check leap year conditions
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }
        
    }
}
