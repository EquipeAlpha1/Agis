package org.equipealpha.agis.view;

import DAO.EscolaDAO;
import javax.swing.*;
import java.awt.*;
import org.equipealpha.agis.model.Escola;

public class CadastroEscola extends InterfaceBase {

    //paineis
    private JPanel painelTituloCadastroEscola;
    private JPanel painelNomeCadastroEscola;
    private JPanel painelBtnCadastroEscola;
    //labels
    private JLabel labelTituloCadastroEscola;
    private JLabel labelNomeCadastroEscola;
    //textfields
    private JTextField textoNomeCadastroEscola;
    //outros
    private GridBagConstraints constraints;
    private RoundedPanel painelCadastroEscola;
    private JButton btnCadastroEscola;

    public CadastroEscola() {
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
        painelCadastroEscola = new RoundedPanel(20);
        painelCadastroEscola.setLayout(new GridBagLayout());
        painelCadastroEscola.setPreferredSize(new Dimension(400, 250));
        painelCadastroEscola.setBackground(new Color(255, 255, 255, 175));
        degradeconteudo.add(painelCadastroEscola, constraints);

        painelTituloCadastroEscola = new JPanel();
        painelTituloCadastroEscola.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        painelTituloCadastroEscola.setBackground(new Color(255, 255, 255, 0));
        constraints.gridx = 0;
        constraints.gridy = 0;
        labelTituloCadastroEscola = new JLabel("CADASTRAR ESCOLA");
        labelTituloCadastroEscola.setFont(new Font("Courier New", Font.BOLD, 20));
        painelTituloCadastroEscola.add(labelTituloCadastroEscola);
        painelCadastroEscola.add(painelTituloCadastroEscola, constraints);

        painelNomeCadastroEscola = new JPanel();
        painelNomeCadastroEscola.setLayout(new FlowLayout(FlowLayout.LEFT));
        painelNomeCadastroEscola.setBackground(new Color(255, 255, 255, 0));
        constraints.gridy = 1;
        constraints.gridx = 0;
        labelNomeCadastroEscola = new JLabel("Nome:");
        labelNomeCadastroEscola.setFont(new Font("Courier New", Font.PLAIN,13));
        textoNomeCadastroEscola = new JTextField(30);
        painelNomeCadastroEscola.add(labelNomeCadastroEscola);
        painelNomeCadastroEscola.add(textoNomeCadastroEscola);
        painelCadastroEscola.add(painelNomeCadastroEscola, constraints);

        painelBtnCadastroEscola = new JPanel();
        painelBtnCadastroEscola.setLayout(new FlowLayout(FlowLayout.RIGHT));
        painelBtnCadastroEscola.setBackground(new Color(255, 255, 255, 0));
        constraints.gridy = 2;
        constraints.gridx = 0;
        btnCadastroEscola = new JButton("Cadastrar");
        btnCadastroEscola.setFont(new Font("Courier New", Font.PLAIN,13));
        btnCadastroEscola.setFocusable(false);
        painelBtnCadastroEscola.add(btnCadastroEscola);
        painelCadastroEscola.add(painelBtnCadastroEscola, constraints);

        btnCadastroEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                Escola e = new Escola();
                EscolaDAO DAO = new EscolaDAO();

                e.setNome(textoNomeCadastroEscola.getText());
                DAO.create(e);
            }
        });
    }
}