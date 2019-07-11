package task4.part1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsDivider {
    public static String divideString(String text) {
        List<String> dividedText = new ArrayList<>();
        StringBuilder resultText = new StringBuilder();

        Pattern pattern = Pattern.compile("[\\w'А-я]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            dividedText.add(text.substring(matcher.start(), matcher.end()));
        }

        for (int i = 0; i < dividedText.size(); i++) {
            resultText.append(dividedText.get(i));
            resultText.append("\n");
        }

        return resultText.toString().toLowerCase();
    }
}
