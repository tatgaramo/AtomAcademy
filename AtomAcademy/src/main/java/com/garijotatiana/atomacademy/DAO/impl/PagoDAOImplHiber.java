package com.garijotatiana.atomacademy.DAO.impl;

import com.garijotatiana.atomacademy.Auxiliar;
import com.garijotatiana.atomacademy.DAO.PagoDAO;
import com.garijotatiana.atomacademy.model.Alumno;
import com.garijotatiana.atomacademy.model.Curso;
import com.garijotatiana.atomacademy.model.Pago;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Expression;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;
import java.time.LocalDate;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Tatiana
 */
public class PagoDAOImplHiber extends GenericDAOImplHiber<Pago, Integer> implements PagoDAO {

    Auxiliar aux = new Auxiliar();

    public PagoDAOImplHiber(Class<Pago> entityClass) {
        super(entityClass);
    }

    //buscar pagos por el nombre o apellido del alumno
    @Override
    public List<Pago> findPagosByAlumnoNombreOrApellidos(String dato) {
        List<Pago> pagos = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Pago> cq = cb.createQuery(entityClass);
            Root<Pago> root = cq.from(entityClass);
            Join<Pago, Alumno> alumnoJoin = root.join("alumno");

            cq.select(root).where(cb.or(
                    cb.like(alumnoJoin.get("nombre"), "%" + dato + "%"),
                    cb.like(alumnoJoin.get("apellidos"), "%" + dato + "%")));

            pagos = session.createQuery(cq).getResultList();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return pagos;
    }

    
    //buscar pagos por el id del alumno
    @Override
    public List<Pago> findPagosByAlumnoId(String dato) {
        List<Pago> pagos = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Pago> cq = cb.createQuery(entityClass);
            Root<Pago> root = cq.from(entityClass);
            Join<Pago, Alumno> alumnoJoin = root.join("alumno");

            cq.select(root).where(
                    cb.equal(alumnoJoin.get("id"), dato));

            pagos = session.createQuery(cq).getResultList();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return pagos;
    }

    
    //buscar pagos por nombre de curso
    @Override
    public List<Pago> findPagosByAlumnoCursoNombre(String dato) {
        List<Pago> pagos = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Pago> cq = cb.createQuery(entityClass);
            Root<Pago> root = cq.from(entityClass);
            Join<Pago, Alumno> alumnoJoin = root.join("alumno");
            Join<Alumno, Curso> cursoJoin = alumnoJoin.join("cursos");

            cq.select(root)
                    .where(cb.like(cursoJoin.get("nombre"), "%" + dato + "%"));

            pagos = session.createQuery(cq).getResultList();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return pagos;
    }

    
    //buscar pagos por año
    @Override
    public List<Pago> findPagosByFechaAnyo(String dato) {
        List<Pago> pagos = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Pago> cq = cb.createQuery(entityClass);
            Root<Pago> root = cq.from(entityClass);
            //extraer el año del campo fecha de la BD
            Expression<Integer> anyo = cb.function("year", Integer.class, root.get("fecha"));

            cq.select(root).where(cb.equal(anyo, dato));

            pagos = session.createQuery(cq).getResultList();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return pagos;
    }

    
    //buscar pagos por fecha exacta
    @Override
    public List<Pago> findPagosByFechaCompleta(LocalDate dato) {
        List<Pago> pagos = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Pago> cq = cb.createQuery(entityClass);
            Root<Pago> root = cq.from(entityClass);
            cq.select(root).where(cb.equal(root.get("fecha"), dato));

            pagos = session.createQuery(cq).getResultList();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return pagos;
    }

}
