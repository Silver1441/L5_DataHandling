package task2.part3.service;

import java.util.Arrays;

public class MinMaxDeterminant {
    public static void determineMinMax(Double firstNumber, Double secondNumber, Double thirdNumber) {
        Double[] numbers = new Double[3];
        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
        numbers[2] = thirdNumber;
        Arrays.sort(numbers); //технически внутри есть условные операторы, но это внутренняя реализация

        System.out.println("Наибольшее число: " + numbers[2]);
        System.out.println("Наименьшее число: " + numbers[0]);
    }

}
