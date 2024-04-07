package com.dev_team.views;

import com.dev_team.utilidades.JPanelPersonzalizado;
import com.dev_team.utilidades.Main_Colores;
import java.awt.Color;


public class V_RegistrarComponentes extends JPanelPersonzalizado {

    /**
     * Creates new form V_RegistrarUsuario
     */
    public V_RegistrarComponentes() {
      
        initComponents();
        
    }

    
    private void iniciarComponentes(){
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descripcionC = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        btn_buscarC = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cbx_marcaC = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbx_tipoC = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbx_modeloC = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbx_capacidadC = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbx_velocidadC = new javax.swing.JComboBox<>();
        btn_registrarC = new javax.swing.JButton();
        tf_nombreC1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel2.setForeground(Main_Colores.C_100);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Imagen del producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 240, 20));

        jLabel6.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descripcion:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 140, -1));

        ta_descripcionC.setColumns(20);
        ta_descripcionC.setRows(5);
        ta_descripcionC.setBorder(null);
        jScrollPane1.setViewportView(ta_descripcionC);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 580, 90));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 210, 196));

        btn_buscarC.setText("Buscar");
        jPanel1.add(btn_buscarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 130, -1));

        jLabel13.setFont(new java.awt.Font("Questrian", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("REGISTRAR COMPONENTES");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 360, 50));

        jPanel1.add(cbx_marcaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Componente:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        cbx_tipoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tipoCActionPerformed(evt);
            }
        });
        jPanel1.add(cbx_tipoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 200, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modelo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jPanel1.add(cbx_modeloC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 200, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Capacidad:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        cbx_capacidadC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_capacidadCActionPerformed(evt);
            }
        });
        jPanel1.add(cbx_capacidadC, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 230, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Velocidad:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jPanel1.add(cbx_velocidadC, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 230, 30));

        btn_registrarC.setText("REGISTRAR");
        jPanel1.add(btn_registrarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 190, 50));
        jPanel1.add(tf_nombreC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 210, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Proveedor:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cantidad:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 210, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 210, 30));

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_capacidadCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_capacidadCActionPerformed

    }//GEN-LAST:event_cbx_capacidadCActionPerformed

    private void cbx_tipoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tipoCActionPerformed

    }//GEN-LAST:event_cbx_tipoCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarC;
    private javax.swing.JButton btn_registrarC;
    private javax.swing.JComboBox<String> cbx_capacidadC;
    private javax.swing.JComboBox<String> cbx_marcaC;
    private javax.swing.JComboBox<String> cbx_modeloC;
    private javax.swing.JComboBox<String> cbx_tipoC;
    private javax.swing.JComboBox<String> cbx_velocidadC;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_descripcionC;
    private javax.swing.JTextField tf_nombreC1;
    // End of variables declaration//GEN-END:variables
}
