package employeeproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeProject {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) throws SQLException {
        getCon();

        CreateEmployee("Rafiaah", "rafiaah@gmail.com", "IT", 70000);
        CreateEmployee("Sathy", "sathy@gmail.com", "IT", 50000);
        CreateEmployee("Jui", "jui@gmail.com", "IT", 55000);
        ShowAllEmployee();
        System.out.println("-----------------------------------------------------");

        UpdateEmployee("Moyna", "moyna@gmail.com", "Sales", 60000, 3);
        ShowAllEmployee();
        System.out.println("-----------------------------------------------------");

        DeleteEmployee(1);
        ShowAllEmployee();
        System.out.println("-----------------------------------------------------");
    }

    public static Connection getCon() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Con = DriverManager.getConnection(url, username, password);

            return Con;
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Not Connected");
            return null;
        }

    }

    public static void CreateEmployee(String name, String email, String department, int salary) {
        String createSql = "insert into employee (name, email, department, salary) values (?, ?, ?, ?)";

        try {
            ps = getCon().prepareStatement(createSql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, department);
            ps.setInt(4, salary);
            ps.executeUpdate();
            ps.close();

            System.out.println("Data Created Successfully!");
            System.out.println("-----------------------------------------------------");
        } catch (SQLException ex) {
            System.out.println("Data Not Created!");
        }
    }

    public static void UpdateEmployee(String name, String email, String department, int salary, int id) {

        String updateSql = "UPDATE employee SET name = ?, email = ?, department = ?, salary = ? WHERE id = ?";
        try {
            ps = getCon().prepareStatement(updateSql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, department);
            ps.setInt(4, salary);
            ps.setInt(5, id);
            ps.executeUpdate();
            ps.close();

            System.out.println("Data Updated Successfully!");
        } catch (SQLException ex) {

            System.out.println("Data Not Updated!");
        }
    }

    public static void DeleteEmployee(int id) {
        String deleteSql = "delete from employee where id = ?";
        try {
            ps = getCon().prepareStatement(deleteSql);

            ps.setInt(1, id);
            int status = ps.executeUpdate();
            if (status > 0) {
                System.out.println("Employee Id " + id + " Deleted!");
            } else {
                System.out.println("Employee " + id + " Not Deleted!");
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Employee " + id + " Not Found!");
        }

    }

    public static void ShowAllEmployee() {
        String selectSql = "Select * from employee";
        try {
            ps = getCon().prepareStatement(selectSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String allEmployee = rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("email") + " " + rs.getString("department") + " " + rs.getInt("salary");
                System.out.println(allEmployee);
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Data Not Found");
        }
    }
}
