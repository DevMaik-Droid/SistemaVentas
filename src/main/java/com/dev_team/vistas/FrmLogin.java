package com.dev_team.vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class FrmLogin extends javax.swing.JFrame {

    Point posicion;
    Point posicionInicial; // Variable para almacenar la posición inicial al iniciar el arrastre

    public FrmLogin() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Login - SISTEMA DE VENTAS");
        this.setSize(new Dimension(800, 600));

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
                // Calcular la nueva posición de la ventana en función del movimiento del ratón y la posición inicial de la ventana
                int x = posicionInicial.x + m.getXOnScreen() - posicion.x;
                int y = posicionInicial.y + m.getYOnScreen() - posicion.y;
                setLocation(x, y);
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_mostrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lb_barra = new javax.swing.JLabel();
        lb_cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(73, 181, 172));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 560));

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_mostrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btn_mostrar.setText("O");
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 30, 30));

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Iniciar Sesión");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 400, 53));

        jLabel4.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USUARIO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(73, 181, 172));
        btnIngresar.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setFocusPainted(false);
        btnIngresar.setFocusable(false);
        btnIngresar.setOpaque(true);
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
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 210, 60));

        txt_usuario.setBackground(new java.awt.Color(33, 45, 62));
        txt_usuario.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(73, 181, 172));
        txt_usuario.setBorder(null);
        txt_usuario.setCaretColor(new java.awt.Color(73, 181, 172));
        jPanel2.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 270, 40));

        txt_password.setBackground(new java.awt.Color(33, 45, 62));
        txt_password.setFont(txt_password.getFont().deriveFont(txt_password.getFont().getSize()+7f));
        txt_password.setForeground(new java.awt.Color(73, 181, 172));
        txt_password.setBorder(null);
        txt_password.setCaretColor(new java.awt.Color(73, 181, 172));
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 270, 36));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 310, 10));

        jSeparator2.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator2.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 310, 10));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 48, 36));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 48, 42));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 400, 560));

        lb_barra.setBackground(new java.awt.Color(255, 255, 255));
        lb_barra.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lb_barra.setForeground(new java.awt.Color(33, 45, 62));
        lb_barra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_barra.setText("Login");
        lb_barra.setOpaque(true);
        getContentPane().add(lb_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 40));

        lb_cerrar.setBackground(new java.awt.Color(255, 255, 255));
        lb_cerrar.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        lb_cerrar.setForeground(new java.awt.Color(73, 181, 172));
        lb_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_cerrar.setText("x");
        lb_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_cerrar.setOpaque(true);
        lb_cerrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lb_cerrarFocusGained(evt);
            }
        });
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
        getContentPane().add(lb_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void lb_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseClicked
        int c = JOptionPane.showConfirmDialog(null, "Estas seguro de cerrar?");
        if (c == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_lb_cerrarMouseClicked

    private void lb_cerrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lb_cerrarFocusGained
        System.out.println("dasdasd");
    }//GEN-LAST:event_lb_cerrarFocusGained

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
        lb_barra.setBackground(Color.white);
        lb_barra.setText("Login");
        lb_barra.setForeground(new Color(33, 45, 62));
    }//GEN-LAST:event_lb_cerrarMouseExited

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        btnIngresar.setBackground(new Color(119, 209, 199));
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        btnIngresar.setBackground(new Color(73, 181, 172));
    }//GEN-LAST:event_btnIngresarMouseExited
    boolean bandera = false;
    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed

        if (!bandera) {
            txt_password.setEchoChar((char) 0);
            bandera = true;
        } else {
            txt_password.setEchoChar('\u2022');
            bandera = false;
        }

    }//GEN-LAST:event_btn_mostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb_barra;
    private javax.swing.JLabel lb_cerrar;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    /**
     * metodo Iniciar Sesion
    
    private void Login() {
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
    } */
}
