import java.util.*; 

public class SmallestAndLargest {
    // Method to find the smallest and largest numbers among three inputs
    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int smallest = Math.min(num1, Math.min(num2, num3)); // Finding the smallest number
        int largest = Math.max(num1, Math.max(num2, num3)); // Finding the largest number
        return new int[] {smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for three numbers
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        int[] result = findSmallestAndLargest(num1, num2, num3);

        // Displaying the results
        System.out.println("The smallest number is " + result[0]);
        System.out.println("The largest number is " + result[1]);
    }
}
