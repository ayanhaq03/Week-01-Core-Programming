import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();

        if (choice == 1) {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temp));
        } else if (choice == 2) {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
