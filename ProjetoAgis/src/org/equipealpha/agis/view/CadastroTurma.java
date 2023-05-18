
package org.equipealpha.agis.view;


import javax.swing.*;
import java.awt.*;

public class CadastroTurma extends InterfaceBase{

    //paineis
    private JPanel painelTituloCadastroTurma;
    private JPanel painelNomeCadastroTurma;
    private JPanel painelBtnCadastroTurma;
    private JPanel painelEscolaCadastroTurma;
    //labels
    private JLabel labelTituloCadastroTurma;
    private JLabel labelNomeCadastroTurma;
    private JLabel labelEscolaCadastroTurma;
    //textfields
    private JTextField textoNomeCadastroTurma;
    //combobox
    private JComboBox comboEscolaCadastroTurma;
    //outros
    private GridBagConstraints constraints;
    private RoundedPanel painelCadastroTurma;
    private JButton btnCadastroTurma;

    public CadastroTurma() {
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
        painelCadastroTurma = new RoundedPanel(20);
        painelCadastroTurma.setLayout(new GridBagLayout());
        painelCadastroTurma.setPreferredSize(new Dimension(400, 350));
        painelCadastroTurma.setBackground(new Color(255, 255, 255, 175));
        degradeconteudo.add(painelCadastroTurma, constraints);

        painelTituloCadastroTurma = new JPanel();
        painelTituloCadastroTurma.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        painelTituloCadastroTurma.setBackground(new Color(255, 255, 255, 0));
        constraints.gridx = 0;
        constraints.gridy = 0;
        labelTituloCadastroTurma = new JLabel("CADASTRAR TURMA");
        labelTituloCadastroTurma.setFont(new Font("Courier New", Font.BOLD,20));
        painelTituloCadastroTurma.add(labelTituloCadastroTurma);
        painelCadastroTurma.add(painelTituloCadastroTurma,constraints);

        painelNomeCadastroTurma = new JPanel();
        painelNomeCadastroTurma.setLayout(new GridBagLayout());
        painelNomeCadastroTurma.setBackground(new Color(255, 255, 255, 0));
        constraints.gridy = 0; // Ajuste aqui para definir a linha correta
        constraints.gridx = 0;
        labelNomeCadastroTurma = new JLabel("Nome:");
        labelNomeCadastroTurma.setFont(new Font("Courier New", Font.PLAIN,13));
        painelNomeCadastroTurma.add(labelNomeCadastroTurma, constraints);
        textoNomeCadastroTurma = new JTextField(20);
        constraints.gridx = 1;
        painelNomeCadastroTurma.add(textoNomeCadastroTurma, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.WEST;
        painelCadastroTurma.add(painelNomeCadastroTurma,constraints);


        painelEscolaCadastroTurma = new JPanel();
        painelEscolaCadastroTurma.setLayout(new GridBagLayout());
        painelEscolaCadastroTurma.setBackground(new Color(255, 255, 255, 0));
        constraints.gridy = 0;
        constraints.gridx = 0;
        labelEscolaCadastroTurma = new JLabel("Escola:");
        labelEscolaCadastroTurma.setFont(new Font("Courier New", Font.PLAIN,13));
        painelEscolaCadastroTurma.add(labelEscolaCadastroTurma,constraints);
        String[] opcoesEscolaCadastroTurma = {""};
        comboEscolaCadastroTurma = new JComboBox<>(opcoesEscolaCadastroTurma);
        constraints.gridx = 1;
        painelEscolaCadastroTurma.add(comboEscolaCadastroTurma,constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        painelCadastroTurma.add(painelEscolaCadastroTurma,constraints);


        painelBtnCadastroTurma = new JPanel();
        painelBtnCadastroTurma.setLayout(new FlowLayout(FlowLayout.CENTER));

        painelBtnCadastroTurma.setBackground(new Color(255, 255, 255, 0));
        constraints.gridy = 3;
        constraints.gridx = 0;
        btnCadastroTurma = new JButton("Cadastrar");
        btnCadastroTurma.setFont(new Font("Courier New", Font.PLAIN,13));
        btnCadastroTurma.setFocusable(false);
        painelBtnCadastroTurma.add(btnCadastroTurma);
        constraints.anchor = GridBagConstraints.CENTER;
        painelCadastroTurma.add(painelBtnCadastroTurma,constraints);

    }
}

    
