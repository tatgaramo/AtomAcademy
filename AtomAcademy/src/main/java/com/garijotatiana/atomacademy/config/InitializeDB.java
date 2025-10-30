package com.garijotatiana.atomacademy.config;

import com.garijotatiana.atomacademy.Auxiliar;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Tatiana
 */
public class InitializeDB {

    Auxiliar aux = new Auxiliar();

    public void inicializarBD() {
        Transaction transaction = null;
        Session session = null;
        try {
            InputStream is = getClass().getResourceAsStream("/init_db.sql");
            if (is != null) {
                session = HibernateUtil.getSessionFactory().openSession();

                transaction = session.beginTransaction();
                session.doWork(connection -> {
                    //configuración para que no haya problemas con los signos y acentos
                    connection.createStatement().execute("SET MODE MySQL");
                    try (Reader read = new InputStreamReader(is, StandardCharsets.UTF_8)) {
                        org.h2.tools.RunScript.execute(connection, read);
                    } catch (IOException ex) {
                        aux.mostrarMensaje("Error al leer el script ", "Error", "Error");
                    }
                });

                transaction.commit();
                session.close();
                aux.mostrarMensaje("Datos cargados con éxito", "Info", "Info");
            }

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();

            }

            aux.mostrarMensaje("Error al cargar los datos ", "Error", "Error");
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }

        }
    }

}
