package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUD {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {

        CreateStudent("Rafia", "rafia@gmail.com", "0196000000", 500000);
        CreateStudent("Rehanaa", "rehanaa@gmail.com", "0197000000", 500000);
        CreateStudent("Safanaa", "safanaa@gmail.com", "0198000000", 500000);
        CreateStudent("Sanjidaa", "sanjidaa@gmail.com", "0199000000", 500000);

        ShowAllStudent();
        System.out.println("*******************************");

        deleteStudent(6);
        deleteStudent(7);
        ShowAllStudent();
        System.out.println("*******************************");
        updateStudent("Piya", "piya@gmail.com", "0186000000", 500000, 1);

        ShowAllStudent();
        System.out.println("*******************************");
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

    public static void CreateStudent(String name, String email, String phone, float fee) {
        String createSql = "insert into students(name, email, phone, fee) values(?, ?, ?, ?)";
        try {

            ps = getCon().prepareStatement(createSql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setFloat(4, fee);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Data Saved");
        } catch (SQLException ex) {
            System.getLogger(CRUD.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            System.out.println("Data Not Saved");
        }
    }

    public static void ShowAllStudent() {
        String selectSql = "select * from students";

        try {
            ps = getCon().prepareStatement(selectSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String students = rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("email") + " " + rs.getString("phone") + " " + rs.getFloat("fee");
                System.out.println(students);
            }
        } catch (SQLException ex) {
            System.getLogger(CRUD.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public static void deleteStudent(int id) {
        String deleteSql = "delete from students where id = ? ";
        try {
            ps = getCon().prepareStatement(deleteSql);
            ps.setInt(1, id);

            int status = ps.executeUpdate();

            if (status > 0) {
                System.out.println("Student Id " + id + " Deleted ");
            } else {
                System.out.println("Student Data Not Deleted");
            }

            ps.close();
            getCon().close();

        } catch (SQLException ex) {
            System.getLogger(CRUD.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            System.out.println("Student Data Not Found");
        }

    }

    public static void updateStudent(String name, String email, String phone, float fee, int id) {

        String updateSql = "update students set name = ?, email = ?, phone = ? , fee =? where id = ?";

        try {
            ps = getCon().prepareStatement(updateSql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setFloat(4, fee);
            ps.setInt(5, id);
            ps.executeUpdate();
            ps.close();
            getCon().close();

            System.out.println("Data Updated");
        } catch (SQLException ex) {
            System.getLogger(CRUD.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            System.out.println("Data Not Updated");
        }

    }

}
