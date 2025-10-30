package com.garijotatiana.atomacademy.DAO;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Tatiana
 * @param <T>
 * @param <ID>
 */
public interface GenericDAO <T,ID extends Serializable>{
    void save(T entity);
    void update (T entity);
    void delete (T entity);
    T findById (ID id);
    List<T> findAll();
    List<T> findLike (String campo,String dato);
    long count (T entity);
    
}
