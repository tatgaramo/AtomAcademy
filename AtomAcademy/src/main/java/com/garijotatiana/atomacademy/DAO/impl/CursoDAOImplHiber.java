package com.garijotatiana.atomacademy.DAO.impl;

import com.garijotatiana.atomacademy.Auxiliar;
import com.garijotatiana.atomacademy.DAO.CursoDAO;
import com.garijotatiana.atomacademy.model.Curso;
import com.garijotatiana.atomacademy.model.Profesor;
import jakarta.persistence.NoResultException;
import jakarta.persistence.criteria.*;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Tatiana
 */
public class CursoDAOImplHiber extends GenericDAOImplHiber<Curso, Integer> implements CursoDAO {

    Auxiliar aux = new Auxiliar();

    public CursoDAOImplHiber(Class<Curso> entityClass) {
        super(entityClass);

    }

    //buscar curso por nombre
    @Override
    public Curso findByName(String name) {
        Curso curso = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Curso> cq = cb.createQuery(entityClass);
            Root<Curso> root = cq.from(entityClass);

            cq.select(root).where(cb.equal(root.get("nombre"), name));

            curso = session.createQuery(cq).getSingleResult();

        } catch (NoResultException e) {
            aux.mostrarMensaje("No hay ningún resultado", "Error", "Error al eliminar");
        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error al eliminar");
        }
        return curso;

    }

    
    //buscar cursos por cuota (precio)
    @Override
    public List<Curso> findByCuota(int precio) {
        List<Curso> cursos = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Curso> cq = cb.createQuery(entityClass);
            Root<Curso> root = cq.from(entityClass);
            cq.select(root).where(cb.equal(root.get("cuota"), precio));

            cursos = session.createQuery(cq).getResultList();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return cursos;
    }

    
    //buscar cursos por nombre o apellido del alumno
    @Override
    public List<Curso> findCursosByAlumnoNombreOrApellidos(String dato) {

        List<Curso> cursos = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Curso> cq = cb.createQuery(entityClass);
            Root<Curso> root = cq.from(entityClass);
            Join<Curso, Profesor> alumnoJoin = root.join("profesor");

            cq.select(root).where(cb.or(
                    cb.like(alumnoJoin.get("nombre"), "%" + dato + "%"),
                    cb.like(alumnoJoin.get("apellidos"), "%" + dato + "%")));

            cursos = session.createQuery(cq).getResultList();

        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }

        return cursos;
    }

    //buscar cursos que están completos
    @Override
    public List<Curso> findCursosByCompletos() {
        List<Curso> cursos = null;
        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Curso> cq = cb.createQuery(Curso.class);
            Root<Curso> root = cq.from(Curso.class);

            // Subconsulta para contar el número de alumnos por curso 
            Subquery<Long> sq = cq.subquery(Long.class);
            Root<Curso> sRoot = sq.from(Curso.class);
            sq.select(cb.count(sRoot.join("alumnos").get("id"))).where(cb.equal(sRoot.get("id"), root.get("id")));

            // Ccomprobar capacidad == número de alumnos 
            cq.select(root).where(cb.equal(root.get("capacidad"), sq));

            cursos = session.createQuery(cq).getResultList();
        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return cursos;
    }

    
    //buscar cursos que no están completos y tienen capacidad para admitir alumnos
    @Override
    public List<Curso> findCursosByIncompletos() {
        List<Curso> cursos = null;
        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Curso> cq = cb.createQuery(Curso.class);
            Root<Curso> root = cq.from(Curso.class);

            // Subconsulta para contar el número de alumnos por curso 
            Subquery<Long> sq = cq.subquery(Long.class);
            Root<Curso> sRoot = sq.from(Curso.class);
            sq.select(cb.count(sRoot.join("alumnos").get("id"))).where(cb.equal(sRoot.get("id"), root.get("id")));

            // Combrobar capacidad > número de alumnos 
            cq.select(root).where(cb.greaterThan(root.get("capacidad"), sq));

            cursos = session.createQuery(cq).getResultList();
        } catch (Exception e) {
            aux.mostrarMensaje("Error en la búsqueda", "Error", "Error");
        }
        return cursos;
    }
    
}
