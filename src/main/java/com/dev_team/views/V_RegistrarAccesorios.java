package com.dev_team.views;

import com.dev_team.utilidades.JPanelPersonzalizado;
import com.dev_team.utilidades.Main_Colores;
import java.awt.Color;


public class V_RegistrarAccesorios extends JPanelPersonzalizado {

    /**
     * Creates new form V_RegistrarUsuario
     */
    public V_RegistrarAccesorios() {
       
        initComponents();
        setBackground(Main_Colores.Fondo_2);
    }

    
    private void iniciarComponentes(){
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cbx_modeloA = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbx_materialA = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbx_marcaA = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbx_conectividadA = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbx_versionA = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbx_compatibilidadA = new javax.swing.JComboBox<>();
        tf_nombreA = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel2.setForeground(Main_Colores.C_100);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Foto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 190, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 580, 90));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 191, 196));

        btn_buscar.setText("Buscar");
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 130, -1));

        jLabel13.setFont(new java.awt.Font("Questrian", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("REGISTRAR ACCESORIOS");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 320, 50));

        jPanel1.add(cbx_modeloA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Material:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        cbx_materialA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_materialAActionPerformed(evt);
            }
        });
        jPanel1.add(cbx_materialA, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 230, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jPanel1.add(cbx_marcaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Conectividad:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        jPanel1.add(cbx_conectividadA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 200, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Version:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        cbx_versionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_versionAActionPerformed(evt);
            }
        });
        jPanel1.add(cbx_versionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 230, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Compatibilidad:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        jPanel1.add(cbx_compatibilidadA, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 230, 30));
        jPanel1.add(tf_nombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 210, 30));

        btn_registrar.setText("REGISTRAR");
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 190, 50));

        jLabel8.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Descripcion:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 180, -1));

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_materialAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_materialAActionPerformed

    }//GEN-LAST:event_cbx_materialAActionPerformed

    private void cbx_versionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_versionAActionPerformed

    }//GEN-LAST:event_cbx_versionAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JComboBox<String> cbx_compatibilidadA;
    private javax.swing.JComboBox<String> cbx_conectividadA;
    private javax.swing.JComboBox<String> cbx_marcaA;
    private javax.swing.JComboBox<String> cbx_materialA;
    private javax.swing.JComboBox<String> cbx_modeloA;
    private javax.swing.JComboBox<String> cbx_versionA;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField tf_nombreA;
    // End of variables declaration//GEN-END:variables
}
