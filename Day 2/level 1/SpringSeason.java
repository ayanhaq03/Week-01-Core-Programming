import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
	
	    //taking user input 
        Scanner scanner = new Scanner(System.in); 

        
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt(); 
        System.out.print("Enter the day: ");
        int day = scanner.nextInt(); 

        // Checking if the date is within the spring season (March 20 to June 20)
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
