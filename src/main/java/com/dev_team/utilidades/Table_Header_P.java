/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev_team.utilidades;

import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author DevMaik
 */
public class Table_Header_P implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
   
        JComponent componente = null;
        if( value instanceof String){
            componente = new JLabel(value.toString());
            ((JLabel)componente).setHorizontalAlignment(SwingConstants.CENTER);
            componente.setSize(100, 50);
        }
        
        // Personzalitar todo
        
        
        
        return componente;
    }
    
    
    
    
}
