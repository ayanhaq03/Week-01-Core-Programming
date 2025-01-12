
import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            double salary = sc.nextDouble();
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            double serviceYears = sc.nextDouble();

            if (salary <= 0 || serviceYears < 0) {
                System.out.println("Invalid input. Try again.");
                i--; // Decrement to re-enter
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = serviceYears;

            double bonus = serviceYears > 5 ? salary * 0.05 : salary * 0.02;
            bonuses[i] = bonus;
            newSalaries[i] = salary + bonus;

            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nTotal Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}

