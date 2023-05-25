package org.equipealpha.agis.view;

import javax.swing.*;
import java.awt.*;

public class ListaAtividades extends InterfaceBase {

    //paineis
    private JPanel painelListaAtividades;
    private JScrollPane painelScrollListaAtividades;
    //outros
    private GridBagConstraints constraints;
    private PainelAtividade painelAtividade;

    public ListaAtividades() {
        addConteudo();
    }

    @Override
    public void addConteudo() {
        degradeconteudo.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        Insets insets = new Insets(20, 0, 20, 0);
        constraints.insets = insets;
        constraints.ipadx = 0;
        constraints.ipady = 0;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0;
        constraints.weighty = 0;
        constraints.fill = GridBagConstraints.WEST;

        //fundo do Jscroll
        painelListaAtividades = new JPanel();
        painelListaAtividades.setLayout(new GridBagLayout());

        //criando o Jscroll
        painelScrollListaAtividades = new JScrollPane(painelListaAtividades);
        painelScrollListaAtividades.setBorder(null);
        painelScrollListaAtividades.setPreferredSize(new Dimension(500, 600));
        degradeconteudo.add(painelScrollListaAtividades, constraints);

        JScrollPane jScrollPane = new JScrollPane();
        constraints.gridx = 1;
        degradeconteudo.add(jScrollPane, constraints);

        constraints.gridx = 0;
        constraints.insets = new Insets(5,0,5,0);
        painelListaAtividades.add(criarPainelAtividade(),constraints);
        constraints.gridy = 1;
        painelListaAtividades.add(criarPainelAtividade(),constraints);
        constraints.gridy = 2;
        painelListaAtividades.add(criarPainelAtividade(),constraints);
        constraints.gridy = 3;
        painelListaAtividades.add(criarPainelAtividade(),constraints);
        constraints.gridy = 4;
        painelListaAtividades.add(criarPainelAtividade(),constraints);


    }

    private PainelAtividade criarPainelAtividade(){
        painelAtividade = new PainelAtividade(Color.WHITE, new Color(0x4090CC));
        painelAtividade.setPreferredSize(new Dimension(400,150));
        return painelAtividade;
    }

}
