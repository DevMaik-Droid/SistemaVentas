package com.dev_team.utilidades;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class Panel_Round extends JPanel {

    private final int round;


    public Panel_Round(int round) {
        setOpaque(false);

        this.round = round;
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Crear área con esquinas redondeadas
        RoundRectangle2D roundRect = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), round, round);
        Area area = new Area(roundRect);
        g2d.setColor(getBackground());
        g2d.fill(area);


        /*Borde de Abajo*/
        area.subtract(new Area(new Rectangle2D.Double(0, 0, getWidth(), getHeight() - 3)));
        g2d.setPaint(new GradientPaint(0, 0, new Color(255, 51, 255), getWidth(), 0, Main_Colores.MAIN_COLOR_2));
        g2d.fill(area);
        g2d.dispose();
        super.paintComponent(g);
    }
}
