package task4.part4.service;

import task4.part4.entitie.Client;
import task4.part4.entitie.Employee;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TemplateHandlerImpl {
    private Client client;
    private Employee employee;
    private String template;

    public TemplateHandlerImpl(Client client, Employee employee, String template) {
        this.client = client;
        this.employee = employee;
        this.template = template;
    }

    public void getFormattedText() {
        Pattern pattern = Pattern.compile("\\$[\\wа-яА-Я]+");
        Matcher matcher = pattern.matcher(template);

        while (matcher.find()) {
            String templateKey = template.substring(matcher.start(),matcher.end());
            System.out.println(templateKey);
        }
    }
}
