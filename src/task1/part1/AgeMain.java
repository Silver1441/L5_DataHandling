package task1.part1;

import task1.part1.service.AgeCalculator;
import task1.part1.service.AgeCalculatorImpl;

import java.time.LocalDateTime;
import java.time.Month;

//Определить ваш возраст с момента рождения (можно нафантазировать, если нет точных данных =) ) на момент запуска
//программы. Возраст в секундах, минутах, часах, днях, месяцах и годах

public class AgeMain {
    public static void main(String[] args) {
        LocalDateTime birthDay = LocalDateTime.of(1991, Month.JUNE, 18, 2, 8);
        AgeCalculator ageDeterminer = new AgeCalculatorImpl(birthDay);

        ageDeterminer.calculateAge();
    }
}
