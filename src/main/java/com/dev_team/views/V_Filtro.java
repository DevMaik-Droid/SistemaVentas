/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dev_team.views;

import com.dev_team.dashboard.Vista_Dashboard;
import com.dev_team.models.Usuario;

/**
 *
 * @author DevMaik
 */
public class V_Filtro extends javax.swing.JFrame {

    private Usuario user;
    
    public V_Filtro(Usuario us) {
        initComponents();
        this.user = us;
        lb_saludo.setText(user.getNivel() + " - " + user.getNombre());
        init();
    }

    private void init() {
        if(true){
            Vista_Dashboard vista_Dashboard = new Vista_Dashboard(user);
        }
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lb_saludo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("ADMINISTRATIVA");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 190, 190));

        jButton2.setText("jButton1");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 210, 190));

        jButton3.setText("jButton1");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 200, 180));

        jButton4.setText("GENERAL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 200, 194));

        lb_saludo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_saludo.setForeground(new java.awt.Color(255, 255, 255));
        lb_saludo.setText("GGGG");
        jPanel1.add(lb_saludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Vista_Dashboard v = new Vista_Dashboard(user);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_saludo;
    // End of variables declaration//GEN-END:variables

}
