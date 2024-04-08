package com.dev_team.views;

import com.dev_team.utilidades.JButtonRound;
import com.dev_team.utilidades.Main_Colores;
import com.dev_team.utilidades.Panel_Round;
import javax.swing.JPanel;


public class V_RegistrarLaptop extends JPanel {

    /**
     * Creates new form V_RegistrarUsuario
     */
    public V_RegistrarLaptop()  {
        initComponents();
        setBackground(Main_Colores.Fondo_2);
        
    }

    
    private void iniciarComponentes(){
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_form = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descripcionLaptop = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        btn_buscarLP = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbx_memoriaRamLP = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbx_procesadorLP = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbx_discoDeAlmacenamientoLP = new javax.swing.JComboBox<>();
        tf_modeloLP = new javax.swing.JTextField();
        btn_registrarLP = new JButtonRound("REGISTRAR",30);
        tf_conectividadLP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_pantallaLP = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_nombreLP = new javax.swing.JTextField();
        tf_bateriaLP = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf_precioLP = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        tf_nombreC1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_form.setOpaque(false);
        panel_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Laptop");
        panel_form.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 200, 20));

        jLabel6.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descripcion:");
        panel_form.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 180, -1));

        ta_descripcionLaptop.setColumns(20);
        ta_descripcionLaptop.setRows(5);
        ta_descripcionLaptop.setBorder(null);
        jScrollPane1.setViewportView(ta_descripcionLaptop);

        panel_form.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 580, 90));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setOpaque(true);
        panel_form.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 200, 170));

        btn_buscarLP.setText("Buscar");
        panel_form.add(btn_buscarLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 130, -1));

        jLabel13.setFont(new java.awt.Font("Questrian", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("REGISTRAR LAPTOP");
        panel_form.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 360, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre:");
        panel_form.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Memoria ram:");
        panel_form.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Conectividad:");
        panel_form.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        panel_form.add(cbx_memoriaRamLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pantalla:");
        panel_form.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Procesador:");
        panel_form.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 90, -1));

        cbx_procesadorLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_procesadorLPActionPerformed(evt);
            }
        });
        panel_form.add(cbx_procesadorLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 200, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Disco de almacenamiento:");
        panel_form.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 190, -1));

        panel_form.add(cbx_discoDeAlmacenamientoLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 200, 30));
        panel_form.add(tf_modeloLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 200, 30));

        btn_registrarLP.setText("REGISTRAR");
        panel_form.add(btn_registrarLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 150, 40));
        panel_form.add(tf_conectividadLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Modelo:");
        panel_form.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));
        panel_form.add(tf_pantallaLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 200, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Bateria:");
        panel_form.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));
        panel_form.add(tf_nombreLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 200, 30));
        panel_form.add(tf_bateriaLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 200, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Precio:");
        panel_form.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 60, -1));
        panel_form.add(tf_precioLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 150, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:" }));
        panel_form.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 210, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Proveedor:");
        panel_form.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));
        panel_form.add(tf_nombreC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 210, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cantidad:");
        panel_form.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        add(panel_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 15, 951, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_procesadorLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_procesadorLPActionPerformed

    }//GEN-LAST:event_cbx_procesadorLPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarLP;
    private javax.swing.JButton btn_registrarLP;
    private javax.swing.JComboBox<String> cbx_discoDeAlmacenamientoLP;
    private javax.swing.JComboBox<String> cbx_memoriaRamLP;
    private javax.swing.JComboBox<String> cbx_procesadorLP;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel panel_form;
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
