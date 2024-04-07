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

    
    private int round ;

    public Panel_Round(int round) {
        setOpaque(false);
        
        this.round = round;
        repaint();
    }
    
    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
        repaint();
    }

    public JPanel getPanelMod() {
        return this;
    }

    public void setFondo(Color color) {
        setBackground(color);
    }


    

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), round, round));
        g2.setColor(getBackground());
        g2.fill(area);
        area.subtract(new Area(new Rectangle2D.Double(0, 0, getWidth(), getHeight() - 3)));
        g2.setPaint(new GradientPaint(0, 0, new Color(255, 51, 255), getWidth(), 0, Main_Colores.MAIN_COLOR_2));
        g2.fill(area);
        g2.dispose();
        super.paintComponent(g);
    }
}
