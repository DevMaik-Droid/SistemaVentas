package com.dev_team.vistas;

import com.dev_team.models.Categoria;
import com.dev_team.models.Proveedor;
import java.awt.Dimension;
import java.time.LocalDate;


public class InterProducto extends javax.swing.JInternalFrame {

    public InterProducto() {
        initComponents();
        this.setSize(new Dimension(720, 400));
        this.setTitle("Nuevo Producto");
        LocalDate fecha = LocalDate.now();
        lb_date.setText("Fecha:"+ fecha.toString());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_date = new javax.swing.JLabel();
        cbx_proveedor = new javax.swing.JComboBox<>();
        txt_nombre = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        cbx_iva = new javax.swing.JComboBox<>();
        cbx_categorias = new javax.swing.JComboBox<>();
        btn_Guardar = new javax.swing.JButton();
        lb_imagen = new javax.swing.JLabel();
        btn_buscarImg = new javax.swing.JButton();
        tf_url = new javax.swing.JTextField();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cantidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descripcion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("IVA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Categorias:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nuevo Producto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Proveedor:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 90, -1));

        lb_date.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_date.setForeground(new java.awt.Color(255, 255, 255));
        lb_date.setText("Fecha:");
        getContentPane().add(lb_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        cbx_proveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbx_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_proveedorActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 170, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 170, -1));

        txt_cantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 170, -1));

        txt_precio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 170, -1));

        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 170, -1));

        cbx_iva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbx_iva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione iva:", "No grava iva", "13%" }));
        cbx_iva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_ivaActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 170, -1));

        cbx_categorias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbx_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_categoriasActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 170, -1));

        btn_Guardar.setBackground(new java.awt.Color(0, 204, 204));
        btn_Guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Guardar.setText("Guardar");
        getContentPane().add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 90, 30));

        lb_imagen.setBackground(new java.awt.Color(255, 255, 255));
        lb_imagen.setOpaque(true);
        getContentPane().add(lb_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 150, 130));

        btn_buscarImg.setText("BUSCAR");
        getContentPane().add(btn_buscarImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 130, 30));
        getContentPane().add(tf_url, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 210, 30));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.jpg"))); // NOI18N
        jLabel_wallpaper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_wallpaperMouseClicked(evt);
            }
        });
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_ivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_ivaActionPerformed
    }//GEN-LAST:event_cbx_ivaActionPerformed

    private void cbx_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_categoriasActionPerformed
      /*  try {
            String seleccion = jComboBox_categoria.getSelectedItem().toString();
            System.out.println(seleccion);
            if (seleccion.equals("Laptops")) {
                desActivarPaneles();
                panel_laptops.setVisible(true);
                
            }else if (seleccion.equals("Accesorios")) {
                System.out.println("sdfsdfdsf");
                desActivarPaneles();
                panel_acce.setVisible(true);
                
            }else{
                panel_laptops.setVisible(false);
            }
        } catch (Exception e) {    
        }*/
    
    }//GEN-LAST:event_cbx_categoriasActionPerformed

   /* public void desActivarPaneles(){    
        if(panel_laptops.isVisible()){s
            panel_laptops.setVisible(false);
        }
        if(panel_acce.isVisible()){
            panel_acce.setVisible(false);
        }
    }*/
    private void jLabel_wallpaperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_wallpaperMouseClicked
        /*panel_laptops.setVisible(false);*/
    }//GEN-LAST:event_jLabel_wallpaperMouseClicked

    private void cbx_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_proveedorActionPerformed
     
    }//GEN-LAST:event_cbx_proveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btn_Guardar;
    protected javax.swing.JButton btn_buscarImg;
    protected javax.swing.JComboBox<Categoria> cbx_categorias;
    protected javax.swing.JComboBox<String> cbx_iva;
    protected javax.swing.JComboBox<Proveedor> cbx_proveedor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JLabel lb_date;
    protected javax.swing.JLabel lb_imagen;
    protected javax.swing.JTextField tf_url;
    protected javax.swing.JTextField txt_cantidad;
    protected javax.swing.JTextField txt_descripcion;
    protected javax.swing.JTextField txt_nombre;
    protected javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
   
}
