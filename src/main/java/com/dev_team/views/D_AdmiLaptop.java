/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.dev_team.views;

import java.awt.Dimension;

/**
 *
 * @author Usuario
 */
public class D_AdmiLaptop extends javax.swing.JDialog {

    /**
     * Creates new form D_AdmiLaptop
     */
    public D_AdmiLaptop(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(new Dimension(800, 550));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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
        btn_buscarLP1 = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Laptop");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 200, 20));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 200, 170));

        jLabel13.setFont(new java.awt.Font("Questrian", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ADMINISTRAR LAPTOP");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 270, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Memoria ram:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Conectividad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        getContentPane().add(cbx_memoriaRamLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pantalla:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Procesador:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, -1));

        cbx_procesadorLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_procesadorLPActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_procesadorLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Disco de almacenamiento:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, -1));

        getContentPane().add(cbx_discoDeAlmacenamientoLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 200, 30));
        getContentPane().add(tf_modeloLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 200, 30));
        getContentPane().add(tf_conectividadLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Modelo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));
        getContentPane().add(tf_pantallaLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 200, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Bateria:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));
        getContentPane().add(tf_nombreLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, 30));
        getContentPane().add(tf_bateriaLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 200, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Precio:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 60, -1));
        getContentPane().add(tf_precioLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 130, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 210, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Proveedor:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));
        getContentPane().add(tf_nombreC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 210, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cantidad:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        btn_buscarLP1.setText("Buscar");
        getContentPane().add(btn_buscarLP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 130, -1));

        btn_buscar.setText("Guardar");
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_procesadorLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_procesadorLPActionPerformed

    }//GEN-LAST:event_cbx_procesadorLPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(D_AdmiLaptop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_AdmiLaptop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_AdmiLaptop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_AdmiLaptop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                D_AdmiLaptop dialog = new D_AdmiLaptop(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscarLP1;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tf_bateriaLP;
    private javax.swing.JTextField tf_conectividadLP;
    private javax.swing.JTextField tf_modeloLP;
    private javax.swing.JTextField tf_nombreC1;
    private javax.swing.JTextField tf_nombreLP;
    private javax.swing.JTextField tf_pantallaLP;
    private javax.swing.JTextField tf_precioLP;
    // End of variables declaration//GEN-END:variables
}