/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.dev_team.views;

import com.dev_team.utilidades.JButtonRound;
import com.dev_team.utilidades.Main_Colores;
import com.dev_team.utilidades.PanelGradient;
import com.dev_team.utilidades.Panel_Round;
import java.awt.Color;
import javax.swing.JPanel;


public class V_RegistrarUsuario extends JPanel{
   
    
    public V_RegistrarUsuario() {
        initComponents();
        panel_main.setBackground(Main_Colores.Fondo);
        setBackground(Main_Colores.Fondo_2);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_main = new Panel_Round(20);
        panel_form = new JPanel();
        tf_nombre = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        tf_ci = new javax.swing.JTextField();
        tf_telefono = new javax.swing.JTextField();
        tf_direccion = new javax.swing.JTextField();
        tf_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lb_foto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_observaciones = new javax.swing.JTextArea();
        pf_password = new javax.swing.JPasswordField();
        pf_confPassword = new javax.swing.JPasswordField();
        btn_registrar = new JButtonRound("Registrar",20);
        btn_buscarFoto = new JButtonRound("Buscar",20);
        dc_fechaNac = new com.toedter.calendar.JDateChooser();
        panelTitle = new PanelGradient(Color.MAGENTA, Color.BLUE);
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(980, 730));

        panel_main.setLayout(new java.awt.BorderLayout());

        panel_form.setOpaque(false);
        panel_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_nombre.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_nombre.setForeground(Main_Colores.Fondo);
        tf_nombre.setBorder(null);
        panel_form.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, 30));

        tf_apellido.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_apellido.setForeground(Main_Colores.Fondo);
        tf_apellido.setBorder(null);
        panel_form.add(tf_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 300, 30));

        tf_ci.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_ci.setForeground(Main_Colores.Fondo);
        tf_ci.setBorder(null);
        panel_form.add(tf_ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 210, 30));

        tf_telefono.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_telefono.setForeground(Main_Colores.Fondo);
        tf_telefono.setBorder(null);
        panel_form.add(tf_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 300, 30));

        tf_direccion.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_direccion.setForeground(Main_Colores.Fondo);
        tf_direccion.setBorder(null);
        panel_form.add(tf_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 290, 30));

        tf_usuario.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_usuario.setForeground(Main_Colores.Fondo);
        tf_usuario.setBorder(null);
        panel_form.add(tf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 190, 30));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nombre:");
        panel_form.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Imagen de usuario");
        panel_form.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 190, 20));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Fecha nacimiento:");
        panel_form.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Cedula Identidad:");
        panel_form.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 200, 20));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Telefono");
        panel_form.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, -1));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Observaciones: ");
        panel_form.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 180, -1));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Direccion:");
        panel_form.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 130, -1));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Usuario:");
        panel_form.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 110, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Contraseña:");
        panel_form.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 140, -1));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Apellido:");
        panel_form.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 120, 20));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Confirmar:");
        panel_form.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 130, -1));

        lb_foto.setBackground(new java.awt.Color(255, 255, 255));
        lb_foto.setOpaque(true);
        panel_form.add(lb_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 76, 190, 180));

        ta_observaciones.setColumns(20);
        ta_observaciones.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        ta_observaciones.setForeground(Main_Colores.Fondo);
        ta_observaciones.setRows(5);
        ta_observaciones.setBorder(null);
        jScrollPane1.setViewportView(ta_observaciones);

        panel_form.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 630, 90));

        pf_password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pf_password.setForeground(Main_Colores.Fondo);
        pf_password.setBorder(null);
        panel_form.add(pf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 170, 30));

        pf_confPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pf_confPassword.setForeground(Main_Colores.Fondo);
        pf_confPassword.setBorder(null);
        panel_form.add(pf_confPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 170, 30));

        btn_registrar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_registrar.setForeground(Main_Colores.Fondo);
        btn_registrar.setText("Registrar");
        btn_registrar.setBorder(null);
        btn_registrar.setBorderPainted(false);
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.setFocusPainted(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        panel_form.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 160, 50));

        btn_buscarFoto.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_buscarFoto.setForeground(Main_Colores.Fondo);
        btn_buscarFoto.setText("Buscar");
        btn_buscarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_form.add(btn_buscarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 110, 40));

        dc_fechaNac.setForeground(Main_Colores.Fondo);
        dc_fechaNac.setDateFormatString("dd - MMM - YYYY");
        dc_fechaNac.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        panel_form.add(dc_fechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 220, 30));

        panel_main.add(panel_form, java.awt.BorderLayout.CENTER);

        panelTitle.setBackground(new java.awt.Color(51, 51, 255));
        panelTitle.setPreferredSize(new java.awt.Dimension(40, 40));
        panelTitle.setLayout(new java.awt.BorderLayout());

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("REGISTRAR USUARIO");
        panelTitle.add(jLabel14, java.awt.BorderLayout.PAGE_END);

        panel_main.add(panelTitle, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btn_buscarFoto;
    protected javax.swing.JButton btn_registrar;
    protected com.toedter.calendar.JDateChooser dc_fechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JLabel lb_foto;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel panel_form;
    private javax.swing.JPanel panel_main;
    protected javax.swing.JPasswordField pf_confPassword;
    protected javax.swing.JPasswordField pf_password;
    protected javax.swing.JTextArea ta_observaciones;
    protected javax.swing.JTextField tf_apellido;
    protected javax.swing.JTextField tf_ci;
    protected javax.swing.JTextField tf_direccion;
    protected javax.swing.JTextField tf_nombre;
    protected javax.swing.JTextField tf_telefono;
    protected javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
}
