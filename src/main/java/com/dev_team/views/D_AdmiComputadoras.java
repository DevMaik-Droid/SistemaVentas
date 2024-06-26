package com.dev_team.views;
import com.dev_team.utilidades.GradientDialog;
import com.dev_team.utilidades.JButtonRound;
import com.dev_team.utilidades.Main_Colores;
import java.awt.Dimension;

public class D_AdmiComputadoras extends GradientDialog {

    public D_AdmiComputadoras(java.awt.Frame parent, boolean modal) {
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
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_buscar = new JButtonRound("Editar",30);
        cbx_modeloCO = new javax.swing.JComboBox<>();
        cbx_ramCO = new javax.swing.JComboBox<>();
        cbx_tarjetaMadreCO = new javax.swing.JComboBox<>();
        cbx_pantallaC = new javax.swing.JComboBox<>();
        cbx_procesadorCO = new javax.swing.JComboBox<>();
        cbx_discoCO = new javax.swing.JComboBox<>();
        cbx_caseCO = new javax.swing.JComboBox<>();
        tf_nombreCO = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btn_buscar1 = new JButtonRound("Guardar",30);

        jLabel13.setFont(new java.awt.Font("Questrian", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ADMINISTRAR COMPONENTES");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Computadora");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(560, 90, 190, 20);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(560, 120, 191, 196);

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Modelo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 230, 57, 20);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Ram:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(280, 170, 37, 20);

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Tarjeta Madre:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 160, 105, 30);

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Pantalla:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 290, 65, 20);

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Procesador:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(280, 230, 89, 20);

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Disco:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(280, 290, 44, 20);

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Case:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 350, 40, 20);

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Nombre:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(30, 70, 63, 20);

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Precio real:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(280, 370, 85, 20);

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Precio total:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(280, 410, 88, 20);

        btn_buscar.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btn_buscar.setForeground(Main_Colores.Fondo);
        btn_buscar.setText("Editar");
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_buscar);
        btn_buscar.setBounds(590, 330, 130, 30);

        cbx_modeloCO.setForeground(Main_Colores.Fondo);
        getContentPane().add(cbx_modeloCO);
        cbx_modeloCO.setBounds(30, 250, 200, 30);

        cbx_ramCO.setForeground(Main_Colores.Fondo);
        cbx_ramCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_ramCOActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_ramCO);
        cbx_ramCO.setBounds(280, 190, 230, 30);

        cbx_tarjetaMadreCO.setForeground(Main_Colores.Fondo);
        getContentPane().add(cbx_tarjetaMadreCO);
        cbx_tarjetaMadreCO.setBounds(30, 190, 200, 30);

        cbx_pantallaC.setForeground(Main_Colores.Fondo);
        getContentPane().add(cbx_pantallaC);
        cbx_pantallaC.setBounds(30, 310, 200, 30);

        cbx_procesadorCO.setForeground(Main_Colores.Fondo);
        cbx_procesadorCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_procesadorCOActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_procesadorCO);
        cbx_procesadorCO.setBounds(280, 250, 230, 30);

        cbx_discoCO.setForeground(Main_Colores.Fondo);
        getContentPane().add(cbx_discoCO);
        cbx_discoCO.setBounds(280, 310, 230, 30);

        cbx_caseCO.setForeground(Main_Colores.Fondo);
        getContentPane().add(cbx_caseCO);
        cbx_caseCO.setBounds(30, 370, 200, 30);

        tf_nombreCO.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tf_nombreCO.setForeground(Main_Colores.Fondo);
        getContentPane().add(tf_nombreCO);
        tf_nombreCO.setBounds(30, 100, 210, 30);

        jTextField7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTextField7.setForeground(Main_Colores.Fondo);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(370, 400, 150, 30);

        jTextField5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTextField5.setForeground(Main_Colores.Fondo);
        jTextField5.setEnabled(false);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(370, 360, 150, 30);

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("ADMINISTRAR COMPUTADORA");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(240, 20, 370, 50);

        btn_buscar1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btn_buscar1.setForeground(Main_Colores.Fondo);
        btn_buscar1.setText("Guardar");
        btn_buscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_buscar1);
        btn_buscar1.setBounds(340, 450, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_ramCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_ramCOActionPerformed

    }//GEN-LAST:event_cbx_ramCOActionPerformed

    private void cbx_procesadorCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_procesadorCOActionPerformed

    }//GEN-LAST:event_cbx_procesadorCOActionPerformed

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
            java.util.logging.Logger.getLogger(D_AdmiComputadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_AdmiComputadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_AdmiComputadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_AdmiComputadoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                D_AdmiComputadoras dialog = new D_AdmiComputadoras(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cbx_caseCO;
    private javax.swing.JComboBox<String> cbx_discoCO;
    private javax.swing.JComboBox<String> cbx_modeloCO;
    private javax.swing.JComboBox<String> cbx_pantallaC;
    private javax.swing.JComboBox<String> cbx_procesadorCO;
    private javax.swing.JComboBox<String> cbx_ramCO;
    private javax.swing.JComboBox<String> cbx_tarjetaMadreCO;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField tf_nombreCO;
    // End of variables declaration//GEN-END:variables
}
