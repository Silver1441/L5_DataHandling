package task1.part3;

import task1.part3.service.ISODateFormatter;
import static  task1.part3.service.ISOStringDemo.makeTest;

//Дана строка вида "Friday, Aug 10, 2016 12:10:56 PM".
//Необходимо сконвертировать ее в вид “2018-0 8-10".
//(* “2016-08-16T10:15:30+08:00” в дату со временем с учетом часового пояса - привести к ижевскому).

public class ISOStringConverterMain {
    public static void main(String[] args) {
        makeTest(ISODateFormatter.formatDate("Wednesday, Feb 10, 2016 1:10:56 PM"));
    }
}
