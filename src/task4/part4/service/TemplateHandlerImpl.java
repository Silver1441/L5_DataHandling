package task4.part4.service;

import task4.part4.entitie.Client;
import task4.part4.entitie.Employee;
import task4.part4.lib.MockDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TemplateHandlerImpl implements TemplateHandler {
    private Client client;
    private Employee employee;
    private String template;

    StringBuilder resultString = new StringBuilder();
    List<String> templateKeys = new ArrayList<>();

    public TemplateHandlerImpl(Client client, Employee employee, String template) {
        this.client = client;
        this.employee = employee;
        this.template = template;
    }

    public String getFormattedText() {
        Pattern pattern = Pattern.compile("\\$[\\wа-яА-Я]+");
        Matcher matcher = pattern.matcher(template);

        while (matcher.find()) {
            String templateKey = template.substring(matcher.start(), matcher.end());
            templateKeys.add(templateKey);
        }

        resultString.append(template);
        for (int i = 0; i < templateKeys.size(); i++) {
            resultString = resultString.replace(resultString.indexOf(templateKeys.get(i)),
                    resultString.indexOf(templateKeys.get(i)) + templateKeys.get(i).length(),
                    getTemplateValue(templateKeys.get(i)));
        }
        return resultString.toString();
    }

    private String getTemplateValue(String templateKey) {
        switch (templateKey) {
            case ("$userName"):
                return client.getClientName() + " " + client.getClientPatronymic();
            case ("$номерСчета"):
                return String.valueOf(client.getAccountNumber());
            case ("$числоМесяцев"):
                return String.valueOf(MockDemo.numberOfMonths);
            case ("$пользовательФИО"):
                return employee.getEmployeeName() + " " + employee.getEmployeePatronymic() + " " + employee.getEmployeeSurname();
            case ("$должностьПользователя"):
                return employee.getAppointment();
            default:
                return templateKey;
        }
    }
}
