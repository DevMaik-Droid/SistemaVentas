package com.dev_team.utilidades;

import com.dev_team.dashboard.menu.ScrollBar;
import java.awt.Color;
import java.awt.Component;
import java.util.Arrays;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXTable;

public class Table extends JXTable {

    DefaultTableModel model;

    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
                Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                com.setBackground(Color.WHITE);
                setBorder(noFocusBorder);
                if (selected) {
                    com.setForeground(Main_Colores.MAIN_COLOR_1);
                } else {
                    com.setForeground(new Color(102, 102, 102));
                }
                return com;
            }
        });
    }

    public void setColumnas(Object[] columnas) {
        System.out.println("Agregando columnas");
        System.out.println(Arrays.toString(columnas));
        model = new DefaultTableModel(columnas, 0);
    }

    public void setFila(Object[] row) {
        model.addRow(row);
    }

    public void fixTable(JScrollPane scroll) {
        scroll.setBorder(null);
        scroll.setVerticalScrollBar(new ScrollBar());
        scroll.getVerticalScrollBar().setBackground(Color.WHITE);
        scroll.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    }
}
