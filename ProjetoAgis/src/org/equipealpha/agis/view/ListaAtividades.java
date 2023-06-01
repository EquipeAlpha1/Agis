package org.equipealpha.agis.view;

import javax.swing.*;
import java.awt.*;
import org.equipealpha.agis.controller.GerenciamentoEscolar;

public class ListaAtividades extends InterfaceBase {

    //paineis
    private JPanel painelListaAtividades;
    private JScrollPane painelScrollListaAtividades;
    //outros
    private GridBagConstraints constraints;
    private PainelAtividade painelAtividade;
    private GerenciamentoEscolar gerenciamentoEscolar= new GerenciamentoEscolar();

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
        painelScrollListaAtividades.setPreferredSize(new Dimension(600, 600));
        degradeconteudo.add(painelScrollListaAtividades, constraints);

        JScrollPane jScrollPane = new JScrollPane();
        constraints.gridx = 1;
        degradeconteudo.add(jScrollPane, constraints);
        
  
    }

}
