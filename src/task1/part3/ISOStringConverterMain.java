package task1.part3;

import task1.part3.service.ISODateFormatter;

public class ISOStringConverterMain {

    public static void main(String[] args) {
        String testString = "Wednesday, Feb 10, 2016 1:10:56 PM";
        ISODateFormatter.formatDate(testString);
    }
}
