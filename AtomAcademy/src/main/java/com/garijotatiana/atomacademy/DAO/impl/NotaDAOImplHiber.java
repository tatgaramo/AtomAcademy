package com.garijotatiana.atomacademy.DAO.impl;

import com.garijotatiana.atomacademy.Auxiliar;
import com.garijotatiana.atomacademy.DAO.NotaDAO;
import com.garijotatiana.atomacademy.model.Alumno;
import com.garijotatiana.atomacademy.model.Curso;
import com.garijotatiana.atomacademy.model.Nota;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Tatiana
 */
public class NotaDAOImplHiber extends GenericDAOImplHiber<Nota, Integer> implements NotaDAO {

    Auxiliar aux = new Auxiliar();

    public NotaDAOImplHiber(Class<Nota> persistentClass) {
        super(persistentClass);
    }

    //buscar notas por el valor del campo nota
    @Override
    public List<Nota> findByNota(float valorNota) {
        List<Nota> notas = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Nota> cq = cb.createQuery(entityClass);
            Root<Nota> root = cq.from(entityClass);
            cq.select(root).where(cb.equal(root.get("nota"), valorNota));

            notas = session.createQuery(cq).getResultList();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return notas;
    }

    //buscar notas por el nombre o apellido del alumno
    @Override
    public List<Nota> findNotasByAlumnoNombreOrApellidos(String dato) {
        List<Nota> notas = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Nota> cq = cb.createQuery(entityClass);
            Root<Nota> root = cq.from(entityClass);
            Join<Nota, Alumno> alumnoJoin = root.join("alumno");

            cq.select(root).where(cb.or(
                    cb.like(alumnoJoin.get("nombre"), "%" + dato + "%"),
                    cb.like(alumnoJoin.get("apellidos"), "%" + dato + "%")));

            notas = session.createQuery(cq).getResultList();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return notas;
    }

    //buscar notas por nombre del curso
    @Override
    public List<Nota> findNotasByCursoNombre(String dato) {
        List<Nota> notas = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Nota> cq = cb.createQuery(entityClass);
            Root<Nota> root = cq.from(entityClass);
            Join<Nota, Curso> cusoJoin = root.join("curso");

            cq.select(root).where(cb.like(cusoJoin.get("nombre"), "%" + dato + "%"));

            notas = session.createQuery(cq).getResultList();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return notas;
    }

    //buscar notas suspensas <5
    @Override
    public List<Nota> findNotasSuspensos() {
        List<Nota> notas = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Nota> cq = cb.createQuery(entityClass);
            Root<Nota> root = cq.from(entityClass);
            cq.select(root).where(cb.lessThan(root.get("nota"), 5.0));

            notas = session.createQuery(cq).getResultList();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return notas;
    }

    //buscar notas aprobadas >=5
    @Override
    public List<Nota> findNotasAprobados() {
        List<Nota> notas = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Nota> cq = cb.createQuery(entityClass);
            Root<Nota> root = cq.from(entityClass);
            cq.select(root).where(cb.greaterThanOrEqualTo(root.get("nota"), 5.0));

            notas = session.createQuery(cq).getResultList();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return notas;
    }

    //buscar notas de notable  >=7 y <9
    @Override
    public List<Nota> findNotasNotables() {
        List<Nota> notas = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Nota> cq = cb.createQuery(entityClass);
            Root<Nota> root = cq.from(entityClass);
            cq.select(root).where(cb.between(root.get("nota"), 7.0, 8.9));

            notas = session.createQuery(cq).getResultList();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return notas;
    }

    //buscar notas >9
    @Override
    public List<Nota> findNotasSobresalientes() {
        List<Nota> notas = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Nota> cq = cb.createQuery(entityClass);
            Root<Nota> root = cq.from(entityClass);
            cq.select(root).where(cb.greaterThanOrEqualTo(root.get("nota"), 9));

            notas = session.createQuery(cq).getResultList();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return notas;
    }

    //contar las notas aprobadas
    @Override
    public Long countNotasWhereAprobados() {
        Long aprobados = null;
        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Long> cq = cb.createQuery(Long.class);
            Root<Nota> root = cq.from(entityClass);
            cq.select(cb.count(root));
            cq.where(cb.greaterThanOrEqualTo(root.get("nota"), 5.0));

            aprobados = session.createQuery(cq).getSingleResult();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return aprobados;
    }

    //contar las notas suspensas
    @Override
    public Long countNotasWhereSuspensos() {
        Long suspensos = null;
        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Long> cq = cb.createQuery(Long.class);
            Root<Nota> root = cq.from(entityClass);
            cq.select(cb.count(root));
            cq.where(cb.lessThan(root.get("nota"), 5));

            suspensos = session.createQuery(cq).getSingleResult();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return suspensos;
    }

    //contar las notas notables 
    @Override
    public Long countNotasWhereNotables() {
        Long aprobados = null;
        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Long> cq = cb.createQuery(Long.class);
            Root<Nota> root = cq.from(entityClass);
            cq.select(cb.count(root));
            cq.where(cb.between(root.get("nota"), 7.0, 8.9));

            aprobados = session.createQuery(cq).getSingleResult();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return aprobados;
    }

    //contar las notas sobresalientes
    @Override
    public Long countNotasWhereSobresalientes() {
        Long aprobados = null;
        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Long> cq = cb.createQuery(Long.class);
            Root<Nota> root = cq.from(entityClass);
            cq.select(cb.count(root));
            cq.where(cb.greaterThanOrEqualTo(root.get("nota"), 9));

            aprobados = session.createQuery(cq).getSingleResult();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return aprobados;
    }
    
     @Override
    public Long countNotasWhereSuspensosByEvaluacion(String evaluacion) {
        Long aprobados = null;
        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Long> cq = cb.createQuery(Long.class);
            Root<Nota> root = cq.from(entityClass);
            
            Predicate condicionSuspensos=cb.lessThan(root.get("nota"), 5);
            Predicate condicionAprobados=cb.equal(root.get("evaluacion"), evaluacion);
            
            
            cq.select(cb.count(root)).where(cb.and(condicionSuspensos,condicionAprobados));

            aprobados = session.createQuery(cq).getSingleResult();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return aprobados;
    }

    
    
    @Override
    public Long countNotasWhereAprobadosByEvaluacion(String evaluacion) {
        Long suspensos = null;
        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Long> cq = cb.createQuery(Long.class);
            Root<Nota> root = cq.from(entityClass);
            
            Predicate condicionSuspensos=cb.greaterThanOrEqualTo(root.get("nota"), 5);
            Predicate condicionAprobados=cb.equal(root.get("evaluacion"), evaluacion);
            
            
            cq.select(cb.count(root)).where(cb.and(condicionSuspensos,condicionAprobados));

            suspensos = session.createQuery(cq).getSingleResult();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return suspensos;
    }
}
