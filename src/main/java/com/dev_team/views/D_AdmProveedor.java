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
public class D_AdmProveedor extends GradientDialog {

    /**
     * Creates new form D_AdmUsuario
     */
    public D_AdmProveedor(java.awt.Frame parent, boolean modal) {     
        super(modal, Main_Colores.C_600, Main_Colores.C_500, Main_Colores.C_400);
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
        tf_nombre = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        tf_contacto = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        dc_fechaRegistro = new com.toedter.calendar.JDateChooser();
        cbx_estado = new javax.swing.JComboBox<>();
        tf_clave = new javax.swing.JTextField();
        tf_direccionproveedor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_historialTransacciones = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        cbx_estadoDePago = new javax.swing.JComboBox<>();
        tf_productoSum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel1.setText("ADMINISTRAR PROVEEDOR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 10, 270, 32);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel2.setText("Clave: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 70, 60, 18);

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 160, 70, 18);

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 200, 38, 18);

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel6.setText("Producto suministrado:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 310, 160, 20);

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setText("Contacto:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 240, 90, 18);

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel8.setText("Direccion:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(260, 240, 64, 18);

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel12.setText("Estado:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(70, 380, 46, 18);
        getContentPane().add(tf_nombre);
        tf_nombre.setBounds(130, 150, 240, 26);
        getContentPane().add(tf_email);
        tf_email.setBounds(130, 190, 240, 26);
        getContentPane().add(tf_contacto);
        tf_contacto.setBounds(70, 270, 170, 26);

        btn_guardar.setText("GUARDAR");
        getContentPane().add(btn_guardar);
        btn_guardar.setBounds(380, 450, 120, 30);

        dc_fechaRegistro.setDateFormatString("dd - MMM - YYYY");
        getContentPane().add(dc_fechaRegistro);
        dc_fechaRegistro.setBounds(70, 340, 170, 26);

        cbx_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:", "Activo", "Inactivo" }));
        getContentPane().add(cbx_estado);
        cbx_estado.setBounds(70, 410, 170, 26);

        tf_clave.setEnabled(false);
        getContentPane().add(tf_clave);
        tf_clave.setBounds(60, 100, 90, 26);
        getContentPane().add(tf_direccionproveedor);
        tf_direccionproveedor.setBounds(260, 270, 170, 26);

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel14.setText("Fecha de registro:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(70, 310, 160, 20);

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel15.setText("Historial de transacciones:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(550, 90, 240, 18);

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
        jScrollPane1.setViewportView(tb_historialTransacciones);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(470, 120, 350, 260);

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel16.setText("Estado de pago:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(210, 70, 120, 18);

        cbx_estadoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion:", "Completo", "Pendiente", "Parcialmente pagado" }));
        cbx_estadoDePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_estadoDePagoActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_estadoDePago);
        cbx_estadoDePago.setBounds(210, 100, 180, 26);
        getContentPane().add(tf_productoSum);
        tf_productoSum.setBounds(260, 340, 170, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_estadoDePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_estadoDePagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_estadoDePagoActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_historialTransacciones;
    private javax.swing.JTextField tf_clave;
    private javax.swing.JTextField tf_contacto;
    private javax.swing.JTextField tf_direccionproveedor;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_productoSum;
    // End of variables declaration//GEN-END:variables
}
