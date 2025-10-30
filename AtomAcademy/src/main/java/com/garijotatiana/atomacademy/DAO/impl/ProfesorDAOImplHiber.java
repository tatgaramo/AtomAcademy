package com.garijotatiana.atomacademy.DAO.impl;

import com.garijotatiana.atomacademy.DAO.ProfesorDAO;
import com.garijotatiana.atomacademy.model.Profesor;

/**
 *
 * @author Tatiana
 */
public class ProfesorDAOImplHiber extends GenericDAOImplHiber<Profesor, Integer>implements ProfesorDAO{
    
    public ProfesorDAOImplHiber(Class<Profesor> entityClass) {
        super(entityClass);
    }
}
