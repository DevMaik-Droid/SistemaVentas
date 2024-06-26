/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.dev_team.views;

import com.dev_team.utilidades.GradientDialog;
import com.dev_team.utilidades.Main_Colores;
import java.awt.Dimension;

/**
 *
 * @author Usuario
 */
public class D_AdmiLaptop extends GradientDialog {

    /**
     * Creates new form D_AdmiLaptop
     */
    public D_AdmiLaptop(java.awt.Frame parent, boolean modal) {
        super(modal, Main_Colores.Fondo, Main_Colores.C_F800, Main_Colores.C_F700);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cbx_discoDeAlmacenamientoLP = new javax.swing.JComboBox<>();
        cbx_memoriaRamLP = new javax.swing.JComboBox<>();
        cbx_procesadorLP = new javax.swing.JComboBox<>();
        cbx_proveedor = new javax.swing.JComboBox<>();
        tf_precioLP = new javax.swing.JTextField();
        tf_modeloLP = new javax.swing.JTextField();
        tf_conectividadLP = new javax.swing.JTextField();
        tf_pantallaLP = new javax.swing.JTextField();
        tf_nombreLP = new javax.swing.JTextField();
        tf_bateriaLP = new javax.swing.JTextField();
        tf_cantidad = new javax.swing.JTextField();
        btn_editar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ADMINISTRAR LAPTOP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 20, 270, 50);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Laptop");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 90, 200, 20);

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Conectividad:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 220, 97, 20);

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Pantalla:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 280, 65, 20);

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 90, 63, 20);

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Modelo:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(270, 90, 57, 20);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Memoria ram:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(270, 160, 102, 20);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(550, 120, 200, 170);

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Disco de almacenamiento:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 220, 200, 20);

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Procesador:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 160, 90, 20);

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Bateria:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(270, 280, 57, 20);

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Precio:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(580, 380, 60, 20);

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Proveedor:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(40, 380, 81, 20);

        jLabel18.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Cantidad:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(310, 380, 68, 20);

        cbx_discoDeAlmacenamientoLP.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbx_discoDeAlmacenamientoLP.setForeground(Main_Colores.Fondo);
        cbx_discoDeAlmacenamientoLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_discoDeAlmacenamientoLPActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_discoDeAlmacenamientoLP);
        cbx_discoDeAlmacenamientoLP.setBounds(30, 240, 200, 30);

        cbx_memoriaRamLP.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbx_memoriaRamLP.setForeground(Main_Colores.Fondo);
        getContentPane().add(cbx_memoriaRamLP);
        cbx_memoriaRamLP.setBounds(270, 180, 200, 30);

        cbx_procesadorLP.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbx_procesadorLP.setForeground(Main_Colores.Fondo);
        cbx_procesadorLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_procesadorLPActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_procesadorLP);
        cbx_procesadorLP.setBounds(30, 180, 200, 30);

        cbx_proveedor.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbx_proveedor.setForeground(Main_Colores.Fondo);
        cbx_proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:" }));
        cbx_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_proveedorActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_proveedor);
        cbx_proveedor.setBounds(40, 400, 210, 30);

        tf_precioLP.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_precioLP.setForeground(Main_Colores.Fondo);
        getContentPane().add(tf_precioLP);
        tf_precioLP.setBounds(580, 400, 130, 30);

        tf_modeloLP.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_modeloLP.setForeground(Main_Colores.Fondo);
        getContentPane().add(tf_modeloLP);
        tf_modeloLP.setBounds(270, 110, 200, 30);

        tf_conectividadLP.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_conectividadLP.setForeground(Main_Colores.Fondo);
        getContentPane().add(tf_conectividadLP);
        tf_conectividadLP.setBounds(270, 240, 200, 30);

        tf_pantallaLP.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_pantallaLP.setForeground(Main_Colores.Fondo);
        getContentPane().add(tf_pantallaLP);
        tf_pantallaLP.setBounds(30, 300, 200, 30);

        tf_nombreLP.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_nombreLP.setForeground(Main_Colores.Fondo);
        getContentPane().add(tf_nombreLP);
        tf_nombreLP.setBounds(30, 110, 200, 30);

        tf_bateriaLP.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_bateriaLP.setForeground(Main_Colores.Fondo);
        getContentPane().add(tf_bateriaLP);
        tf_bateriaLP.setBounds(270, 300, 200, 30);

        tf_cantidad.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_cantidad.setForeground(Main_Colores.Fondo);
        getContentPane().add(tf_cantidad);
        tf_cantidad.setBounds(310, 400, 210, 30);

        btn_editar.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btn_editar.setForeground(Main_Colores.Fondo);
        btn_editar.setText("Editar");
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_editar);
        btn_editar.setBounds(580, 300, 130, 26);

        btn_buscar.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btn_buscar.setForeground(Main_Colores.Fondo);
        btn_buscar.setText("Guardar");
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_buscar);
        btn_buscar.setBounds(340, 460, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_procesadorLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_procesadorLPActionPerformed

    }//GEN-LAST:event_cbx_procesadorLPActionPerformed

    private void cbx_discoDeAlmacenamientoLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_discoDeAlmacenamientoLPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_discoDeAlmacenamientoLPActionPerformed

    private void cbx_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_proveedorActionPerformed

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
    private javax.swing.JButton btn_editar;
    private javax.swing.JComboBox<String> cbx_discoDeAlmacenamientoLP;
    private javax.swing.JComboBox<String> cbx_memoriaRamLP;
    private javax.swing.JComboBox<String> cbx_procesadorLP;
    private javax.swing.JComboBox<String> cbx_proveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField tf_cantidad;
    private javax.swing.JTextField tf_conectividadLP;
    private javax.swing.JTextField tf_modeloLP;
    private javax.swing.JTextField tf_nombreLP;
    private javax.swing.JTextField tf_pantallaLP;
    private javax.swing.JTextField tf_precioLP;
    // End of variables declaration//GEN-END:variables
}
