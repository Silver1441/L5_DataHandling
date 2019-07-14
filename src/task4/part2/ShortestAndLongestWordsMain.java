package task4.part2;

import task4.part2.service.ToSingleLowercaseStringParser;

//В предыдущей задаче найти самое короткое слово, самое длинное слово.

public class ShortestAndLongestWordsMain {
    public static void main(String[] args) {
        String textForTest = "so \n --- this IS some\n *random    (TexT) \nВключая русский";
        ToSingleLowercaseStringParser test = new ToSingleLowercaseStringParser(textForTest);
        System.out.println("Shortest word: " + test.getShortestWord());
        System.out.println("Longest word:  " + test.getLongestWord());
    }
}
