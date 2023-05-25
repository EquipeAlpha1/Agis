/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.equipealpha.agis.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.equipealpha.agis.controller.GerenciamentoEscolar;
import org.equipealpha.agis.model.Aluno;

/**
 *
 * @author nilber
 */
public class AlunoDAO {

    public void create(Aluno a) {

        Connection con = GerenciamentoEscolar.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO aluno (nome)VALUES(?)");
            stmt.setString(1, a.getNome());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            GerenciamentoEscolar.closeConnection(con, stmt);
        }
    }

    public List<Aluno> read() {
        Connection con = GerenciamentoEscolar.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Aluno> alunos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM turma");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Aluno novoAluno = new Aluno();
                novoAluno.setId_aluno(rs.getInt("id"));
                novoAluno.setNome(rs.getString("nome"));
                alunos.add(novoAluno);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            GerenciamentoEscolar.closeConnection(con, stmt, rs);
        }

        return alunos; // Retorna a lista de objetos 'Turma' preenchida
    }
}
