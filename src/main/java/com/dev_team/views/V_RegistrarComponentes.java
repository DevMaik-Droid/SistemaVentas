package com.dev_team.views;

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
        setBackground(Main_Colores.Fondo_2);
    }

    
    private void iniciarComponentes(){
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_main = new javax.swing.JPanel();
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
        btn_buscarC = new javax.swing.JButton();
        cbx_marcaC = new javax.swing.JComboBox<>();
        cbx_tipoC = new javax.swing.JComboBox<>();
        cbx_modeloC = new javax.swing.JComboBox<>();
        cbx_capacidadC = new javax.swing.JComboBox<>();
        cbx_velocidadC = new javax.swing.JComboBox<>();
        btn_registrarC = new javax.swing.JButton();
        tf_nombreC1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        panelTitle = new PanelGradient(Color.MAGENTA, Color.BLUE);
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        panel_main.setLayout(new java.awt.BorderLayout());

        panel_form.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel2.setForeground(Main_Colores.C_100);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Imagen del producto");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setForeground(Main_Colores.C_100);
        jLabel6.setText("Descripcion:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel10.setForeground(Main_Colores.C_100);
        jLabel10.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setForeground(Main_Colores.C_100);
        jLabel7.setText("Componente:");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setForeground(Main_Colores.C_100);
        jLabel3.setText("Marca:");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel9.setForeground(Main_Colores.C_100);
        jLabel9.setText("Tipo:");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(Main_Colores.C_100);
        jLabel4.setText("Modelo:");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel12.setForeground(Main_Colores.C_100);
        jLabel12.setText("Capacidad:");

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel11.setForeground(Main_Colores.C_100);
        jLabel11.setText("Velocidad:");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel8.setForeground(Main_Colores.C_100);
        jLabel8.setText("Proveedor:");

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel14.setForeground(Main_Colores.C_100);
        jLabel14.setText("Cantidad:");

        ta_descripcionC.setColumns(20);
        ta_descripcionC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        ta_descripcionC.setForeground(Main_Colores.Fondo);
        ta_descripcionC.setRows(5);
        ta_descripcionC.setBorder(null);
        jScrollPane1.setViewportView(ta_descripcionC);

        btn_buscarC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_buscarC.setForeground(Main_Colores.Fondo);
        btn_buscarC.setText("Buscar");

        cbx_marcaC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_marcaC.setForeground(Main_Colores.Fondo);

        cbx_tipoC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_tipoC.setForeground(Main_Colores.Fondo);
        cbx_tipoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tipoCActionPerformed(evt);
            }
        });

        cbx_modeloC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_modeloC.setForeground(Main_Colores.Fondo);

        cbx_capacidadC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_capacidadC.setForeground(Main_Colores.Fondo);
        cbx_capacidadC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_capacidadCActionPerformed(evt);
            }
        });

        cbx_velocidadC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_velocidadC.setForeground(Main_Colores.Fondo);

        btn_registrarC.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_registrarC.setForeground(Main_Colores.Fondo);
        btn_registrarC.setText("REGISTRAR");

        tf_nombreC1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_nombreC1.setForeground(Main_Colores.Fondo);

        jComboBox1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jComboBox1.setForeground(Main_Colores.Fondo);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:" }));

        jComboBox2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jComboBox2.setForeground(Main_Colores.Fondo);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:" }));

        javax.swing.GroupLayout panel_formLayout = new javax.swing.GroupLayout(panel_form);
        panel_form.setLayout(panel_formLayout);
        panel_formLayout.setHorizontalGroup(
            panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formLayout.createSequentialGroup()
                        .addGroup(panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(panel_formLayout.createSequentialGroup()
                                .addGap(550, 550, 550)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_formLayout.createSequentialGroup()
                                .addGroup(panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(cbx_marcaC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbx_modeloC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(cbx_tipoC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(cbx_capacidadC, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(cbx_velocidadC, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_formLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_formLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_nombreC1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_formLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(253, 253, 253)
                                        .addComponent(btn_buscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formLayout.createSequentialGroup()
                        .addComponent(btn_registrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(352, 352, 352))))
        );
        panel_formLayout.setVerticalGroup(
            panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_formLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_formLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(3, 3, 3)
                                .addComponent(cbx_marcaC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addGap(3, 3, 3)
                                .addComponent(cbx_modeloC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9)
                                .addGap(3, 3, 3)
                                .addComponent(cbx_tipoC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_formLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(3, 3, 3)
                                .addComponent(cbx_capacidadC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11)
                                .addGap(3, 3, 3)
                                .addComponent(cbx_velocidadC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14)
                .addGroup(panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscarC)
                    .addGroup(panel_formLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14))))
                .addGap(3, 3, 3)
                .addGroup(panel_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreC1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_registrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panel_main.add(panel_form, java.awt.BorderLayout.CENTER);

        panelTitle.setBackground(new java.awt.Color(51, 51, 255));
        panelTitle.setPreferredSize(new java.awt.Dimension(40, 40));
        panelTitle.setLayout(new java.awt.BorderLayout());

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel15.setForeground(Main_Colores.C_100);
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("REGISTRAR COMPONENTES");
        panelTitle.add(jLabel15, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_capacidadCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_capacidadCActionPerformed

    }//GEN-LAST:event_cbx_capacidadCActionPerformed

    private void cbx_tipoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tipoCActionPerformed

    }//GEN-LAST:event_cbx_tipoCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarC;
    private javax.swing.JButton btn_registrarC;
    private javax.swing.JComboBox<String> cbx_capacidadC;
    private javax.swing.JComboBox<String> cbx_marcaC;
    private javax.swing.JComboBox<String> cbx_modeloC;
    private javax.swing.JComboBox<String> cbx_tipoC;
    private javax.swing.JComboBox<String> cbx_velocidadC;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextField tf_nombreC1;
    // End of variables declaration//GEN-END:variables
}
