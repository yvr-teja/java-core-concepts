package dateandtime;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ExampleDuration {
    public static void main(String[] args) {
    //Duration: Represents a period of time between two dates.
        Instant start = Instant.now();
        Instant end=Instant.now();
        Duration d1 = Duration.between(start, end);
        Duration d2= Duration.of(24, ChronoUnit.MINUTES);
        System.out.println(d1);
        System.out.println(d2);
        int i = d2.compareTo(d1);
        System.out.println(i);
    }
}
