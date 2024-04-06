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

        PanelMid = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new org.jdesktop.swingx.JXTable();
        jLabel2 = new javax.swing.JLabel();
        cbx_filtrarGU = new javax.swing.JComboBox<>();
        tf_clave = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PanelTop = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_buscaUS = new javax.swing.JButton();
        tf_nombreGU = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new java.awt.BorderLayout());

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

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clave:");

        cbx_filtrarGU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:", "Cedula de indentidad", "Nombre", "Apellido" }));

        tf_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_claveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar:");

        PanelTop.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GESTION DE USUARIOS");
        PanelTop.add(jLabel3);

        btn_buscaUS.setText("BUSCAR");

        javax.swing.GroupLayout PanelMidLayout = new javax.swing.GroupLayout(PanelMid);
        PanelMid.setLayout(PanelMidLayout);
        PanelMidLayout.setHorizontalGroup(
            PanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMidLayout.createSequentialGroup()
                .addGroup(PanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMidLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(PanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelMidLayout.createSequentialGroup()
                                .addComponent(cbx_filtrarGU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscaUS))
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelMidLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMidLayout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addGroup(PanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelMidLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_nombreGU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelMidLayout.setVerticalGroup(
            PanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMidLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombreGU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMidLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_filtrarGU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscaUS)))
                    .addGroup(PanelMidLayout.createSequentialGroup()
                        .addComponent(tf_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
