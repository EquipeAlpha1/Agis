package org.equipealpha.agis.view;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class PainelAtividade extends JPanel {
    private Color startColor;
    private Color endColor;

    public PainelAtividade(Color startColor, Color endColor) {
        this.startColor = startColor;
        this.endColor = endColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();

        Graphics2D g2d = (Graphics2D) g.create();

        // Renderização de alta qualidade
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Gradiente do branco ao azul (da esquerda para a direita)
        GradientPaint gradient = new GradientPaint(0, 0, endColor, width, 0, startColor);
        g2d.setPaint(gradient);

        // Preencher o fundo com o gradiente
        g2d.fillRoundRect(0, 0, width, height, 20, 20);

        g2d.dispose();
    }

}
