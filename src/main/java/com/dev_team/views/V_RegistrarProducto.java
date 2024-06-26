/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.dev_team.views;

import com.dev_team.models.Proveedor;
import com.dev_team.utilidades.JButtonRound;
import com.dev_team.utilidades.Main_Colores;
import com.dev_team.utilidades.PanelGradient;
import com.dev_team.utilidades.Panel_Round;
import java.awt.Color;

/**
 *
 * @author DevMaik
 */
public class V_RegistrarProducto extends javax.swing.JPanel {

    /**
     * Creates new form V_RegistrarProducto
     */
    public V_RegistrarProducto() {
        initComponents();
        panel_main.setBackground(Main_Colores.Fondo);
        setBackground(Main_Colores.Fondo_2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_main = new Panel_Round(20,Color.CYAN,Color.BLUE);
        panelTitle = new PanelGradient(Color.CYAN, Color.BLUE);
        jLabel13 = new javax.swing.JLabel();
        panel_form = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf_nombreProducto = new javax.swing.JTextField();
        tf_precioUnitario = new javax.swing.JTextField();
        tf_cantidad = new javax.swing.JTextField();
        tf_precioTotal = new javax.swing.JTextField();
        cbx_categoria = new javax.swing.JComboBox<>();
        cbx_clave = new javax.swing.JComboBox<>();
        cbx_proveedor = new javax.swing.JComboBox<>();
        btn_registrar = new JButtonRound("Registrar",20);
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_detalle = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(51, 51, 51));

        panel_main.setLayout(new java.awt.BorderLayout());

        panelTitle.setBackground(new java.awt.Color(51, 51, 255));
        panelTitle.setPreferredSize(new java.awt.Dimension(40, 40));
        panelTitle.setLayout(new java.awt.BorderLayout());

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("REGISTRAR PRODUCTO");
        panelTitle.add(jLabel13, java.awt.BorderLayout.CENTER);

        panel_main.add(panelTitle, java.awt.BorderLayout.NORTH);

        panel_form.setBackground(Main_Colores.Fondo);
        panel_form.setOpaque(false);
        panel_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel1.setForeground(Main_Colores.C_100);
        jLabel1.setText("Categorias:");
        panel_form.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel2.setForeground(Main_Colores.C_100);
        jLabel2.setText("Clave Producto:");
        panel_form.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setForeground(Main_Colores.C_100);
        jLabel3.setText("Detalle:");
        panel_form.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(Main_Colores.C_100);
        jLabel4.setText("Nombre Producto:");
        panel_form.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel19.setForeground(Main_Colores.C_100);
        jLabel19.setText("Precio total:");
        panel_form.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 130, 30));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel8.setForeground(Main_Colores.C_100);
        jLabel8.setText("Proveedor:");
        panel_form.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel16.setForeground(Main_Colores.C_100);
        jLabel16.setText("Precio unitario:");
        panel_form.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 130, 30));

        jLabel18.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel18.setForeground(Main_Colores.C_100);
        jLabel18.setText("Stock:");
        panel_form.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, 30));

        tf_nombreProducto.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_nombreProducto.setForeground(Main_Colores.Fondo);
        tf_nombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreProductoActionPerformed(evt);
            }
        });
        panel_form.add(tf_nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, 30));

        tf_precioUnitario.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_precioUnitario.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_precioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 150, 30));

        tf_cantidad.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_cantidad.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 150, 30));

        tf_precioTotal.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_precioTotal.setForeground(Main_Colores.Fondo);
        tf_precioTotal.setEnabled(false);
        panel_form.add(tf_precioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 170, 30));

        cbx_categoria.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_categoria.setForeground(Main_Colores.Fondo);
        cbx_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione categoria:", "Computadora", "Laptop", "Componentes", "Accesorios" }));
        panel_form.add(cbx_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 220, 30));

        cbx_clave.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_clave.setForeground(Main_Colores.Fondo);
        panel_form.add(cbx_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 180, 30));

        cbx_proveedor.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_proveedor.setForeground(Main_Colores.Fondo);
        panel_form.add(cbx_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 220, 30));

        btn_registrar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_registrar.setForeground(Main_Colores.Fondo);
        btn_registrar.setText("Registrar");
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_form.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 150, 50));

        ta_detalle.setColumns(20);
        ta_detalle.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        ta_detalle.setForeground(Main_Colores.Fondo);
        ta_detalle.setLineWrap(true);
        ta_detalle.setRows(5);
        jScrollPane1.setViewportView(ta_detalle);

        panel_form.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 510, 170));

        panel_main.add(panel_form, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btn_registrar;
    protected javax.swing.JComboBox<String> cbx_categoria;
    protected javax.swing.JComboBox<String> cbx_clave;
    protected javax.swing.JComboBox<Proveedor> cbx_proveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel panel_form;
    private javax.swing.JPanel panel_main;
    protected javax.swing.JTextArea ta_detalle;
    protected javax.swing.JTextField tf_cantidad;
    protected javax.swing.JTextField tf_nombreProducto;
    protected javax.swing.JTextField tf_precioTotal;
    protected javax.swing.JTextField tf_precioUnitario;
    // End of variables declaration//GEN-END:variables
}
