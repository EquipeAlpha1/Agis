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
import org.equipealpha.agis.model.Escola;

/**
 *
 * @author nilber
 */
public class EscolaDAO {

    public void create(Escola e) {

        Connection con = GerenciamentoEscolar.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO escola (nome) VALUES(?)");
            stmt.setString(1, e.getNome());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            GerenciamentoEscolar.closeConnection(con, stmt);
        }

    }

    public List<Escola> read() {
        Connection con = GerenciamentoEscolar.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Escola> escolas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM escola");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Escola escola = new Escola();
                escola.setId_escola(rs.getInt("id"));
                escola.setNome(rs.getString("nome"));
                escolas.add(escola); // Adiciona o objeto 'escola' na lista 'escolas'
            }

        } catch (SQLException ex) {
            Logger.getLogger(EscolaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            GerenciamentoEscolar.closeConnection(con, stmt, rs);
        }

        return escolas; // Retorna a lista de objetos 'Escola' preenchida
    }

}
