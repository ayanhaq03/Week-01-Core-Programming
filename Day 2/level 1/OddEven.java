import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            
            for (int i = 1; i <= number; i++) {
                // Check if the number is odd or even and print
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }
        
    }
}
