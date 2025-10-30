package com.garijotatiana.atomacademy.gui;

import com.garijotatiana.atomacademy.DAO.CursoDAO;
import com.garijotatiana.atomacademy.DAO.impl.CursoDAOImplHiber;
import com.garijotatiana.atomacademy.model.Curso;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;

/**
 *
 * @author Tatiana
 */
public class panelHorario extends javax.swing.JPanel {

    private Map<String, JLabel> labelMap = new HashMap<>();
    private Map<String, String> nombresBD;

    public panelHorario() {
        initComponents();
        iniciar();
    }

    private void iniciar() {
        buscarYAgregarLabels(this);
        obtenerLista();
        buscarYActualizarColores(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        panelDias = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        panelHoras = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        panelMartes = new javax.swing.JPanel();
        M9 = new javax.swing.JLabel();
        M11 = new javax.swing.JLabel();
        M13 = new javax.swing.JLabel();
        M10 = new javax.swing.JLabel();
        M12 = new javax.swing.JLabel();
        M14 = new javax.swing.JLabel();
        M20 = new javax.swing.JLabel();
        M15 = new javax.swing.JLabel();
        M16 = new javax.swing.JLabel();
        M17 = new javax.swing.JLabel();
        M18 = new javax.swing.JLabel();
        M19 = new javax.swing.JLabel();
        M21 = new javax.swing.JLabel();
        panelMiercoles = new javax.swing.JPanel();
        X9 = new javax.swing.JLabel();
        X11 = new javax.swing.JLabel();
        X13 = new javax.swing.JLabel();
        X10 = new javax.swing.JLabel();
        X12 = new javax.swing.JLabel();
        X14 = new javax.swing.JLabel();
        X20 = new javax.swing.JLabel();
        X15 = new javax.swing.JLabel();
        X16 = new javax.swing.JLabel();
        X17 = new javax.swing.JLabel();
        X18 = new javax.swing.JLabel();
        X19 = new javax.swing.JLabel();
        X21 = new javax.swing.JLabel();
        panelJueves = new javax.swing.JPanel();
        J9 = new javax.swing.JLabel();
        J11 = new javax.swing.JLabel();
        J13 = new javax.swing.JLabel();
        J10 = new javax.swing.JLabel();
        J12 = new javax.swing.JLabel();
        J14 = new javax.swing.JLabel();
        J20 = new javax.swing.JLabel();
        J15 = new javax.swing.JLabel();
        J16 = new javax.swing.JLabel();
        J17 = new javax.swing.JLabel();
        J18 = new javax.swing.JLabel();
        J19 = new javax.swing.JLabel();
        J21 = new javax.swing.JLabel();
        panelViernes = new javax.swing.JPanel();
        V9 = new javax.swing.JLabel();
        V11 = new javax.swing.JLabel();
        V13 = new javax.swing.JLabel();
        V10 = new javax.swing.JLabel();
        V12 = new javax.swing.JLabel();
        V14 = new javax.swing.JLabel();
        V20 = new javax.swing.JLabel();
        V15 = new javax.swing.JLabel();
        V16 = new javax.swing.JLabel();
        V17 = new javax.swing.JLabel();
        V18 = new javax.swing.JLabel();
        V19 = new javax.swing.JLabel();
        V21 = new javax.swing.JLabel();
        panelLunes = new javax.swing.JPanel();
        L9 = new javax.swing.JLabel();
        L11 = new javax.swing.JLabel();
        L13 = new javax.swing.JLabel();
        L10 = new javax.swing.JLabel();
        L12 = new javax.swing.JLabel();
        L14 = new javax.swing.JLabel();
        L20 = new javax.swing.JLabel();
        L15 = new javax.swing.JLabel();
        L16 = new javax.swing.JLabel();
        L17 = new javax.swing.JLabel();
        L18 = new javax.swing.JLabel();
        L19 = new javax.swing.JLabel();
        L21 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

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

        panelDias.setBackground(new java.awt.Color(209, 178, 232));
        panelDias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel81.setBackground(new java.awt.Color(209, 178, 232));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setOpaque(true);
        jLabel81.setPreferredSize(new java.awt.Dimension(100, 16));

        jLabel82.setBackground(new java.awt.Color(209, 178, 232));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("JUEVES");
        jLabel82.setOpaque(true);

        jLabel83.setBackground(new java.awt.Color(209, 178, 232));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("MIÉRCOLES");
        jLabel83.setOpaque(true);
        jLabel83.setPreferredSize(new java.awt.Dimension(100, 16));

        jLabel84.setBackground(new java.awt.Color(209, 178, 232));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("MARTES");
        jLabel84.setOpaque(true);
        jLabel84.setPreferredSize(new java.awt.Dimension(100, 16));

        jLabel85.setBackground(new java.awt.Color(209, 178, 232));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("LUNES");
        jLabel85.setOpaque(true);
        jLabel85.setPreferredSize(new java.awt.Dimension(100, 16));

        jLabel86.setBackground(new java.awt.Color(209, 178, 232));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("VIERNES");
        jLabel86.setOpaque(true);

        javax.swing.GroupLayout panelDiasLayout = new javax.swing.GroupLayout(panelDias);
        panelDias.setLayout(panelDiasLayout);
        panelDiasLayout.setHorizontalGroup(
            panelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiasLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
        );
        panelDiasLayout.setVerticalGroup(
            panelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelHoras.setBackground(new java.awt.Color(255, 255, 255));
        panelHoras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("09:00 - 10:00");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("11:00 - 12:00");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("13:00 - 14:00");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("10:00 - 11:00");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("12:00 - 13:00");
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("14:00 - 15:00");
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("20:00 - 21:00");
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("15:00 - 16:00");
        jLabel10.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("16:00 - 17:00");
        jLabel11.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("17:00 - 18:00");
        jLabel12.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("18:00 - 19:00");
        jLabel13.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("19:00 - 20:00");
        jLabel14.setOpaque(true);

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("21:00 - 22:00");
        jLabel15.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("21:00 - 22:00");

        javax.swing.GroupLayout panelHorasLayout = new javax.swing.GroupLayout(panelHoras);
        panelHoras.setLayout(panelHorasLayout);
        panelHorasLayout.setHorizontalGroup(
            panelHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addGroup(panelHorasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHorasLayout.setVerticalGroup(
            panelHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHorasLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel17))
        );

        panelMartes.setBackground(new java.awt.Color(204, 204, 204));
        panelMartes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        M9.setName("M9");
        M9.setBackground(new java.awt.Color(255, 255, 255));
        M9.setOpaque(true);

        M11.setName("M11");
        M11.setBackground(new java.awt.Color(255, 255, 255));
        M11.setOpaque(true);

        M13.setName("M13");
        M13.setBackground(new java.awt.Color(255, 255, 255));
        M13.setOpaque(true);

        M10.setName("M10");
        M10.setBackground(new java.awt.Color(255, 255, 255));
        M10.setOpaque(true);

        M12.setName("M12");
        M12.setBackground(new java.awt.Color(255, 255, 255));
        M12.setOpaque(true);

        M14.setName("M14");
        M14.setBackground(new java.awt.Color(255, 255, 255));
        M14.setOpaque(true);

        M20.setName("M20");
        M20.setBackground(new java.awt.Color(255, 255, 255));
        M20.setOpaque(true);

        M15.setName("M15");
        M15.setBackground(new java.awt.Color(255, 255, 255));
        M15.setOpaque(true);

        M16.setName("M16");
        M16.setBackground(new java.awt.Color(255, 255, 255));
        M16.setOpaque(true);

        M17.setName("M17");
        M17.setBackground(new java.awt.Color(255, 255, 255));
        M17.setOpaque(true);

        M18.setName("M18");
        M18.setBackground(new java.awt.Color(255, 255, 255));
        M18.setOpaque(true);

        M19.setName("M19");
        M19.setBackground(new java.awt.Color(255, 255, 255));
        M19.setOpaque(true);

        M21.setName("M21");
        M21.setBackground(new java.awt.Color(255, 255, 255));
        M21.setOpaque(true);

        javax.swing.GroupLayout panelMartesLayout = new javax.swing.GroupLayout(panelMartes);
        panelMartes.setLayout(panelMartesLayout);
        panelMartesLayout.setHorizontalGroup(
            panelMartesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMartesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelMartesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(M10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(M11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(M12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(M13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(M18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(M14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(M20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(M15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(M16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(M17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(M19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(M21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelMartesLayout.setVerticalGroup(
            panelMartesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMartesLayout.createSequentialGroup()
                .addComponent(M9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(M15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(M16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMiercoles.setBackground(new java.awt.Color(204, 204, 204));
        panelMiercoles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        X9.setName("X9");
        X9.setBackground(new java.awt.Color(255, 255, 255));
        X9.setOpaque(true);

        X11.setName("X11");
        X11.setBackground(new java.awt.Color(255, 255, 255));
        X11.setOpaque(true);

        X13.setName("X13");
        X13.setBackground(new java.awt.Color(255, 255, 255));
        X13.setOpaque(true);

        X10.setName("X10");
        X10.setBackground(new java.awt.Color(255, 255, 255));
        X10.setOpaque(true);

        X12.setName("X12");
        X12.setBackground(new java.awt.Color(255, 255, 255));
        X12.setOpaque(true);

        X14.setName("X14");
        X14.setBackground(new java.awt.Color(255, 255, 255));
        X14.setOpaque(true);

        X20.setName("X20");
        X20.setBackground(new java.awt.Color(255, 255, 255));
        X20.setOpaque(true);

        X15.setName("X15");
        X15.setBackground(new java.awt.Color(255, 255, 255));
        X15.setOpaque(true);

        X16.setName("X16");
        X16.setBackground(new java.awt.Color(255, 255, 255));
        X16.setOpaque(true);

        X17.setName("X17");
        X17.setBackground(new java.awt.Color(255, 255, 255));
        X17.setOpaque(true);

        X18.setName("X18");
        X18.setBackground(new java.awt.Color(255, 255, 255));
        X18.setOpaque(true);

        X19.setName("X19");
        X19.setBackground(new java.awt.Color(255, 255, 255));
        X19.setOpaque(true);

        X21.setName("X21");
        X21.setBackground(new java.awt.Color(255, 255, 255));
        X21.setOpaque(true);

        javax.swing.GroupLayout panelMiercolesLayout = new javax.swing.GroupLayout(panelMiercoles);
        panelMiercoles.setLayout(panelMiercolesLayout);
        panelMiercolesLayout.setHorizontalGroup(
            panelMiercolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMiercolesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelMiercolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(X9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(X10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(X11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(X12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(X13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(X18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(X14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(X20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(X15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(X16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(X17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(X19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(X21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelMiercolesLayout.setVerticalGroup(
            panelMiercolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMiercolesLayout.createSequentialGroup()
                .addComponent(X9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(X10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(X11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(X12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(X13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(X14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(X15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(X16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(X17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(X18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(X19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(X20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(X21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelJueves.setBackground(new java.awt.Color(204, 204, 204));
        panelJueves.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelJueves.setPreferredSize(new java.awt.Dimension(100, 551));

        J9.setName("J9");
        J9.setBackground(new java.awt.Color(255, 255, 255));
        J9.setOpaque(true);

        J11.setName("J11");
        J11.setBackground(new java.awt.Color(255, 255, 255));
        J11.setOpaque(true);

        J13.setName("J13");
        J13.setBackground(new java.awt.Color(255, 255, 255));
        J13.setOpaque(true);

        J10.setName("J10");
        J10.setBackground(new java.awt.Color(255, 255, 255));
        J10.setOpaque(true);

        J12.setName("J12");
        J12.setBackground(new java.awt.Color(255, 255, 255));
        J12.setOpaque(true);

        J14.setName("J14");
        J14.setBackground(new java.awt.Color(255, 255, 255));
        J14.setOpaque(true);

        J20.setName("J20");
        J20.setBackground(new java.awt.Color(255, 255, 255));
        J20.setOpaque(true);

        J15.setName("J15");
        J15.setBackground(new java.awt.Color(255, 255, 255));
        J15.setOpaque(true);

        J16.setName("J16");
        J16.setBackground(new java.awt.Color(255, 255, 255));
        J16.setOpaque(true);

        J17.setName("J17");
        J17.setBackground(new java.awt.Color(255, 255, 255));
        J17.setOpaque(true);

        J18.setName("J18");
        J18.setBackground(new java.awt.Color(255, 255, 255));
        J18.setOpaque(true);

        J19.setName("J19");
        J19.setBackground(new java.awt.Color(255, 255, 255));
        J19.setOpaque(true);

        J21.setName("J21");
        J21.setBackground(new java.awt.Color(255, 255, 255));
        J21.setOpaque(true);

        javax.swing.GroupLayout panelJuevesLayout = new javax.swing.GroupLayout(panelJueves);
        panelJueves.setLayout(panelJuevesLayout);
        panelJuevesLayout.setHorizontalGroup(
            panelJuevesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJuevesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelJuevesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(J11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(J12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(J13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(J18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(J14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(J20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(J15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(J16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(J17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(J19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(J21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(J9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelJuevesLayout.setVerticalGroup(
            panelJuevesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJuevesLayout.createSequentialGroup()
                .addComponent(J9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(J10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(J11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(J12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(J13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(J14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(J15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(J16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(J17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(J18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(J19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(J20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(J21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelViernes.setBackground(new java.awt.Color(204, 204, 204));
        panelViernes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelViernes.setPreferredSize(new java.awt.Dimension(100, 551));

        V9.setName("V9");
        V9.setBackground(new java.awt.Color(255, 255, 255));
        V9.setOpaque(true);

        V11.setName("V11");
        V11.setBackground(new java.awt.Color(255, 255, 255));
        V11.setOpaque(true);

        V13.setName("V13");
        V13.setBackground(new java.awt.Color(255, 255, 255));
        V13.setOpaque(true);

        V10.setName("V10");
        V10.setBackground(new java.awt.Color(255, 255, 255));
        V10.setOpaque(true);

        V12.setName("V12");
        V12.setBackground(new java.awt.Color(255, 255, 255));
        V12.setOpaque(true);

        V14.setName("V14");
        V14.setBackground(new java.awt.Color(255, 255, 255));
        V14.setOpaque(true);

        V20.setName("V20");
        V20.setBackground(new java.awt.Color(255, 255, 255));
        V20.setOpaque(true);

        V15.setName("V15");
        V15.setBackground(new java.awt.Color(255, 255, 255));
        V15.setOpaque(true);

        V16.setName("V16");
        V16.setBackground(new java.awt.Color(255, 255, 255));
        V16.setOpaque(true);

        V17.setName("V17");
        V17.setBackground(new java.awt.Color(255, 255, 255));
        V17.setOpaque(true);

        V18.setName("V18");
        V18.setBackground(new java.awt.Color(255, 255, 255));
        V18.setOpaque(true);

        V19.setName("V19");
        V19.setBackground(new java.awt.Color(255, 255, 255));
        V19.setOpaque(true);

        V21.setName("V21");
        V21.setBackground(new java.awt.Color(255, 255, 255));
        V21.setOpaque(true);

        javax.swing.GroupLayout panelViernesLayout = new javax.swing.GroupLayout(panelViernes);
        panelViernes.setLayout(panelViernesLayout);
        panelViernesLayout.setHorizontalGroup(
            panelViernesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViernesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelViernesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(V9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(V10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelViernesLayout.setVerticalGroup(
            panelViernesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViernesLayout.createSequentialGroup()
                .addComponent(V9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(V10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(V11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(V12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(V13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(V14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(V15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(V16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(V17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(V18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(V19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(V20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(V21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelLunes.setBackground(new java.awt.Color(204, 204, 204));
        panelLunes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        L9.setName("L9");
        L9.setBackground(new java.awt.Color(255, 255, 255));
        L9.setToolTipText("1234567890123456789212345678931234567894");
        L9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        L9.setOpaque(true);

        L11.setName("L11");
        L11.setBackground(new java.awt.Color(255, 255, 255));
        L11.setOpaque(true);

        L13.setName("L13");
        L13.setBackground(new java.awt.Color(255, 255, 255));
        L13.setOpaque(true);

        L10.setName("L10");
        L10.setBackground(new java.awt.Color(255, 255, 255));
        L10.setOpaque(true);

        L12.setName("L12");
        L12.setBackground(new java.awt.Color(255, 255, 255));
        L12.setOpaque(true);

        L14.setName("L14");
        L14.setBackground(new java.awt.Color(255, 255, 255));
        L14.setOpaque(true);

        L20.setName("L20");
        L20.setBackground(new java.awt.Color(255, 255, 255));
        L20.setOpaque(true);

        L15.setName("L15");
        L15.setBackground(new java.awt.Color(255, 255, 255));
        L15.setOpaque(true);

        L16.setName("L16");
        L16.setBackground(new java.awt.Color(255, 255, 255));
        L16.setOpaque(true);

        L17.setName("L17");
        L17.setBackground(new java.awt.Color(255, 255, 255));
        L17.setOpaque(true);

        L18.setName("L18");
        L18.setBackground(new java.awt.Color(255, 255, 255));
        L18.setOpaque(true);

        L19.setName("L19");
        L19.setBackground(new java.awt.Color(255, 255, 255));
        L19.setOpaque(true);

        L21.setName("L21");
        L21.setBackground(new java.awt.Color(255, 255, 255));
        L21.setOpaque(true);

        javax.swing.GroupLayout panelLunesLayout = new javax.swing.GroupLayout(panelLunes);
        panelLunes.setLayout(panelLunesLayout);
        panelLunesLayout.setHorizontalGroup(
            panelLunesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLunesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelLunesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(L11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelLunesLayout.setVerticalGroup(
            panelLunesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLunesLayout.createSequentialGroup()
                .addComponent(L9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(L15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(L16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelDias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(panelHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panelLunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panelMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panelMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panelJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panelViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(panelDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelHoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelJueves, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                    .addComponent(panelViernes, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                    .addComponent(panelMiercoles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMartes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLunes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(785, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(567, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(106, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        iniciar();
    }//GEN-LAST:event_btActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel J10;
    private javax.swing.JLabel J11;
    private javax.swing.JLabel J12;
    private javax.swing.JLabel J13;
    private javax.swing.JLabel J14;
    private javax.swing.JLabel J15;
    private javax.swing.JLabel J16;
    private javax.swing.JLabel J17;
    private javax.swing.JLabel J18;
    private javax.swing.JLabel J19;
    private javax.swing.JLabel J20;
    private javax.swing.JLabel J21;
    private javax.swing.JLabel J9;
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L11;
    private javax.swing.JLabel L12;
    private javax.swing.JLabel L13;
    private javax.swing.JLabel L14;
    private javax.swing.JLabel L15;
    private javax.swing.JLabel L16;
    private javax.swing.JLabel L17;
    private javax.swing.JLabel L18;
    private javax.swing.JLabel L19;
    private javax.swing.JLabel L20;
    private javax.swing.JLabel L21;
    private javax.swing.JLabel L9;
    private javax.swing.JLabel M10;
    private javax.swing.JLabel M11;
    private javax.swing.JLabel M12;
    private javax.swing.JLabel M13;
    private javax.swing.JLabel M14;
    private javax.swing.JLabel M15;
    private javax.swing.JLabel M16;
    private javax.swing.JLabel M17;
    private javax.swing.JLabel M18;
    private javax.swing.JLabel M19;
    private javax.swing.JLabel M20;
    private javax.swing.JLabel M21;
    private javax.swing.JLabel M9;
    private javax.swing.JLabel V10;
    private javax.swing.JLabel V11;
    private javax.swing.JLabel V12;
    private javax.swing.JLabel V13;
    private javax.swing.JLabel V14;
    private javax.swing.JLabel V15;
    private javax.swing.JLabel V16;
    private javax.swing.JLabel V17;
    private javax.swing.JLabel V18;
    private javax.swing.JLabel V19;
    private javax.swing.JLabel V20;
    private javax.swing.JLabel V21;
    private javax.swing.JLabel V9;
    private javax.swing.JLabel X10;
    private javax.swing.JLabel X11;
    private javax.swing.JLabel X12;
    private javax.swing.JLabel X13;
    private javax.swing.JLabel X14;
    private javax.swing.JLabel X15;
    private javax.swing.JLabel X16;
    private javax.swing.JLabel X17;
    private javax.swing.JLabel X18;
    private javax.swing.JLabel X19;
    private javax.swing.JLabel X20;
    private javax.swing.JLabel X21;
    private javax.swing.JLabel X9;
    private javax.swing.JButton btActualizar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelDias;
    private javax.swing.JPanel panelHoras;
    private javax.swing.JPanel panelJueves;
    private javax.swing.JPanel panelLunes;
    private javax.swing.JPanel panelMartes;
    private javax.swing.JPanel panelMiercoles;
    private javax.swing.JPanel panelViernes;
    // End of variables declaration//GEN-END:variables

    // Recursivamente añadir labels al map
    private void buscarYAgregarLabels(Container container) {
        //buscar componenetes que sean de tipo JLabel
        for (Component comp : container.getComponents()) {
            if (comp instanceof JLabel) {
                JLabel label = (JLabel) comp;
                labelMap.put(label.getName(), label);//añadir al Map usando el nombre como clave y el JLabel como valor
                Dimension fixedSize=new Dimension (80,25);
                label.setPreferredSize(fixedSize);
                label.setMaximumSize(fixedSize);
                label.setMinimumSize(fixedSize);
            } else if (comp instanceof Container) {
                buscarYAgregarLabels((Container) comp);  // Recursivamente buscar en contenedores hijos (hay paneles dentro de otros panels)
            }
        }
    }

    // Método para obtener la lista de nombres de cursos de la base de datos
    private void obtenerLista() {

        CursoDAO cursoDAO = new CursoDAOImplHiber(Curso.class);
        List<Curso> listaCursos = cursoDAO.findAll();

        nombresBD = new HashMap<>();

        // Llenar el Map, la clave corresponde al horario reservado por curso y el valor será el nombre del curso
        for (Curso curso : listaCursos) {
            nombresBD.put(curso.getHorario(), curso.getNombre());
        }
    }

    // Método para actualizar los colores de los JLabel según la lista de nombres
    private void buscarYActualizarColores(Container container) {
        //iterar sobre las claves del map que corresponden a los nombres de los label
        for (String nombreLabel : labelMap.keySet()) {
            JLabel label = labelMap.get(nombreLabel);//obtener el JLabel
            //si el nombre del JLabel coincide con el valor del horario mostrar el nombre del curos en el label correspondiente
            if (nombresBD.containsKey(nombreLabel)) {
                label.setText(nombresBD.get(nombreLabel));
                label.setOpaque(true);
                label.setBackground(new Color(204, 204, 255));

            } else {//si no se encuentra la key correspondiente horario-label borrar el contenido y dejar en blanco
                label.setOpaque(true);
                label.setBackground(Color.WHITE);
                label.setText("");
            }
            label.repaint();  // Repintar JLabel
        }
    }

}
