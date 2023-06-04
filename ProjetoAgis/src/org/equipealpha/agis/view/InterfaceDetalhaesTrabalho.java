package org.equipealpha.agis.view;

import javax.swing.*;
import java.awt.*;

public class InterfaceDetalhaesTrabalho extends InterfaceBase{


    //labels
    private JLabel labelTitulo;
    private JLabel labelAlunosPendentes;
    private JLabel labelAlunosConcluidos;
    private JLabel labelPorcentagemPendentes;
    private JLabel labelPorcentagemConcluidos;
    private JLabel labelDiaTermino;
    //paineis
    private JPanel painelListasAlunos;
    private JPanel painelEstatisticasTrabalho;
    private JPanel painelListasAlunosPendentes;
    private JPanel painelListasAlunosConcluidos;
    private JPanel painelTituloDetalhes;
    private JPanel painelTituloAlunosPendentes;
    private JPanel painelTituloAlunosConcluidos;
    private JPanel painelPorcentagemConcluidos;
    private JPanel painelPorcentagemPendentes;
    private JPanel painelDiaTermino;
    private JPanel painelInfoDetalhesAtividades;
    //outros
    private JScrollPane scrollAlunosPendentes;
    private JScrollPane scrollAlunosConcluidos;
    private GridBagConstraints constraints;
    private RoundedPanel painelDetalhesTrabalho;

    public InterfaceDetalhaesTrabalho() {
        addConteudo();
    }

