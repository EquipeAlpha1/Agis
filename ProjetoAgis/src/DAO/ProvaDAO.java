/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

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
import org.equipealpha.agis.model.Prova;

/**
 *
 * @author nilber
 */
public class ProvaDAO {
    
        public void create(Prova prova) {
        
        Connection con = GerenciamentoEscolar.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO produto (nome,DataAplicacao,concluido)VALUES(?,?,?)");
            stmt.setString(1, prova.getNome());
            stmt.setDate(2, java.sql.Date.valueOf(prova.getDataAplicacao()));
            stmt.setBoolean(3, prova.isConcluido());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);
        } finally {
            GerenciamentoEscolar.closeConnection(con, stmt);
        }

    }
    
}
