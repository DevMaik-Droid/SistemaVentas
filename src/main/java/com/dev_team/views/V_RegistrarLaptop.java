package com.dev_team.views;

import com.dev_team.utilidades.JButtonRound;
import com.dev_team.utilidades.Main_Colores;
import com.dev_team.utilidades.PanelGradient;
import com.dev_team.utilidades.Panel_Round;
import java.awt.Color;
import javax.swing.JPanel;


public class V_RegistrarLaptop extends JPanel {

    /**
     * Creates new form V_RegistrarUsuario
     */
    public V_RegistrarLaptop()  {
        initComponents();
        panel_main.setBackground(Main_Colores.Fondo);
        setBackground(Main_Colores.Fondo_2);
        
    }

    
    private void iniciarComponentes(){
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_main = new Panel_Round(20);
        panelTitle = new PanelGradient(Color.MAGENTA, Color.BLUE);
        jLabel16 = new javax.swing.JLabel();
        panel_form = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descripcionLaptop = new javax.swing.JTextArea();
        btn_buscarLP = new JButtonRound("Buscar",20);
        cbx_memoriaRamLP = new javax.swing.JComboBox<>();
        cbx_procesadorLP = new javax.swing.JComboBox<>();
        cbx_discoDeAlmacenamientoLP = new javax.swing.JComboBox<>();
        cbx_proveedor = new javax.swing.JComboBox<>();
        tf_modeloLP = new javax.swing.JTextField();
        tf_conectividadLP = new javax.swing.JTextField();
        tf_pantallaLP = new javax.swing.JTextField();
        tf_nombreLP = new javax.swing.JTextField();
        tf_bateriaLP = new javax.swing.JTextField();
        tf_precioLP = new javax.swing.JTextField();
        tf_nombreC1 = new javax.swing.JTextField();
        btn_registrarLP = new JButtonRound("Registrar",30);

        setBackground(new java.awt.Color(51, 51, 51));

        panel_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitle.setBackground(new java.awt.Color(51, 51, 255));
        panelTitle.setPreferredSize(new java.awt.Dimension(40, 40));
        panelTitle.setLayout(new java.awt.BorderLayout());

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel16.setForeground(Main_Colores.C_100);
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("REGISTRAR LAPTOP");
        panelTitle.add(jLabel16, java.awt.BorderLayout.PAGE_END);

        panel_main.add(panelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        panel_form.setOpaque(false);
        panel_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel10.setOpaque(true);
        panel_form.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 200, 170));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel2.setForeground(Main_Colores.C_100);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Laptop");
        panel_form.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 200, 20));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setForeground(Main_Colores.C_100);
        jLabel6.setText("Descripcion:");
        panel_form.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 180, -1));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setForeground(Main_Colores.C_100);
        jLabel7.setText("Nombre:");
        panel_form.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel9.setForeground(Main_Colores.C_100);
        jLabel9.setText("Memoria ram:");
        panel_form.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(Main_Colores.C_100);
        jLabel4.setText("Conectividad:");
        panel_form.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setForeground(Main_Colores.C_100);
        jLabel5.setText("Pantalla:");
        panel_form.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel12.setForeground(Main_Colores.C_100);
        jLabel12.setText("Procesador:");
        panel_form.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 110, -1));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel11.setForeground(Main_Colores.C_100);
        jLabel11.setText("Disco de almacenamiento:");
        panel_form.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 220, -1));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel8.setForeground(Main_Colores.C_100);
        jLabel8.setText("Modelo:");
        panel_form.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel14.setForeground(Main_Colores.C_100);
        jLabel14.setText("Bateria:");
        panel_form.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel15.setForeground(Main_Colores.C_100);
        jLabel15.setText("Precio:");
        panel_form.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 60, -1));

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel17.setForeground(Main_Colores.C_100);
        jLabel17.setText("Proveedor:");
        panel_form.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel18.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel18.setForeground(Main_Colores.C_100);
        jLabel18.setText("Cantidad:");
        panel_form.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        ta_descripcionLaptop.setColumns(20);
        ta_descripcionLaptop.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        ta_descripcionLaptop.setForeground(Main_Colores.Fondo);
        ta_descripcionLaptop.setRows(5);
        ta_descripcionLaptop.setBorder(null);
        jScrollPane1.setViewportView(ta_descripcionLaptop);

        panel_form.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 590, 90));

        btn_buscarLP.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_buscarLP.setForeground(Main_Colores.Fondo);
        btn_buscarLP.setText("Buscar");
        btn_buscarLP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_form.add(btn_buscarLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 120, 40));

        cbx_memoriaRamLP.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_memoriaRamLP.setForeground(Main_Colores.Fondo);
        panel_form.add(cbx_memoriaRamLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 210, 30));

        cbx_procesadorLP.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_procesadorLP.setForeground(Main_Colores.Fondo);
        cbx_procesadorLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_procesadorLPActionPerformed(evt);
            }
        });
        panel_form.add(cbx_procesadorLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 220, 30));

        cbx_discoDeAlmacenamientoLP.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_discoDeAlmacenamientoLP.setForeground(Main_Colores.Fondo);
        panel_form.add(cbx_discoDeAlmacenamientoLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 220, 30));

        cbx_proveedor.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_proveedor.setForeground(Main_Colores.Fondo);
        cbx_proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:" }));
        panel_form.add(cbx_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 220, 30));

        tf_modeloLP.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_modeloLP.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_modeloLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 210, 30));

        tf_conectividadLP.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_conectividadLP.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_conectividadLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 210, 30));

        tf_pantallaLP.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_pantallaLP.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_pantallaLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 210, 30));

        tf_nombreLP.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_nombreLP.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_nombreLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 210, 30));

        tf_bateriaLP.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_bateriaLP.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_bateriaLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 210, 30));

        tf_precioLP.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_precioLP.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_precioLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 160, 30));

        tf_nombreC1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_nombreC1.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_nombreC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 220, 30));

        btn_registrarLP.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_registrarLP.setForeground(Main_Colores.Fondo);
        btn_registrarLP.setText("Registrar");
        btn_registrarLP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_form.add(btn_registrarLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 150, 50));

        panel_main.add(panel_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 820, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_procesadorLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_procesadorLPActionPerformed

    }//GEN-LAST:event_cbx_procesadorLPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarLP;
    private javax.swing.JButton btn_registrarLP;
    private javax.swing.JComboBox<String> cbx_discoDeAlmacenamientoLP;
    private javax.swing.JComboBox<String> cbx_memoriaRamLP;
    private javax.swing.JComboBox<String> cbx_procesadorLP;
    private javax.swing.JComboBox<String> cbx_proveedor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel panel_form;
    private javax.swing.JPanel panel_main;
    private javax.swing.JTextArea ta_descripcionLaptop;
    private javax.swing.JTextField tf_bateriaLP;
    private javax.swing.JTextField tf_conectividadLP;
    private javax.swing.JTextField tf_modeloLP;
    private javax.swing.JTextField tf_nombreC1;
    private javax.swing.JTextField tf_nombreLP;
    private javax.swing.JTextField tf_pantallaLP;
    private javax.swing.JTextField tf_precioLP;
    // End of variables declaration//GEN-END:variables
}
