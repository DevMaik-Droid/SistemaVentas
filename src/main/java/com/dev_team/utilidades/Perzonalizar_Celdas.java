/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev_team.utilidades;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author DevMaik
 */
public class Perzonalizar_Celdas extends DefaultTableCellRenderer {

    private final Font normal = new Font("Arial", Font.BOLD, 15);
 

    public Perzonalizar_Celdas() {
        setOpaque(true);
        setFont(normal);
        setHorizontalAlignment(SwingConstants.CENTER); // Centrar el texto dentro de las celdas
        
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        if (row == 0) {
            ((JComponent) c).setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        } else {
            ((JComponent) c).setBorder(BorderFactory.createEmptyBorder(1, 0, 0, 0));
        }
        c.setFont(normal);
        return c;
    }

    

}
