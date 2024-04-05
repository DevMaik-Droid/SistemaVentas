package com.dev_team.controllers;

import com.dev_team.dashboard.Vista_Dashboard;

import com.dev_team.vistas.FrmMenu;

public class Main {

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {

        }
        
        Vista_Dashboard dashboard = new Vista_Dashboard();
        dashboard.setVisible(true);
        
    }

}
