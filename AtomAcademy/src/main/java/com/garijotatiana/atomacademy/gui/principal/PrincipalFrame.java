package com.garijotatiana.atomacademy.gui.principal;

import com.garijotatiana.atomacademy.gui.curso.panelCurso;
import com.garijotatiana.atomacademy.gui.notas.panelNotas;
import com.garijotatiana.atomacademy.gui.Pagos.panelPagos;
import com.garijotatiana.atomacademy.gui.Profesores.panelProfesores;
import com.garijotatiana.atomacademy.gui.Alumno.panelAlumnos;
import com.garijotatiana.atomacademy.gui.panelHorario;
import com.garijotatiana.atomacademy.plantilla.AccionesPDF;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author Tatiana
 */
public class PrincipalFrame extends javax.swing.JFrame {

   public CardLayout cardLayout;
   public JLabel[] labels;
   
    
    public PrincipalFrame() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/atom.png")).getImage());
        setTitle("AtomAcademy");
    }
    
     public void cambiosCardLayout(String panel) {
         cardLayout.show(panelRemove, panel);
     }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        pnCentro = new javax.swing.JPanel();
        panelUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnOpc = new javax.swing.JButton();
        panelRemove = new javax.swing.JPanel();
        panelMenu1 = new com.garijotatiana.atomacademy.gui.principal.panelMenu();
        pnSecciones = new javax.swing.JPanel();
        tggBtnCursos = new javax.swing.JToggleButton();
        tggBtnProfesores = new javax.swing.JToggleButton();
        tggBtnAlumnos = new javax.swing.JToggleButton();
        tggBtnNotas = new javax.swing.JToggleButton();
        tggBtnInicio = new javax.swing.JToggleButton();
        tggBtnHorario = new javax.swing.JToggleButton();
        tggBtnPagos = new javax.swing.JToggleButton();
        laLogo = new javax.swing.JLabel();
        laTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnCentro.setBackground(new java.awt.Color(0, 0, 0));
        pnCentro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelUsuario.setBackground(new java.awt.Color(140, 166, 219));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnOpc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        btnOpc.setBorder(null);
        btnOpc.setContentAreaFilled(false);
        btnOpc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOpc)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOpc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnCentro.add(panelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 870, 50));

        cardLayout= new CardLayout();

        javax.swing.GroupLayout panelRemoveLayout = new javax.swing.GroupLayout(panelRemove);
        panelRemove.setLayout(panelRemoveLayout);
        panelRemoveLayout.setHorizontalGroup(
            panelRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        panelRemoveLayout.setVerticalGroup(
            panelRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        panelRemove.setLayout(cardLayout);

        pnCentro.add(panelRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 870, 620));
        panelRemove.add(new panelAlumnos(), "panelAlumnos");
        panelRemove.add(new panelCurso(), "panelCurso");
        panelRemove.add(new panelProfesores(), "panelProfesores");
        panelRemove.add(new panelCentral(), "panelCentral");
        panelRemove.add(new panelHorario(), "panelHorario");
        panelRemove.add(new panelNotas(), "panelNotas");
        panelRemove.add(new panelPagos(), "panelPagos");
        panelRemove.add(new panelInicio(), "panelInicio");
        panelRemove.add(new panelCentral(), "panelCentral");

        cardLayout.show(panelRemove, "panelCentral");

        pnSecciones.setOpaque(false);

        grupoBotones.add(tggBtnCursos);
        tggBtnCursos.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tggBtnCursos.setForeground(new java.awt.Color(255, 255, 255));
        tggBtnCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        tggBtnCursos.setText("   Cursos");
        tggBtnCursos.setBorder(null);
        tggBtnCursos.setContentAreaFilled(false);
        tggBtnCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tggBtnCursos.setFocusPainted(false);
        tggBtnCursos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tggBtnCursos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tggBtnCursosItemStateChanged(evt);
            }
        });
        tggBtnCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tggBtnCursosMouseClicked(evt);
            }
        });

        grupoBotones.add(tggBtnProfesores);
        tggBtnProfesores.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tggBtnProfesores.setForeground(new java.awt.Color(255, 255, 255));
        tggBtnProfesores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profesor.png"))); // NOI18N
        tggBtnProfesores.setText("   Profesores");
        tggBtnProfesores.setBorder(null);
        tggBtnProfesores.setContentAreaFilled(false);
        tggBtnProfesores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tggBtnProfesores.setFocusPainted(false);
        tggBtnProfesores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tggBtnProfesores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tggBtnProfesoresItemStateChanged(evt);
            }
        });
        tggBtnProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tggBtnProfesoresMouseClicked(evt);
            }
        });

        grupoBotones.add(tggBtnAlumnos);
        tggBtnAlumnos.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tggBtnAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        tggBtnAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estudiante.png"))); // NOI18N
        tggBtnAlumnos.setText("   Alumnos");
        tggBtnAlumnos.setBorder(null);
        tggBtnAlumnos.setContentAreaFilled(false);
        tggBtnAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tggBtnAlumnos.setFocusPainted(false);
        tggBtnAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tggBtnAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tggBtnAlumnosItemStateChanged(evt);
            }
        });
        tggBtnAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tggBtnAlumnosMouseClicked(evt);
            }
        });

        grupoBotones.add(tggBtnNotas);
        tggBtnNotas.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tggBtnNotas.setForeground(new java.awt.Color(255, 255, 255));
        tggBtnNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/notas.png"))); // NOI18N
        tggBtnNotas.setText("   Notas");
        tggBtnNotas.setBorder(null);
        tggBtnNotas.setContentAreaFilled(false);
        tggBtnNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tggBtnNotas.setFocusPainted(false);
        tggBtnNotas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tggBtnNotas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tggBtnNotasItemStateChanged(evt);
            }
        });
        tggBtnNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tggBtnNotasMouseClicked(evt);
            }
        });

        grupoBotones.add(tggBtnInicio);
        tggBtnInicio.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tggBtnInicio.setForeground(new java.awt.Color(255, 255, 255));
        tggBtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homehose.png"))); // NOI18N
        tggBtnInicio.setText("   Inicio");
        tggBtnInicio.setBorder(null);
        tggBtnInicio.setContentAreaFilled(false);
        tggBtnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tggBtnInicio.setFocusPainted(false);
        tggBtnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tggBtnInicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tggBtnInicioItemStateChanged(evt);
            }
        });
        tggBtnInicio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tggBtnInicioStateChanged(evt);
            }
        });
        tggBtnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tggBtnInicioMouseClicked(evt);
            }
        });

        grupoBotones.add(tggBtnHorario);
        tggBtnHorario.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tggBtnHorario.setForeground(new java.awt.Color(255, 255, 255));
        tggBtnHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendario.png"))); // NOI18N
        tggBtnHorario.setText("   Horario");
        tggBtnHorario.setBorder(null);
        tggBtnHorario.setContentAreaFilled(false);
        tggBtnHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tggBtnHorario.setFocusPainted(false);
        tggBtnHorario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tggBtnHorario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tggBtnHorarioItemStateChanged(evt);
            }
        });
        tggBtnHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tggBtnHorarioMouseClicked(evt);
            }
        });

        grupoBotones.add(tggBtnPagos);
        tggBtnPagos.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tggBtnPagos.setForeground(new java.awt.Color(255, 255, 255));
        tggBtnPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pago.png"))); // NOI18N
        tggBtnPagos.setText("   Pagos");
        tggBtnPagos.setBorder(null);
        tggBtnPagos.setContentAreaFilled(false);
        tggBtnPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tggBtnPagos.setFocusPainted(false);
        tggBtnPagos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tggBtnPagos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tggBtnPagosItemStateChanged(evt);
            }
        });
        tggBtnPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tggBtnPagosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnSeccionesLayout = new javax.swing.GroupLayout(pnSecciones);
        pnSecciones.setLayout(pnSeccionesLayout);
        pnSeccionesLayout.setHorizontalGroup(
            pnSeccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tggBtnHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tggBtnInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tggBtnCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tggBtnProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
            .addComponent(tggBtnNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tggBtnPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tggBtnAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnSeccionesLayout.setVerticalGroup(
            pnSeccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSeccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tggBtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tggBtnHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tggBtnCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tggBtnProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tggBtnAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tggBtnPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tggBtnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        laLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atom.png"))); // NOI18N
        laLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laLogoMouseClicked(evt);
            }
        });

        laTitulo.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        laTitulo.setForeground(new java.awt.Color(255, 255, 255));
        laTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laTitulo.setText("AtomAcademy");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Icons Designed by Flaticon");

        javax.swing.GroupLayout panelMenu1Layout = new javax.swing.GroupLayout(panelMenu1);
        panelMenu1.setLayout(panelMenu1Layout);
        panelMenu1Layout.setHorizontalGroup(
            panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu1Layout.createSequentialGroup()
                .addGroup(panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenu1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(laLogo)
                        .addGap(6, 6, 6)
                        .addComponent(laTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenu1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(pnSecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenu1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)))
                .addGap(6, 6, 6))
        );
        panelMenu1Layout.setVerticalGroup(
            panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(laLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(pnSecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pnCentro.add(panelMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 670));

        getContentPane().add(pnCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tggBtnCursosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tggBtnCursosItemStateChanged
        tggBtnCursos.setForeground(Color.WHITE);
        tggBtnCursos.setBorder(null);
    }//GEN-LAST:event_tggBtnCursosItemStateChanged

    private void tggBtnCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tggBtnCursosMouseClicked
        tggBtnCursos.setForeground(new Color(102,102,255));
        tggBtnCursos.setBorder(BorderFactory.createBevelBorder(WIDTH));
        cardLayout.show(panelRemove, "panelCurso");
    }//GEN-LAST:event_tggBtnCursosMouseClicked

    private void tggBtnProfesoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tggBtnProfesoresItemStateChanged
        tggBtnProfesores.setForeground(Color.WHITE);
        tggBtnProfesores.setBorder(null);
    }//GEN-LAST:event_tggBtnProfesoresItemStateChanged

    private void tggBtnProfesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tggBtnProfesoresMouseClicked
        tggBtnProfesores.setForeground(new Color(102,102,255));
        tggBtnProfesores.setBorder(BorderFactory.createBevelBorder(WIDTH));
        cardLayout.show(panelRemove, "panelProfesores");
    }//GEN-LAST:event_tggBtnProfesoresMouseClicked

    private void tggBtnAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tggBtnAlumnosItemStateChanged
        tggBtnAlumnos.setForeground(Color.WHITE);
        tggBtnAlumnos.setBorder(null);
    }//GEN-LAST:event_tggBtnAlumnosItemStateChanged

    private void tggBtnAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tggBtnAlumnosMouseClicked
        tggBtnAlumnos.setForeground(new Color(102,102,255));
        tggBtnAlumnos.setBorder(BorderFactory.createBevelBorder(WIDTH));
        cardLayout.show(panelRemove, "panelAlumnos");
    }//GEN-LAST:event_tggBtnAlumnosMouseClicked

    private void tggBtnNotasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tggBtnNotasItemStateChanged
        tggBtnNotas.setForeground(Color.WHITE);
        tggBtnNotas.setBorder(null);
    }//GEN-LAST:event_tggBtnNotasItemStateChanged

    private void tggBtnNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tggBtnNotasMouseClicked
        tggBtnNotas.setForeground(new Color(102,102,255));
        tggBtnNotas.setBorder(BorderFactory.createBevelBorder(WIDTH));
        cardLayout.show(panelRemove, "panelNotas");
    }//GEN-LAST:event_tggBtnNotasMouseClicked

    private void tggBtnInicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tggBtnInicioItemStateChanged
        tggBtnInicio.setForeground(Color.WHITE);
        tggBtnInicio.setBorder(null);
    }//GEN-LAST:event_tggBtnInicioItemStateChanged

    private void tggBtnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tggBtnInicioMouseClicked
        tggBtnInicio.setForeground(new Color(102,102,255));
        tggBtnInicio.setBorder(BorderFactory.createBevelBorder(WIDTH));
        cardLayout.show(panelRemove, "panelInicio");
    }//GEN-LAST:event_tggBtnInicioMouseClicked

    private void tggBtnHorarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tggBtnHorarioItemStateChanged
        tggBtnHorario.setForeground(Color.WHITE);
        tggBtnHorario.setBorder(null);
    }//GEN-LAST:event_tggBtnHorarioItemStateChanged

    private void tggBtnHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tggBtnHorarioMouseClicked
        tggBtnHorario.setForeground(new Color(102,102,255));
        tggBtnHorario.setBorder(BorderFactory.createBevelBorder(WIDTH));
        cardLayout.show(panelRemove, "panelHorario");
    }//GEN-LAST:event_tggBtnHorarioMouseClicked

    private void tggBtnPagosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tggBtnPagosItemStateChanged
        tggBtnPagos.setForeground(Color.WHITE);
        tggBtnPagos.setBorder(null);
    }//GEN-LAST:event_tggBtnPagosItemStateChanged

    private void tggBtnPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tggBtnPagosMouseClicked
        tggBtnPagos.setForeground(new Color(102,102,255));
        tggBtnPagos.setBorder(BorderFactory.createBevelBorder(WIDTH));
        cardLayout.show(panelRemove, "panelPagos");
    }//GEN-LAST:event_tggBtnPagosMouseClicked

    private void tggBtnInicioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tggBtnInicioStateChanged
        tggBtnInicio.setForeground(Color.WHITE);
        tggBtnInicio.setBorder(null);
    }//GEN-LAST:event_tggBtnInicioStateChanged

    private void btnOpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcActionPerformed
        AccionesPDF pdf = new AccionesPDF();
        pdf.exportarPDFInfo();
    }//GEN-LAST:event_btnOpcActionPerformed

    private void laLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laLogoMouseClicked
       cardLayout.show(panelRemove, "panelCentral");
       grupoBotones.clearSelection();
    }//GEN-LAST:event_laLogoMouseClicked
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpc;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel laLogo;
    private javax.swing.JLabel laTitulo;
    private com.garijotatiana.atomacademy.gui.principal.panelMenu panelMenu1;
    private javax.swing.JPanel panelRemove;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JPanel pnCentro;
    private javax.swing.JPanel pnSecciones;
    private javax.swing.JToggleButton tggBtnAlumnos;
    private javax.swing.JToggleButton tggBtnCursos;
    private javax.swing.JToggleButton tggBtnHorario;
    private javax.swing.JToggleButton tggBtnInicio;
    private javax.swing.JToggleButton tggBtnNotas;
    private javax.swing.JToggleButton tggBtnPagos;
    private javax.swing.JToggleButton tggBtnProfesores;
    // End of variables declaration//GEN-END:variables

       
}



