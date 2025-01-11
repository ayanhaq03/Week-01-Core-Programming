import java.util.*;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input Fahrenheit temperature
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        
        // Convert to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        // Print result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius");
    }
}
