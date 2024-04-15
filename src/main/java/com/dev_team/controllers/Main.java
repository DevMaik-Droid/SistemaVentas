package com.dev_team.controllers;

import com.dev_team.dashboard.Vista_Dashboard;


public class Main {

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ignored) {

        }
        
        Vista_Dashboard login = new Vista_Dashboard();
        login.setVisible(true);
        
    }

}
