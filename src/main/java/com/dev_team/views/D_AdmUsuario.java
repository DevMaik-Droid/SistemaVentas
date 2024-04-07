package com.dev_team.views;

import com.dev_team.controllers.GestionUsuarioController;
import com.dev_team.models.Usuario;
import com.dev_team.services.Service_Usuario;
import com.dev_team.utilidades.JButtonRound;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;

import java.io.ByteArrayInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class D_AdmUsuario extends javax.swing.JDialog {

    Usuario us = null;
    private InputStream input_image;
    private boolean nueva_imagen = false;

    public D_AdmUsuario(java.awt.Frame parent, boolean modal, Usuario us) {
        super(parent, modal);
        this.us = us;
        initComponents();
        iniciarComponentes();
        setSize(new Dimension(700, 550));
        setTitle("Administracion de Usuario");
        setLocationRelativeTo(null);

    }

    private void iniciarComponentes() {
        tf_clave.setText(us.getClave());
        tf_usuario.setText(us.getUsuario());
        pf_password.setText(us.getPassword());
        pf_confirmar.setText(us.getPassword());
        tf_nombre.setText(us.getNombre());
        tf_apellido.setText(us.getApellido());
        dc_fechaNac.setDate(us.getFechaNacimiento());
        tf_ci.setText(us.getCi());
        tf_telefono.setText(us.getTelefono());
        tf_direccion.setText(us.getDireccion());
        lb_foto.setIcon(rec(us.getBytes_image()));
        cbx_estado.setSelectedItem(us.getEstado());

    }

    private Icon rec(byte[] bytes_image) {
        byte[] imagenbyte = bytes_image;
        ImageIcon imagen = new ImageIcon(imagenbyte);
        Image img = imagen.getImage().getScaledInstance(lb_foto.getWidth(), lb_foto.getHeight(), Image.SCALE_DEFAULT);
        return new ImageIcon(img);
    }


    private void actualizarUsuario() {

        try {
            if (verificarCampos()) {
                if (pf_password.getText().trim().equals(pf_confirmar.getText().trim())) {

                    Service_Usuario service_Usuario = new Service_Usuario();
                    Usuario usuario = new Usuario();
                    usuario.setNombre(tf_nombre.getText().toUpperCase().trim());
                    usuario.setApellido(tf_apellido.getText().toUpperCase().trim());
                    usuario.setCi(tf_ci.getText().toUpperCase().trim());
                    usuario.setFechaNacimiento(dc_fechaNac.getDate());
                    usuario.setTelefono(tf_telefono.getText().trim());
                    usuario.setDireccion(tf_direccion.getText().trim());
                    usuario.setUsuario(tf_usuario.getText().trim());
                    usuario.setPassword(pf_confirmar.getText());

                    if (input_image == null) {
                        input_image = new ByteArrayInputStream(us.getBytes_image());
                        System.out.println("Almacenando anterior imagen");
                    }

                    usuario.setFoto(input_image);

                    usuario.setEstado(cbx_estado.getSelectedItem().toString());
                    
                    if (service_Usuario.actualizar(usuario, tf_clave.getText())) {
                        JOptionPane.showMessageDialog(null, "Usuario Actualizado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al registrar.");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe llenar los campos");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Datos erroneos.");
        }
    }

    private Boolean verificarCampos() {
        boolean bandera = true;
        JTextField[] tfs = {tf_nombre, tf_apellido, tf_ci, tf_direccion, tf_telefono, tf_usuario};
        JPasswordField[] pfs = {pf_password, pf_confirmar};
        for (JTextField f : tfs) {
            if (f.getText().isBlank()) {
                bandera = false;
                break;
            }
        }
        if (bandera) {
            for (JPasswordField pf : pfs) {
                if (new String(pf.getPassword()).isBlank()) {
                    bandera = false;
                    break;
                }
            }
        }
        return bandera;
    }

    private void seleccionarImagen() {
        File archivo = null;
        try {

            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagenes", "jpg", "png");
            chooser.setFileFilter(filter);
            int result = chooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                archivo = chooser.getSelectedFile();
                System.out.println("Nueva imagen seleccionada");
            }

            Image img = ImageIO.read(archivo).getScaledInstance(lb_foto.getWidth(), lb_foto.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(img);

            lb_foto.setIcon(icon);

            input_image = new FileInputStream(archivo);

        } catch (IOException | IllegalArgumentException ex) {
            System.out.println("No se seleciono la imagen");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        tf_nombre = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        tf_ci = new javax.swing.JTextField();
        tf_telefono = new javax.swing.JTextField();
        tf_direccion = new javax.swing.JTextField();
        tf_usuario = new javax.swing.JTextField();
        lb_foto = new javax.swing.JLabel();
        btn_actualizarIMG = new javax.swing.JButton();
        btn_guardar = new JButtonRound("ELIMINAR",30);
        dc_fechaNac = new com.toedter.calendar.JDateChooser();
        cbx_estado = new javax.swing.JComboBox<>();
        tf_clave = new javax.swing.JTextField();
        btn_guardar1 = new JButtonRound("REGISTRAR",30);
        pf_password = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        pf_confirmar = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("ADMINISTRAR USUARIO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 12, 220, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Clave: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 69, 60, 20);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 149, 53, 20);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 189, 54, 20);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Cedula de identidad:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 231, 150, 19);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 231, 160, 19);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Telefono:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 299, 60, 20);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Direccion:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 299, 63, 20);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Usuario:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(150, 69, 52, 20);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Contraseña:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(310, 69, 78, 20);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Foto");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(500, 151, 150, 19);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Estado:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 369, 48, 20);
        getContentPane().add(tf_nombre);
        tf_nombre.setBounds(130, 154, 240, 20);
        getContentPane().add(tf_apellido);
        tf_apellido.setBounds(130, 194, 240, 20);
        getContentPane().add(tf_ci);
        tf_ci.setBounds(250, 264, 170, 20);
        getContentPane().add(tf_telefono);
        tf_telefono.setBounds(50, 334, 170, 20);
        getContentPane().add(tf_direccion);
        tf_direccion.setBounds(250, 334, 170, 20);
        getContentPane().add(tf_usuario);
        tf_usuario.setBounds(150, 104, 120, 20);

        lb_foto.setBackground(new java.awt.Color(255, 255, 255));
        lb_foto.setOpaque(true);
        getContentPane().add(lb_foto);
        lb_foto.setBounds(500, 180, 150, 150);

        btn_actualizarIMG.setText("Actualizar Imagen");
        btn_actualizarIMG.setBorder(null);
        btn_actualizarIMG.setBorderPainted(false);
        btn_actualizarIMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarIMGActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizarIMG);
        btn_actualizarIMG.setBounds(500, 340, 150, 30);

        btn_guardar.setText("ELIMINAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar);
        btn_guardar.setBounds(450, 440, 110, 30);

        dc_fechaNac.setDateFormatString("dd - MMM - YYYY");
        getContentPane().add(dc_fechaNac);
        dc_fechaNac.setBounds(50, 264, 170, 20);

        cbx_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Ausente", "Inactivo" }));
        getContentPane().add(cbx_estado);
        cbx_estado.setBounds(50, 396, 160, 30);

        tf_clave.setEnabled(false);
        getContentPane().add(tf_clave);
        tf_clave.setBounds(30, 104, 90, 20);

        btn_guardar1.setText("ACTUALIZAR");
        btn_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar1);
        btn_guardar1.setBounds(280, 440, 120, 30);
        getContentPane().add(pf_password);
        pf_password.setBounds(310, 102, 120, 20);
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(310, 102, 120, 20);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Contraseña:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(310, 69, 78, 20);
        getContentPane().add(pf_confirmar);
        pf_confirmar.setBounds(490, 102, 120, 20);

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setText("Confirmar");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(490, 69, 62, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarIMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarIMGActionPerformed
        seleccionarImagen();
    }//GEN-LAST:event_btn_actualizarIMGActionPerformed

    private void btn_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar1ActionPerformed
        actualizarUsuario();
        this.dispose();
    }//GEN-LAST:event_btn_guardar1ActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizarIMG;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JComboBox<String> cbx_estado;
    protected com.toedter.calendar.JDateChooser dc_fechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JLabel lb_foto;
    private javax.swing.JPasswordField pf_confirmar;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_ci;
    private javax.swing.JTextField tf_clave;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_telefono;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
}
