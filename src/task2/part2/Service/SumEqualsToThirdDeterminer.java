package task2.part2.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumEqualsToThirdDeterminer {
    public static boolean isSumEqualToThirdNumber(String str) {
        List<String> strNumbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+((\\.|\\,)\\d+)?");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            strNumbers.add(str.substring(matcher.start(),matcher.end()));
        }

        System.out.println("Найденные числа:  " + strNumbers);

        if (strNumbers.size()>=3) {
            String firstStringNumber = strNumbers.get(0).replaceAll(",", ".");
            String secondStringNumber = strNumbers.get(1).replaceAll(",", ".");
            String thirdStringNumber = strNumbers.get(2).replaceAll(",", ".");
            return Double.parseDouble(thirdStringNumber) ==
                    Double.parseDouble(firstStringNumber) + Double.parseDouble(secondStringNumber);
        } else {
            return false;
        }
    }
}