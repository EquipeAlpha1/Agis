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
import org.equipealpha.agis.model.Prova;

/**
 *
 * @author nilber
 */
public class ProvaDAO {

    public void create(Prova prova) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = GerenciamentoEscolar.getConnection();

            String sql = "INSERT INTO prova (nome, DataAplicacao) VALUES (?, ?)";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, prova.getNome());

            LocalDate dataAplicacao = prova.getDataAplicacao();
            if (dataAplicacao != null) {
                stmt.setDate(2, java.sql.Date.valueOf(dataAplicacao));
            } else {
                stmt.setNull(2, Types.DATE);
            }

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex.getMessage());
        } finally {
            GerenciamentoEscolar.closeConnection(conn, stmt);
        }
    }

    public List<Prova> read() {
        Connection con = GerenciamentoEscolar.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Prova> provas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM turma");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Prova novaProva = new Prova();
                novaProva.setId_prova(rs.getInt("id"));
                novaProva.setNome(rs.getString("nome"));
                provas.add(novaProva);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProvaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            GerenciamentoEscolar.closeConnection(con, stmt, rs);
        }

        return provas; // Retorna a lista de objetos 'Turma' preenchida
    }
}
