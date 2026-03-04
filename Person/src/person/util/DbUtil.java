
package person.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbUtil {
    private Connection con = null;
    private String url = "jdbc:mysql://localhost:3306/person?";
    private String user = "root";
    private String password = "1234";
    private String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection getCon(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            
            
            
        } catch (ClassNotFoundException ex) {
            System.getLogger(DbUtil.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(DbUtil.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return con;
    }
}
