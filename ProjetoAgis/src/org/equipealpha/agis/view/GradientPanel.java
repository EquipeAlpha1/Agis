package org.equipealpha.agis.view;
import java.awt.*;
import javax.swing.JPanel;

public class GradientPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Configuração do antialiasing para suavizar o degradê
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Definição das cores do degradê
        Color corInicial = Color.WHITE;
        Color corFinal = new Color(0x4090CC);

        // Criação do objeto GradientPaint para desenhar o degradê
        GradientPaint gradient = new GradientPaint(
                0, 0, corInicial,
                getWidth(), 0, corFinal);

        // Preenchimento do painel com o degradê
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
    public Dimension getPreferredSize() {
        // Retorna a mesma dimensão do JPanel pai
        return getParent().getSize();
    }
}