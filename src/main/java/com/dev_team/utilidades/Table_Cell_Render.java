package com.dev_team.utilidades;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.HierarchyEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import org.jdesktop.swingx.renderer.DefaultTableRenderer;

/**
 *
 * @author DevMaik
 */
public class Table_Cell_Render extends DefaultTableRenderer {

    private final Font font_sustom = new Font("Verdana", Font.PLAIN, 12);


    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        Border topBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK); // Borde solo en la parte superior
        TableHeader label = new TableHeader(String.valueOf(value));
        label.setForeground(new Color(51, 51, 51));
        label.setFont(font_sustom);
        if (column != 1 && column != 2) {
            label.setHorizontalAlignment(JLabel.CENTER);
        } else {
            label.setHorizontalAlignment(JLabel.LEADING);
        }

        if (isSelected) {
            label.setForeground(new Color(153, 0, 153));
            label.setBackground(new Color(204, 0, 0));
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

        label.setBorder(topBorder);
        return label;
    }

}
