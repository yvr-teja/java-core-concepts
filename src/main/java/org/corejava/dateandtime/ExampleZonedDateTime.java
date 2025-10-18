package dateandtime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ExampleZonedDateTime {
    public static void main(String[] args) {
    //ZonedDateTime: Represents a date and time without a time zone
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
       // availableZoneIds.forEach(System.out::println);

        // Get the current local date and time
        LocalDateTime now = LocalDateTime.now();

        // Specify the desired time zone
        ZoneId zoneId = ZoneId.of("US/Pacific");

        // Create a ZonedDateTime object
        ZonedDateTime usaZoneTime = ZonedDateTime.of(now, zoneId);

        // Print the result
        System.out.println("ZonedDateTime in US/Pacific: " + usaZoneTime);
    }
}
