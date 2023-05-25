//EXEMPLO DE COMO MUDAR O O CONTEUDO DA INTERFACE BASE
//NÃO MEXER NO PAINEL SIDEBAR, SOMENTE NO CONTEUDO

package org.equipealpha.agis.view;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;


public class InterfaceCadastroTarefa extends InterfaceBase{

    //panels
    private JPanel painelTituloCadastroTarefa;
    private JPanel painelNomeCadastroTarefa;
    private JPanel painelDataIniCadastroTarefa;
    private JPanel painelDataFimCadastroTarefa;
    private JPanel painelComboTurma;
    private JPanel painelBtnCadastroTarefa;
    private JPanel painelComboEscola;
    //labels
    private JLabel labelTituloCadastroTarefa;
    private JLabel labelNomeCadastroTarefa;
    private JLabel labelDataIniCadastroTarefa;
    private JLabel labelDataFimCadastroTarefa;
    private JLabel labelTurmaCadastroTarefa;
    private JLabel labelEscolaCadastroTarefa;
    //datechosser
    private JDateChooser dataIniCadastroTarefa;
    private JDateChooser dataFimCadastroTarefa;
    //textfields
    private JTextField textoNomeCadastroTarefa;
    //outros
    private GridBagConstraints constraints;
    private RoundedPanel painelCadastroTarefa;
    private JButton btnCadastroTarefa;
    private JComboBox comboTurmaCadastroTarefa;
    private JComboBox comboEscolaCadastroTarefa;

    public InterfaceCadastroTarefa() {
        addConteudo();

    }

