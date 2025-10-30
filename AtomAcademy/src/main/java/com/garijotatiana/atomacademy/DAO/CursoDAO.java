
package com.garijotatiana.atomacademy.DAO;

import com.garijotatiana.atomacademy.model.Curso;
import java.util.List;

/**
 *
 * @author Tatiana
 */
public interface CursoDAO extends GenericDAO<Curso, Integer>{
    
    Curso findByName (String name);
    List<Curso> findByCuota(int precio);
    List<Curso> findCursosByAlumnoNombreOrApellidos(String dato);
    List<Curso> findCursosByCompletos();
    List<Curso> findCursosByIncompletos();
    
}
