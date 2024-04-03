package com.dev_team.controllers;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Render_Imagen extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object value, boolean bln, boolean bln1, int i, int i1) {
        JLabel label = new JLabel();
        if (value instanceof ImageIcon) {
            label.setIcon((ImageIcon) value);
        } else {
            label.setText("Sin imagen");
        }
        label.setHorizontalAlignment(SwingConstants.CENTER);

        return label;
    }
}
