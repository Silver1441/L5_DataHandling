package task4.part2.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToSingleLowercaseStringParser {
    private String givenText;
    private List<String> dividedText = new ArrayList<>();

    public ToSingleLowercaseStringParser(String givenText) {
        this.givenText = givenText;
        generateStringArray();
        makeSortedStringArray();
    }

    private void generateStringArray() {
        Pattern pattern = Pattern.compile("[\\w'А-я]+");
        Matcher matcher = pattern.matcher(givenText);

        while (matcher.find()) {
            dividedText.add(givenText.substring(matcher.start(), matcher.end()).toLowerCase());
        }
        System.out.println("generated lowercase strings:  " + dividedText); //LOG
    }

    private void makeSortedStringArray() {
        Comparator<String> comparator = Comparator.comparing(String::length);
        dividedText.sort(comparator);
        System.out.println("list sorted ascending:        " + dividedText); //LOG
    }

    public String getShortestWord() {
        return dividedText.get(0);
    }

    public String getLongestWord() {
        return dividedText.get(dividedText.size() - 1);
    }
}
