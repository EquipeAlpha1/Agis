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
import org.equipealpha.agis.model.Turma;

/**
 *
 * @author nilber
 */
public class TurmaDAO {

    public void create(Turma t) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = GerenciamentoEscolar.getConnection();

            // Altere a consulta SQL para incluir a coluna da chave estrangeira
            String sql = "INSERT INTO turma (nome, fk_Escola_id) VALUES (?, ?)";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, t.getNome());
            stmt.setInt(2, t.getFk_Escola_id());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex.getMessage());
        } finally {
            GerenciamentoEscolar.closeConnection(conn, stmt);
        }
    }

    public List<Turma> read() {
        Connection con = GerenciamentoEscolar.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Turma> turmas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM turma");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Turma novaTurma = new Turma();
                novaTurma.setId_turma(rs.getInt("id"));
                novaTurma.setNome(rs.getString("nome"));
                turmas.add(novaTurma); // Adiciona o objeto 'novaTurma' na lista 'turmas'
            }

        } catch (SQLException ex) {
            Logger.getLogger(TurmaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            GerenciamentoEscolar.closeConnection(con, stmt, rs);
        }

        return turmas; // Retorna a lista de objetos 'Turma' preenchida
    }

}
