import java.util.*; 

public class HandshakeCalculator {
    // Method to calculate maximum handshakes 
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2; // Formula for maximum handshakes
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for the number of students
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();

        // Calculating the maximum number of handshakes
        int handshakes = calculateHandshakes(n);

        // Displaying the result
        System.out.println("The maximum number of handshakes is " + handshakes);
    }
}
