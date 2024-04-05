/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.dev_team.views;

import com.dev_team.utilidades.Gradient;
import com.dev_team.utilidades.Main_Colores;
import java.awt.Color;

/**
 *
 * @author DevMaik
 */
public class V_RegistrarUsuario extends Gradient {

    /**
     * Creates new form V_RegistrarUsuario
     */
    public V_RegistrarUsuario() {
        super(Main_Colores.C_600,Main_Colores.C_500,Main_Colores.C_400);
        initComponents();
        
    }

    
    private void iniciarComponentes(){
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tf_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_ci = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_direccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_observaciones = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pf_password = new javax.swing.JPasswordField();
        btn_registrar = new javax.swing.JButton();
        lb_foto = new javax.swing.JLabel();
        btn_buscarFoto = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        pf_confPassword = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dc_fechaNac = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_nombre.setFont(new java.awt.Font("Righteous", 0, 14)); // NOI18N
        tf_nombre.setBorder(null);
        jPanel1.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 300, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel1.setForeground(Main_Colores.C_100);
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 90, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel2.setForeground(Main_Colores.C_100);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Foto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 190, 20));

        tf_apellido.setBorder(null);
        jPanel1.add(tf_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 300, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel3.setForeground(Main_Colores.C_100);
        jLabel3.setText("Fecha nacimiento:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 200, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel4.setForeground(Main_Colores.C_100);
        jLabel4.setText("Cedula Identidad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 200, 20));

        tf_ci.setBorder(null);
        jPanel1.add(tf_ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 210, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel5.setForeground(Main_Colores.C_100);
        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 110, -1));

        tf_telefono.setBorder(null);
        jPanel1.add(tf_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 300, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel6.setForeground(Main_Colores.C_100);
        jLabel6.setText("Observaciones: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 180, -1));

        tf_direccion.setBorder(null);
        jPanel1.add(tf_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 290, 30));

        ta_observaciones.setColumns(20);
        ta_observaciones.setRows(5);
        ta_observaciones.setBorder(null);
        jScrollPane1.setViewportView(ta_observaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 630, 90));

        jLabel7.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel7.setForeground(Main_Colores.C_100);
        jLabel7.setText("Direccion:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 130, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel8.setForeground(Main_Colores.C_100);
        jLabel8.setText("Usuario:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 110, -1));

        jTextField10.setBorder(null);
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 190, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel9.setForeground(Main_Colores.C_100);
        jLabel9.setText("Contraseña:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 140, -1));

        pf_password.setBorder(null);
        jPanel1.add(pf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 170, 30));

        btn_registrar.setText("REGISTRAR");
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 190, 50));

        lb_foto.setBackground(new java.awt.Color(255, 255, 255));
        lb_foto.setOpaque(true);
        jPanel1.add(lb_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 191, 196));

        btn_buscarFoto.setText("Buscar");
        jPanel1.add(btn_buscarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, 140, 40));

        jLabel11.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel11.setForeground(Main_Colores.C_100);
        jLabel11.setText("Apellido:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 120, 20));

        pf_confPassword.setBorder(null);
        jPanel1.add(pf_confPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 170, 30));

        jLabel12.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel12.setForeground(Main_Colores.C_100);
        jLabel12.setText("Confirmar:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 130, -1));

        jLabel13.setFont(new java.awt.Font("Questrian", 0, 18)); // NOI18N
        jLabel13.setText("REGISTRAR USUARIO");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 200, 40));

        dc_fechaNac.setDateFormatString("dd - MMM - YYYY");
        jPanel1.add(dc_fechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTextField jTextField10;
    protected javax.swing.JLabel lb_foto;
    protected javax.swing.JPasswordField pf_confPassword;
    protected javax.swing.JPasswordField pf_password;
    protected javax.swing.JTextArea ta_observaciones;
    protected javax.swing.JTextField tf_apellido;
    protected javax.swing.JTextField tf_ci;
    protected javax.swing.JTextField tf_direccion;
    protected javax.swing.JTextField tf_nombre;
    protected javax.swing.JTextField tf_telefono;
    // End of variables declaration//GEN-END:variables
}
