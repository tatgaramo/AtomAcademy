package com.garijotatiana.atomacademy.config;

import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Tatiana
 */
public class HibernateUtil {
    
    private static final SessionFactory sessionFactory; 
    static { 
        try { 
            
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
             
        } catch (HibernateException ex) { 
           
            JOptionPane.showMessageDialog(null, "Error: No hay conexión","Error",JOptionPane.ERROR_MESSAGE);
            throw new ExceptionInInitializerError(ex); 
        } 
        
    } public static SessionFactory getSessionFactory() { 
        return sessionFactory;
    }
    
    
}
