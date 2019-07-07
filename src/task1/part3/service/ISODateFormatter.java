package task1.part3.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class ISODateFormatter {
    public static void formatDate(String dateString) {
        //Example: "Friday, Aug 10, 2016 12:10:56 PM"
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("cccc, MMM dd, yyyy h:m:s a");
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("cccc, MMM dd, yyyy h:m:s a")
                .toFormatter(Locale.ENGLISH);
        LocalDateTime date = LocalDateTime.parse(dateString, formatter);

        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getHour());
        System.out.println(date.getMinute());
    }
}
