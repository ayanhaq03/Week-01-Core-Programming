import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZonesExample {
    public static void main(String[] args) {
        System.out.println("Problem 1: Current time in different time zones");

        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("GMT Time: " + gmtTime);
        System.out.println("IST Time: " + istTime);
        System.out.println("PST Time: " + pstTime);
    }
}
