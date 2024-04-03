package com.dev_team.dashboard;

import com.dev_team.utilidades.Main_Colores;
import com.dev_team.vistas.V_RegistrarUsuario;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Vista_Dashboard extends javax.swing.JFrame {
    
    private static Vista_Dashboard main;
    Point posicion;
    Point posicionInicial; // Variable para almacenar la posición inicial al iniciar el arrastre
    
    public Vista_Dashboard() {
        initComponents();
        init();
        
        lb_barra.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent m) {
                // Almacenar la posición inicial del ratón dentro de la ventana
                posicion = m.getPoint();
                SwingUtilities.convertPointToScreen(posicion, lb_barra);
                // Almacenar la posición inicial de la ventana
                posicionInicial = getLocation();
            }
            
            @Override
            public void mouseDragged(MouseEvent m) {
                // Calcular la nueva posición de la ventana en función del movimiento del ratón y la posición inicial de la ventana
                int x = posicionInicial.x + m.getXOnScreen() - posicion.x;
                int y = posicionInicial.y + m.getYOnScreen() - posicion.y;
                setLocation(x, y);
            }
        });
        
        
        
    }
    
    private void init() {
        main = this;
        
        menu.addEvent((int index, int indexSubMenu) -> {
            if (index == 0 && indexSubMenu == 0) {
                
                showForm(new Form_Empty(0 + " " + 0));
            }else if(index == 4 && indexSubMenu == 1){
                showForm(new V_RegistrarUsuario());
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

        background = new javax.swing.JPanel();
        lb_barra = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        menu = new com.dev_team.dashboard.menu.Menu();
        jPanel1 = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        lb_cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(245, 245, 245));

        lb_barra.setBackground(Main_Colores.C_900);
        lb_barra.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        lb_barra.setOpaque(true);

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());

        lb_cerrar.setBackground(new java.awt.Color(255, 51, 51));
        lb_cerrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        lb_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_cerrar.setText("X");
        lb_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_cerrar.setOpaque(true);
        lb_cerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lb_cerrarMouseDragged(evt);
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

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(lb_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 1296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_cerrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseDragged
        
    }//GEN-LAST:event_lb_cerrarMouseDragged

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

    private void lb_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseClicked
        
        int c = JOptionPane.showConfirmDialog(null, "Estas seguro de cerrar?");
        if (c == 0) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_lb_cerrarMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel body;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_barra;
    private javax.swing.JLabel lb_cerrar;
    private com.dev_team.dashboard.menu.Menu menu;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
