package task4.part4;

//Дана строка-шаблон, содержащая заготовку письма. Например, "Уважаемый, $userName, извещаем вас о том,
//что на вашем счете $номерСчета скопилась сумма, превышающая стоимость $числоМесяцев месяцев пользования
//нашими услугами. Деньги продолжают поступать. Вероятно, вы неправильно настроили автоплатеж. С уважением,
//$пользовательФИО $должностьПользователя"
//Также дана одна пара строк. templateKey и templateValue.
// Необходимо в строке заменить все placeholders (строки $имяШаблона, т.е. &#39;$&#39;
//+ templateKey) на значения из templateValue.

import task4.part4.entitie.CallCenterManager;
import task4.part4.entitie.Client;
import task4.part4.entitie.ClientBasic;
import task4.part4.entitie.Employee;
import task4.part4.service.TemplateHandler;
import task4.part4.service.TemplateHandlerImpl;

import static task4.part4.lib.TemplateHolder.respondOverpaymentAutopayment;

public class AutoRespondMain {
    public static void main(String[] args) {
        Client mockClient = new ClientBasic(1, 236000535, "Petr", "Glinko", "Grigorievich");
        Employee mockWorker = new CallCenterManager(1, "Victoria", "Fedorova", "Pavlovna");

        TemplateHandler handler = new TemplateHandlerImpl(mockClient, mockWorker, respondOverpaymentAutopayment);
        System.out.println(handler.getFormattedText());
    }
}
