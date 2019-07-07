package task2.part1.service;

import java.math.BigDecimal;

public class DecimalFormatter {
    public static BigDecimal formatDecimalNumber(BigDecimal number) {
        String formattedNumber = String.format("%.50f", number);
        return new BigDecimal(formattedNumber.replaceAll(",", "."));
    }


}
