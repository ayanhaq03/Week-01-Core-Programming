import java.util.*;

public class TravelComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Take user input for cities
        System.out.print("Enter the starting city (fromCity): ");
        String fromCity = sc.nextLine();
        System.out.print("Enter the via city (viaCity): ");
        String viaCity = sc.nextLine();
        System.out.print("Enter the destination city (toCity): ");
        String toCity = sc.nextLine();

        // Take user input for distances
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in km: ");
        double distanceFromToVia = sc.nextDouble();
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in minutes: ");
        int timeFromToVia = sc.nextInt();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in km: ");
        double distanceViaToFinalCity = sc.nextDouble();
        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in minutes: ");
        int timeViaToFinalCity = sc.nextInt();

        // Calculate total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details
        System.out.println("\nThe Total Distance travelled by " + name + " from " + 
                           fromCity + " to " + toCity + " via " + viaCity +
                           " is " + totalDistance + " km and " +
                           "the Total Time taken is " + totalTime + " minutes");
    }
}
