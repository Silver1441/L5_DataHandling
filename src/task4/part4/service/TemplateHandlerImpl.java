package task4.part4.service;

import task4.part4.entitie.Client;
import task4.part4.entitie.Employee;
import task4.part4.lib.MockDemo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import  static  task4.part4.lib.TemplateKeyHolder.*;

public class TemplateHandlerImpl implements TemplateHandler {
    private Client client;
    private Employee employee;
    private String template;

    private StringBuilder resultString = new StringBuilder();

    public TemplateHandlerImpl(Client client, Employee employee, String template) {
        this.client = client;
        this.employee = employee;
        this.template = template;
    }

    public String getFormattedText() {
        Pattern pattern = Pattern.compile("\\$[\\wа-яА-Я]+");
        Matcher matcher = pattern.matcher(template);
        resultString.append(template);

        while (matcher.find()) {
            String templateKey = template.substring(matcher.start(), matcher.end());
            resultString = resultString.replace(resultString.indexOf(templateKey),
                    resultString.indexOf(templateKey) + templateKey.length(),
                    getTemplateValue(templateKey));
        }
        return resultString.toString();
    }

    private String getTemplateValue(String templateKey) {
        switch (templateKey) {
            case (USER_NAME):
                return client.getClientName() + " " + client.getClientPatronymic();
            case (ACCOUNT_NUMBER):
                return String.valueOf(client.getAccountNumber());
            case (MONTH_NUMBER):
                return String.valueOf(MockDemo.numberOfMonths);
            case (EMPLOYEE_FULL_NAME):
                return employee.getEmployeeName() + " " + employee.getEmployeePatronymic() + " " + employee.getEmployeeSurname();
            case (EMPLOYEE_APPOINTMENT):
                return employee.getAppointment();
            default:
                return templateKey;
        }
    }
}
