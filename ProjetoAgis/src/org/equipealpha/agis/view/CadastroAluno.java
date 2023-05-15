package org.equipealpha.agis.view;

import javax.swing.*;
import java.awt.*;

public class CadastroAluno extends InterfaceBase{

    //paineis
    private JPanel painelTituloCadastroAluno;
    private JPanel painelNomeCadastroAluno;
    private JPanel painelEscolaCadastroAluno;
    private JPanel painelTurmaCadastroAluno;
    private JPanel painelBtnCadastroAluno;
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
    private RoundedPanel panelCadastroAluno;
    private JButton btnCadastroAluno;

    public CadastroAluno() {
        addConteudo();
    }

    @Override
    public void addConteudo() {

        //Configurando area do conteudo
        degradeconteudo.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.CENTER;

        //Configurando o painel
        panelCadastroAluno = new RoundedPanel(20);
        panelCadastroAluno.setLayout(new BoxLayout(panelCadastroAluno, BoxLayout.PAGE_AXIS));
        panelCadastroAluno.setPreferredSize(new Dimension(400,400));
        panelCadastroAluno.setBackground(new Color(255, 255, 255, 175));
        degradeconteudo.add(panelCadastroAluno, constraints);

        //Informações dentro do painel
        panelCadastroAluno.add(Box.createRigidArea(new Dimension(0,15)));
        painelTituloCadastroAluno = new JPanel();
        painelTituloCadastroAluno.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        painelTituloCadastroAluno.setBackground(new Color(255, 255, 255, 0));
        labelTituloCadastroAluno = new JLabel("CADASTRAR ALUNO");
        labelTituloCadastroAluno.setFont(new Font(" Courier New", Font.PLAIN,20));
        painelTituloCadastroAluno.add(labelTituloCadastroAluno);
        panelCadastroAluno.add(painelTituloCadastroAluno);

        painelNomeCadastroAluno = new JPanel();
        painelNomeCadastroAluno.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        painelNomeCadastroAluno.setBackground(new Color(255, 255, 255, 0));
        labelNomeCadastroAluno = new JLabel("Nome:");
        textoNomeCadastroAluno = new JTextField(30);
        painelNomeCadastroAluno.add(Box.createRigidArea(new Dimension(10,0)));
        painelNomeCadastroAluno.add(labelNomeCadastroAluno);
        painelNomeCadastroAluno.add(textoNomeCadastroAluno);
        panelCadastroAluno.add(painelNomeCadastroAluno);

        painelEscolaCadastroAluno = new JPanel();
        painelEscolaCadastroAluno.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        painelEscolaCadastroAluno.setBackground(new Color(255, 255, 255, 0));
        labelEscolaCadastroAluno = new JLabel("Escola:");
        String[] opcoesComboEscola = {""};
        comboEscola = new JComboBox(opcoesComboEscola);
        painelEscolaCadastroAluno.add(Box.createRigidArea(new Dimension(10,0)));
        painelEscolaCadastroAluno.add(labelEscolaCadastroAluno);
        painelEscolaCadastroAluno.add(comboEscola);
        panelCadastroAluno.add(painelEscolaCadastroAluno);

        painelTurmaCadastroAluno = new JPanel();
        painelTurmaCadastroAluno.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        painelTurmaCadastroAluno.setBackground(new Color(255, 255, 255, 0));
        labelTurmaCadastroAluno = new JLabel("Turma:");
        String[] opcoesComboTurma = {""};
        comboTurma = new JComboBox(opcoesComboTurma);
        painelTurmaCadastroAluno.add(Box.createRigidArea(new Dimension(10,0)));
        painelTurmaCadastroAluno.add(labelTurmaCadastroAluno);
        painelTurmaCadastroAluno.add(comboTurma);
        panelCadastroAluno.add(painelTurmaCadastroAluno);

        painelBtnCadastroAluno = new JPanel();
        painelBtnCadastroAluno.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
        painelBtnCadastroAluno.setBackground(new Color(255, 255, 255, 0));
        btnCadastroAluno = new JButton("Cadastrar");
        painelBtnCadastroAluno.add(Box.createRigidArea(new Dimension(20,0)));
        painelBtnCadastroAluno.add(btnCadastroAluno);
        panelCadastroAluno.add(painelBtnCadastroAluno);
    }
}
