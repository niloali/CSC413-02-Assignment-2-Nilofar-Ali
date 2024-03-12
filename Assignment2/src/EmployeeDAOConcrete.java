//Nilofar M. Ali
//CSC413-02 Spring 2024
//Assignment 2

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class EmployeeDAOConcrete implements EmployeeDAO {

    static Connection connection = null;
    PreparedStatement pStatement;
    ResultSet result;
    static String url = EmployeeDataConnection.getURL();
    static String username = EmployeeDataConnection.getURL();
    static String pwd = EmployeeDataConnection.getURL();

    EmployeeDAOConcrete() {

        try {

            connection = EmployeeDataConnection.getDBConnection();

        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }

    }

    // Method to disconnect from the database
    public static void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    // Method to insert a user into the database
    @Override
    public int insert(Employee emp) throws SQLException {

        int res = -1;
        pStatement = connection.prepareStatement(EmployeeDataConnection.getInsert());
        pStatement.setString(1, emp.getUsername());
        pStatement.setString(2, emp.getEmail());
        res = pStatement.executeUpdate();
        disconnect();

        return res;
    }

    // Method to retrieve a user from the database by ID
    @Override
    public Employee get(int anID) throws SQLException {

        pStatement = connection.prepareStatement(EmployeeDataConnection.getSelect());
        pStatement.setInt(1,anID);
        result = pStatement.executeQuery();

        Employee updatedEmp = null;
        if (result.next()) {
            Employee e = new Employee();
            updatedEmp = new Employee( result.getInt("id"), result.getString("username"), result.getString("email"), result.getString("phone"));
        }

        return updatedEmp;
    }

    // Method to update a user in the database
    public int update(Employee emp) throws SQLException {

        int result = -1;

        pStatement = connection.prepareStatement(EmployeeDataConnection.getUpdate());
        pStatement.setString(1, emp.getUsername());
        pStatement.setString(2, emp.getEmail());
        pStatement.setString(3, emp.getPhone());
        pStatement.setInt(4, emp.getID());
        result = pStatement.executeUpdate();

        return result;
    }

    // Method to delete a user from the database
    @Override
    public int delete(Employee emp) throws SQLException {

        int res = -1;

        pStatement = connection.prepareStatement(EmployeeDataConnection.getDelete());
        pStatement.setInt(1,emp.getID());
        res = pStatement.executeUpdate();

        return res;
    }

    // Method to update a user in the database
    @Override
    public int save(Employee emp) throws SQLException {

        int res = -1;

        pStatement = connection.prepareStatement(EmployeeDataConnection.getInsert());
        pStatement.setString(1, emp.getUsername());
        pStatement.setString(2, emp.getEmail());
        pStatement.setInt(3, emp.getID());
        res = pStatement.executeUpdate();

        return res;
    }

}
