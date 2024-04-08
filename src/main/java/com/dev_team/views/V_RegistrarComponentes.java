package com.dev_team.views;

import com.dev_team.utilidades.JButtonRound;
import com.dev_team.utilidades.Main_Colores;
import com.dev_team.utilidades.PanelGradient;
import com.dev_team.utilidades.Panel_Round;
import java.awt.Color;
import javax.swing.JPanel;


public class V_RegistrarComponentes extends JPanel{

    /**
     * Creates new form V_RegistrarUsuario
     */
    public V_RegistrarComponentes() {
      
        initComponents();
        panel_main.setBackground(Main_Colores.Fondo);
        setBackground(Main_Colores.Fondo_2);
    }

    
    private void iniciarComponentes(){
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_main = panel_main = new Panel_Round(20);

        panel_main.setLayout(new java.awt.BorderLayout());
        panel_form = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descripcionC = new javax.swing.JTextArea();
        btn_buscarC = new JButtonRound("Buscar",20);
        cbx_marcaC = new javax.swing.JComboBox<>();
        cbx_tipoC = new javax.swing.JComboBox<>();
        cbx_modeloC = new javax.swing.JComboBox<>();
        cbx_componente = new javax.swing.JComboBox<>();
        cbx_capacidadC = new javax.swing.JComboBox<>();
        cbx_proveedor = new javax.swing.JComboBox<>();
        cbx_velocidadC = new javax.swing.JComboBox<>();
        btn_registrarC = new JButtonRound("Registrar",20);
        tf_nombreC1 = new javax.swing.JTextField();
        tf_nombreC2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        panelTitle = new PanelGradient(Color.MAGENTA, Color.BLUE);
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        panel_form.setOpaque(false);
        panel_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel2.setForeground(Main_Colores.C_100);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Imagen del producto");
        panel_form.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 85, 240, 20));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setForeground(Main_Colores.C_100);
        jLabel6.setText("Descripcion:");
        panel_form.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 423, 140, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel10.setForeground(Main_Colores.C_100);
        jLabel10.setOpaque(true);
        panel_form.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 115, 210, 196));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setForeground(Main_Colores.C_100);
        jLabel7.setText("Componente:");
        panel_form.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 26, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setForeground(Main_Colores.C_100);
        jLabel3.setText("Marca:");
        panel_form.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 125, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel9.setForeground(Main_Colores.C_100);
        jLabel9.setText("Tipo:");
        panel_form.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(Main_Colores.C_100);
        jLabel4.setText("Modelo:");
        panel_form.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel12.setForeground(Main_Colores.C_100);
        jLabel12.setText("Capacidad:");
        panel_form.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel11.setForeground(Main_Colores.C_100);
        jLabel11.setText("Velocidad:");
        panel_form.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 191, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel8.setForeground(Main_Colores.C_100);
        jLabel8.setText("Proveedor:");
        panel_form.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel14.setForeground(Main_Colores.C_100);
        jLabel14.setText("Cantidad:");
        panel_form.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        ta_descripcionC.setColumns(20);
        ta_descripcionC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        ta_descripcionC.setForeground(Main_Colores.Fondo);
        ta_descripcionC.setRows(5);
        ta_descripcionC.setBorder(null);
        jScrollPane1.setViewportView(ta_descripcionC);

        panel_form.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 460, 580, 90));

        btn_buscarC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_buscarC.setForeground(Main_Colores.Fondo);
        btn_buscarC.setText("Buscar");
        btn_buscarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_form.add(btn_buscarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 130, -1));

        cbx_marcaC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_marcaC.setForeground(Main_Colores.Fondo);
        panel_form.add(cbx_marcaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 151, 230, 30));

        cbx_tipoC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_tipoC.setForeground(Main_Colores.Fondo);
        cbx_tipoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tipoCActionPerformed(evt);
            }
        });
        panel_form.add(cbx_tipoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 200, 30));

        cbx_modeloC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_modeloC.setForeground(Main_Colores.Fondo);
        panel_form.add(cbx_modeloC, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 200, 30));

        cbx_componente.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_componente.setForeground(Main_Colores.Fondo);
        cbx_componente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione componente:", "Placa Base (Motherboard)", "Procesador (CPU)", "Memoria RAM", "Almacenamiento", "Tarjeta grafica (GPU)", "Fuente Alimentacion", "Case", "Disipador", "Ventiladores" }));
        panel_form.add(cbx_componente, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 55, -1, 30));

        cbx_capacidadC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_capacidadC.setForeground(Main_Colores.Fondo);
        cbx_capacidadC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_capacidadCActionPerformed(evt);
            }
        });
        panel_form.add(cbx_capacidadC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 230, 30));

        cbx_proveedor.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_proveedor.setForeground(Main_Colores.Fondo);
        cbx_proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:" }));
        panel_form.add(cbx_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, 30));

        cbx_velocidadC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_velocidadC.setForeground(Main_Colores.Fondo);
        panel_form.add(cbx_velocidadC, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 217, 230, 30));

        btn_registrarC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_registrarC.setForeground(Main_Colores.Fondo);
        btn_registrarC.setText("Registrar");
        btn_registrarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_form.add(btn_registrarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 154, 42));

        tf_nombreC1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_nombreC1.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_nombreC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 210, 30));

        tf_nombreC2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_nombreC2.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_nombreC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 210, 30));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel16.setForeground(Main_Colores.C_100);
        jLabel16.setText("Precio:");
        panel_form.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        panelTitle.setBackground(new java.awt.Color(51, 51, 255));
        panelTitle.setPreferredSize(new java.awt.Dimension(40, 40));
        panelTitle.setLayout(new java.awt.BorderLayout());

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel15.setForeground(Main_Colores.C_100);
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("REGISTRAR COMPONENTES");
        panelTitle.add(jLabel15, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout panel_mainLayout = new javax.swing.GroupLayout(panel_main);
        panel_main.setLayout(panel_mainLayout);
        panel_mainLayout.setHorizontalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_form, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
        );
        panel_mainLayout.setVerticalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mainLayout.createSequentialGroup()
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_form, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_capacidadCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_capacidadCActionPerformed

    }//GEN-LAST:event_cbx_capacidadCActionPerformed

    private void cbx_tipoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tipoCActionPerformed

    }//GEN-LAST:event_cbx_tipoCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarC;
    private javax.swing.JButton btn_registrarC;
    protected javax.swing.JComboBox<String> cbx_capacidadC;
    protected javax.swing.JComboBox<String> cbx_componente;
    protected javax.swing.JComboBox<String> cbx_marcaC;
    protected javax.swing.JComboBox<String> cbx_modeloC;
    protected javax.swing.JComboBox<String> cbx_proveedor;
    protected javax.swing.JComboBox<String> cbx_tipoC;
    protected javax.swing.JComboBox<String> cbx_velocidadC;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel panel_form;
    private javax.swing.JPanel panel_main;
    private javax.swing.JTextArea ta_descripcionC;
    protected javax.swing.JTextField tf_nombreC1;
    protected javax.swing.JTextField tf_nombreC2;
    // End of variables declaration//GEN-END:variables
}
