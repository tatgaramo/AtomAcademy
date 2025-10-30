package com.garijotatiana.atomacademy.DAO.impl;

import com.garijotatiana.atomacademy.DAO.AlumnoDAO;
import com.garijotatiana.atomacademy.model.Alumno;

/**
 *
 * @author Tatiana
 */
public class AlumnoDAOImplHiber extends GenericDAOImplHiber<Alumno, Integer>implements AlumnoDAO {

    public AlumnoDAOImplHiber(Class<Alumno> entityClass) {
        super(entityClass);
    }
}
