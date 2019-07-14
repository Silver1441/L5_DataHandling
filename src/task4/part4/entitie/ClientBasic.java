package task4.part4.entitie;

public class ClientBasic implements Client {
    private int clientID;
    private int accountNumber;
    private String clientName;
    private String clientSurname;
    private String clientPatronymic;

    public ClientBasic(int clientID, int accountNumber, String clientName, String clientSurname, String clientPatronymic) {
        this.clientID = clientID;
        this.accountNumber = accountNumber;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientPatronymic = clientPatronymic;
    }

    public int getClientID() {
        return clientID;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public String getClientPatronymic() {
        return clientPatronymic;
    }
}
