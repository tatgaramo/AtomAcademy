package com.garijotatiana.atomacademy.gui.Profesores;

import com.garijotatiana.atomacademy.Auxiliar;
import com.garijotatiana.atomacademy.DAO.CursoDAO;
import com.garijotatiana.atomacademy.gui.principal.frameAuxiliar;
import com.garijotatiana.atomacademy.DAO.ProfesorDAO;
import com.garijotatiana.atomacademy.DAO.impl.CursoDAOImplHiber;
import com.garijotatiana.atomacademy.DAO.impl.ProfesorDAOImplHiber;
import com.garijotatiana.atomacademy.model.Curso;
import com.garijotatiana.atomacademy.model.Profesor;
import com.garijotatiana.atomacademy.plantilla.AccionesPDF;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tatiana
 */
public class panelProfesores extends javax.swing.JPanel {

    ProfesorDAO profesorDAO = new ProfesorDAOImplHiber(Profesor.class);
    CursoDAO cursoDAO = new CursoDAOImplHiber(Curso.class);
    Auxiliar aux = new Auxiliar();

    List<Profesor> listaCompleta = profesorDAO.findAll();

    public panelProfesores() {
        initComponents();
        cargarTabla(listaCompleta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBotones = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btPdf = new javax.swing.JButton();
        pnBuscar = new javax.swing.JPanel();
        btBuscar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        cmbBuscar = new javax.swing.JComboBox<>();
        spTablaProf = new javax.swing.JScrollPane();
        tbProfesores = new javax.swing.JTable();
        laTitulo = new javax.swing.JLabel();
        btActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(870, 620));

        pnBotones.setOpaque(false);

        btAdd.setBackground(new java.awt.Color(140, 166, 219));
        btAdd.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        btAdd.setForeground(new java.awt.Color(255, 255, 255));
        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mas.png"))); // NOI18N
        btAdd.setText(" Añadir");
        btAdd.setBorderPainted(false);
        btAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAdd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btEdit.setBackground(new java.awt.Color(140, 166, 219));
        btEdit.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        btEdit.setForeground(new java.awt.Color(255, 255, 255));
        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lapiz.png"))); // NOI18N
        btEdit.setText(" Editar");
        btEdit.setBorderPainted(false);
        btEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEdit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDelete.setBackground(new java.awt.Color(140, 166, 219));
        btDelete.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        btDelete.setForeground(new java.awt.Color(255, 255, 255));
        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/papelera.png"))); // NOI18N
        btDelete.setText(" Eliminar");
        btDelete.setToolTipText("No se puede eliminar un profesor que está asociado a algún curso");
        btDelete.setBorderPainted(false);
        btDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btPdf.setBackground(new java.awt.Color(140, 166, 219));
        btPdf.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        btPdf.setForeground(new java.awt.Color(255, 255, 255));
        btPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf.png"))); // NOI18N
        btPdf.setBorderPainted(false);
        btPdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBotonesLayout = new javax.swing.GroupLayout(pnBotones);
        pnBotones.setLayout(pnBotonesLayout);
        pnBotonesLayout.setHorizontalGroup(
            pnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnBotonesLayout.setVerticalGroup(
            pnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pnBuscar.setOpaque(false);

        btBuscar.setBackground(new java.awt.Color(140, 166, 219));
        btBuscar.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        btBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btBuscar.setText(" Buscar");
        btBuscar.setBorderPainted(false);
        btBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btBuscar.setMargin(new java.awt.Insets(2, 2, 3, 14));
        btBuscar.setPreferredSize(new java.awt.Dimension(133, 39));
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btLimpiar.setBackground(new java.awt.Color(140, 166, 219));
        btLimpiar.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        btLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrar.png"))); // NOI18N
        btLimpiar.setText(" Limpiar");
        btLimpiar.setBorderPainted(false);
        btLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btLimpiar.setMargin(new java.awt.Insets(2, 4, 3, 14));
        btLimpiar.setMaximumSize(new java.awt.Dimension(113, 39));
        btLimpiar.setMinimumSize(new java.awt.Dimension(113, 39));
        btLimpiar.setPreferredSize(new java.awt.Dimension(133, 39));
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        cmbBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombre", "Apellidos", "Documento", "Direccion", "Email", "Teléfono", "Curso" }));
        cmbBuscar.setBackground(Color.WHITE);
        cmbBuscar.setOpaque(true);

        javax.swing.GroupLayout pnBuscarLayout = new javax.swing.GroupLayout(pnBuscar);
        pnBuscar.setLayout(pnBuscarLayout);
        pnBuscarLayout.setHorizontalGroup(
            pnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBuscar, 0, 185, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pnBuscarLayout.setVerticalGroup(
            pnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spTablaProf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tbProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbProfesores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbProfesores.setAutoscrolls(false);
        tbProfesores.setMinimumSize(null);
        tbProfesores.setPreferredSize(new java.awt.Dimension(700, 500));
        tbProfesores.setSelectionBackground(new java.awt.Color(140, 166, 219));
        tbProfesores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        spTablaProf.setViewportView(tbProfesores);

        laTitulo.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        laTitulo.setForeground(new java.awt.Color(79, 79, 255));
        laTitulo.setText("Registros de Profesores");

        btActualizar.setBackground(new java.awt.Color(140, 166, 219));
        btActualizar.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        btActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/actualizar.png"))); // NOI18N
        btActualizar.setToolTipText("Actualizar");
        btActualizar.setBorderPainted(false);
        btActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btActualizar.setMargin(new java.awt.Insets(2, 4, 3, 14));
        btActualizar.setMaximumSize(new java.awt.Dimension(113, 39));
        btActualizar.setMinimumSize(new java.awt.Dimension(113, 39));
        btActualizar.setPreferredSize(new java.awt.Dimension(133, 39));
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(laTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spTablaProf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(pnBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(laTitulo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spTablaProf, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
   frameAuxiliar pantalla = new frameAuxiliar();
    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        panelNuevoProfesor panel = new panelNuevoProfesor();

        JDialog dialogo = new JDialog(pantalla, "Nuevo Registro Profesor", true);
        dialogo.setContentPane(panel);
        dialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialogo.pack();
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);

    }//GEN-LAST:event_btAddActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        //controlar que la tabla no esté vacía
        if (tbProfesores.getRowCount() > 0) {
            //controlar que haya un registro seleccionado
            if (tbProfesores.getSelectedRow() != -1) {
                int id = (int) tbProfesores.getValueAt(tbProfesores.getSelectedRow(), 0);
                //llamda método buscar por ID
                Profesor profesor = profesorDAO.findById(id);

                //abrir el panel para editar el registro pasando el profesor encontrado
                panelEditarProfesor panel = new panelEditarProfesor(profesor);

                JDialog dialogo = new JDialog(pantalla, "Editar Registro Profesor", true);
                dialogo.setContentPane(panel);
                dialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialogo.pack();
                dialogo.setLocationRelativeTo(null);
                dialogo.setVisible(true);

            } else {
                aux.mostrarMensaje("No hay ningún registro seleccionado", "Error", "Error al eliminar");
            }
        } else {
            aux.mostrarMensaje("No hay registros para editar", "Error", "Error al eliminar");
        }


    }//GEN-LAST:event_btEditActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        List<Profesor> listaBusqueda = new ArrayList<>();
        String valorBusqueda = txtBuscar.getText();

        try {
            //controlar el el valor de busqueda no esté vacío
            if (!valorBusqueda.isEmpty() && !valorBusqueda.trim().isEmpty()) {
                String propiedad = (String) cmbBuscar.getSelectedItem();

                switch (propiedad) {
                    case "ID":
                        try {
                            int id = Integer.parseInt(valorBusqueda);
                            Profesor alu = profesorDAO.findById(id);
                            if (alu != null) {
                                listaBusqueda.add(alu);
                            } else {
                                aux.mostrarMensaje("No encontrado profesor con el ID introducido", "Error", "Error al editar");
                            }

                        } catch (NumberFormatException e) {
                            aux.mostrarMensaje("Debe introducir un valor numérico para buscar por ID", "Error", "Error al editar");
                        } catch (Exception e) {
                            aux.mostrarMensaje("Error", "Error", "Error al editar");
                        }

                        break;

                    case "Nombre":
                    case "Email":
                    case "Apellidos":
                    case "Documento":

                        listaBusqueda = profesorDAO.findLike(propiedad.toLowerCase(), valorBusqueda);
                        if (listaBusqueda == null) {
                            aux.mostrarMensaje("Revise el valor introducido", "Error", "Error al editar");
                        }
                        break;

                    case "Dirección":
                        listaBusqueda = profesorDAO.findLike("direccion", valorBusqueda);
                        if (listaBusqueda == null) {
                            aux.mostrarMensaje("Revise el valor introducido", "Error", "Error al editar");
                        }
                        break;

                    case "Teléfono":
                        listaBusqueda = profesorDAO.findLike("telefono", valorBusqueda);
                        if (listaBusqueda == null || listaBusqueda.isEmpty()) {
                            aux.mostrarMensaje("Revise el valor introducido", "Error", "Error al editar");
                        }
                        break;
                    case "Curso":
                        for (Profesor i : profesorDAO.findAll()) {
                            if (i.getNombreCursos().contains(valorBusqueda)) {
                                listaBusqueda.add(i);
                            }
                        }
                        break;

                }
                cargarTabla(listaBusqueda);

            } else {
                cargarTabla(profesorDAO.findAll());
                aux.mostrarMensaje("Debe indicar un criterio de búsqueda", "Error", "Error al editar");
            }

        } catch (Exception e) {

        }

    }//GEN-LAST:event_btBuscarActionPerformed


    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        txtBuscar.setText("");
        cmbBuscar.setSelectedIndex(0);

        cargarTabla(profesorDAO.findAll());
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        cargarTabla(profesorDAO.findAll());
    }//GEN-LAST:event_btActualizarActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        try {
            //controlar que la tabla no esté vacía
            if (tbProfesores.getRowCount() > 0) {
                //controlar que haya un registro seleccionado
                if (tbProfesores.getSelectedRow() != -1) {
                    //confirmar que el usuario quiere eliminar el registro
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que desea Eliminar el registro? ", "Confirmación", JOptionPane.YES_NO_OPTION);

                    if (opcion == JOptionPane.YES_OPTION) {
                        int id = (int) tbProfesores.getValueAt(tbProfesores.getSelectedRow(), 0);
                        //Comprobar si el profesor está asociado a algún curso
                        List<Curso> listaCursos = cursoDAO.findAll();
                        boolean profesorEnCursos = listaCursos.stream().anyMatch(r -> r.getProfesor().getId().equals(id));
                        if (profesorEnCursos) {
                            aux.mostrarMensaje("El registro que intenta eliminar está asociado a Algún curso y no puede ser eliminado", "Error", "Error al eliminar");
                        } else {
                            //llamda método buscar por ID
                            Profesor profesor = profesorDAO.findById(id);
                            //llamada al método para borrar el registro
                            profesorDAO.delete(profesor);
                        }

                    } else {
                        aux.mostrarMensaje("Registro no eliminado", "Info", "Eliminar registro cancelado");
                    }

                } else {
                    aux.mostrarMensaje("No hay ningún registro seleccionado", "Error", "Error al eliminar");
                }
            } else {
                aux.mostrarMensaje("No hay registros para elimiar", "Error", "Error al eliminar");
            }
        } catch (Exception ex) {
            aux.mostrarMensaje("Error", "Error", "Error al eliminar");
        }

        cargarTabla(profesorDAO.findAll());
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPdfActionPerformed
        AccionesPDF pdf = new AccionesPDF();
        pdf.crearPlantilla("REGISTROS PROFESORES", tbProfesores, titulos);

    }//GEN-LAST:event_btPdfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btPdf;
    private javax.swing.JComboBox<String> cmbBuscar;
    private javax.swing.JLabel laTitulo;
    private javax.swing.JPanel pnBotones;
    private javax.swing.JPanel pnBuscar;
    private javax.swing.JScrollPane spTablaProf;
    private javax.swing.JTable tbProfesores;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    String titulos[] = {"ID", "Nombre", "Documento", "Teléfono", "Email", "Dirección", "Cursos"};

    private void cargarTabla(List<Profesor> listaProfesores) {
        //definir el modelo de la vista de la Tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            //filas y columnas no editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        //establecer nombres de columnas
        modeloTabla.setColumnIdentifiers(titulos);

        //recorrer lista y mostrar los elementos de la tabla
        if (listaProfesores != null) {
            for (Profesor i : listaProfesores) {
                //creamos el array de tipo object porque vamos a guardar diferentes tipos de datos
                Object[] objeto = {i.getId(), i.getNombre() + " " + i.getApellidos(), i.getDocumento(), i.getTelefono(), i.getEmail(), i.getDireccion(), i.getNombreCursos()};

                modeloTabla.addRow(objeto);
            }
        }
        tbProfesores.setModel(modeloTabla);
    }

}
