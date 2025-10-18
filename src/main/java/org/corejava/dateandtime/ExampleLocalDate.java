package dateandtime;

import java.time.LocalDate;
import java.time.Month;

public class ExampleLocalDate {
    public static void main(String[] args) {
      //LocalDate: Represents a date without a time zone.
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate customDate = LocalDate.of(2024, 04, 25);
        System.out.println(customDate);
        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println(dayOfMonth);
        Month monthInWord = localDate.getMonth();
        System.out.println(monthInWord);
        int monthInValue = localDate.getMonthValue();
        System.out.println(monthInValue);
        int year = localDate.getYear();
        System.out.println(year);
        int dayOfYear = localDate.getDayOfYear();
        System.out.println(dayOfYear);
    }
}
