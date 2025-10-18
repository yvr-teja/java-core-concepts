package dateandtime;

import java.time.LocalDate;
import java.time.Period;

public class ExamplePeriod {
    public static void main(String[] args) {
    //Period: Represents a period of time between two dates.
        LocalDate now = LocalDate.now();
        LocalDate then=LocalDate.of(1994,04,25);
        Period between = Period.between(now, then);
        System.out.println(between);

    }
}
