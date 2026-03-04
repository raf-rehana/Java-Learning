
package person.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import person.model.StudentInfo;
import person.util.DbUtil;

public class StudentDao {
    DbUtil util = new DbUtil();
    
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;
    
     public void saveStudent(StudentInfo studentinfo){
        
        sql = "insert into user(name, email, phoneNumber, address) values(? , ?, ?, ?)";
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, studentinfo.getName());
            ps.setString(2, studentinfo.getEmail());
            ps.setString(3, studentinfo.getPhoneNumber());
            ps.setString(4, studentinfo.getAddress());
         
            
            
            ps.executeUpdate();
            ps.close();
            util.getCon().close();
            
            System.out.println("Data Saved");
            
            
        } catch (SQLException ex) {
      
        }
    }
}
