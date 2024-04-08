package com.dev_team.views;

import com.dev_team.utilidades.JButtonRound;
import com.dev_team.utilidades.Main_Colores;
import com.dev_team.utilidades.PanelGradient;
import com.dev_team.utilidades.Panel_Round;
import java.awt.Color;
import javax.swing.JPanel;


public class V_RegistrarProveedor extends JPanel {

    /**
     * Creates new form V_RegistrarUsuario
     */
    public V_RegistrarProveedor() {
        
        initComponents();
        panel_main.setBackground(Main_Colores.Fondo);
        setBackground(Main_Colores.Fondo_2);
        
    }

    
    private void iniciarComponentes(){
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_main = new javax.swing.JPanel();
        panelTitle = new PanelGradient(Color.MAGENTA, Color.BLUE);
        jLabel13 = new javax.swing.JLabel();
        panel_form = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombreProveedor = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        tf_productoSuministrado = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_informacionAdicional = new javax.swing.JTextArea();
        btn_registrar = new JButtonRound("REGISTRAR",20);
        dc_fechaRegistro = new com.toedter.calendar.JDateChooser();
        cbx_estadoDePago = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(51, 51, 51));

        panel_main.setLayout(new java.awt.BorderLayout());

        panelTitle.setBackground(new java.awt.Color(51, 51, 255));
        panelTitle.setPreferredSize(new java.awt.Dimension(40, 40));
        panelTitle.setLayout(new java.awt.BorderLayout());

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel13.setForeground(Main_Colores.C_100);
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("REGISTRAR PROVEEDOR");
        panelTitle.add(jLabel13, java.awt.BorderLayout.CENTER);

        panel_main.add(panelTitle, java.awt.BorderLayout.NORTH);

        panel_form.setBackground(Main_Colores.Fondo);
        panel_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel1.setForeground(Main_Colores.C_100);
        jLabel1.setText("Nombre:");
        panel_form.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 210, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setForeground(Main_Colores.C_100);
        jLabel3.setText("Fecha de registro:");
        panel_form.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 230, 20));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(Main_Colores.C_100);
        jLabel4.setText("Producto suministrado:");
        panel_form.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 200, 20));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setForeground(Main_Colores.C_100);
        jLabel6.setText("Informacion adicional:");
        panel_form.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 200, -1));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setForeground(Main_Colores.C_100);
        jLabel7.setText("Direccion:");
        panel_form.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 130, -1));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel11.setForeground(Main_Colores.C_100);
        jLabel11.setText("Contacto:");
        panel_form.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 120, 20));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel8.setForeground(Main_Colores.C_100);
        jLabel8.setText("Estado de pago:");
        panel_form.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 200, 20));

        tf_nombreProveedor.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_nombreProveedor.setForeground(new java.awt.Color(19, 18, 54));
        tf_nombreProveedor.setBorder(null);
        panel_form.add(tf_nombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 310, 30));

        jTextField5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(19, 18, 54));
        jTextField5.setBorder(null);
        panel_form.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 290, 30));

        tf_productoSuministrado.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_productoSuministrado.setForeground(new java.awt.Color(19, 18, 54));
        tf_productoSuministrado.setBorder(null);
        panel_form.add(tf_productoSuministrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 290, 30));

        jTextField9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(19, 18, 54));
        jTextField9.setBorder(null);
        panel_form.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 310, 30));

        ta_informacionAdicional.setColumns(20);
        ta_informacionAdicional.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        ta_informacionAdicional.setForeground(new java.awt.Color(19, 18, 54));
        ta_informacionAdicional.setRows(5);
        ta_informacionAdicional.setBorder(null);
        jScrollPane1.setViewportView(ta_informacionAdicional);

        panel_form.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 580, 90));

        btn_registrar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(19, 18, 54));
        btn_registrar.setText("REGISTRAR");
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_form.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 190, 50));

        dc_fechaRegistro.setForeground(new java.awt.Color(19, 18, 54));
        dc_fechaRegistro.setDateFormatString("dd - MMM - YYYY");
        dc_fechaRegistro.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        panel_form.add(dc_fechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 270, 30));

        cbx_estadoDePago.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_estadoDePago.setForeground(new java.awt.Color(19, 18, 54));
        cbx_estadoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:", "Completo", "Pendiente", "Parcialmente pagado" }));
        panel_form.add(cbx_estadoDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 220, 30));

        panel_main.add(panel_form, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel panel_form;
    private javax.swing.JPanel panel_main;
    private javax.swing.JTextArea ta_informacionAdicional;
    private javax.swing.JTextField tf_nombreProveedor;
    private javax.swing.JTextField tf_productoSuministrado;
    // End of variables declaration//GEN-END:variables
}
