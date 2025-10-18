package dateandtime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExampleLocalTime {
    public static void main(String[] args) {
    //LocalTime: Represents a time without a date or time zone
        LocalTime now = LocalTime.now();
        System.out.println(now);
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        System.out.println(hour+":"+minute+":"+second);
        LocalTime customTime = LocalTime.of(14, 24, 30);
        System.out.println(customTime);
        String timeInString= "15:40";
        LocalTime parsedTime= LocalTime.parse(timeInString);
        System.out.println(parsedTime);
        LocalTime minusTwoHours = now.minusHours(2);
        System.out.println(minusTwoHours);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime= minusTwoHours.format(formatter);
        System.out.println(formattedTime);
    }
}
