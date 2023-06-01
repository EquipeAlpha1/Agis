package org.equipealpha.agis.view;

import javax.swing.*;
import java.awt.*;
import org.equipealpha.agis.DAO.AlunoDAO;
import org.equipealpha.agis.DAO.EscolaDAO;
import org.equipealpha.agis.DAO.TurmaDAO;
import org.equipealpha.agis.controller.GerenciamentoEscolar;
import org.equipealpha.agis.model.Aluno;
import org.equipealpha.agis.model.Escola;
import org.equipealpha.agis.model.Turma;

public class CadastroAluno extends InterfaceBase {

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
    private GerenciamentoEscolar gerenciamentoEscolar = new GerenciamentoEscolar();

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
        painelCadastroAluno.setPreferredSize(new Dimension(500, 400));
        painelCadastroAluno.setBackground(new Color(255, 255, 255, 175));
        degradeconteudo.add(painelCadastroAluno, constraints);

        labelTituloCadastroAluno = new JLabel("CADASTRAR ALUNO");
        labelTituloCadastroAluno.setFont(new Font("Courier New", Font.BOLD, 20));
        constraints.gridwidth = 2;
        constraints.gridx = 2;
        painelCadastroAluno.add(labelTituloCadastroAluno, constraints);

        labelNomeCadastroAluno = new JLabel("Nome:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        labelNomeCadastroAluno.setFont(new Font("Courier New", Font.PLAIN, 13));
        painelCadastroAluno.add(labelNomeCadastroAluno, constraints);
        textoNomeCadastroAluno = new JTextField();
        constraints.gridx = 1;
        constraints.gridwidth = 4;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets.set(20, 0, 20, 0);
        painelCadastroAluno.add(textoNomeCadastroAluno, constraints);

        labelEscolaCadastroAluno = new JLabel("Escola:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        labelEscolaCadastroAluno.setFont(new Font("Courier New", Font.PLAIN, 13));
        painelCadastroAluno.add(labelEscolaCadastroAluno, constraints);
        String[] opcoesComboEscola = {""};
        comboEscola = new JComboBox(opcoesComboEscola);
        constraints.gridx = 1;
        painelCadastroAluno.add(comboEscola, constraints);

        EscolaDAO daoEscola = new EscolaDAO();
        for (Escola e : daoEscola.read()) {
            comboEscola.addItem(e.getNome());
        }

        labelTurmaCadastroAluno = new JLabel("Turma:");
        constraints.gridx = 0;
        constraints.gridy = 3;
        labelTurmaCadastroAluno.setFont(new Font("Courier New", Font.PLAIN, 13));
        painelCadastroAluno.add(labelTurmaCadastroAluno, constraints);
        String[] opcoesTurma = {""};
        comboTurma = new JComboBox(opcoesTurma);
        constraints.gridx = 1;
        painelCadastroAluno.add(comboTurma, constraints);

        TurmaDAO daoTurma = new TurmaDAO();
        for (Turma e : daoTurma.read()) {
            comboTurma.addItem(e.getNome());
        }

        btnCadastroAluno = new JButton("Cadastrar");
        btnCadastroAluno.setFocusable(false);
        btnCadastroAluno.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCadastroAluno.setFont(new Font("Courier New", Font.PLAIN, 13));
        constraints.gridx = 4;
        constraints.gridy = 4;
        constraints.anchor = GridBagConstraints.CENTER;
        painelCadastroAluno.add(btnCadastroAluno, constraints);

        btnCadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aluno a = new Aluno();
                AlunoDAO alunoDAO = new AlunoDAO();
                a.setNome(textoNomeCadastroAluno.getText());

                // Obter a escola selecionada no JComboBox
                String nomeEscola = (String) comboEscola.getSelectedItem();
                Escola escola = obterEscolaPorNome(nomeEscola);

                // Verificar se a escola foi encontrada e configurar a chave estrangeira
                if (escola != null) {
                    a.setFk_Escola_id(escola.getId_escola());
                } else {
                    // Lógica para lidar com o caso em que a escola não foi encontrada
                    JOptionPane.showMessageDialog(null, "Escola não encontrada. Verifique o nome e tente novamente.");
                    return; // Encerrar o método caso a escola não seja encontrada
                }

                // Obter a turma selecionada no JComboBox
                String nomeTurma = (String) comboTurma.getSelectedItem();
                Turma turma = obterTurmaPorNome(nomeTurma);

                // Verificar se a turma foi encontrada e configurar a chave estrangeira
                if (turma != null) {
                    a.setFk_Turma_id(turma.getId_turma());
                } else {
                    // Lógica para lidar com o caso em que a turma não foi encontrada
                    JOptionPane.showMessageDialog(null, "Turma não encontrada. Verifique o nome e tente novamente.");
                    return; // Encerrar o método caso a turma não seja encontrada
                }

                alunoDAO.create(a);

            }
        });
    }
}
