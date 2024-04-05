package com.dev_team.views;

import com.dev_team.models.Usuario;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class D_AdmUsuario extends javax.swing.JDialog {

    Usuario us = null;

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
        tf_Usuario.setText(us.getUsuario());
        tf_password.setText(us.getPassword());
        tf_nombre.setText(us.getNombre());
        tf_apellido.setText(us.getApellido());
        dc_fechaNac.setDate(us.getFechaNacimiento());
        tf_cedulaIdentidad.setText(us.getCi());
        tf_telefono.setText(us.getTelefono());
        tf_direccion.setText(us.getDireccion());
        lb_foto.setIcon(recuperarImagen(us.getBytes_image()));
        iniciarCbxEstado(us.getEstado());
    }

    private Icon recuperarImagen(byte[] bytes_image) {
        ImageIcon img_icon = new ImageIcon(bytes_image);
        Image imagen = img_icon.getImage().getScaledInstance(lb_foto.getWidth(), lb_foto.getHeight(), Image.SCALE_DEFAULT);
        Icon icon = new ImageIcon(imagen);
        return icon;
    }

    private void iniciarCbxEstado(int estado) {
        switch (estado) {
            case 0 -> cbx_estado.setSelectedItem("Inactivo");
            case 1 -> cbx_estado.setSelectedItem("Activo");
            case 2 -> cbx_estado.setSelectedItem("Ausente");
            
            default -> System.out.println("Error");
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
        tf_cedulaIdentidad = new javax.swing.JTextField();
        tf_telefono = new javax.swing.JTextField();
        tf_direccion = new javax.swing.JTextField();
        tf_Usuario = new javax.swing.JTextField();
        tf_password = new javax.swing.JTextField();
        lb_foto = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        dc_fechaNac = new com.toedter.calendar.JDateChooser();
        cbx_estado = new javax.swing.JComboBox<>();
        tf_clave = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("ADMINISTRAR USUARIO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 10, 220, 32);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Clave: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 60, 19);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 150, 53, 19);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 190, 54, 19);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Cedula de indentidad:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 230, 150, 20);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 230, 160, 20);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Telefono:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 300, 60, 19);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Direccion:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 300, 63, 19);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Usuario:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 70, 52, 19);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Contraseña:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(360, 70, 78, 19);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Foto");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(560, 170, 60, 20);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Estado:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 370, 48, 19);
        getContentPane().add(tf_nombre);
        tf_nombre.setBounds(130, 150, 240, 26);
        getContentPane().add(tf_apellido);
        tf_apellido.setBounds(130, 190, 240, 26);
        getContentPane().add(tf_cedulaIdentidad);
        tf_cedulaIdentidad.setBounds(250, 260, 170, 26);
        getContentPane().add(tf_telefono);
        tf_telefono.setBounds(50, 330, 170, 26);
        getContentPane().add(tf_direccion);
        tf_direccion.setBounds(250, 330, 170, 26);
        getContentPane().add(tf_Usuario);
        tf_Usuario.setBounds(180, 100, 120, 26);
        getContentPane().add(tf_password);
        tf_password.setBounds(360, 100, 160, 26);

        lb_foto.setBackground(new java.awt.Color(255, 255, 255));
        lb_foto.setOpaque(true);
        getContentPane().add(lb_foto);
        lb_foto.setBounds(500, 200, 150, 130);

        btn_editar.setText("Editar");
        getContentPane().add(btn_editar);
        btn_editar.setBounds(540, 340, 80, 30);

        btn_guardar.setText("GUARDAR");
        getContentPane().add(btn_guardar);
        btn_guardar.setBounds(280, 440, 120, 30);

        dc_fechaNac.setDateFormatString("dd - MMM - YYYY");
        getContentPane().add(dc_fechaNac);
        dc_fechaNac.setBounds(50, 260, 170, 26);

        cbx_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Ausente", "Inactivo" }));
        getContentPane().add(cbx_estado);
        cbx_estado.setBounds(50, 400, 160, 26);

        tf_clave.setEnabled(false);
        getContentPane().add(tf_clave);
        tf_clave.setBounds(30, 100, 90, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> cbx_estado;
    protected com.toedter.calendar.JDateChooser dc_fechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_foto;
    private javax.swing.JTextField tf_Usuario;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_cedulaIdentidad;
    private javax.swing.JTextField tf_clave;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_telefono;
    // End of variables declaration//GEN-END:variables
}
