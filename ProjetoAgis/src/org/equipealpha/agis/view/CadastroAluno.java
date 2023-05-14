/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.equipealpha.agis.view;

import DAO.AlunoDAO;
import DAO.EscolaDAO;
import DAO.TurmaDAO;
import javax.swing.*;
import java.awt.*;
import org.equipealpha.agis.model.Aluno;
import org.equipealpha.agis.model.Escola;
import org.equipealpha.agis.model.Turma;

/**
 *
 * @author Pedro Davi
 */
public class CadastroAluno extends InterfaceBase {

    private JButton jButton1;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JTextField jTextField1;

    public CadastroAluno() {
        addConteudo();
    }

    @Override
    public void addConteudo() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE ALUNO");
        jLabel1.setFont(new Font(" Courier New", Font.BOLD, 17));

        jLabel2.setText("Nome do Aluno:");
        jLabel2.setFont(new Font(" Courier New", Font.BOLD, 14));

        jLabel3.setText("Escolha a Escola:");
        jLabel3.setFont(new Font(" Courier New", Font.BOLD, 14));
        jComboBox1 = new javax.swing.JComboBox<>();


        jComboBox1.addItem("Escolha a Escola");

        EscolaDAO daoEscola = new EscolaDAO();
        for (Escola e : daoEscola.read()) {
        jComboBox1.addItem(e.getNome());
        }


        jComboBox1.setSelectedIndex(0);


        jLabel4.setText("Escolha a Turma");
        jLabel4.setFont(new Font(" Courier New", Font.BOLD, 14));
        jComboBox2 = new javax.swing.JComboBox<>();


        jComboBox2.addItem("Escolha a Turma");

        TurmaDAO daoTurma = new TurmaDAO();
        for (Turma e : daoTurma.read()) {
            jComboBox2.addItem(e.getNome());
        }


        jComboBox2.setSelectedIndex(0);

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                Aluno a = new Aluno();
                AlunoDAO DAO = new AlunoDAO();

                a.setNome(jTextField1.getText());
                DAO.create(a);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(degradeconteudo);
        degradeconteudo.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(200, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(330, 330, 330))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton1)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel4))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jComboBox2, 0, 410, Short.MAX_VALUE)
                                                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jTextField1))))
                                                .addGap(145, 145, 145))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addGap(68, 68, 68)
                                .addComponent(jButton1)
                                .addContainerGap(399, Short.MAX_VALUE))
        );

        pack();
    }

}
