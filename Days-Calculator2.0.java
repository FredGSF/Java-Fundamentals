import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysCalculator { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // Prompt the user to enter the first date 
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String dateString1 = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(dateString1, DateTimeFormatter.ISO_LOCAL_DATE);

        // Prompt the user to enter the second date
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String dateString2 = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(dateString2, DateTimeFormatter.ISO_LOCAL_DATE);

        // Calculate the difference between the two dates
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Number of days between " + date1 + " and " + date2 + " is: " + daysBetween);
        
        scanner.close();
    }
}
