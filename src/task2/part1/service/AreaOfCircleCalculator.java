package task2.part1.service;

import java.math.BigDecimal;
import java.math.MathContext;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class AreaOfCircleCalculator {
    public static BigDecimal calculateCircleArea(double radius) {
        BigDecimal result = new BigDecimal(PI * pow(radius, 2));
        MathContext numbersAfterDot = new MathContext(50);
        return result.round(numbersAfterDot);
    }
}
