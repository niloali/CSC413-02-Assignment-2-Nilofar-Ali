//Nilofar M. Ali
//CSC413-02 Spring 2024
//Assignment 2

import java.util.Date;

public class BankApplicationTester {

    public static void main(String[] args) {
        testCustomer();
        testAccount();
        testTransaction();
        testPriorityQueue();
        testEmployee(); // Adding the test for Employee class
    }

    private static void testCustomer() {
        System.out.println("Running tests on...");
        System.out.println("Customer Class:");
        Client customer = new Client("920311584", "Nilofar M. Ali", "nmohammadali@mail.sfsu.edu", "39505 Trinity Way apt 19", UserRole.CUSTOMER);

        boolean testPassed = customer.getClientID().equals("920311584") &&
                customer.getClientName().equals("Nilofar M. Ali") &&
                customer.getClientEmail().equals("nmohammadali@mail.sfsu.edu") &&
                customer.getClientAddress().equals("39505 Trinity Way apt 19") &&
                customer.getClientRole() == UserRole.CUSTOMER;

        if (testPassed) {
            System.out.println("Customer class was successful.\n");
            System.out.println(customer.toString() + "\n");
        } else {
            System.out.println("Customer class was unsuccessful.\n");
        }
    }

    private static void testAccount() {
        System.out.println("--------------------");
        System.out.println("Account Class:");
        Date creationDate = new Date();
        Account account = new Account("920311584", "920311584", "Checking", 500.0, creationDate);

        boolean testPassed = account.getId().equals("920311584") &&
                account.getCustomerId().equals("920311584") &&
                account.getType().equals("Checking") &&
                account.getBalance() == 500.0 &&
                account.getCreationDate().equals(creationDate);

        if (testPassed) {
            System.out.println("Account class was successful.\n");
        } else {
            System.out.println("Account class was unsuccessful.\n");
        }
    }

    private static void testTransaction() {
        System.out.println("--------------------");
        System.out.println("Transaction Class:");
        Date timestamp = new Date();
        Transaction transaction = new Transaction("1", "1", "Deposit", 500.0, timestamp);

        boolean testPassed = transaction.getId().equals("1") &&
                transaction.getAccountId().equals("1") &&
                transaction.getType().equals("Deposit") &&
                transaction.getAmount() == 500.0 &&
                transaction.getTimestamp().equals(timestamp);

        if (testPassed) {
            System.out.println("Transaction class was successful.\n");
        } else {
            System.out.println("Transaction class was unsuccessful.\n");
        }
    }

    public static void testPriorityQueue() {
        System.out.println("--------------------");
        System.out.println("Priority Queue:");
        PriorityQueue pq = new PriorityQueue();

        // Create Account instances
        Account acc1 = new Account("1", "920", "Checking", 1050.0, new Date(120, 0, 1));
        Account acc2 = new Account("2", "311", "Savings", 1800.0, new Date(119, 0, 1));
        Account acc3 = new Account("3", "584", "Checking", 2100.0, new Date(121, 0, 1));

        // Add accounts to the priority queue
        pq.add(acc1);
        pq.add(acc2);
        pq.add(acc3);

        // Remove accounts from the priority queue and print them
        while (!pq.isEmpty()) {
            Account acc = pq.remove();
            System.out.println(acc.toString());
        }
    }

    public static void testEmployee() {
        System.out.println("--------------------");
        System.out.println("Employee Class:");
        // Create Employee instances
        Employee emp1 = new Employee("Nilofar M. Ali", "nmohammadali@sfsu.edu");
        Employee emp2 = new Employee(1001, "Nilofar M. Ali", "nmohammadali@sfsu.edu", "143-1234");

        // Print out the details of each employee
        System.out.println("Employee 1 Details:");
        System.out.println(emp1);

        System.out.println("\nEmployee 2 Details:");
        System.out.println(emp2);

        // Test the getEmployee method (Not recommended, but added as per your code)
        emp1.getEmployee(2001); // Passing any arbitrary ID for demonstration purposes

        // Print out the updated details of employee 1
        System.out.println("\nEmployee 1 Details after getEmployee:");
        System.out.println(emp1);
    }
}