package task1.part3;

import task1.part3.service.ISODateFormatter;
import static  task1.part3.service.ISOStringDemo.makeTest;

public class ISOStringConverterMain {
    public static void main(String[] args) {
        makeTest(ISODateFormatter.formatDate("Wednesday, Feb 10, 2016 1:10:56 PM"));
    }
}
