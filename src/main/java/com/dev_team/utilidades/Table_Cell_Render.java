package com.dev_team.utilidades;

import java.awt.Color;
import java.awt.Component;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
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
        
        JLabel label = new TableHeader(String.valueOf(value));
        label.setBackground(Color.WHITE);
        label.setForeground(new Color(51, 51, 51));
        label.setFont(font_sustom);
        if (column != 1) {
            label.setHorizontalAlignment(JLabel.CENTER);
        } else {
            label.setHorizontalAlignment(JLabel.LEADING);
        }

        if (isSelected) {
            label.setForeground(new Color(153, 0, 153));
        }

        if (value instanceof String) {
            String dato = String.valueOf(value);
            switch (dato) {
                case "ACTIVO" ->
                    label.setBackground(new Color(153, 255, 153)); // Verde claro para "Activo"
                case "INACTIVO" ->
                    label.setBackground(new Color(255, 153, 153)); // Rojo claro para "Inactivo"
                case "AUSENTE" ->
                    label.setBackground(new Color(255, 255, 153)); // Rojo claro para "Inactivo"
                default ->
                    label.setBackground(table.getBackground()); // Fondo por defecto de la tabla
            }
        }

        label.setBorder(topBorder);
        
        return label;
    }

}
