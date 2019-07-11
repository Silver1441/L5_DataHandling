package task4.part1;

import static task4.part1.service.WordsDivider.divideString;
import static task4.part1.service.DemoTest.makeTest;

//Дана строка, содержащая "обычный" текст, т.е. слова, знаки препинания, переносы строк и т.п., например,
//"Ребе, Ви случайно не знаете, сколько тогда Иуда получил по нынешнему курсу?".
//Необходимо получить строку, в которой содержатся только слова из исходной строки,
//разделенные знаком переноса строки, в нижнем регистре

public class WordsDividerMain {
    public static void main(String[] args) {
        String givenString = "so \n --- this IS some\n *random    (TexT) \nВключая русский";
        String resultString = divideString(givenString);

        makeTest(resultString);
    }
}
