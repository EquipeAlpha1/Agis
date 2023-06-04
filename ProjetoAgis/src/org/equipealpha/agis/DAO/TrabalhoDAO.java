/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.equipealpha.agis.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.equipealpha.agis.controller.GerenciamentoEscolar;
import org.equipealpha.agis.model.Trabalho;

/**
 *
 * @author nilber
 */
public class TrabalhoDAO {
    
      public void create(Trabalho trabalho) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = GerenciamentoEscolar.getConnection();

            String sql = "INSERT INTO trabalho (nome, dataInicio, dataFim, fk_Turma_id) VALUES (?, ?, ?, ?)";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, trabalho.getNome());

            LocalDate dataInicio = trabalho.getDataInicio();
            if (dataInicio != null) {
                stmt.setDate(2, java.sql.Date.valueOf(dataInicio));
            } else {
                stmt.setNull(2, Types.DATE);
            }

            LocalDate dataFim = trabalho.getDataFim();
            if (dataFim != null) {
                stmt.setDate(3, java.sql.Date.valueOf(dataFim));
            } else {
                stmt.setNull(3, Types.DATE);
            }
            
            stmt.setInt(4, trabalho.getFk_Turma_id());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex.getMessage());
        } finally {
            GerenciamentoEscolar.closeConnection(conn, stmt);
        }
    }

    public List<Trabalho> read() {
        Connection con = GerenciamentoEscolar.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Trabalho> trabalhos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM turma");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Trabalho novoTrabalho = new Trabalho();
                novoTrabalho.setId_trabalho(rs.getInt("id"));
                novoTrabalho.setNome(rs.getString("nome"));
                trabalhos.add(novoTrabalho);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TarefaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            GerenciamentoEscolar.closeConnection(con, stmt, rs);
        }

        return trabalhos;
    }
    
}
