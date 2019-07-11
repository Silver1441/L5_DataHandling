package task1.part2;

import task1.part2.service.DateComparator;

//Даны две даты в виде "25.07.192", т.е. "день месяца 2 разряда, месяц 2 разряда, год 4 разряда".
//Найти разницу в днях между ними. Число должно быть всегда положительным.

public class DateCompareMain {

    public static void main(String[] args) {
        DateComparator.compareDates("03.02.2019", "08.10.2018");
    }
}
