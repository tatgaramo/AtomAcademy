package com.garijotatiana.atomacademy;

import com.garijotatiana.atomacademy.gui.principal.PrincipalFrame;
/**
 *
 * @author Tatiana
 */
public class AtomAcademy {
    
     public static void main(String[] args) {
             
        //Iniciar GUI
        //ejecutar el JFrame en el hilo de eventos de Swing
        java.awt.EventQueue.invokeLater(() -> {
            // Crear una instancia JFrame y hacerlo visible
            new PrincipalFrame().setVisible(true);
        });
         
    }
}
