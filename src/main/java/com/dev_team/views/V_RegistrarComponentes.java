package com.dev_team.views;

import com.dev_team.dashboard.Vista_Dashboard;
import com.dev_team.models.Proveedor;
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

        panel_main = panel_main = new Panel_Round(20,Color.MAGENTA,Color.red);

        panel_main.setLayout(new java.awt.BorderLayout());
        panel_form = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lb_imagen = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lb_1 = new javax.swing.JLabel();
        lb_2 = new javax.swing.JLabel();
        lb_3 = new javax.swing.JLabel();
        lb_4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descripcion = new javax.swing.JTextArea();
        btn_buscar = new JButtonRound("Buscar",20);
        cbx_componente = new javax.swing.JComboBox<>();
        cbx_proveedor = new javax.swing.JComboBox<>();
        btn_registrar = new JButtonRound("Registrar",20);
        tf_marca = new javax.swing.JTextField();
        tf_modelo = new javax.swing.JTextField();
        cbx_velocidad = new javax.swing.JComboBox<>();
        cbx_capacidad = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        tf_precioUnitario = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tf_cantidad = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tf_precioTotal = new javax.swing.JTextField();
        panelTitle = new PanelGradient(Color.MAGENTA,Color.red);
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
        panel_form.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 140, -1));

        lb_imagen.setBackground(new java.awt.Color(255, 255, 255));
        lb_imagen.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lb_imagen.setForeground(Main_Colores.C_100);
        lb_imagen.setOpaque(true);
        panel_form.add(lb_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 115, 210, 196));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setForeground(Main_Colores.C_100);
        jLabel7.setText("Componente:");
        panel_form.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 26, -1, -1));

        lb_1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lb_1.setForeground(Main_Colores.C_100);
        lb_1.setText("Marca:");
        panel_form.add(lb_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        lb_2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lb_2.setForeground(Main_Colores.C_100);
        lb_2.setText("Modelo:");
        panel_form.add(lb_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        lb_3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lb_3.setForeground(Main_Colores.C_100);
        lb_3.setText("Capacidad:");
        panel_form.add(lb_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        lb_4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lb_4.setForeground(Main_Colores.C_100);
        lb_4.setText("Velocidad:");
        panel_form.add(lb_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel8.setForeground(Main_Colores.C_100);
        jLabel8.setText("Proveedor:");
        panel_form.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        ta_descripcion.setColumns(20);
        ta_descripcion.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        ta_descripcion.setForeground(Main_Colores.Fondo);
        ta_descripcion.setRows(5);
        ta_descripcion.setBorder(null);
        jScrollPane1.setViewportView(ta_descripcion);

        panel_form.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 460, 780, 90));

        btn_buscar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_buscar.setForeground(Main_Colores.Fondo);
        btn_buscar.setText("Buscar");
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_form.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 130, 40));

        cbx_componente.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_componente.setForeground(Main_Colores.Fondo);
        cbx_componente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione componente:", "Placa Base (Motherboard)", "Procesador (CPU)", "Memoria RAM", "Almacenamiento (HDD)", "Almacenamiento (SSD)", "Tarjeta grafica (GPU)", "Fuente Alimentacion", "Monitor", "Case", "Disipador", "Ventiladores", " " }));
        panel_form.add(cbx_componente, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 55, -1, 30));

        cbx_proveedor.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_proveedor.setForeground(Main_Colores.Fondo);
        panel_form.add(cbx_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 220, 30));

        btn_registrar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btn_registrar.setForeground(Main_Colores.Fondo);
        btn_registrar.setText("Registrar");
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_form.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 154, 42));

        tf_marca.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_marca.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 140, 30));

        tf_modelo.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_modelo.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 270, 30));

        cbx_velocidad.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_velocidad.setForeground(Main_Colores.Fondo);
        panel_form.add(cbx_velocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 210, 30));

        cbx_capacidad.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        cbx_capacidad.setForeground(Main_Colores.Fondo);
        panel_form.add(cbx_capacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 220, 30));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel16.setForeground(Main_Colores.C_100);
        jLabel16.setText("Precio unitario:");
        panel_form.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 130, -1));

        tf_precioUnitario.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_precioUnitario.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_precioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 150, 30));

        jLabel18.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel18.setForeground(Main_Colores.C_100);
        jLabel18.setText("Cantidad:");
        panel_form.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        tf_cantidad.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tf_cantidad.setForeground(Main_Colores.Fondo);
        panel_form.add(tf_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 150, 30));

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel19.setForeground(Main_Colores.C_100);
        jLabel19.setText("Precio total:");
        panel_form.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 130, -1));

        tf_precioTotal.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_precioTotal.setForeground(Main_Colores.Fondo);
        tf_precioTotal.setEnabled(false);
        panel_form.add(tf_precioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 140, 30));

        panelTitle.setBackground(new java.awt.Color(51, 51, 255));
        panelTitle.setPreferredSize(new java.awt.Dimension(40, 40));
        panelTitle.setLayout(new java.awt.BorderLayout());

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btn_buscar;
    protected javax.swing.JButton btn_registrar;
    protected javax.swing.JComboBox<String> cbx_capacidad;
    protected javax.swing.JComboBox<String> cbx_componente;
    protected javax.swing.JComboBox<Proveedor> cbx_proveedor;
    protected javax.swing.JComboBox<String> cbx_velocidad;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JLabel lb_1;
    protected javax.swing.JLabel lb_2;
    protected javax.swing.JLabel lb_3;
    protected javax.swing.JLabel lb_4;
    protected javax.swing.JLabel lb_imagen;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel panel_form;
    private javax.swing.JPanel panel_main;
    protected javax.swing.JTextArea ta_descripcion;
    protected javax.swing.JTextField tf_cantidad;
    protected javax.swing.JTextField tf_marca;
    protected javax.swing.JTextField tf_modelo;
    protected javax.swing.JTextField tf_precioTotal;
    protected javax.swing.JTextField tf_precioUnitario;
    // End of variables declaration//GEN-END:variables
}
