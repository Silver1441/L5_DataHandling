package service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface ISODateFormatter {

    static void formatDate(String dateString) {
        //Example: "Friday, Aug 10, 2016 12:10:56 PM"
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("cccc, MMM dd, yyyy h:m:s a");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd, yyyy");
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);

        System.out.println(parsedDate.getDayOfMonth());
        System.out.println(parsedDate.getDayOfWeek());
        System.out.println(parsedDate.getMonth());
        System.out.println(parsedDate.getYear());
    }
}
