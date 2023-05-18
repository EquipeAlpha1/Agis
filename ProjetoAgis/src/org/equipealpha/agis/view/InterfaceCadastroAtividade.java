//EXEMPLO DE COMO MUDAR O O CONTEUDO DA INTERFACE BASE
//NÃO MEXER NO PAINEL SIDEBAR, SOMENTE NO CONTEUDO

package org.equipealpha.agis.view;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;


public class InterfaceCadastroAtividade extends InterfaceBase{

    //panels
    private JPanel painelTituloCadastroAtividade;
    private JPanel painelNomeCadastroAtividade;
    private JPanel painelDataIniCadastroAtividade;
    private JPanel painelDataFimCadastroAtividade;
    private JPanel paineltipoCadastroAtividade;
    private JPanel painelBtnCadastroAtividade;
    //labels
    private JLabel labelTituloCadastroAtividade;
    private JLabel labelNomeCadastroAtividade;
    private JLabel labelDataIniCadastroAtividade;
    private JLabel labelDataFimCadastroAtividade;
    private JLabel labelTipoCadastroAtividade;
    //datechosser
    private JDateChooser dataIniCadastroAtividade;
    private JDateChooser dataFimCadastroAtividade;
    //textfields
    private JTextField textoNomeCadastroAtividade;
    //outros
    private GridBagConstraints constraints;
    private RoundedPanel painelCadastroAtividade;
    private JButton btnCadastroAtividade;
    private JComboBox comboTipoCadastroAtividade;
    
     public InterfaceCadastroAtividade() {
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
        painelCadastroAtividade = new RoundedPanel(20);
        painelCadastroAtividade.setLayout(new GridBagLayout());
        painelCadastroAtividade.setPreferredSize(new Dimension(500, 550));
        painelCadastroAtividade.setBackground(new Color(255, 255, 255, 175));
        degradeconteudo.add(painelCadastroAtividade, constraints);


        painelTituloCadastroAtividade = new JPanel();
        painelTituloCadastroAtividade.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        painelTituloCadastroAtividade.setBackground(new Color(255, 255, 255, 0));
        constraints.gridx = 0;
        constraints.gridy = 0;
        labelTituloCadastroAtividade = new JLabel("CADASTRAR ATIVIDADE");
        labelTituloCadastroAtividade.setFont(new Font("Courier New", Font.BOLD,20));
        painelTituloCadastroAtividade.add(labelTituloCadastroAtividade);
        painelCadastroAtividade.add(painelTituloCadastroAtividade,constraints);


        painelNomeCadastroAtividade = new JPanel();
        painelNomeCadastroAtividade.setLayout(new FlowLayout(FlowLayout.LEFT));
        painelNomeCadastroAtividade.setBackground(new Color(255, 255, 255, 0));
        constraints.gridy = 1;
        constraints.gridx = 0;
        labelNomeCadastroAtividade = new JLabel("Nome:");
        labelNomeCadastroAtividade.setFont(new Font("Courier New", Font.PLAIN,13));
        textoNomeCadastroAtividade = new JTextField(30);
        painelNomeCadastroAtividade.add(labelNomeCadastroAtividade);
        painelNomeCadastroAtividade.add(textoNomeCadastroAtividade);
        painelCadastroAtividade.add(painelNomeCadastroAtividade,constraints);


        painelDataIniCadastroAtividade = new JPanel();
        painelDataIniCadastroAtividade.setLayout(new GridBagLayout());
        painelDataIniCadastroAtividade.setBackground(new Color(255, 255, 255, 0));
        labelDataIniCadastroAtividade = new JLabel("Data de início:");
        labelDataIniCadastroAtividade.setFont(new Font("Courier New", Font.PLAIN,13));
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        painelDataIniCadastroAtividade.add(labelDataIniCadastroAtividade,constraints);
        dataIniCadastroAtividade = new JDateChooser();
        dataIniCadastroAtividade.setDateFormatString("dd/MM/yyyy");
        constraints.gridx = 1;
        painelDataIniCadastroAtividade.add(dataIniCadastroAtividade,constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        painelCadastroAtividade.add(painelDataIniCadastroAtividade, constraints);

        painelDataFimCadastroAtividade = new JPanel();
        painelDataFimCadastroAtividade.setLayout(new GridBagLayout());
        painelDataFimCadastroAtividade.setBackground(new Color(255, 255, 255, 0));
        labelDataFimCadastroAtividade = new JLabel("Data de final:");
        labelDataFimCadastroAtividade.setFont(new Font("Courier New", Font.PLAIN,13));
        constraints.gridy = 0;
        painelDataFimCadastroAtividade.add(labelDataFimCadastroAtividade,constraints);
        dataFimCadastroAtividade = new JDateChooser();
        dataFimCadastroAtividade.setDateFormatString("dd/MM/yyyy");
        constraints.gridx = 1;
        painelDataFimCadastroAtividade.add(dataFimCadastroAtividade,constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        painelCadastroAtividade.add(painelDataFimCadastroAtividade, constraints);

        paineltipoCadastroAtividade = new JPanel();
        paineltipoCadastroAtividade.setLayout(new GridBagLayout());
        paineltipoCadastroAtividade.setBackground(new Color(255, 255, 255, 0));
        labelTipoCadastroAtividade = new JLabel("Tipo:");
        labelTipoCadastroAtividade.setFont(new Font("Courier New", Font.PLAIN,13));
        constraints.gridy = 0;
        paineltipoCadastroAtividade.add(labelTipoCadastroAtividade,constraints);
        String[] opcoesTipoCadastroTipo = {""};
        comboTipoCadastroAtividade = new JComboBox<>(opcoesTipoCadastroTipo);
        constraints.gridx = 1;
        paineltipoCadastroAtividade.add(comboTipoCadastroAtividade,constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;
        painelCadastroAtividade.add(paineltipoCadastroAtividade, constraints);


        painelBtnCadastroAtividade = new JPanel();
        painelBtnCadastroAtividade.setLayout(new FlowLayout(FlowLayout.RIGHT));
        painelBtnCadastroAtividade.setBackground(new Color(255, 255, 255, 0));
        constraints.gridy = 5;
        constraints.gridx = 0;
        constraints.anchor = GridBagConstraints.CENTER;
        btnCadastroAtividade = new JButton("Cadastrar");
        btnCadastroAtividade.setFont(new Font("Courier New", Font.PLAIN,13));
        btnCadastroAtividade.setFocusable(false);
        painelBtnCadastroAtividade.add(btnCadastroAtividade);
        painelCadastroAtividade.add(painelBtnCadastroAtividade,constraints);

        }
    
}
