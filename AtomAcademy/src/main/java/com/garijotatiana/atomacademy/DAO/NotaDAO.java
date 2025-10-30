package com.garijotatiana.atomacademy.DAO;

import com.garijotatiana.atomacademy.model.Nota;
import java.util.List;

/**
 *
 * @author Tatiana
 */
public interface NotaDAO extends GenericDAO<Nota, Integer>{

    List<Nota> findByNota(float valorNota);
    List<Nota> findNotasByAlumnoNombreOrApellidos(String dato);
    List<Nota> findNotasByCursoNombre(String dato);
    List<Nota> findNotasSuspensos();
    List<Nota> findNotasAprobados();
    List<Nota> findNotasNotables();
    List<Nota> findNotasSobresalientes();
    Long countNotasWhereAprobados();
    Long countNotasWhereSuspensos();
    Long countNotasWhereNotables();
    Long countNotasWhereSobresalientes();
    Long countNotasWhereSuspensosByEvaluacion(String evaluacion);
    Long countNotasWhereAprobadosByEvaluacion(String evaluacion);
    
}
