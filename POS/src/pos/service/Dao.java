package pos.service;

import java.util.List;

public interface Dao<E> {

    void save(E e);

    void update(E e);

    void delete(int id);

    List<E> findAll();

    E findById(int id);
}