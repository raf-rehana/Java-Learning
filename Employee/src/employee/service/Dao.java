
package employee.service;


import java.util.List;

public interface Dao <E> {
    
     void saveEmployee(E e);

    void updateEmployee(E e);

    void deleteEmployee(int id);

    List<E> findAll();

    E findById(int id);
}