/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev_team.utilidades;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author DevMaik
 */
public class ComboBoxRender extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index,
            boolean isSelected, boolean cellHasFocus) {
        JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        
        label.setBackground(isSelected ? Main_Colores.C_400 : Color.BLUE);// fondoItemCombobox
        
        label.setForeground(Main_Colores.C_300);// Texto ComboBox
        return label;
    }
}
