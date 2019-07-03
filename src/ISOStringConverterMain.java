import service.ISODateFormatter;

public class ISOStringConverterMain {

    public static void main(String[] args) {
        // --Problem 1.2
        String testString = "08 10, 2016";
        ISODateFormatter.formatDate(testString);
    }
}
