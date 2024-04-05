
package com.dev_team.utilidades;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.MultipleGradientPaint;
import javax.swing.JPanel;

public class Gradient extends JPanel{
    
    
    private Color[] colors;
    private float[] fractions;

    public Gradient(Color color1, Color color2, Color color3) {
        colors = new Color[]{color1, color2, color3};
        fractions = new float[]{0.0f, 0.5f, 1.0f};
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Define el gradiente lineal con tres colores
        MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, getWidth(), getHeight(), fractions, colors);
        g2d.setPaint(gradient);

        // Dibuja el gradiente en el fondo del panel
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
    
    
    /* Porciacaso
        private Icon recuperarImagen(byte[] bytes_image) {
        try {
            InputStream inputStream = new ByteArrayInputStream(bytes_image);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            ImageIcon img_icon = new ImageIcon(buffer);
            Image imagen = img_icon.getImage().getScaledInstance(lb_foto.getWidth(), lb_foto.getHeight(), Image.SCALE_DEFAULT);
            Icon icon = new ImageIcon(imagen);
            return icon;
        } catch (IOException ex) {
            Logger.getLogger(D_AdmUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    */
}
