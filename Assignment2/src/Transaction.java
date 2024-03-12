import java.util.Date;

public class Transaction {
    private String id;
    private String accountId;
    private String type;
    private double amount;
    private Date timestamp;

    // Default constructor
    public Transaction() {}

    // Constructor with parameters
    public Transaction(String id, String accountId, String type, double amount, Date timestamp) {
        this.id = id;
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    // Override toString() method for easy printing
    @Override
    public String toString() {
        return "Transaction: \n" +
                "ID: " + id + '\n' +
                "Account Id= '" + accountId + '\n' +
                "Type= " + type + '\n' +
                "Amount= " + amount + '\n' +
                "Timestamp= " + timestamp +
                '\n';
    }
}
