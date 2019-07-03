package service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public interface DateComparator {

    static void compareDates(String firstDate, String secondDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localFirstDate = LocalDate.parse(firstDate, formatter);
        LocalDate localSecondDate = LocalDate.parse(secondDate, formatter);

        long resultDays = Math.abs(ChronoUnit.DAYS.between(localFirstDate, localSecondDate));
        System.out.println("Dates: " + firstDate + " and " + secondDate);
        System.out.println("Days between: " + resultDays);
    }
}
