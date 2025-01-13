import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking user input
        System.out.print("Enter the employee's salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter the employee's years of service ");
        int yearsOfService = input.nextInt();

        // Checking if years of service is more than 5 and calculate bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus is applicable.");
        }
        
    }
}
