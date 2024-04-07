package com.dev_team.views;

import com.dev_team.utilidades.JPanelPersonzalizado;
import com.dev_team.utilidades.Main_Colores;
import java.awt.Color;


public class V_RegistrarProveedor extends JPanelPersonzalizado {

    /**
     * Creates new form V_RegistrarUsuario
     */
    public V_RegistrarProveedor() {
        
        initComponents();
        
    }

    
    private void iniciarComponentes(){
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tf_nombreProveedor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_productoSuministrado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_informacionAdicional = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dc_fechaRegistro = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        cbx_estadoDePago = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_nombreProveedor.setFont(new java.awt.Font("Righteous", 0, 14)); // NOI18N
        tf_nombreProveedor.setBorder(null);
        jPanel1.add(tf_nombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 310, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel1.setForeground(Main_Colores.C_100);
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 210, -1));

        jTextField5.setBorder(null);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 290, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel3.setForeground(Main_Colores.C_100);
        jLabel3.setText("Fecha de registro:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 230, 20));

        jLabel4.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel4.setForeground(Main_Colores.C_100);
        jLabel4.setText("Producto suministrado:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 200, 20));

        tf_productoSuministrado.setBorder(null);
        jPanel1.add(tf_productoSuministrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 290, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel6.setForeground(Main_Colores.C_100);
        jLabel6.setText("Informacion adicional:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 200, -1));

        jTextField9.setBorder(null);
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 310, 30));

        ta_informacionAdicional.setColumns(20);
        ta_informacionAdicional.setRows(5);
        ta_informacionAdicional.setBorder(null);
        jScrollPane1.setViewportView(ta_informacionAdicional);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 580, 90));

        jLabel7.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel7.setForeground(Main_Colores.C_100);
        jLabel7.setText("Direccion:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 130, -1));

        btn_registrar.setText("REGISTRAR");
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 190, 50));

        jLabel11.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel11.setForeground(Main_Colores.C_100);
        jLabel11.setText("Contacto:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 120, 20));

        jLabel13.setFont(new java.awt.Font("Questrian", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("REGISTRAR PROVEEDOR");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 270, 40));

        dc_fechaRegistro.setDateFormatString("dd - MMM - YYYY");
        jPanel1.add(dc_fechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 270, 30));

        jLabel8.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel8.setForeground(Main_Colores.C_100);
        jLabel8.setText("Estado de pago:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 200, 20));

        cbx_estadoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:", "Completo", "Pendiente", "Parcialmente pagado" }));
        jPanel1.add(cbx_estadoDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 200, 30));

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JComboBox<String> cbx_estadoDePago;
    private com.toedter.calendar.JDateChooser dc_fechaRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextArea ta_informacionAdicional;
    private javax.swing.JTextField tf_nombreProveedor;
    private javax.swing.JTextField tf_productoSuministrado;
    // End of variables declaration//GEN-END:variables
}
