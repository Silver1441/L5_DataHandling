package task4.part3.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberFormatter {
    public static String formatPhoneNumbers(String text) {
        Pattern pattern = Pattern.compile("(\\+7|8)(\\s|\\-)?(3412|\\(3412\\))(\\s|\\-)?");
        Matcher matcher = pattern.matcher(text);
        StringBuilder resultString = new StringBuilder();

        while (matcher.find()) {
            resultString.append(matcher.replaceAll(""));
        }
        return resultString.toString();
    }
}
