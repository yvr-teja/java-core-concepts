package dateandtime;

import java.time.Instant;

public class ExampleInstant {
    public static void main(String[] args) {
    /*Instant: Represents as instantaneous point on the timeline, Typically
      used for machine timestamps
      * */
        //Old used time - 1970 jan 1st time: 00:00:00
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        //Instant
        Instant now = Instant.now();
        System.out.println(now);

    }
}
