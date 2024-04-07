package com.dev_team.views;

import com.dev_team.utilidades.Main_Colores;
import com.dev_team.utilidades.Panel_Round;
import java.awt.Color;
import javax.swing.JPanel;


public class V_RegistrarComputadora extends JPanel {

    /**
     * Creates new form V_RegistrarUsuario
     */
    public V_RegistrarComputadora() {
        
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
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cbx_modeloCO = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbx_ramCO = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbx_tarjetaMadreCO = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbx_pantallaC = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbx_procesadorCO = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbx_discoCO = new javax.swing.JComboBox<>();
        btn_registrar = new javax.swing.JButton();
        cbx_caseCO = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tf_nombreCO = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel2.setForeground(Main_Colores.C_100);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Foto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 190, 20));

        jLabel6.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descripcion:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 180, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 580, 90));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 191, 196));

        btn_buscar.setText("Buscar");
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 130, -1));

        jLabel13.setFont(new java.awt.Font("Questrian", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("REGISTRAR COMPUTADORA");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 360, 50));

        jPanel1.add(cbx_modeloCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 200, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ram:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        cbx_ramCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_ramCOActionPerformed(evt);
            }
        });
        jPanel1.add(cbx_ramCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 230, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tarjeta Madre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jPanel1.add(cbx_tarjetaMadreCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pantalla:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jPanel1.add(cbx_pantallaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 200, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Procesador:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        cbx_procesadorCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_procesadorCOActionPerformed(evt);
            }
        });
        jPanel1.add(cbx_procesadorCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 230, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Disco:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        jPanel1.add(cbx_discoCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 230, 30));

        btn_registrar.setText("REGISTRAR");
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 190, 50));

        jPanel1.add(cbx_caseCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Case:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));
        jPanel1.add(tf_nombreCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 210, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nombre:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 150, 20));

        jTextField5.setEnabled(false);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 150, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Precio real:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Precio total:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_procesadorCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_procesadorCOActionPerformed

    }//GEN-LAST:event_cbx_procesadorCOActionPerformed

    private void cbx_ramCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_ramCOActionPerformed

    }//GEN-LAST:event_cbx_ramCOActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JComboBox<String> cbx_caseCO;
    private javax.swing.JComboBox<String> cbx_discoCO;
    private javax.swing.JComboBox<String> cbx_modeloCO;
    private javax.swing.JComboBox<String> cbx_pantallaC;
    private javax.swing.JComboBox<String> cbx_procesadorCO;
    private javax.swing.JComboBox<String> cbx_ramCO;
    private javax.swing.JComboBox<String> cbx_tarjetaMadreCO;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField tf_nombreCO;
    // End of variables declaration//GEN-END:variables
}
