package org.equipealpha.agis.view;

import javax.swing.*;
import java.awt.*;

public class CadastroAluno extends InterfaceBase{

    //labels
    private JLabel labelTituloCadastroAluno;
    private JLabel labelNomeCadastroAluno;
    private JLabel labelEscolaCadastroAluno;
    private JLabel labelTurmaCadastroAluno;
    //textfields
    private JTextField textoNomeCadastroAluno;
    //combobox
    private JComboBox comboEscola;
    private JComboBox comboTurma;
    //outros
    private GridBagConstraints constraints;
    private RoundedPanel painelCadastroAluno;
    private JButton btnCadastroAluno;

    public CadastroAluno() {
        addConteudo();
    }

    @Override
    public void addConteudo() {

        //Configurando area do conteudo
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

        //Configurando o painel
        painelCadastroAluno = new RoundedPanel(20);
        painelCadastroAluno.setLayout(new GridBagLayout());
        painelCadastroAluno.setPreferredSize(new Dimension(450, 400));
        painelCadastroAluno.setBackground(new Color(255, 255, 255, 175));
        degradeconteudo.add(painelCadastroAluno, constraints);

        labelTituloCadastroAluno = new JLabel("CADASTRAR ALUNO");
        labelTituloCadastroAluno.setFont(new Font("Courier New", Font.BOLD,20));
        constraints.gridwidth = 2;
        constraints.gridx = 2;
        painelCadastroAluno.add(labelTituloCadastroAluno, constraints);

        labelNomeCadastroAluno = new JLabel("Nome:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        labelNomeCadastroAluno.setFont(new Font("Courier New", Font.PLAIN,13));
        painelCadastroAluno.add(labelNomeCadastroAluno, constraints);
        textoNomeCadastroAluno = new JTextField();
        constraints.gridx = 1;
        constraints.gridwidth = 4;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets.set(20,0,20,0);
        painelCadastroAluno.add(textoNomeCadastroAluno, constraints);

        labelEscolaCadastroAluno = new JLabel("Escola:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        labelEscolaCadastroAluno.setFont(new Font("Courier New", Font.PLAIN,13));
        painelCadastroAluno.add(labelEscolaCadastroAluno, constraints);
        String[] opcoesComboEscola = {""};
        comboEscola = new JComboBox(opcoesComboEscola);
        constraints.gridx = 1;
        painelCadastroAluno.add(comboEscola, constraints);

        labelTurmaCadastroAluno = new JLabel("Turma:");
        constraints.gridx = 0;
        constraints.gridy = 3;
        labelTurmaCadastroAluno.setFont(new Font("Courier New", Font.PLAIN,13));
        painelCadastroAluno.add(labelTurmaCadastroAluno, constraints);
        String[] opcoesTurma = {""};
        comboTurma = new JComboBox(opcoesTurma);
        constraints.gridx = 1;
        painelCadastroAluno.add(comboTurma, constraints);

        btnCadastroAluno = new JButton("Cadastrar");
        btnCadastroAluno.setFocusable(false);
        btnCadastroAluno.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCadastroAluno.setFont(new Font("Courier New", Font.PLAIN,13));
        constraints.gridx = 4;
        constraints.gridy = 4;
        constraints.anchor = GridBagConstraints.CENTER;
        painelCadastroAluno.add(btnCadastroAluno, constraints);
    }
}
