package com.dev_team.views;

import com.dev_team.utilidades.JButtonRound;
import com.dev_team.utilidades.Main_Colores;
import com.dev_team.utilidades.PanelGradient;
import com.dev_team.utilidades.Panel_Round;
import java.awt.Color;
import javax.swing.JPanel;


public class V_RegistrarComputadora extends JPanel {

    /**
     * Creates new form V_RegistrarUsuario
     */
    public V_RegistrarComputadora() {
        
        initComponents();
        panel_main.setBackground(Main_Colores.Fondo);
        setBackground(Main_Colores.Fondo_2);
    }

    
    private void iniciarComponentes(){
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_main = new Panel_Round(20);
        panelTitle = new PanelGradient(Color.MAGENTA, Color.BLUE);
        jLabel17 = new javax.swing.JLabel();
        panel_form = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_buscar = new JButtonRound("Buscar",20);
        cbx_modeloCO = new javax.swing.JComboBox<>();
        cbx_ramCO = new javax.swing.JComboBox<>();
        cbx_tarjetaMadreCO = new javax.swing.JComboBox<>();
        cbx_pantallaC = new javax.swing.JComboBox<>();
        cbx_procesadorCO = new javax.swing.JComboBox<>();
        cbx_discoCO = new javax.swing.JComboBox<>();
        btn_registrar = new JButtonRound("Registrar",20);
        cbx_caseCO = new javax.swing.JComboBox<>();
        tf_precioTotal = new javax.swing.JTextField();
        tf_nombreCO = new javax.swing.JTextField();
        tf_clave = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 51, 51));

        panel_main.setLayout(new java.awt.BorderLayout());

        panelTitle.setBackground(new java.awt.Color(51, 51, 255));
        panelTitle.setPreferredSize(new java.awt.Dimension(40, 40));
        panelTitle.setLayout(new java.awt.BorderLayout());

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("REGISTRAR COMPUTADORA");
        panelTitle.add(jLabel17, java.awt.BorderLayout.PAGE_END);

        panel_main.add(panelTitle, java.awt.BorderLayout.PAGE_START);

        panel_form.setOpaque(false);
        panel_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setOpaque(true);
        panel_form.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 191, 196));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel2.setForeground(Main_Colores.C_100);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Computadora");
        panel_form.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 190, 20));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setForeground(Main_Colores.C_100);
        jLabel6.setText("Descripcion:");
        panel_form.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 110, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setForeground(Main_Colores.C_100);
        jLabel3.setText("Modelo:");
        panel_form.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel9.setForeground(Main_Colores.C_100);
        jLabel9.setText("Ram:");
        panel_form.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(Main_Colores.C_100);
        jLabel4.setText("Tarjeta Madre:");
        panel_form.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setForeground(Main_Colores.C_100);
        jLabel5.setText("Pantalla:");
        panel_form.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel12.setForeground(Main_Colores.C_100);
        jLabel12.setText("Procesador:");
        panel_form.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel11.setForeground(Main_Colores.C_100);
        jLabel11.setText("Disco:");
        panel_form.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel8.setForeground(Main_Colores.C_100);
        jLabel8.setText("Case:");
        panel_form.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel14.setForeground(Main_Colores.C_100);
        jLabel14.setText("Nombre:");
        panel_form.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel15.setForeground(Main_Colores.C_100);
        jLabel15.setText("Precio real:");
        panel_form.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel16.setForeground(Main_Colores.C_100);
        jLabel16.setText("Precio total:");
        panel_form.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTextArea1.setForeground(Main_Colores.Fondo);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        panel_form.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 580, 90));

        btn_buscar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_buscar.setForeground(Main_Colores.Fondo);
        btn_buscar.setText("Buscar");
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_form.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 100, 30));

        cbx_modeloCO.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_modeloCO.setForeground(Main_Colores.Fondo);
        panel_form.add(cbx_modeloCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 200, 30));

        cbx_ramCO.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_ramCO.setForeground(Main_Colores.Fondo);
        cbx_ramCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_ramCOActionPerformed(evt);
            }
        });
        panel_form.add(cbx_ramCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 230, 30));

        cbx_tarjetaMadreCO.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_tarjetaMadreCO.setForeground(Main_Colores.Fondo);
        panel_form.add(cbx_tarjetaMadreCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 30));

        cbx_pantallaC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_pantallaC.setForeground(Main_Colores.Fondo);
        panel_form.add(cbx_pantallaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 200, 30));

        cbx_procesadorCO.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_procesadorCO.setForeground(Main_Colores.Fondo);
        cbx_procesadorCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_procesadorCOActionPerformed(evt);
            }
        });
        panel_form.add(cbx_procesadorCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 230, 30));

        cbx_discoCO.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_discoCO.setForeground(Main_Colores.Fondo);
        panel_form.add(cbx_discoCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 230, 30));

        btn_registrar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_registrar.setForeground(Main_Colores.Fondo);
        btn_registrar.setText("Registrar");
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_form.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, 120, 40));

        cbx_caseCO.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_caseCO.setForeground(Main_Colores.Fondo);
        panel_form.add(cbx_caseCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 200, 30));

        tf_precioTotal.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_precioTotal.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_precioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 130, 30));

        tf_nombreCO.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_nombreCO.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_nombreCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, 30));

        tf_clave.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_clave.setForeground(Main_Colores.Fondo);
        tf_clave.setEnabled(false);
        tf_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_claveActionPerformed(evt);
            }
        });
        panel_form.add(tf_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 130, 30));

        panel_main.add(panel_form, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_procesadorCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_procesadorCOActionPerformed

    }//GEN-LAST:event_cbx_procesadorCOActionPerformed

    private void cbx_ramCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_ramCOActionPerformed

    }//GEN-LAST:event_cbx_ramCOActionPerformed

    private void tf_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_claveActionPerformed


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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel panel_form;
    private javax.swing.JPanel panel_main;
    private javax.swing.JTextField tf_clave;
    private javax.swing.JTextField tf_nombreCO;
    private javax.swing.JTextField tf_precioTotal;
    // End of variables declaration//GEN-END:variables
}
