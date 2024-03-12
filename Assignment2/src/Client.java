//Nilofar M. Ali
//CSC413-02 Spring 2024
//Assignment 2

public class Client implements UserPermissions {
    private String clientID;
    private String clientName;
    private String clientEmail;
    private String clientAddress;
    private UserRole clientRole;

    public void manageAccount() {
        System.out.println("Client managing their account.");
    }

    @Override
    public void viewAccountDetails() {
        System.out.println("Client viewing their account details.");
    }

    @Override
    public void performTransaction() {
        System.out.println("Client performing a transaction.");
    }

    public Client(String clientID, String clientName, String clientEmail, String clientAddress, UserRole clientRole) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.clientAddress = clientAddress;
        this.clientRole = clientRole;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public UserRole getClientRole() {
        return clientRole;
    }

    public void setClientRole(UserRole clientRole) {
        this.clientRole = clientRole;
    }

    @Override
    public String toString() {
        return "Client Details:\n" +
                "ID: " + clientID + "\n" +
                "Name: " + clientName + "\n" +
                "Email: " + clientEmail + "\n" +
                "Address: " + clientAddress + "\n" +
                "Role: " + clientRole;
    }
}