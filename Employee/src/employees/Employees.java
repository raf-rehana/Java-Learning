
package employees;

import employee.dao.employeeDao;
import employee.model.employee;

public class Employees { 

    public static void main(String[] args) {
   
        employee employee = new employee("Rafiaah", "rafiaah@gmail.com", "018190000");
       
       employeeDao employeeDao = new employeeDao();
       
        employeeDao.saveEmployee(employee);
       
    }
    
}
