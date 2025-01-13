import java.util.*; 
public class NumberCheck {
    // Method to determine if a number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) return 1; 
        if (number < 0) return -1; 
        return 0; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for a number
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        // Checking the number's sign using the method
        int result = checkNumber(number);

        // Displaying the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
