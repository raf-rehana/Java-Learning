package employees;

import employee.dao.employeeDao;
import employee.model.employee;
import java.sql.SQLException;
import java.util.List;

public class Employees {

    public static void main(String[] args) throws SQLException {

        employee employee = new employee("Rafiaah", "rafiaah@gmail.com", "018190000", 500000);

        employeeDao employeeDao = new employeeDao();

        employeeDao.saveEmployee(employee);
        employeeDao.updateEmployee(employee);
        employeeDao.deleteEmployee(employee);
        employeeDao.showAll();

    }

}
