import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class JavaDateAndTime {

    public static String findDay(int month, int day, int year) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM DD YYYY");
        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.toString();
    }


    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        int month = Integer.parseInt(input.split(" ")[0]);
        int day = Integer.parseInt(input.split(" ")[1]);
        int year = Integer.parseInt(input.split(" ")[2]);

        String dayName = findDay(month, day, year);
        System.out.println(dayName);


    }
}
