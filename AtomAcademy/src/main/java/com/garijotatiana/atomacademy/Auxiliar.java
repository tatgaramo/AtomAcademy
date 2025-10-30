package com.garijotatiana.atomacademy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Tatiana
 */


public class Auxiliar {
    //mostrar JOptionPane con diferentes mensajes ERROR e INFO
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
       JOptionPane optionPane=new JOptionPane(mensaje);
        if(tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if(tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog=optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    //validar DNI o NIE 
    public boolean validarDocumento(String documento, String tipoDoc) {
        boolean valido;

        Pattern pattern;
        Matcher matcher;

        if (!documento.isEmpty() && !documento.trim().isEmpty()) {
            if (tipoDoc.equals("DNI")) {//validar el contenido del DNI 
                String dniValido = "\\d{8}[A-Za-z]";

                pattern = Pattern.compile(dniValido);

            } else {//validar el contenido del NIE 
                String nieValido = "^[XYZ][0-9]{7}[A-Z]$";

                pattern = Pattern.compile(nieValido);

            }
            matcher = pattern.matcher(documento);
            //comprobar si el Docuemnto es válido
            if (matcher.matches()) {
                valido = true;

            } else {
                mostrarMensaje("Error: el Número de Docuemnto introducido no es válido.", "Error", "Error");
                valido = false;
            }
        } else {
            mostrarMensaje("Error: Debe introducir el Número de Documento", "Error", "Error");
            valido = false;
        }
        return valido;
    }
    
}
