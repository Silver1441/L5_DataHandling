package task4.part4.entitie;

public class CallCenterManager implements Employee {
    private String appointment = "менеджер call-центра";

    private int employeeID;
    private String employeeName;
    private String employeeSurname;
    private String employeePatronymic;

    public CallCenterManager(int employeeID, String employeeName, String employeeSurname, String employeePatronymic) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.employeePatronymic = employeePatronymic;
    }

    public String getAppointment() {
        return appointment;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public String getEmployeePatronymic() {
        return employeePatronymic;
    }
}
