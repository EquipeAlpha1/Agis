package org.equipealpha.agis.view;

import javax.swing.*;
import java.awt.*;

public class InterfaceEstatistica extends InterfaceBase{

    //paineis
    private RoundedPanel painelListaEstatisticas;
    private JScrollPane painelScrollListaEstatisticas;
    private JPanel painelTituloEstatisticas;
    private JPanel painelTurmasEstatisticas;
    private JScrollPane scrollPainelTurmasEstatisticas;
    //labels
    private JLabel labelTituloEstatisticas;
    //outros
    private GridBagConstraints constraints;

    public InterfaceEstatistica() {
            addConteudo();
        }

    protected void addConteudo() {
        degradeconteudo.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        Insets insets = new Insets(0, 0, 20, 0);
        constraints.insets = insets;
        constraints.ipadx = 0;
        constraints.ipady = 0;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0;
        constraints.weighty = 0;
        constraints.fill = GridBagConstraints.WEST;

        painelListaEstatisticas = new RoundedPanel(20);
        painelListaEstatisticas.setLayout(new GridBagLayout());
        painelListaEstatisticas.setPreferredSize(new Dimension(600, 600));
        painelListaEstatisticas.setBackground(new Color(255, 255, 255, 175));
        degradeconteudo.add(painelListaEstatisticas, constraints);


        painelTituloEstatisticas = new JPanel();
        painelTituloEstatisticas.setOpaque(false);
        painelTituloEstatisticas.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        painelTituloEstatisticas.setPreferredSize(new Dimension(500,25));
        labelTituloEstatisticas = new JLabel("LISTA DE ESTATISTICAS");
        labelTituloEstatisticas.setFont(new Font("Courier New", Font.BOLD, 20));
        painelTituloEstatisticas.add(labelTituloEstatisticas);
        painelListaEstatisticas.add(painelTituloEstatisticas,constraints);


        painelTurmasEstatisticas = new JPanel();
        painelTurmasEstatisticas.setLayout(new BoxLayout(painelTurmasEstatisticas,BoxLayout.PAGE_AXIS));

        scrollPainelTurmasEstatisticas = new JScrollPane(painelTurmasEstatisticas);
        scrollPainelTurmasEstatisticas.setPreferredSize(new Dimension(500,500));
        scrollPainelTurmasEstatisticas.setBorder(null);
        constraints.gridy = 1;
        constraints.insets = new Insets(0,0,0,0);
        painelListaEstatisticas.add(scrollPainelTurmasEstatisticas,constraints);

    }
}
