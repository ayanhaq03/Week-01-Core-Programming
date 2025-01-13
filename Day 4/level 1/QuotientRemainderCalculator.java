import java.util.*; 

public class QuotientRemainderCalculator {
    // Method to calculate the quotient and remainder
    public static int[] findRemainderAndQuotient(int dividend, int divisor) {
        int quotient = dividend / divisor; // Calculating quotient
        int remainder = dividend % divisor; // Calculating remainder
        return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for dividend and divisor
        System.out.println("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();

       
        int[] result = findRemainderAndQuotient(dividend, divisor);

        // Displaying the results
        System.out.println("The quotient is " + result[0]);
        System.out.println("The remainder is " + result[1]);
    }
}
