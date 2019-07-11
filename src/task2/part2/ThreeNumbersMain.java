package task2.part2;

import static task2.part2.Service.SumEqualsToThirdDeterminer.isSumEqualToThirdNumber;

import static task2.part2.Service.ThreeNumberDemo.makeTest;

//Даны три числа, например, 0.1, 0.15 и 0.25. Числа даны в виде строки. Необходимо ответить,
//является ли третье число суммой двух первых.
//* Учесть локаль пользователя и разделитель целой-дробной частей в данных строках

public class ThreeNumbersMain {
    public static void main(String[] args) {
        makeTest(isSumEqualToThirdNumber("числа: 0.1, 0.15, а также 0,25."));
    }
}