    @Override
    public void addConteudo() {

        //Configurando area do conteudo
        degradeconteudo.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        Insets insets = new Insets(10, 0, 20, 0);
        constraints.insets = insets;
        constraints.ipadx = 0;
        constraints.ipady = 0;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0;
        constraints.weighty = 0;
        constraints.fill = GridBagConstraints.WEST;
        //Configurando o painel
        painelCadastroTarefa = new RoundedPanel(20);
        painelCadastroTarefa.setLayout(new GridBagLayout());
        painelCadastroTarefa.setPreferredSize(new Dimension(550, 550));
        painelCadastroTarefa.setBackground(new Color(255, 255, 255, 175));
        degradeconteudo.add(painelCadastroTarefa, constraints);


        painelTituloCadastroTarefa = new JPanel();
        painelTituloCadastroTarefa.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        painelTituloCadastroTarefa.setBackground(new Color(255, 255, 255, 0));
        constraints.gridx = 0;
        constraints.gridy = 0;
        labelTituloCadastroTarefa = new JLabel("CADASTRAR TAREFA");
        labelTituloCadastroTarefa.setFont(new Font("Courier New", Font.BOLD,20));
        painelTituloCadastroTarefa.add(labelTituloCadastroTarefa);
        painelCadastroTarefa.add(painelTituloCadastroTarefa,constraints);


        painelNomeCadastroTarefa = new JPanel();
        painelNomeCadastroTarefa.setLayout(new FlowLayout(FlowLayout.LEFT));
        painelNomeCadastroTarefa.setBackground(new Color(255, 255, 255, 0));
        constraints.gridy = 1;
        constraints.gridx = 0;
        labelNomeCadastroTarefa = new JLabel("Nome:");
        labelNomeCadastroTarefa.setFont(new Font("Courier New", Font.PLAIN,13));
        textoNomeCadastroTarefa = new JTextField(30);
        painelNomeCadastroTarefa.add(labelNomeCadastroTarefa);
        painelNomeCadastroTarefa.add(textoNomeCadastroTarefa);
        painelCadastroTarefa.add(painelNomeCadastroTarefa,constraints);


        painelDataIniCadastroTarefa = new JPanel();
        painelDataIniCadastroTarefa.setLayout(new GridBagLayout());
        painelDataIniCadastroTarefa.setBackground(new Color(255, 255, 255, 0));
        labelDataIniCadastroTarefa = new JLabel("Data de início:");
        labelDataIniCadastroTarefa.setFont(new Font("Courier New", Font.PLAIN,13));
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        painelDataIniCadastroTarefa.add(labelDataIniCadastroTarefa,constraints);
        dataIniCadastroTarefa = new JDateChooser();
        dataIniCadastroTarefa.setDateFormatString("dd/MM/yyyy");
        constraints.gridx = 1;
        painelDataIniCadastroTarefa.add(dataIniCadastroTarefa,constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        painelCadastroTarefa.add(painelDataIniCadastroTarefa, constraints);

        painelDataFimCadastroTarefa = new JPanel();
        painelDataFimCadastroTarefa.setLayout(new GridBagLayout());
        painelDataFimCadastroTarefa.setBackground(new Color(255, 255, 255, 0));
        labelDataFimCadastroTarefa = new JLabel("Data de encerramento:");
        labelDataFimCadastroTarefa.setFont(new Font("Courier New", Font.PLAIN,13));
        constraints.gridy = 0;
        painelDataFimCadastroTarefa.add(labelDataFimCadastroTarefa,constraints);
        dataFimCadastroTarefa = new JDateChooser();
        dataFimCadastroTarefa.setDateFormatString("dd/MM/yyyy");
        constraints.gridx = 1;
        painelDataFimCadastroTarefa.add(dataFimCadastroTarefa,constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        painelCadastroTarefa.add(painelDataFimCadastroTarefa, constraints);

        painelComboEscola = new JPanel();
        painelComboEscola.setLayout(new GridBagLayout());
        painelComboEscola.setBackground(new Color(255, 255, 255, 0));
        labelEscolaCadastroTarefa = new JLabel("Escola:");
        labelEscolaCadastroTarefa.setFont(new Font("Courier New", Font.PLAIN,13));
        constraints.gridy = 0;
        painelComboEscola.add(labelEscolaCadastroTarefa, constraints);
        String[] opcoesEscolaCadastroTarefa = {""};
        comboEscolaCadastroTarefa = new JComboBox<>(opcoesEscolaCadastroTarefa);
        constraints.gridx = 1;
        painelComboEscola.add(comboEscolaCadastroTarefa, constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;
        painelCadastroTarefa.add(painelComboEscola, constraints);

        painelComboTurma = new JPanel();
        painelComboTurma.setLayout(new GridBagLayout());
        painelComboTurma.setBackground(new Color(255, 255, 255, 0));
        labelTurmaCadastroTarefa = new JLabel("Turma:");
        labelTurmaCadastroTarefa.setFont(new Font("Courier New", Font.PLAIN,13));
        constraints.gridy = 0;
        painelComboTurma.add(labelTurmaCadastroTarefa, constraints);
        String[] opcoesTurmaCadastroTarefa = {""};
        comboTurmaCadastroTarefa = new JComboBox<>(opcoesTurmaCadastroTarefa);
        constraints.gridx = 1;
        painelComboTurma.add(comboTurmaCadastroTarefa, constraints);
        constraints.gridx = 0;
        constraints.gridy = 5;
        painelCadastroTarefa.add(painelComboTurma, constraints);



        painelBtnCadastroTarefa = new JPanel();
        painelBtnCadastroTarefa.setLayout(new FlowLayout(FlowLayout.RIGHT));
        painelBtnCadastroTarefa.setBackground(new Color(255, 255, 255, 0));
        constraints.gridy = 6;
        constraints.gridx = 0;
        constraints.anchor = GridBagConstraints.CENTER;
        btnCadastroTarefa = new JButton("Cadastrar");
        btnCadastroTarefa.setFont(new Font("Courier New", Font.PLAIN,13));
        btnCadastroTarefa.setFocusable(false);
        painelBtnCadastroTarefa.add(btnCadastroTarefa);
        painelCadastroTarefa.add(painelBtnCadastroTarefa,constraints);

    }

}
