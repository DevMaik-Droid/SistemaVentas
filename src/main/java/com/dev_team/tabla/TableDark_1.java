package com.dev_team.tabla;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class TableDark_1 extends JTable{

    static void fixtable(JScrollPane jScrollPane1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public TableDark_1() {
        getTableHeader().setDefaultRenderer(new TableDarkHeader());
        getTableHeader().setPreferredSize(new Dimension(0, 35));
        setDefaultRenderer(Object.class, new TableDarkCell());
        setRowHeight(30); //tamaño de la fila
    }
    
    public void fixTable(JScrollPane scroll){
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel  panel= new JPanel();
        panel.setBackground(new Color(30,30,30));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
        scroll.getViewport().setBackground(new Color(30,30,30));
        scroll.setBorder(BorderFactory.createLineBorder(new Color(60,60,60), 2));
    }
    
    //cabeza
    private class TableDarkHeader extends DefaultTableCellRenderer{

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            com.setBackground(new Color(30,30,30));
            com.setForeground(new Color(200, 200, 200));
            com.setFont(com.getFont().deriveFont(Font.BOLD, 12));
            return com;
        }
    }
    //celda
    private class TableDarkCell extends DefaultTableCellRenderer{

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (isCellSelected(row, column)) {
                if (row%2==0) {
                    com.setBackground(new Color(70, 0, 91));
                } else {
                    com.setBackground(new Color(78, 24, 130));
                }
            }else{
                if (row%2==0) {
                    com.setBackground(new Color(50,50,50));
                } else {
                    com.setBackground(new Color(30,30,30));
                }
            }
            com.setForeground(new Color(200, 200, 200));
            setBorder(new EmptyBorder(0,5,0,5));
            return com;
        }      
    }
}
