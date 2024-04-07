package com.dev_team.views;

import com.dev_team.utilidades.JPanelPersonzalizado;
import com.dev_team.utilidades.Main_Colores;
import java.awt.Color;

public class V_GestionarProductos extends JPanelPersonzalizado {

    /**
     * Creates new form V_RegistrarUsuario
     */
    public V_GestionarProductos() {
        
        initComponents();

    }

    private void iniciarComponentes() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTop = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbx_filtrarGP = new javax.swing.JComboBox<>();
        tf_nombreGP = new javax.swing.JTextField();
        btn_buscarGP = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PanelMid = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new java.awt.BorderLayout());

        PanelTop.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar:");

        tf_nombreGP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreGPActionPerformed(evt);
            }
        });

        btn_buscarGP.setText("BUSCAR");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GESTION DE PRODUCTOS");

        javax.swing.GroupLayout PanelTopLayout = new javax.swing.GroupLayout(PanelTop);
        PanelTop.setLayout(PanelTopLayout);
        PanelTopLayout.setHorizontalGroup(
            PanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTopLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelTopLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombreGP, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscarGP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(PanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_filtrarGP, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(769, Short.MAX_VALUE))
        );
        PanelTopLayout.setVerticalGroup(
            PanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelTopLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombreGP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscarGP)))
                    .addGroup(PanelTopLayout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_filtrarGP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        add(PanelTop, java.awt.BorderLayout.NORTH);

        PanelMid.setOpaque(false);
        PanelMid.setLayout(new javax.swing.BoxLayout(PanelMid, javax.swing.BoxLayout.LINE_AXIS));

        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setOpaque(false);
        jScrollPane2.setViewportView(jTable1);

        PanelMid.add(jScrollPane2);

        add(PanelMid, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nombreGPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreGPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreGPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMid;
    private javax.swing.JPanel PanelTop;
    private javax.swing.JButton btn_buscarGP;
    private javax.swing.JComboBox<String> cbx_filtrarGP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tf_nombreGP;
    // End of variables declaration//GEN-END:variables
}
