
import java.time.LocalDate;
import java.util.Scanner;

public class ModifyDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(inputDate);

        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Modified Date: " + modifiedDate);

        
    }
}