    @Override
    protected void addConteudo() {

        degradeconteudo.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        Insets insets = new Insets(0, 0, 0, 0);
        constraints.insets = insets;
        constraints.ipadx = 0;
        constraints.ipady = 0;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0;
        constraints.weighty = 0;
        constraints.fill = GridBagConstraints.WEST;

        //Configurando o painel
        painelDetalhesTrabalho = new RoundedPanel(20);
        painelDetalhesTrabalho.setLayout(new GridBagLayout());
        painelDetalhesTrabalho.setPreferredSize(new Dimension(650, 600));
        painelDetalhesTrabalho.setBackground(new Color(255, 255, 255, 175));
        degradeconteudo.add(painelDetalhesTrabalho, constraints);

        //titulo do painel
        painelTituloDetalhes = new JPanel();
        painelTituloDetalhes.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        painelTituloDetalhes.setOpaque(false);
        labelTitulo = new JLabel("DETALHES DO TRABALHO");
        labelTitulo.setFont(new Font("Courier New", Font.BOLD,20));
        painelTituloDetalhes.setPreferredSize(new Dimension(600,50));
        painelTituloDetalhes.add(labelTitulo);
        painelDetalhesTrabalho.add(painelTituloDetalhes);


        //painel das listas
        painelListasAlunos = new JPanel();
        painelListasAlunos.setLayout(new GridBagLayout());
        painelListasAlunos.setOpaque(false);
        painelListasAlunos.setPreferredSize(new Dimension(450, 500));

        painelTituloAlunosPendentes = new JPanel();
        painelTituloAlunosPendentes.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        painelTituloAlunosPendentes.setPreferredSize(new Dimension(175, 25));
        painelTituloAlunosPendentes.setOpaque(false);
        labelAlunosPendentes = new JLabel("Alunos Pendentes");
        labelAlunosPendentes.setFont(new Font("Courier New", Font.BOLD,15));
        painelTituloAlunosPendentes.add(labelAlunosPendentes);
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.insets = new Insets(0,0,0,10);
        painelListasAlunos.add(painelTituloAlunosPendentes,constraints);
        painelListasAlunosPendentes = new JPanel();
        painelListasAlunosPendentes.setLayout(new BoxLayout(painelListasAlunosPendentes,BoxLayout.PAGE_AXIS));
        scrollAlunosPendentes = new JScrollPane(painelListasAlunosPendentes);
        scrollAlunosPendentes.setPreferredSize(new Dimension(200, 400));
        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.insets = new Insets(0,0,0,10);
        painelListasAlunos.add(scrollAlunosPendentes,constraints);

        painelTituloAlunosConcluidos = new JPanel();
        painelTituloAlunosConcluidos.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        painelTituloAlunosConcluidos.setPreferredSize(new Dimension(175, 25));
        painelTituloAlunosConcluidos.setOpaque(false);
        labelAlunosConcluidos = new JLabel("Alunos Concluidos");
        labelAlunosConcluidos.setFont(new Font("Courier New", Font.BOLD,15));
        painelTituloAlunosConcluidos.add(labelAlunosConcluidos);
        constraints.gridy = 0;
        constraints.gridx = 1;
        constraints.insets = new Insets(0,10,0,0);
        painelListasAlunos.add(painelTituloAlunosConcluidos,constraints);
        painelListasAlunosConcluidos = new JPanel();
        scrollAlunosConcluidos = new JScrollPane(painelListasAlunosConcluidos);
        scrollAlunosConcluidos.setPreferredSize(new Dimension(200, 400));
        constraints.gridy = 1;
        constraints.gridx = 1;
        constraints.insets = new Insets(0,10,0,0);
        painelListasAlunos.add(scrollAlunosConcluidos,constraints);


        //painel das estatisticas da Trabalho
        painelEstatisticasTrabalho = new JPanel();
        painelEstatisticasTrabalho.setLayout(new GridBagLayout());
        painelEstatisticasTrabalho.setOpaque(false);
        painelEstatisticasTrabalho.setPreferredSize(new Dimension(150, 300));

        painelPorcentagemConcluidos = new JPanel();
        painelPorcentagemConcluidos.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        painelPorcentagemConcluidos.setPreferredSize(new Dimension(150,20));
        painelPorcentagemConcluidos.setOpaque(false);
        labelPorcentagemConcluidos = new JLabel("Conclusão:  %");
        labelPorcentagemConcluidos.setFont(new Font("Courier New", Font.BOLD,15));
        painelPorcentagemConcluidos.add(labelPorcentagemConcluidos);
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.anchor = GridBagConstraints.WEST;
        painelEstatisticasTrabalho.add(painelPorcentagemConcluidos,constraints);

        painelPorcentagemPendentes = new JPanel();
        painelPorcentagemPendentes.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        painelPorcentagemPendentes.setPreferredSize(new Dimension(150,20));
        painelPorcentagemPendentes.setOpaque(false);
        labelPorcentagemPendentes = new JLabel("Pendencia:  %");
        labelPorcentagemPendentes.setFont(new Font("Courier New", Font.BOLD,15));
        painelPorcentagemPendentes.add(labelPorcentagemPendentes);
        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.anchor = GridBagConstraints.WEST;
        painelEstatisticasTrabalho.add(painelPorcentagemPendentes,constraints);


        painelDiaTermino = new JPanel();
        painelDiaTermino.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        painelDiaTermino.setPreferredSize(new Dimension(150,20));
        painelDiaTermino.setOpaque(false);
        labelDiaTermino = new JLabel("Faltam __ "+"dias" );
        labelDiaTermino.setFont(new Font("Courier New", Font.BOLD,15));
        painelDiaTermino.add(labelDiaTermino);
        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.anchor = GridBagConstraints.WEST;
        painelEstatisticasTrabalho.add(painelDiaTermino,constraints);



        //painel que vai receber o conteudo
        painelInfoDetalhesAtividades = new JPanel();
        painelInfoDetalhesAtividades.setLayout(new GridBagLayout());
        painelInfoDetalhesAtividades.setOpaque(false);
        painelInfoDetalhesAtividades.setPreferredSize(new Dimension(600, 500));
        constraints.insets = new Insets(0,0,0,0);
        constraints.gridx = 0;
        constraints.gridy = 0;
        painelInfoDetalhesAtividades.add(painelListasAlunos,constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        painelInfoDetalhesAtividades.add(painelEstatisticasTrabalho,constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        painelDetalhesTrabalho.add(painelInfoDetalhesAtividades,constraints);

    }
    
}
