import service.AgeCalculator;
import service.AgeCalculatorImpl;

import java.time.LocalDateTime;
import java.time.Month;
public class AgeMain {

    public static void main(String[] args) {
        // --Problem 1.1
        LocalDateTime birthDay = LocalDateTime.of(1991, Month.JUNE, 18, 8, 30);
        AgeCalculator ageDeterminer = new AgeCalculatorImpl(birthDay);

        ageDeterminer.calculateAge();
    }
}
