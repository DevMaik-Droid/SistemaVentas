package com.dev_team.dashboard;

import com.dev_team.controllers.GestionUsuarioController;
import com.dev_team.controllers.ProveedorController;
import com.dev_team.controllers.ProveedorGestionController;
import com.dev_team.controllers.UsuarioController;
import com.dev_team.utilidades.Main_Colores;
import com.dev_team.views.V_GestionarProductos;
import com.dev_team.views.V_GestionarProveedores;
import com.dev_team.views.V_GestionarUsuario;
import com.dev_team.views.V_RegistrarAccesorios;
import com.dev_team.views.V_RegistrarComponentes;
import com.dev_team.views.V_RegistrarComputadora;
import com.dev_team.views.V_RegistrarLaptop;
import com.dev_team.views.V_RegistrarProveedor;
import com.dev_team.views.V_RegistrarUsuario;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Vista_Dashboard extends javax.swing.JFrame {

    private static Vista_Dashboard main;
    Point posicion;
    Point posicionInicial; // Variable para almacenar la posición inicial al iniciar el arrastre

    public Vista_Dashboard() {
        initComponents();
        init();
        setResizable(true);
        setSize(1280,800);
        panel_header.setBackground(Main_Colores.Fondo);
    }

    private void init() {
        main = this;

        menu.addEvent((int index, int indexSubMenu) -> {
            if (index == 0 && indexSubMenu == 0) {

                showForm(new Form_Empty(0 + " " + 0));
            } else if (index == 4 && indexSubMenu == 1) {
                
                V_RegistrarUsuario usr = new UsuarioController();
                showForm(usr);
                
            } else if (index == 4 && indexSubMenu == 2) {
                
                V_GestionarUsuario gestionarUsuario = new GestionUsuarioController();
                showForm(gestionarUsuario);
                
            } else if (index == 5 && indexSubMenu == 1) {
                V_RegistrarProveedor prov = new ProveedorController();
                showForm(prov);
                
            } else if (index == 5 && indexSubMenu == 2) {
                V_GestionarProveedores gest = new ProveedorGestionController();
                showForm(gest);
                
            } else if (index == 6 && indexSubMenu == 1) {
                showForm(new V_RegistrarComputadora());
            } else if (index == 6 && indexSubMenu == 2) {
                showForm(new V_RegistrarLaptop());
            } else if (index == 6 && indexSubMenu == 3) {
                showForm(new V_RegistrarAccesorios());
            } else if (index == 6 && indexSubMenu == 4) {
                showForm(new V_RegistrarComponentes());
            } else if (index == 6 && indexSubMenu == 5) {
                showForm(new V_GestionarProductos());
            } 
            else {
                showForm(new Form_Empty(index + " " + indexSubMenu));
            }
        });
        menu.setSelectedIndex(0, 0);
    }

    public void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }

    public static Vista_Dashboard getMain() {
        return main;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_header = new javax.swing.JPanel();
        panel_title = new javax.swing.JPanel();
        panel_title_1 = new javax.swing.JPanel();
        lb_barra = new javax.swing.JLabel();
        panel_acciones = new javax.swing.JPanel();
        maximizar = new javax.swing.JLabel();
        lb_cerrar = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        lb_apellido = new javax.swing.JLabel();
        menu = new com.dev_team.dashboard.menu.Menu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1280, 650));

        panel_header.setBackground(new java.awt.Color(51, 51, 51));
        panel_header.setLayout(new java.awt.BorderLayout());

        panel_title.setPreferredSize(new java.awt.Dimension(100, 30));
        panel_title.setLayout(new javax.swing.BoxLayout(panel_title, javax.swing.BoxLayout.LINE_AXIS));

        panel_title_1.setLayout(new java.awt.BorderLayout());

        lb_barra.setBackground(Main_Colores.C_900
        );
        lb_barra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_barra.setForeground(new java.awt.Color(255, 255, 255));
        lb_barra.setText("\t Dashboard - Bienvenido Miguel");
        lb_barra.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        lb_barra.setOpaque(true);
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
        panel_title_1.add(lb_barra, java.awt.BorderLayout.CENTER);

        panel_title.add(panel_title_1);

        panel_acciones.setPreferredSize(new java.awt.Dimension(70, 30));
        panel_acciones.setRequestFocusEnabled(false);

        maximizar.setBackground(new java.awt.Color(153, 0, 255));
        maximizar.setForeground(new java.awt.Color(255, 255, 255));
        maximizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maximizar.setText("[--]");
        maximizar.setOpaque(true);
        maximizar.setPreferredSize(new java.awt.Dimension(35, 16));
        maximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizarMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout panel_accionesLayout = new javax.swing.GroupLayout(panel_acciones);
        panel_acciones.setLayout(panel_accionesLayout);
        panel_accionesLayout.setHorizontalGroup(
            panel_accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_accionesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(maximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_accionesLayout.setVerticalGroup(
            panel_accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_accionesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb_cerrar))
            .addComponent(maximizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_title.add(panel_acciones);

        panel_header.add(panel_title, java.awt.BorderLayout.NORTH);

        body.setBackground(new java.awt.Color(204, 204, 204));
        body.setPreferredSize(new java.awt.Dimension(1200, 700));
        body.setRequestFocusEnabled(false);
        body.setLayout(new java.awt.BorderLayout());
        panel_header.add(body, java.awt.BorderLayout.CENTER);

        panelMenu.setBackground(new java.awt.Color(30, 32, 47));
        panelMenu.setPreferredSize(new java.awt.Dimension(300, 700));
        panelMenu.setLayout(new javax.swing.BoxLayout(panelMenu, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(300, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 150));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 60, 57));

        lb_nombre.setFont(new java.awt.Font("Nunito", 1, 12)); // NOI18N
        lb_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lb_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nombre.setText("Miguel Angel");
        jPanel1.add(lb_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 110, -1));

        lb_apellido.setFont(new java.awt.Font("Nunito", 1, 12)); // NOI18N
        lb_apellido.setForeground(new java.awt.Color(255, 255, 255));
        lb_apellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_apellido.setText("Quispe Gutierrez");
        jPanel1.add(lb_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 110, -1));

        panelMenu.add(jPanel1);

        menu.setBackground(new java.awt.Color(51, 0, 102));
        menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menu.setForeground(new java.awt.Color(153, 153, 0));
        menu.setOpaque(false);
        menu.setPreferredSize(new java.awt.Dimension(150, 460));
        panelMenu.add(menu);

        panel_header.add(panelMenu, java.awt.BorderLayout.WEST);

        getContentPane().add(panel_header, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void lb_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseClicked

        int c = JOptionPane.showConfirmDialog(null, "Estas seguro de cerrar?");
        if (c == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_lb_cerrarMouseClicked

    int antes;
    boolean bandera = false;
    private void maximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizarMouseClicked

        if (!bandera) {
            antes = this.getExtendedState();
            setExtendedState(JFrame.MAXIMIZED_BOTH);
            bandera = true;
        } else {
            setExtendedState(antes);
            bandera = false;
        }

    }//GEN-LAST:event_maximizarMouseClicked

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_apellido;
    private javax.swing.JLabel lb_barra;
    private javax.swing.JLabel lb_cerrar;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel maximizar;
    private com.dev_team.dashboard.menu.Menu menu;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panel_acciones;
    private javax.swing.JPanel panel_header;
    private javax.swing.JPanel panel_title;
    private javax.swing.JPanel panel_title_1;
    // End of variables declaration//GEN-END:variables
}
