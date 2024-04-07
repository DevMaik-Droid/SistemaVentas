package com.dev_team.views;

import com.dev_team.utilidades.JButtonRound;
import com.dev_team.utilidades.Main_Colores;
import java.awt.Dimension;

/**
 *
 * @author Usuario
 */
public class D_AdmiAccesorios extends javax.swing.JDialog {

    /**
     * Creates new form D_AdmiAccesorios
     * @param parent
     */
    public D_AdmiAccesorios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(new Dimension(800,550));
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
        lb_imagenAccesorio = new javax.swing.JLabel();
        btn_buscar = new JButtonRound("Guardar",30);
        jLabel13 = new javax.swing.JLabel();
        cbx_modeloA = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbx_materialA = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbx_marcaA = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbx_conectividadA = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbx_versionA = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbx_compatibilidadA = new javax.swing.JComboBox<>();
        tf_nombreA = new javax.swing.JTextField();
        btn_buscar1 = new JButtonRound("Editar",30);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabel2.setForeground(Main_Colores.C_100);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACCESORIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 190, 20));

        lb_imagenAccesorio.setBackground(new java.awt.Color(255, 255, 255));
        lb_imagenAccesorio.setOpaque(true);
        getContentPane().add(lb_imagenAccesorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 191, 196));

        btn_buscar.setText("Guardar");
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 130, 30));

        jLabel13.setFont(new java.awt.Font("Questrian", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ADMINISTRAR ACCESORIOS");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 350, 50));

        getContentPane().add(cbx_modeloA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Material:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        cbx_materialA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_materialAActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_materialA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 230, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        getContentPane().add(cbx_marcaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Conectividad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        getContentPane().add(cbx_conectividadA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 200, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Version:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        cbx_versionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_versionAActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_versionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 230, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Compatibilidad:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        getContentPane().add(cbx_compatibilidadA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 230, 30));
        getContentPane().add(tf_nombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 30));

        btn_buscar1.setText("Editar");
        getContentPane().add(btn_buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_materialAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_materialAActionPerformed

    }//GEN-LAST:event_cbx_materialAActionPerformed

    private void cbx_versionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_versionAActionPerformed

    }//GEN-LAST:event_cbx_versionAActionPerformed

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
            java.util.logging.Logger.getLogger(D_AdmiAccesorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_AdmiAccesorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_AdmiAccesorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_AdmiAccesorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                D_AdmiAccesorios dialog = new D_AdmiAccesorios(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_buscar1;
    private javax.swing.JComboBox<String> cbx_compatibilidadA;
    private javax.swing.JComboBox<String> cbx_conectividadA;
    private javax.swing.JComboBox<String> cbx_marcaA;
    private javax.swing.JComboBox<String> cbx_materialA;
    private javax.swing.JComboBox<String> cbx_modeloA;
    private javax.swing.JComboBox<String> cbx_versionA;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_imagenAccesorio;
    private javax.swing.JTextField tf_nombreA;
    // End of variables declaration//GEN-END:variables
}
