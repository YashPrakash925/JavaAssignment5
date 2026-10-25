
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

class q4{
    public static void main(String[] args) {
        String eventName = "Tech Fest";
        LocalDate eventDate = LocalDate.now().plusDays(5);
        LocalTime startTime = LocalTime.of(10, 30);

        Optional<String> venue = Optional.empty();

        System.out.println("Event: " + eventName);
        System.out.println("Date: " + eventDate);
        System.out.println("Start time: " + startTime);
        System.out.println("End time: " + startTime.plusHours(2));

        LocalDate today = LocalDate.now();

        if (eventDate.isAfter(today)) {
            System.out.println("Event is in the future");
        } else if (eventDate.isEqual(today)) {
            System.out.println("Event is today");
        } else {
            System.out.println("Event is in the past");
        }

        long days = ChronoUnit.DAYS.between(today, eventDate);
        System.out.println("Days remaining: " + days);

        System.out.println(
            "Venue: " + venue.orElse("Venue not specified")
        );
    }
}
