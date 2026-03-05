
package person;

import person.dao.StudentDao;
import person.model.StudentInfo;

public class Students {

    public static void main(String[] args) {
       StudentInfo student = new StudentInfo("Sajin", "sajin@gmail.com", "0181900000", "Ajimpur");
       
       StudentDao studentdao = new StudentDao();
       
       studentdao.saveStudent(student);
       
      
    }
    
}
