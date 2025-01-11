import java.util.*;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;

        // Calculating power using loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        
        System.out.println(number + " raised to the power " + power + " is: " + result);

        scanner.close();
    }
}
