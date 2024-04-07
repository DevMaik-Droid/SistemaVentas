/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.dev_team.views;

import com.dev_team.utilidades.JButtonRound;
import com.dev_team.utilidades.Main_Colores;
import com.dev_team.utilidades.Panel_Round;
import javax.swing.JPanel;




/**
 *
 * @author DevMaik
 */
public class V_RegistrarUsuario extends JPanel{
   
    
    public V_RegistrarUsuario() {
        initComponents();
        panel_form.setBackground(Main_Colores.Fondo);
        setBackground(Main_Colores.Fondo_2);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_form = new Panel_Round(20);
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
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_observaciones = new javax.swing.JTextArea();
        pf_password = new javax.swing.JPasswordField();
        pf_confPassword = new javax.swing.JPasswordField();
        btn_registrar = new JButtonRound("Registrar",20);
        btn_buscarFoto = new JButtonRound("Buscar",20);
        lb_foto = new javax.swing.JLabel();
        dc_fechaNac = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(51, 51, 51));

        panel_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_nombre.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_nombre.setForeground(new java.awt.Color(19, 18, 54));
        tf_nombre.setBorder(null);
        panel_form.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 300, 30));

        tf_apellido.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_apellido.setForeground(new java.awt.Color(19, 18, 54));
        tf_apellido.setBorder(null);
        panel_form.add(tf_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 300, 30));

        tf_ci.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_ci.setForeground(new java.awt.Color(19, 18, 54));
        tf_ci.setBorder(null);
        panel_form.add(tf_ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 210, 30));

        tf_telefono.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_telefono.setForeground(new java.awt.Color(19, 18, 54));
        tf_telefono.setBorder(null);
        panel_form.add(tf_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 300, 30));

        tf_direccion.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_direccion.setForeground(new java.awt.Color(19, 18, 54));
        tf_direccion.setBorder(null);
        panel_form.add(tf_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 290, 30));

        tf_usuario.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_usuario.setForeground(new java.awt.Color(19, 18, 54));
        tf_usuario.setBorder(null);
        panel_form.add(tf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 190, 30));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nombre:");
        panel_form.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 90, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Imagen de usuario");
        panel_form.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 190, 20));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Fecha nacimiento:");
        panel_form.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 200, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Cedula Identidad:");
        panel_form.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 200, 20));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Telefono");
        panel_form.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 110, -1));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Observaciones: ");
        panel_form.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 180, -1));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Direccion:");
        panel_form.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 130, -1));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Usuario:");
        panel_form.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 110, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Contraseña:");
        panel_form.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 140, -1));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Apellido:");
        panel_form.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 120, 20));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Confirmar:");
        panel_form.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 130, -1));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("REGISTRAR USUARIO");
        panel_form.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 260, 40));

        ta_observaciones.setColumns(20);
        ta_observaciones.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        ta_observaciones.setRows(5);
        ta_observaciones.setBorder(null);
        jScrollPane1.setViewportView(ta_observaciones);

        panel_form.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 630, 90));

        pf_password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pf_password.setForeground(new java.awt.Color(19, 18, 54));
        pf_password.setBorder(null);
        panel_form.add(pf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 170, 30));

        pf_confPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pf_confPassword.setForeground(new java.awt.Color(19, 18, 54));
        pf_confPassword.setBorder(null);
        panel_form.add(pf_confPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 170, 30));

        btn_registrar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(19, 18, 54));
        btn_registrar.setText("Registrar");
        btn_registrar.setBorder(null);
        btn_registrar.setBorderPainted(false);
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.setFocusPainted(false);
        panel_form.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 190, 50));

        btn_buscarFoto.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_buscarFoto.setForeground(new java.awt.Color(19, 18, 54));
        btn_buscarFoto.setText("Buscar");
        btn_buscarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_form.add(btn_buscarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 140, 40));

        lb_foto.setBackground(new java.awt.Color(255, 255, 255));
        lb_foto.setOpaque(true);
        panel_form.add(lb_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 191, 196));

        dc_fechaNac.setForeground(new java.awt.Color(19, 18, 54));
        dc_fechaNac.setDateFormatString("dd - MMM - YYYY");
        dc_fechaNac.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        panel_form.add(dc_fechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(panel_form, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(panel_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btn_buscarFoto;
    protected javax.swing.JButton btn_registrar;
    protected com.toedter.calendar.JDateChooser dc_fechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel panel_form;
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
