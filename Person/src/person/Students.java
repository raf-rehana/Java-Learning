
package person;

import person.dao.StudentDao;
import person.model.StudentInfo;

public class Students {

    public static void main(String[] args) {
       StudentInfo student = new StudentInfo(1, "Rafiaah", "rafiaah@gmail.com", "017100000", "dhaka");
       
       StudentDao studentdao = new StudentDao();
       
       studentdao.saveStudent(student);
    }
    
}
