//EXEMPLO DE COMO MUDAR O O CONTEUDO DA INTERFACE BASE
//NÃO MEXER NO PAINEL SIDEBAR, SOMENTE NO CONTEUDO

package org.equipealpha.agis.view;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;


public class InterfaceCadastroTrabalho extends InterfaceBase{

    //panels
    private JPanel painelTituloCadastroTrabalho;
    private JPanel painelNomeCadastroTrabalho;
    private JPanel painelDataIniCadastroTrabalho;
    private JPanel painelDataFimCadastroTrabalho;
    private JPanel painelComboTurma;
    private JPanel painelBtnCadastroTrabalho;
    private JPanel painelComboEscola;
    //labels
    private JLabel labelTituloCadastroTrabalho;
    private JLabel labelNomeCadastroTrabalho;
    private JLabel labelDataIniCadastroTrabalho;
    private JLabel labelDataFimCadastroTrabalho;
    private JLabel labelTurmaCadastroTrabalho;
    private JLabel labelEscolaCadastroTrabalho;
    //datechosser
    private JDateChooser dataIniCadastroTrabalho;
    private JDateChooser dataFimCadastroTrabalho;
    //textfields
    private JTextField textoNomeCadastroTrabalho;
    //outros
    private GridBagConstraints constraints;
    private RoundedPanel painelCadastroTrabalho;
    private JButton btnCadastroTrabalho;
    private JComboBox comboTurmaCadastroTrabalho;
    private JComboBox comboEscolaCadastroTrabalho;

    public InterfaceCadastroTrabalho() {
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
        painelCadastroTrabalho = new RoundedPanel(20);
        painelCadastroTrabalho.setLayout(new GridBagLayout());
        painelCadastroTrabalho.setPreferredSize(new Dimension(550, 550));
        painelCadastroTrabalho.setBackground(new Color(255, 255, 255, 175));
        degradeconteudo.add(painelCadastroTrabalho, constraints);


        painelTituloCadastroTrabalho = new JPanel();
        painelTituloCadastroTrabalho.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        painelTituloCadastroTrabalho.setBackground(new Color(255, 255, 255, 0));
        constraints.gridx = 0;
        constraints.gridy = 0;
        labelTituloCadastroTrabalho = new JLabel("CADASTRAR TRABALHO");
        labelTituloCadastroTrabalho.setFont(new Font("Courier New", Font.BOLD,20));
        painelTituloCadastroTrabalho.add(labelTituloCadastroTrabalho);
        painelCadastroTrabalho.add(painelTituloCadastroTrabalho,constraints);


        painelNomeCadastroTrabalho = new JPanel();
        painelNomeCadastroTrabalho.setLayout(new FlowLayout(FlowLayout.LEFT));
        painelNomeCadastroTrabalho.setBackground(new Color(255, 255, 255, 0));
        constraints.gridy = 1;
        constraints.gridx = 0;
        labelNomeCadastroTrabalho = new JLabel("Nome:");
        labelNomeCadastroTrabalho.setFont(new Font("Courier New", Font.PLAIN,13));
        textoNomeCadastroTrabalho = new JTextField(30);
        painelNomeCadastroTrabalho.add(labelNomeCadastroTrabalho);
        painelNomeCadastroTrabalho.add(textoNomeCadastroTrabalho);
        painelCadastroTrabalho.add(painelNomeCadastroTrabalho,constraints);


        painelDataIniCadastroTrabalho = new JPanel();
        painelDataIniCadastroTrabalho.setLayout(new GridBagLayout());
        painelDataIniCadastroTrabalho.setBackground(new Color(255, 255, 255, 0));
        labelDataIniCadastroTrabalho = new JLabel("Data de início:");
        labelDataIniCadastroTrabalho.setFont(new Font("Courier New", Font.PLAIN,13));
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        painelDataIniCadastroTrabalho.add(labelDataIniCadastroTrabalho,constraints);
        dataIniCadastroTrabalho = new JDateChooser();
        dataIniCadastroTrabalho.setDateFormatString("dd/MM/yyyy");
        constraints.gridx = 1;
        painelDataIniCadastroTrabalho.add(dataIniCadastroTrabalho,constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        painelCadastroTrabalho.add(painelDataIniCadastroTrabalho, constraints);

        painelDataFimCadastroTrabalho = new JPanel();
        painelDataFimCadastroTrabalho.setLayout(new GridBagLayout());
        painelDataFimCadastroTrabalho.setBackground(new Color(255, 255, 255, 0));
        labelDataFimCadastroTrabalho = new JLabel("Data de encerramento:");
        labelDataFimCadastroTrabalho.setFont(new Font("Courier New", Font.PLAIN,13));
        constraints.gridy = 0;
        painelDataFimCadastroTrabalho.add(labelDataFimCadastroTrabalho,constraints);
        dataFimCadastroTrabalho = new JDateChooser();
        dataFimCadastroTrabalho.setDateFormatString("dd/MM/yyyy");
        constraints.gridx = 1;
        painelDataFimCadastroTrabalho.add(dataFimCadastroTrabalho,constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        painelCadastroTrabalho.add(painelDataFimCadastroTrabalho, constraints);

        painelComboEscola = new JPanel();
        painelComboEscola.setLayout(new GridBagLayout());
        painelComboEscola.setBackground(new Color(255, 255, 255, 0));
        labelEscolaCadastroTrabalho = new JLabel("Escola:");
        labelEscolaCadastroTrabalho.setFont(new Font("Courier New", Font.PLAIN,13));
        constraints.gridy = 0;
        painelComboEscola.add(labelEscolaCadastroTrabalho, constraints);
        String[] opcoesEscolaCadastroTrabalho = {""};
        comboEscolaCadastroTrabalho = new JComboBox<>(opcoesEscolaCadastroTrabalho);
        constraints.gridx = 1;
        painelComboEscola.add(comboEscolaCadastroTrabalho, constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;
        painelCadastroTrabalho.add(painelComboEscola, constraints);

        painelComboTurma = new JPanel();
        painelComboTurma.setLayout(new GridBagLayout());
        painelComboTurma.setBackground(new Color(255, 255, 255, 0));
        labelTurmaCadastroTrabalho = new JLabel("Turma:");
        labelTurmaCadastroTrabalho.setFont(new Font("Courier New", Font.PLAIN,13));
        constraints.gridy = 0;
        painelComboTurma.add(labelTurmaCadastroTrabalho, constraints);
        String[] opcoesTurmaCadastroTrabalho = {""};
        comboTurmaCadastroTrabalho = new JComboBox<>(opcoesTurmaCadastroTrabalho);
        constraints.gridx = 1;
        painelComboTurma.add(comboTurmaCadastroTrabalho, constraints);
        constraints.gridx = 0;
        constraints.gridy = 5;
        painelCadastroTrabalho.add(painelComboTurma, constraints);


        painelBtnCadastroTrabalho = new JPanel();
        painelBtnCadastroTrabalho.setLayout(new FlowLayout(FlowLayout.RIGHT));
        painelBtnCadastroTrabalho.setBackground(new Color(255, 255, 255, 0));
        constraints.gridy = 6;
        constraints.gridx = 0;
        constraints.anchor = GridBagConstraints.CENTER;
        btnCadastroTrabalho = new JButton("Cadastrar");
        btnCadastroTrabalho.setFont(new Font("Courier New", Font.PLAIN,13));
        btnCadastroTrabalho.setFocusable(false);
        painelBtnCadastroTrabalho.add(btnCadastroTrabalho);
        painelCadastroTrabalho.add(painelBtnCadastroTrabalho,constraints);

    }

}
