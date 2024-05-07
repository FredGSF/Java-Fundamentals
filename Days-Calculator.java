import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysCalculator {
    public static void main(String[] args) {
        // Define the two dates
        LocalDate start = LocalDate.of(2024, 5, 7); // First date
        LocalDate end = LocalDate.of(2024, 9, 25); // Second date

        // Calculate the difference between the two dates
        long daysBetween = ChronoUnit.DAYS.between(start, end);

        System.out.println("Number of days between " + start + " and " + end + " is: " + daysBetween);
    }
}
