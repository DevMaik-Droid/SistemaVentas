package com.dev_team.views;


import com.dev_team.utilidades.Gradient;
import com.dev_team.utilidades.Main_Colores;

public class V_GestionarUsuario extends Gradient {

    /**
     * Creates new form V_RegistrarUsuariodasdas
     */
    public V_GestionarUsuario() {
        super(Main_Colores.C_600, Main_Colores.C_500, Main_Colores.C_400);
        initComponents();
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTop = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbx_filtrarGU = new javax.swing.JComboBox<>();
        tf_clave = new javax.swing.JTextField();
        btn_buscaUS = new javax.swing.JButton();
        tf_nombreGU = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelMid = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new org.jdesktop.swingx.JXTable();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new java.awt.BorderLayout());

        PanelTop.setOpaque(false);
        PanelTop.setPreferredSize(new java.awt.Dimension(1070, 159));
        PanelTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GESTION DE USUARIOS");
        PanelTop.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        cbx_filtrarGU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:", "Cedula de indentidad", "Nombre", "Apellido" }));
        PanelTop.add(cbx_filtrarGU, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        tf_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_claveActionPerformed(evt);
            }
        });
        PanelTop.add(tf_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 130, -1));

        btn_buscaUS.setText("BUSCAR");
        PanelTop.add(btn_buscaUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));
        PanelTop.add(tf_nombreGU, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 170, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clave:");
        PanelTop.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar:");
        PanelTop.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        add(PanelTop, java.awt.BorderLayout.PAGE_START);

        PanelMid.setOpaque(false);

        tabla_usuarios.setBackground(new java.awt.Color(255, 255, 255));
        tabla_usuarios.setForeground(new java.awt.Color(51, 51, 51));
        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"rtdfg", "dfgdfg", "dfgdfg", "dfgdfg"},
                {"dfgdf", "dfgdfg", "dfgdfg", "dfgdfgdf"},
                {"eeeeee", "sssss", "dfgsss", "dfgdfg"},
                {"dfgdfg", "dfgdf", "dfgdf", "dfgdf"}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_usuarios.setColumnControlVisible(true);
        tabla_usuarios.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_usuarios.setIntercellSpacing(new java.awt.Dimension(10, 0));
        jScrollPane1.setViewportView(tabla_usuarios);

        javax.swing.GroupLayout PanelMidLayout = new javax.swing.GroupLayout(PanelMid);
        PanelMid.setLayout(PanelMidLayout);
        PanelMidLayout.setHorizontalGroup(
            PanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMidLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        PanelMidLayout.setVerticalGroup(
            PanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMidLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        add(PanelMid, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_claveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMid;
    private javax.swing.JPanel PanelTop;
    protected javax.swing.JButton btn_buscaUS;
    private javax.swing.JComboBox<String> cbx_filtrarGU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    protected org.jdesktop.swingx.JXTable tabla_usuarios;
    protected javax.swing.JTextField tf_clave;
    private javax.swing.JTextField tf_nombreGU;
    // End of variables declaration//GEN-END:variables
}
