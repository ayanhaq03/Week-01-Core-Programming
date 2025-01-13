import java.util.*; 

public class WindChillCalculator {
    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) + 
               (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for temperature and wind speed
        System.out.println("Enter the temperature (in Fahrenheit): ");
        double temperature = sc.nextDouble();
        System.out.println("Enter the wind speed (in mph): ");
        double windSpeed = sc.nextDouble();

        
        double windChill = calculateWindChill(temperature, windSpeed);

       
        System.out.println("The wind chill temperature is " + windChill + "°F");
    }
}
