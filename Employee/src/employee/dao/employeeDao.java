package employee.dao;

import employee.model.employee;
import employee.util.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class employeeDao {

    DbUtil db = new DbUtil();

    PreparedStatement ps;
    String sql = null;

    public void saveEmployee(employee e) {

        sql = "insert into employee(name, email, phoneNumber, salary) values(? , ?, ?, ?)";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getEmail());
            ps.setString(3, e.getPhoneNumber());
            ps.setInt(4, e.getSalary());
            ps.executeUpdate();
            ps.close();
            db.getCon().close();

            System.out.println("Data Saved");

        } catch (SQLException ex) {
            System.out.println("Data Not Saved");
        }
    }

    public void updateEmployee(employee e) {
        sql = "update employee set name = ?, email = ?, phoneNumber = ?, salary = ? where id = ? ";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, e.getName());
            ps.setString(2, e.getEmail());
            ps.setString(3, e.getPhoneNumber());
            ps.setInt(4, e.getSalary());
            ps.setInt(5, e.getId());

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

            System.out.println("Data updated");

        } catch (SQLException ex) {
            System.out.println("Data Not updated");
        }

    }

    public void deleteEmployee(employee e) {
        sql = "delete from employee where id = ? ";

        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setInt(1, e.getId());

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

            System.out.println("Data deleted");

        } catch (SQLException ex) {
            System.out.println("Data Not deletedted");
        }

    }

    public List<employee> showAll() {

        List<employee> empList = new ArrayList<>();
        sql = "SELECT * FROM employee";

        try {
            ps = db.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                employee e = new employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setEmail(rs.getString("email"));
                e.setPhoneNumber(rs.getString("phoneNumber"));
                e.setSalary(rs.getInt("salary"));

                empList.add(e);
            }

            rs.close();
            ps.close();
            db.getCon().close();
  
        } catch (Exception ex) {
            System.out.println("Data not loaded: " + ex.getMessage());
        }

        return empList;
    }
}
