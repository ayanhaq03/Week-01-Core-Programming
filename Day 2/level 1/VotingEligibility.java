import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner object to read user input

        //taking user input
        System.out.print("Enter the age: ");
        int age = scanner.nextInt(); 

        // Check if the age is 18 or older
        if (age >= 18) {
         
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
           
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
