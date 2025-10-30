package com.garijotatiana.atomacademy.DAO.impl;

import com.garijotatiana.atomacademy.Auxiliar;
import com.garijotatiana.atomacademy.DAO.GenericDAO;
import com.garijotatiana.atomacademy.config.HibernateUtil;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Tatiana
 * @param <T>
 * @param <ID>
 */
public class GenericDAOImplHiber<T, ID extends Serializable> implements GenericDAO<T, ID> {

    SessionFactory SessionFactory;
    protected final Class<T> entityClass;
    Auxiliar auxiliar;

    public GenericDAOImplHiber(Class<T> entityClass) {
        SessionFactory = HibernateUtil.getSessionFactory();
        this.entityClass = entityClass;
    }

    //guardar registro, recibe como parámettro la entidad a la que pertenece
    @Override
    public void save(T entity) {
        Transaction transaction = null;
        try (Session session = SessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }

            auxiliar.mostrarMensaje("Error al guardar el registro", "Error", "Error");
        }
    }

    //actualizar registro, recibe como parámettro la entidad a la que pertenece
    @Override
    public void update(T entity) {
        Transaction transaction = null;
        try (Session session = SessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.merge(entity);
            session.flush();
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }

            auxiliar.mostrarMensaje("Error al actualizar el registro", "Error", "Error");
        }
    }
    
   
    //eliminar registro, recibe como parámettro la entidad a la que pertenece
    @Override
    public void delete(T entity) {
        Transaction transaction = null;
        try (Session session = SessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();

       
        
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }

            auxiliar.mostrarMensaje("Error al eliminar el registro", "Error", "Error");
        }
    }

    //buscar registro por id
    @Override
    public T findById(ID id) {
        try (Session session = SessionFactory.openSession()) {
            return session.get(entityClass, id);
        }
    }

    ////buscar todos los registros
    @Override
    public List<T> findAll() {
        List<T> resultList = null;
        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<T> cq = cb.createQuery(entityClass);
            Root<T> root = cq.from(entityClass);
            cq.select(root);

            resultList = session.createQuery(cq).getResultList();

        
        }catch (Exception e) {
            auxiliar.mostrarMensaje("Error al buscar el registro", "Error", "Error");
        }
        return resultList;
    }

    
    //buscar registros que coincidan con el valor y campo buscado de tipo String/texto
    @Override
    public List<T> findLike(String campo, String dato) {
        List<T> resultList = null;

        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<T> cq = cb.createQuery(entityClass);
            Root<T> root = cq.from(entityClass);

            cq.select(root).where(cb.like(root.get(campo), "%" + dato + "%"));

            resultList = session.createQuery(cq).getResultList();

        
        } catch (Exception e) {
            auxiliar.mostrarMensaje("Error en la búsqueda", "Error", "Error al eliminar");
        }

        return resultList;
    }
    
    //buscar registros que coincidan con el valor y campo buscado de tipo String/texto
    @Override
    public long count(T entity)  {
        Long result=null;
        try (Session session = SessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();

            CriteriaQuery<Long> cq = cb.createQuery(Long.class);
            Root<T> root = cq.from(entityClass);

            cq.select(cb.count(root));

            result=session.createQuery(cq).getSingleResult();
        
        } catch (Exception e) {
            auxiliar.mostrarMensaje("Error en la búsqueda", "Error", "Error al eliminar");
        }

        return result;
    }
    

}
