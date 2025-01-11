import java.util.*;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input Celsius temperature
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        
        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        // Print result
        System.out.println("The " + celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
