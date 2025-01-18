
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat{
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1: " + currentDate.format(formatter1));
        System.out.println("Format 2: " + currentDate.format(formatter2));
        System.out.println("Format 3: " + currentDate.format(formatter3));
    }
}
