//Nilofar M. Ali
//CSC413-02 Spring 2024
//Assignment 2

public class Employee {

    private String username;
    private String email;
    private String phone;
    private char sex;
    private String birthday;
    private int id;

    // Constructors
    public Employee() {
        // Default constructor
    }

    public Employee(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public Employee(int id, String username, String email, String phone) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phone = phone;
    }

    // Method to get employee details (Not recommended, but added as per your code)
    public void getEmployee(int id) {
        EmployeeDTO empDTO = buildDTO(this.id, this.username, this.email);
        this.id = empDTO.getID();
        this.username = empDTO.getUsername();
        this.email = empDTO.getEmail();
    }

    // Method to build DTO (Data Transfer Object)
    public static EmployeeDTO buildDTO(int id, String username, String email) {
        return new EmployeeDTO(id, username, email);
    }

    // Getter and Setter methods
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee: ID-" + id + ", Name-" + username + ", Email-" + email + ", Phone-" + phone;
    }
}