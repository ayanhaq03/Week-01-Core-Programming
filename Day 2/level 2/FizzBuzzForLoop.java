import java.util.*;

public class FizzBuzzForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input 
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

       
    }
}
