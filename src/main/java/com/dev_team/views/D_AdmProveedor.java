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
public class D_AdmProveedor extends GradientDialog {

    /**
     * Creates new form D_AdmUsuario
     */
    public D_AdmProveedor(java.awt.Frame parent, boolean modal) {     
        super(modal, Main_Colores.Fondo,Main_Colores.C_F800,Main_Colores.C_F700);
        initComponents();
        setSize(new Dimension(860, 535));
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        tf_contacto = new javax.swing.JTextField();
        tf_direccionproveedor = new javax.swing.JTextField();
        tf_productoSum = new javax.swing.JTextField();
        tf_clave = new javax.swing.JTextField();
        btn_guardar = new JButtonRound("GUARDAR",30);
        cbx_estadoDePago = new javax.swing.JComboBox<>();
        cbx_estado = new javax.swing.JComboBox<>();
        dc_fechaRegistro = new com.toedter.calendar.JDateChooser();
        tb_historial_transacciones = new javax.swing.JScrollPane();
        tb_historialTransacciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ADMINISTRAR PROVEEDOR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 20, 330, 32);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Clave: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 60, 20);

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 150, 70, 20);

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 190, 46, 20);

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Producto suministrado:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 310, 190, 20);

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Contacto:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 240, 90, 20);

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Direccion:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(230, 240, 73, 20);

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Estado:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 380, 54, 20);

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Fecha de registro:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(30, 310, 160, 20);

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Historial de transacciones:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(500, 90, 230, 18);

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Estado de pago:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(170, 70, 120, 20);

        tf_nombre.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_nombre.setForeground(Main_Colores.Fondo);
        getContentPane().add(tf_nombre);
        tf_nombre.setBounds(110, 146, 260, 30);

        tf_email.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_email.setForeground(Main_Colores.Fondo);
        getContentPane().add(tf_email);
        tf_email.setBounds(110, 186, 260, 30);

        tf_contacto.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_contacto.setForeground(Main_Colores.Fondo);
        getContentPane().add(tf_contacto);
        tf_contacto.setBounds(30, 266, 170, 30);

        tf_direccionproveedor.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_direccionproveedor.setForeground(Main_Colores.Fondo);
        getContentPane().add(tf_direccionproveedor);
        tf_direccionproveedor.setBounds(230, 266, 170, 30);

        tf_productoSum.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_productoSum.setForeground(Main_Colores.Fondo);
        tf_productoSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_productoSumActionPerformed(evt);
            }
        });
        getContentPane().add(tf_productoSum);
        tf_productoSum.setBounds(230, 336, 170, 30);

        tf_clave.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_clave.setForeground(Main_Colores.Fondo);
        tf_clave.setEnabled(false);
        getContentPane().add(tf_clave);
        tf_clave.setBounds(30, 90, 100, 26);

        btn_guardar.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btn_guardar.setForeground(Main_Colores.Fondo);
        btn_guardar.setText("GUARDAR");
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_guardar);
        btn_guardar.setBounds(350, 450, 120, 30);

        cbx_estadoDePago.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbx_estadoDePago.setForeground(Main_Colores.Fondo);
        cbx_estadoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:", "Completo", "Pendiente", "Parcialmente pagado" }));
        cbx_estadoDePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_estadoDePagoActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_estadoDePago);
        cbx_estadoDePago.setBounds(170, 90, 180, 30);

        cbx_estado.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbx_estado.setForeground(Main_Colores.Fondo);
        cbx_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:", "Activo", "Inactivo" }));
        cbx_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_estadoActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_estado);
        cbx_estado.setBounds(30, 410, 180, 30);

        dc_fechaRegistro.setForeground(Main_Colores.Fondo);
        dc_fechaRegistro.setDateFormatString("dd - MMM - YYYY");
        dc_fechaRegistro.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        getContentPane().add(dc_fechaRegistro);
        dc_fechaRegistro.setBounds(30, 334, 170, 30);

        tb_historialTransacciones.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tb_historialTransacciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_historial_transacciones.setViewportView(tb_historialTransacciones);

        getContentPane().add(tb_historial_transacciones);
        tb_historial_transacciones.setBounds(420, 120, 400, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_estadoDePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_estadoDePagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_estadoDePagoActionPerformed

    private void tf_productoSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_productoSumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_productoSumActionPerformed

    private void cbx_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_estadoActionPerformed

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
            java.util.logging.Logger.getLogger(D_AdmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_AdmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_AdmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_AdmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                D_AdmProveedor dialog = new D_AdmProveedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> cbx_estado;
    private javax.swing.JComboBox<String> cbx_estadoDePago;
    protected com.toedter.calendar.JDateChooser dc_fechaRegistro;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTable tb_historialTransacciones;
    private javax.swing.JScrollPane tb_historial_transacciones;
    private javax.swing.JTextField tf_clave;
    private javax.swing.JTextField tf_contacto;
    private javax.swing.JTextField tf_direccionproveedor;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_productoSum;
    // End of variables declaration//GEN-END:variables
}
