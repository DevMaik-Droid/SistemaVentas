/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.dev_team.views;

import com.dev_team.utilidades.GradientDialog;
import com.dev_team.utilidades.JButtonRound;
import com.dev_team.utilidades.Main_Colores;
import java.awt.Dimension;

/**
 *
 * @author Usuario
 */
public class D_AdmiComponentes extends GradientDialog {

    /**
     * Creates new form D_AdmiComponentes
     */
    public D_AdmiComponentes(java.awt.Frame parent, boolean modal) {
        super(modal, Main_Colores.Fondo,Main_Colores.C_F800,Main_Colores.C_F700);
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

        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbx_marcaC = new javax.swing.JComboBox<>();
        cbx_tipoC = new javax.swing.JComboBox<>();
        cbx_modeloC = new javax.swing.JComboBox<>();
        cbx_capacidadC = new javax.swing.JComboBox<>();
        cbx_velocidadC = new javax.swing.JComboBox<>();
        tf_nombreC1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btn_buscarC1 = new JButtonRound("Editar",30);
        btn_buscar = new JButtonRound("Guardar",30);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("ADMINISTRAR COMPONENTES");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 360, 50));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Componente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 200, 20));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Marca:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Modelo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Componente:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Proveedor:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 20));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Tipo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 200, 160));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Velocidad:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Capacidad:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Cantidad:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, 20));

        cbx_marcaC.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbx_marcaC.setForeground(Main_Colores.Fondo);
        getContentPane().add(cbx_marcaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, 30));

        cbx_tipoC.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbx_tipoC.setForeground(Main_Colores.Fondo);
        cbx_tipoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tipoCActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_tipoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 30));

        cbx_modeloC.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbx_modeloC.setForeground(Main_Colores.Fondo);
        getContentPane().add(cbx_modeloC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, 30));

        cbx_capacidadC.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbx_capacidadC.setForeground(Main_Colores.Fondo);
        cbx_capacidadC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_capacidadCActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_capacidadC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 230, 30));

        cbx_velocidadC.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbx_velocidadC.setForeground(Main_Colores.Fondo);
        getContentPane().add(cbx_velocidadC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 230, 30));

        tf_nombreC1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_nombreC1.setForeground(Main_Colores.Fondo);
        getContentPane().add(tf_nombreC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 210, 30));

        jComboBox1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jComboBox1.setForeground(Main_Colores.Fondo);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 210, 30));

        jComboBox2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jComboBox2.setForeground(Main_Colores.Fondo);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 210, 30));

        btn_buscarC1.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btn_buscarC1.setForeground(Main_Colores.Fondo);
        btn_buscarC1.setText("Editar");
        btn_buscarC1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_buscarC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 130, -1));

        btn_buscar.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btn_buscar.setForeground(Main_Colores.Fondo);
        btn_buscar.setText("Guardar");
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_tipoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tipoCActionPerformed

    }//GEN-LAST:event_cbx_tipoCActionPerformed

    private void cbx_capacidadCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_capacidadCActionPerformed

    }//GEN-LAST:event_cbx_capacidadCActionPerformed

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
            java.util.logging.Logger.getLogger(D_AdmiComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_AdmiComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_AdmiComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_AdmiComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                D_AdmiComponentes dialog = new D_AdmiComponentes(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_buscarC1;
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tf_nombreC1;
    // End of variables declaration//GEN-END:variables
}
