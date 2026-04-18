package employeeevidence;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeEvidence {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        getCon();

        int choice;

        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Create Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Show All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Join Date (YYYY-MM-DD): ");
                    String joinDate = sc.nextLine();

                    System.out.print("Enter Designation: ");
                    String designation = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    int salary = sc.nextInt();

                    CreateEmployee(name, Date.valueOf(joinDate), designation, salary);
                    System.out.println("-------------------------------------------------------");
                    ShowAllEmployee();
                    break;

                case 2:
                    System.out.print("Enter Employee ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Join Date (YYYY-MM-DD): ");
                    String newJoinDate = sc.nextLine();

                    System.out.print("Enter New Designation: ");
                    String newDesignation = sc.nextLine();

                    System.out.print("Enter New Salary: ");
                    int newSalary = sc.nextInt();

                    UpdateEmployee(newName, Date.valueOf(newJoinDate), newDesignation, newSalary, id);
                    System.out.println("-------------------------------------------------------");
                    ShowAllEmployee();
                    break;

                case 3:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();

                    DeleteEmployee(deleteId);
                    ShowAllEmployee();
                    break;

                case 4:
                    System.out.println("-----------------All Employee Info-------------------");
                    ShowAllEmployee();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static Connection getCon() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Not Connected");
            return null;
        }
    }

    public static void CreateEmployee(String name, Date joinDate, String designation, int salary) {

        String createSql = "INSERT INTO employee (name, joinDate, designation, salary) VALUES (?, ?, ?, ?)";

        try {
            ps = getCon().prepareStatement(createSql);
            ps.setString(1, name);
            ps.setDate(2, joinDate);
            ps.setString(3, designation);
            ps.setInt(4, salary);

            ps.executeUpdate();
            ps.close();

            System.out.println("Data Created Successfully!");

        } catch (SQLException ex) {
            System.out.println("Data Not Created!");
        }
    }

    public static void UpdateEmployee(String name, Date joinDate, String designation, int salary, int id) {

        String updateSql = "UPDATE employee SET name = ?, joinDate = ?, designation = ?, salary = ? WHERE id = ?";

        try {
            ps = getCon().prepareStatement(updateSql);
            ps.setString(1, name);
            ps.setDate(2, joinDate);
            ps.setString(3, designation);
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

        String deleteSql = "DELETE FROM employee WHERE id = ?";

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

        String selectSql = "SELECT * FROM employee";

        try {
            ps = getCon().prepareStatement(selectSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + "  "
                        + rs.getString("name") + "  "
                        + rs.getDate("joinDate") + "  "
                        + rs.getString("designation") + "  "
                        + rs.getInt("salary")
                );
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Data Not Found");
        }
    }
}
