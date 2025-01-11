import java.util.Scanner;

public class ConvertKmToMiles {
    public static void main(String[] args) {
		
		
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
		
		//taking input from scanner
        double km = input.nextDouble();
		
		//converting mile to kilometers
        double miles = km / 1.6;
		
        System.out.println("The total miles is " + miles + " miles for the given " + km + " km");
    }
}
