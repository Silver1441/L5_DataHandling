package task1.part3.service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class ISODateFormatter {
    public static String formatDate(String dateString) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("cccc, MMM dd, yyyy h:m:s a")
                .toFormatter(Locale.ENGLISH);
        ZonedDateTime zonedDate = ZonedDateTime.of(LocalDateTime.parse(dateString, formatter), ZoneId.of("+04:00:00"));
        final DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;

        return zonedDate.format(isoFormatter);
    }
}
