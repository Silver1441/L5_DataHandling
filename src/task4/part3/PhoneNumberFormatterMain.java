package task4.part3;

import task4.part3.service.PhoneNumberFormatter;

//Дана строка, содержащая в себе, помимо прочего, номера телефонов.
//Необходимо удалить из этой строки префиксы локальных номеров, соответствующих Ижевску.
//Например, из "+7 (3412) 517-647" получить "517-647"; "8 (3412) 4997-12" - "4997-12";
//"+7 3412 90-41-90" - "90-41-90".

public class PhoneNumberFormatterMain {
    public static void main(String[] args) {
        String test = "Дан набор телефонов: +7 (3412) 517-647, 8-3412-4997-12, 454545 и +73412986532";
        System.out.println(PhoneNumberFormatter.formatPhoneNumbers(test));
    }
}
