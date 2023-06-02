//EXEMPLO DE COMO MUDAR O O CONTEUDO DA INTERFACE BASE
//NÃO MEXER NO PAINEL SIDEBAR, SOMENTE NO CONTEUDO
package org.equipealpha.agis.view;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import org.equipealpha.agis.DAO.EscolaDAO;
import org.equipealpha.agis.DAO.ProvaDAO;
import org.equipealpha.agis.DAO.TurmaDAO;
import org.equipealpha.agis.model.Escola;
import org.equipealpha.agis.model.Prova;
import org.equipealpha.agis.model.Turma;

public class InterfaceCadastroProva extends InterfaceBase {

    private Escola obterEscolaPorNome(String nomeEscola) {
        EscolaDAO escolaDAO = new EscolaDAO();
        for (Escola e : escolaDAO.read()) {
            if (e.getNome().equals(nomeEscola)) {
                return e;
            }
        }
        return null; // Retorna null se a escola não for encontrada
    }

    private Turma obterTurmaPorNome(String nomeTurma) {
        TurmaDAO turmaDAO = new TurmaDAO();
        for (Turma t : turmaDAO.read()) {
            if (t.getNome().equals(nomeTurma)) {
                return t;
            }
        }
        return null; // Retorna null se a turma não for encontrada
    }

    //panels
    private JPanel painelTituloCadastroProva;
    private JPanel painelNomeCadastroProva;
    private JPanel painelDataIniCadastroProva;
    private JPanel painelComboEscola;
    private JPanel painelComboTurma;
    private JPanel painelBtnCadastroProva;
    //labels
    private JLabel labelTituloCadastroProva;
    private JLabel labelNomeCadastroProva;
    private JLabel labelDataIniCadastroProva;
    private JLabel labelTurmaCadastroProva;
    private JLabel labelEscolaCadastroProva;
    //datechosser
    private JDateChooser dataIniCadastroProva;
    //textfields
    private JTextField textoNomeCadastroProva;
    //outros
    private GridBagConstraints constraints;
    private RoundedPanel painelCadastroProva;
    private JButton btnCadastroProva;
    private JComboBox comboTurmaCadastroProva;
    private JComboBox comboEscolaCadastroProva;

