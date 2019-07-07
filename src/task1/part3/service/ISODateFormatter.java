package task1.part3.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class ISODateFormatter {
    public static void formatDate(String dateString) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("cccc, MMM dd, yyyy h:m:s a")
                .toFormatter(Locale.ENGLISH);
        LocalDate date = LocalDate.parse(dateString, formatter);
        LocalDateTime localDate = LocalDateTime.parse(dateString, formatter);
        ZonedDateTime zonedDate = ZonedDateTime.of(localDate, ZoneId.of("+04:00:00"));
        ZonedDateTime zonedOffsetDate = ZonedDateTime.of(localDate, ZoneId.of("GMT+4"));


        System.out.print("Izhevsk date:         ");
        System.out.println(date.toString());
        System.out.print("Izhevsk offset time:  ");
        System.out.println(zonedDate.toString());
        System.out.print("Izhevsk region time:  ");
        System.out.println(zonedOffsetDate.toString());
    }
}
