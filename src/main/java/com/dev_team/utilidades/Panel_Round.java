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

    private int round;
    private int roundTopLeft;
    private int roundTopRight;
    private int roundBottomLeft;
    private int roundBottomRight;

    public Panel_Round(int round) {
        setOpaque(false);

        this.round = round;
        repaint();
    }

    public Panel_Round(int roundTopLeft, int roundTopRight, int roundBottomLeft, int roundBottomRight) {
        setOpaque(false);
        this.roundTopLeft = roundTopLeft;
        this.roundTopRight = roundTopRight;
        this.roundBottomLeft = roundBottomLeft;
        this.roundBottomRight = roundBottomRight;
        repaint();
    }


    /*@Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Area area = new Area(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), round, round));//Crea el borde
        g2.setColor(getBackground());
        g2.fill(area);

        area.subtract(new Area(new Rectangle2D.Double(0, 0, getWidth(), getHeight() - 3)));
        g2.setPaint(new GradientPaint(0, 0, new Color(255, 51, 255), getWidth(), 0, Main_Colores.MAIN_COLOR_2));
        g2.fill(area);
        g2.dispose();
        super.paintComponent(g);
    }*/
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
