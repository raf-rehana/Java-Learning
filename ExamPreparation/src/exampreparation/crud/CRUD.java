package exampreparation.crud;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUD {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {

        createStudent("Rafi", "rafi@gmail.com", "01930000", 50000);
        ShowAllStudent1();
    }

    public static Connection getCon() {

        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!");
            return con;

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Database connection failed!");
            return null;
        }
    }

    public static void createStudent(String name, String email, String phone, int fee) {
        String sql = "INSERT INTO STUDENT1 (NAME, EMAIL, PHONE, FEE) VALUES (?, ?, ?, ?)";

        try (Connection con = getCon(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setInt(4, fee);

            ps.executeUpdate();
            System.out.println("Data Saved");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void UpdateStudent(String name, String email, String phone, int fee, int id) {
        String updateSql = "UPDATE STUDENTS SET NAME = ?, EMAIL = ?, PHONE = ? , FEE = ? WHERE ID = ?";

        try {
            ps = getCon().prepareStatement(updateSql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setInt(4, fee);
            ps.setInt(5, id);
            int status = ps.executeUpdate();
            if (status > 0) {
                System.out.println("Data Updated!");
            } else {
                System.out.println("Student Not Found");
            }
            ps.close();
            System.out.println("Data Updated!");

        } catch (SQLException ex) {
            System.out.println("Data Not updated!");
        }
    }

    public static void deleteStudent(int id) {
        String sql = "DELETE FROM STUDENTS WHERE ID = ?";

        try (Connection con = getCon(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            int status = ps.executeUpdate();

            if (status > 0) {
                System.out.println("Data Deleted Successfully!");
            } else {
                System.out.println("Student Not Found");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void ShowAllStudent1() {
        String selectSql = "SELECT * FROM STUDENT1";

        try (Connection con = getCon(); PreparedStatement ps = con.prepareStatement(selectSql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.printf("%d | %s | %s | %s | %d%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getInt("fee"));
            }
        } catch (SQLException ex) {
            System.out.println("");
        }

    }

}
