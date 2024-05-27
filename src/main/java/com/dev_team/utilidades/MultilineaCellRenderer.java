
package com.dev_team.utilidades;

import javax.swing.*;
import java.awt.*;
import org.jdesktop.swingx.renderer.DefaultTableRenderer;

public class MultilineaCellRenderer extends DefaultTableRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        JTextArea textArea = new JTextArea(String.valueOf(value));
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setOpaque(true);

        if (isSelected) {
            textArea.setBackground(table.getSelectionBackground());
            textArea.setForeground(table.getSelectionForeground());
        } else {
            textArea.setBackground(table.getBackground());
            textArea.setForeground(table.getForeground());
        }

        textArea.setFont(table.getFont());
        return textArea;
    }
}

