
package employee.dao;

import employee.model.employee;
import employee.util.DbUtil;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class employeeDao {
        DbUtil db = new DbUtil();
    
    PreparedStatement ps;
    String sql = null;
    
     public void saveEmployee(employee e){
        
        sql = "insert into employee(name, email, salary) values(? , ?, ?)";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getEmail());
            ps.setInt(3, e.getSalary());
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            
            System.out.println("Data Saved");
            
            
        } catch (SQLException ex) {
      
        }
    }
         
     }

