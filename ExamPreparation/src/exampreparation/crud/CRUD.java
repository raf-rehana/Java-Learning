package exampreparation.crud;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUD {

    static PreparedStatement ps;
    static Resultset rs;

    public static void main(String[] args) {

    }

    public static Connection getCon() {

        String url = "jdbc:mysql://localhost:3306/student?";
        String user = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected Successfully!");
            return connection;

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Database Connection Failed!");
            return null;
        }

    }

    public static void CreateStudent(String name, String email, String phone, int fee) {
        String createSql = "INSERT INTO STUDENT1 (NAME, EMAIL, PHONE, FEE) VALUES(?, ?, ?, ?)";

        try {
            ps = getCon().prepareStatement(createSql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setInt(4, fee);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Data Saved");
        } catch (SQLException ex) {
            System.out.println("Data Not Saved");
        }
    }

    public static void UpdateStudent(String name, String email, String phone, int fee, int id) {
        String updateSql = "UPDATE STUDENTS SET NAME = ?, EMAIL = ?, PHONE = ? FEE = ? WHERE ID = ?";

        try {
            ps = getCon().prepareStatement(updateSql);
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, phone);
        ps.setInt(4, fee);
        ps.setInt(5, id);
        ps.executeUpdate();
            ps.close();
            getCon().close();
              System.out.println("Data Updated!");
        
        } catch (SQLException ex) {
             System.out.println("Data Not updated!");
        }
    }
}