    public InterfaceCadastroProva() {
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
        painelCadastroProva = new RoundedPanel(20);
        painelCadastroProva.setLayout(new GridBagLayout());
        painelCadastroProva.setPreferredSize(new Dimension(550, 500));
        painelCadastroProva.setBackground(new Color(255, 255, 255, 175));
        degradeconteudo.add(painelCadastroProva, constraints);

        painelTituloCadastroProva = new JPanel();
        painelTituloCadastroProva.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        painelTituloCadastroProva.setBackground(new Color(255, 255, 255, 0));
        constraints.gridx = 0;
        constraints.gridy = 0;
        labelTituloCadastroProva = new JLabel("CADASTRAR PROVA");
        labelTituloCadastroProva.setFont(new Font("Courier New", Font.BOLD, 20));
        painelTituloCadastroProva.add(labelTituloCadastroProva);
        painelCadastroProva.add(painelTituloCadastroProva, constraints);

        painelNomeCadastroProva = new JPanel();
        painelNomeCadastroProva.setLayout(new GridBagLayout());
        painelNomeCadastroProva.setBackground(new Color(255, 255, 255, 0));
        labelNomeCadastroProva = new JLabel("Nome:");
        labelNomeCadastroProva.setFont(new Font("Courier New", Font.PLAIN, 13));
        painelNomeCadastroProva.add(labelNomeCadastroProva, constraints);
        textoNomeCadastroProva = new JTextField(30);
        constraints.gridx = 1;
        painelNomeCadastroProva.add(textoNomeCadastroProva, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.WEST;
        painelCadastroProva.add(painelNomeCadastroProva, constraints);

        painelDataIniCadastroProva = new JPanel();
        painelDataIniCadastroProva.setLayout(new GridBagLayout());
        painelDataIniCadastroProva.setBackground(new Color(255, 255, 255, 0));
        labelDataIniCadastroProva = new JLabel("Data de aplicação:");
        labelDataIniCadastroProva.setFont(new Font("Courier New", Font.PLAIN, 13));
        constraints.gridy = 0;
        painelDataIniCadastroProva.add(labelDataIniCadastroProva, constraints);
        dataIniCadastroProva = new JDateChooser();
        dataIniCadastroProva.setDateFormatString("dd/MM/yyyy");
        constraints.gridx = 1;
        painelDataIniCadastroProva.add(dataIniCadastroProva, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        painelCadastroProva.add(painelDataIniCadastroProva, constraints);

        painelComboEscola = new JPanel();
        painelComboEscola.setLayout(new GridBagLayout());
        painelComboEscola.setBackground(new Color(255, 255, 255, 0));
        labelEscolaCadastroProva = new JLabel("Escola:");
        labelEscolaCadastroProva.setFont(new Font("Courier New", Font.PLAIN, 13));
        constraints.gridy = 0;
        painelComboEscola.add(labelEscolaCadastroProva, constraints);
        String[] opcoesEscolaCadastroProva = {""};
        comboEscolaCadastroProva = new JComboBox<>(opcoesEscolaCadastroProva);
        constraints.gridx = 1;
        painelComboEscola.add(comboEscolaCadastroProva, constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        painelCadastroProva.add(painelComboEscola, constraints);

        EscolaDAO daoEscola = new EscolaDAO();
        for (Escola e : daoEscola.read()) {
            comboEscolaCadastroProva.addItem(e.getNome());
        }

        painelComboTurma = new JPanel();
        painelComboTurma.setLayout(new GridBagLayout());
        painelComboTurma.setBackground(new Color(255, 255, 255, 0));
        labelTurmaCadastroProva = new JLabel("Turma:");
        labelTurmaCadastroProva.setFont(new Font("Courier New", Font.PLAIN, 13));
        constraints.gridy = 0;
        constraints.gridx = 0;
        painelComboTurma.add(labelTurmaCadastroProva, constraints);
        String[] opcoesTurmaCadastroProva = {""};
        comboTurmaCadastroProva = new JComboBox<>(opcoesTurmaCadastroProva);
        constraints.gridx = 1;
        painelComboTurma.add(comboTurmaCadastroProva, constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;
        painelCadastroProva.add(painelComboTurma, constraints);

        TurmaDAO daoTurma = new TurmaDAO();
        for (Turma e : daoTurma.read()) {
            comboTurmaCadastroProva.addItem(e.getNome());
        }

        painelBtnCadastroProva = new JPanel();
        painelBtnCadastroProva.setLayout(new FlowLayout(FlowLayout.RIGHT));
        painelBtnCadastroProva.setBackground(new Color(255, 255, 255, 0));
        constraints.gridy = 5;
        constraints.gridx = 0;
        constraints.anchor = GridBagConstraints.CENTER;
        btnCadastroProva = new JButton("Cadastrar");
        btnCadastroProva.setFont(new Font("Courier New", Font.PLAIN, 13));
        btnCadastroProva.setFocusable(false);
        painelBtnCadastroProva.add(btnCadastroProva);
        painelCadastroProva.add(painelBtnCadastroProva, constraints);

        btnCadastroProva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prova prova = new Prova();
                ProvaDAO provaDAO = new ProvaDAO();
                prova.setNome(textoNomeCadastroProva.getText());

                // Obter a data selecionada do JDateChooser
                Date dataSelecionada = dataIniCadastroProva.getDate();
                if (dataSelecionada != null) {
                    // Converter a data para LocalDate
                    Instant instant = dataSelecionada.toInstant();
                    ZoneId zoneId = ZoneId.systemDefault();
                    LocalDate dataAplicacao = instant.atZone(zoneId).toLocalDate();
                    prova.setDataAplicacao(dataAplicacao);
                } else {
                    prova.setDataAplicacao(null);
                }

                provaDAO.create(prova);
            }
        });

    }

}
