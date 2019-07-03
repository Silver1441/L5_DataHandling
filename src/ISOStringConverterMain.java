import service.ISODateFormatter;

public class ISOStringConverterMain {

    public static void main(String[] args) {
        // --Problem 1.2
        String testString = "Wednesday, Feb 10, 2016 1:10:56 PM";
        ISODateFormatter.formatDate(testString);
    }
}
