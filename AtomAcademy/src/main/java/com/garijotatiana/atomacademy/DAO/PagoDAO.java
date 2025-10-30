package com.garijotatiana.atomacademy.DAO;

import com.garijotatiana.atomacademy.model.Pago;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Tatiana
 */
public interface PagoDAO extends GenericDAO<Pago, Integer> {
    
    List<Pago>findPagosByAlumnoNombreOrApellidos(String dato);
    List<Pago> findPagosByAlumnoId(String dato);
    List<Pago> findPagosByAlumnoCursoNombre(String dato);
    List<Pago> findPagosByFechaAnyo(String dato);
    List<Pago> findPagosByFechaCompleta(LocalDate dato);
}
