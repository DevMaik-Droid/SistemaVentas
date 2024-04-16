package com.dev_team.views;

import com.dev_team.utilidades.GradientSeparador;
import com.dev_team.utilidades.JButtonRound;
import com.dev_team.utilidades.Main_Colores;
import com.dev_team.utilidades.PanelGradient;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class V_Login extends javax.swing.JFrame {

    Point posicion;
    Point posicionInicial; //Variable para almacenar la posición inicial al iniciar el arrastre

    public V_Login() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Login - SISTEMA DE VENTAS");
        this.setSize(new Dimension(800, 600));
        lb_fondo_login.setIcon(ponerImagen("/images/login_fondo.jpg"));
        lb_barra.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent m) {
                // Almacenar la posición inicial del ratón dentro de la ventana
                posicion = m.getPoint();
                SwingUtilities.convertPointToScreen(posicion, lb_barra);
                // Almacenar la posición inicial de la ventana
                posicionInicial = getLocation();
            }
        });

        lb_barra.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent m) {
                // Calcular la nueva posición de lsa ventana en función del movimiento del ratón y la posición inicial de la ventana
                int x = posicionInicial.x + m.getXOnScreen() - posicion.x;
                int y = posicionInicial.y + m.getYOnScreen() - posicion.y;
                setLocation(x, y);
            }
        });

    }

    private Icon ponerImagen(String url) {
        Image image = new ImageIcon(getClass().getResource(url)).getImage().getScaledInstance(lb_fondo_login.getWidth(), lb_fondo_login.getHeight(), Image.SCALE_DEFAULT);
        Icon icon = new ImageIcon(image);
        return icon;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_header = new javax.swing.JPanel();
        panel_titulo = new PanelGradient(Color.MAGENTA,Color.BLUE);
        panel_title = new javax.swing.JPanel();
        lb_barra = new javax.swing.JLabel();
        panel_acciones = new javax.swing.JPanel();
        lb_cerrar = new javax.swing.JLabel();
        panel_izquierdo = new javax.swing.JPanel();
        lb_fondo_login = new javax.swing.JLabel();
        panel_derecho = new javax.swing.JPanel();
        btn_mostrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIngresar = new JButtonRound("Ingresar",20);
        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jSeparator1 = new GradientSeparador();
        jSeparator2 = new GradientSeparador();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_header.setLayout(new java.awt.BorderLayout());

        panel_titulo.setPreferredSize(new java.awt.Dimension(100, 30));
        panel_titulo.setLayout(new javax.swing.BoxLayout(panel_titulo, javax.swing.BoxLayout.LINE_AXIS));

        panel_title.setOpaque(false);
        panel_title.setLayout(new java.awt.BorderLayout());

        lb_barra.setBackground(Main_Colores.C_900
        );
        lb_barra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_barra.setForeground(new java.awt.Color(255, 255, 255));
        lb_barra.setText("\t Dashboard - Bienvenido Miguel");
        lb_barra.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        lb_barra.setPreferredSize(new java.awt.Dimension(1500, 20));
        lb_barra.setVerifyInputWhenFocusTarget(false);
        lb_barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lb_barraMouseDragged(evt);
            }
        });
        lb_barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_barraMousePressed(evt);
            }
        });
        panel_title.add(lb_barra, java.awt.BorderLayout.CENTER);

        panel_titulo.add(panel_title);

        panel_acciones.setOpaque(false);
        panel_acciones.setPreferredSize(new java.awt.Dimension(70, 30));
        panel_acciones.setRequestFocusEnabled(false);
        panel_acciones.setLayout(new java.awt.BorderLayout());

        lb_cerrar.setBackground(new java.awt.Color(255, 51, 51));
        lb_cerrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        lb_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_cerrar.setText("X");
        lb_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_cerrar.setOpaque(true);
        lb_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_cerrarMouseExited(evt);
            }
        });
        panel_acciones.add(lb_cerrar, java.awt.BorderLayout.CENTER);

        panel_titulo.add(panel_acciones);

        panel_header.add(panel_titulo, java.awt.BorderLayout.NORTH);

        panel_izquierdo.setBackground(Main_Colores.Fondo);
        panel_izquierdo.setLayout(new java.awt.BorderLayout());

        lb_fondo_login.setBackground(new java.awt.Color(255, 255, 255));
        lb_fondo_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_fondo_login.setOpaque(true);
        lb_fondo_login.setPreferredSize(new java.awt.Dimension(400, 500));
        panel_izquierdo.add(lb_fondo_login, java.awt.BorderLayout.CENTER);

        panel_header.add(panel_izquierdo, java.awt.BorderLayout.WEST);

        panel_derecho.setBackground(Main_Colores.Fondo);
        panel_derecho.setPreferredSize(new java.awt.Dimension(400, 500));
        panel_derecho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_mostrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btn_mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-eye-30.png"))); // NOI18N
        btn_mostrar.setBorder(null);
        btn_mostrar.setBorderPainted(false);
        btn_mostrar.setContentAreaFilled(false);
        btn_mostrar.setFocusPainted(false);
        btn_mostrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-ophthalmology-30.png"))); // NOI18N
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });
        panel_derecho.add(btn_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 40, -1));

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(Main_Colores.C_100);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Iniciar Sesión");
        panel_derecho.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 400, 53));

        jLabel4.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel4.setForeground(Main_Colores.C_100);
        jLabel4.setText("USUARIO");
        panel_derecho.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 194, -1, 30));

        jLabel5.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel5.setForeground(Main_Colores.C_100);
        jLabel5.setText("CONTRASEÑA");
        panel_derecho.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 30));

        btnIngresar.setBackground(Main_Colores.Fondo_2);
        btnIngresar.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnIngresar.setForeground(Main_Colores.C_100);
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setFocusPainted(false);
        btnIngresar.setFocusable(false);
        btnIngresar.setRequestFocusEnabled(false);
        btnIngresar.setVerifyInputWhenFocusTarget(false);
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        panel_derecho.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 210, 60));

        txt_usuario.setBackground(Main_Colores.Fondo);
        txt_usuario.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txt_usuario.setForeground(Main_Colores.C_100);
        txt_usuario.setBorder(null);
        txt_usuario.setCaretColor(new java.awt.Color(231,231,231));
        panel_derecho.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 270, 40));

        txt_password.setBackground(Main_Colores.Fondo);
        txt_password.setFont(txt_password.getFont().deriveFont(txt_password.getFont().getSize()+7f));
        txt_password.setForeground(Main_Colores.C_100);
        txt_password.setBorder(null);
        txt_password.setCaretColor(new java.awt.Color(231,231,231));
        panel_derecho.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 270, 40));

        jSeparator1.setBackground(Main_Colores.Fondo);
        jSeparator1.setForeground(Main_Colores.Fondo);
        panel_derecho.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 310, 10));

        jSeparator2.setBackground(Main_Colores.Fondo);
        jSeparator2.setForeground(Main_Colores.Fondo);
        panel_derecho.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 310, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-password-40 (1).png"))); // NOI18N
        panel_derecho.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 40, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-40.png"))); // NOI18N
        panel_derecho.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 40, 50));

        panel_header.add(panel_derecho, java.awt.BorderLayout.EAST);

        getContentPane().add(panel_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        btnIngresar.setBackground(new Color(49, 51, 70));
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        btnIngresar.setBackground(new Color(41, 41, 65));
    }//GEN-LAST:event_btnIngresarMouseExited
    boolean bandera = false;
    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed

        if (!bandera) {
            txt_password.setEchoChar((char) 0);
            btn_mostrar.setIcon(new ImageIcon(getClass().getResource("/images/icons8-ophthalmology-30.png")));
            bandera = true;
        } else {
            txt_password.setEchoChar('\u2022');
            btn_mostrar.setIcon(new ImageIcon(getClass().getResource("/images/icons8-eye-30.png")));
            bandera = false;
        }

    }//GEN-LAST:event_btn_mostrarActionPerformed

    private void lb_barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_barraMouseDragged
        // Calcular la nueva posición de la ventana en función del movimiento del ratón y la posición inicial de la ventana
        int x = posicionInicial.x + evt.getXOnScreen() - posicion.x;
        int y = posicionInicial.y + evt.getYOnScreen() - posicion.y;
        setLocation(x, y);
    }//GEN-LAST:event_lb_barraMouseDragged

    private void lb_barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_barraMousePressed
        // Almacenar la posición inicial del ratón dentro de la ventana
        posicion = evt.getPoint();
        SwingUtilities.convertPointToScreen(posicion, lb_barra);
        // Almacenar la posición inicial de la ventana
        posicionInicial = getLocation();
    }//GEN-LAST:event_lb_barraMousePressed

    private void lb_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseClicked

        int c = JOptionPane.showConfirmDialog(null, "Estas seguro de cerrar?");
        if (c == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_lb_cerrarMouseClicked

    private void lb_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseEntered
        lb_cerrar.setBackground(Color.red);
        lb_cerrar.setForeground(Color.white);
        lb_barra.setBackground(Color.red);
        lb_barra.setText("Cerrar ventana");
        lb_barra.setForeground(Color.white);
    }//GEN-LAST:event_lb_cerrarMouseEntered

    private void lb_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseExited
        lb_cerrar.setBackground(Color.white);
        lb_cerrar.setForeground(new Color(73, 181, 172));

        lb_barra.setBackground(Main_Colores.C_900);
        lb_barra.setText("\t Dashboard - Bienvenido Miguel Angel");
        lb_barra.setForeground(Color.WHITE);
    }//GEN-LAST:event_lb_cerrarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb_barra;
    private javax.swing.JLabel lb_cerrar;
    private javax.swing.JLabel lb_fondo_login;
    private javax.swing.JPanel panel_acciones;
    private javax.swing.JPanel panel_derecho;
    private javax.swing.JPanel panel_header;
    private javax.swing.JPanel panel_izquierdo;
    private javax.swing.JPanel panel_title;
    private javax.swing.JPanel panel_titulo;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    /**
     * metodo Iniciar Sesion
     */
    /*private void Login() {
        if (!txt_usuario.getText().isEmpty() && !txt_password.getText().isEmpty()) {
            Service_Usuario controlUsuario = new Service_Usuario();
            Usuario usuario = new Usuario();
            usuario.setUsuario(txt_usuario.getText().trim());
            usuario.setPassword(txt_password.getText().trim());
            if (controlUsuario.loginUser(usuario)) {
                //JOptionPane.showMessageDialog(null, "Login Correcto...");
                FrmMenu menu = new FrmMenu();
                menu.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Clave Incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese sus credenciales");
        }
    }*/
}
