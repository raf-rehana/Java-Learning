
package person.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import person.model.StudentInfo;
import person.util.DbUtil;

public class StudentDao {
    DbUtil db = new DbUtil();
    
    PreparedStatement ps;
    String sql = null;
    
     public void saveStudent(StudentInfo student){
        
        sql = "insert into studentdetails(name, email, phoneNumber, address) values(? , ?, ?, ?)";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getPhoneNumber());
            ps.setString(4, student.getAddress()); 
            
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
            
            System.out.println("Data Saved");
            
            
        } catch (SQLException ex) {
      
        }
    }
}
