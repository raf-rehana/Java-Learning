package employees;

import employee.dao.EmployeeDao;
import employee.model.Employee;
import java.sql.SQLException;

public class Employees {
    public static void main(String[] args) throws SQLException {
        Employee employee = new Employee("Sajin", "sajin@gmail.com", "019190000", 500000);
        EmployeeDao employeeDao = new EmployeeDao();

        employeeDao.saveEmployee(employee);
//        EmployeeDao.updateEmployee(Employee);
//        EmployeeDao.deleteEmployee(Employee);
//        EmployeeDao.showAll();
    }
}
