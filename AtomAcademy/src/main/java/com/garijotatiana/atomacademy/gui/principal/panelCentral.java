package com.garijotatiana.atomacademy.gui.principal;

import com.garijotatiana.atomacademy.DAO.AlumnoDAO;
import com.garijotatiana.atomacademy.DAO.CursoDAO;
import com.garijotatiana.atomacademy.DAO.NotaDAO;
import com.garijotatiana.atomacademy.DAO.PagoDAO;
import com.garijotatiana.atomacademy.DAO.ProfesorDAO;
import com.garijotatiana.atomacademy.DAO.impl.AlumnoDAOImplHiber;
import com.garijotatiana.atomacademy.DAO.impl.CursoDAOImplHiber;
import com.garijotatiana.atomacademy.DAO.impl.NotaDAOImplHiber;
import com.garijotatiana.atomacademy.DAO.impl.PagoDAOImplHiber;
import com.garijotatiana.atomacademy.DAO.impl.ProfesorDAOImplHiber;
import com.garijotatiana.atomacademy.config.InitializeDB;
import com.garijotatiana.atomacademy.model.Alumno;
import com.garijotatiana.atomacademy.model.Curso;
import com.garijotatiana.atomacademy.model.Nota;
import com.garijotatiana.atomacademy.model.Pago;
import com.garijotatiana.atomacademy.model.Profesor;
import javax.swing.JOptionPane;

/**
 *
 * @author Tatiana
 */
public class panelCentral extends javax.swing.JPanel {

    public panelCentral() {

        initComponents();
        //Hacer visible botón de carga de Script de datos de prueba si no hay registros
        if (comprobarRegistros()) {
            btnDatos.setVisible(false);
        } else {
            btnDatos.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnDatos = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SlashAtom.png"))); // NOI18N

        btnDatos.setForeground(new java.awt.Color(204, 153, 255));
        btnDatos.setText("Cargar Datos de Prueba");
        btnDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDatos.setContentAreaFilled(false);
        btnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que desea cargar los datos de prueba? ", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION){
            InitializeDB iniciar= new InitializeDB();
            iniciar.inicializarBD();
            btnDatos.setVisible(false);
            repaint();
        }
    }//GEN-LAST:event_btnDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatos;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

//comprobar si hay registros en alguna de las tablas
    private boolean comprobarRegistros() {
        boolean existe = false;
        AlumnoDAO alumnoDAO = new AlumnoDAOImplHiber(Alumno.class);
        long alu = alumnoDAO.count(new Alumno());

        CursoDAO cursoDAO = new CursoDAOImplHiber(Curso.class);
        long curso = cursoDAO.count(new Curso());

        ProfesorDAO profesorDAO = new ProfesorDAOImplHiber(Profesor.class);
        long profe = profesorDAO.count(new Profesor());

        PagoDAO pagoDAO = new PagoDAOImplHiber(Pago.class);
        long pago = pagoDAO.count(new Pago());

        NotaDAO notaDAO = new NotaDAOImplHiber(Nota.class);
        long nota = notaDAO.count(new Nota());

        if (alu != 0) {
            existe = true;
        } else if (curso != 0) {
            existe = true;
        } else if (profe != 0) {
            existe = true;
        } else if (pago != 0) {
            existe = true;
        } else if (nota != 0) {
            existe = true;
        }
        return existe;
    }

}
