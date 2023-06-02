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
import org.equipealpha.agis.model.Tarefa;

/**
 *
 * @author nilber
 */
public class TarefaDAO {

    public void create(Tarefa tarefa) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = GerenciamentoEscolar.getConnection();

            String sql = "INSERT INTO tarefa (nome, dataInicio, dataFim) VALUES (?, ?, ?)";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, tarefa.getNome());

            LocalDate dataInicio = tarefa.getDataInicio();
            if (dataInicio != null) {
                stmt.setDate(2, java.sql.Date.valueOf(dataInicio));
            } else {
                stmt.setNull(2, Types.DATE);
            }

            LocalDate dataFim = tarefa.getDataFim();
            if (dataFim != null) {
                stmt.setDate(3, java.sql.Date.valueOf(dataFim));
            } else {
                stmt.setNull(3, Types.DATE);
            }

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex.getMessage());
        } finally {
            GerenciamentoEscolar.closeConnection(conn, stmt);
        }
    }

    public List<Tarefa> read() {
        Connection con = GerenciamentoEscolar.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Tarefa> tarefas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM turma");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Tarefa novaTarefa = new Tarefa();
                novaTarefa.setId_tarefa(rs.getInt("id"));
                novaTarefa.setNome(rs.getString("nome"));
                tarefas.add(novaTarefa);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TarefaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            GerenciamentoEscolar.closeConnection(con, stmt, rs);
        }

        return tarefas;
    }

}
