package task2.part1;

import task2.part1.service.AreaOfCircleCalculator;

//Необходимо посчитать площадь круга с указанным радиусом с точностью 50 знаков после запятой.

public class CircleAreaMain {
    public static void main(String[] args) {
        System.out.println(AreaOfCircleCalculator.calculateCircleArea(0.3));
    }
}
