/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev_team.utilidades;

import java.awt.Color;
import java.awt.Component;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

import javax.swing.JTable;
import javax.swing.SwingConstants;


import org.jdesktop.swingx.renderer.DefaultTableRenderer;

/**
 *
 * @author DevMaik
 */
public class Perzonalizar_Celdas extends DefaultTableRenderer {

    
    
    private Font font_sustom = new Font("Verdana",Font.PLAIN,14);
    public Perzonalizar_Celdas() {
        super();

    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        label.setFont(font_sustom);
        
        if (column != 1 && column != 2) {
            label.setHorizontalAlignment(JLabel.CENTER);
        } else {
            label.setHorizontalAlignment(JLabel.LEADING);
        }
        
        if (value instanceof String) {
            String dato = String.valueOf(value);
            switch (dato) {
                case "Activo" ->
                    label.setBackground(new Color(153, 255, 153)); // Verde claro para "Activo"
                case "Inactivo" ->
                    label.setBackground(new Color(255, 153, 153)); // Rojo claro para "Inactivo"
                case "Ausente" ->
                    label.setBackground(new Color(255, 255, 153)); // Rojo claro para "Inactivo"
                default ->
                    label.setBackground(table.getBackground()); // Fondo por defecto de la tabla
            }
        }
        label.setBorder(BorderFactory.createEmptyBorder());
        return label;

    }

}
