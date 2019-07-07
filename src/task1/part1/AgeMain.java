package task1.part1;

import task1.part1.service.AgeCalculator;
import task1.part1.service.AgeCalculatorImpl;

import java.time.LocalDateTime;
import java.time.Month;
public class AgeMain {

    public static void main(String[] args) {
        LocalDateTime birthDay = LocalDateTime.of(1991, Month.JUNE, 18, 8, 30);
        AgeCalculator ageDeterminer = new AgeCalculatorImpl(birthDay);

        ageDeterminer.calculateAge();
    }
}
