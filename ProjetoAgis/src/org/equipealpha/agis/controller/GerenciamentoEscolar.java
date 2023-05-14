package org.equipealpha.agis.controller;

import org.equipealpha.agis.model.Aluno;
import java.util.ArrayList;
import org.equipealpha.agis.model.Escola;
import org.equipealpha.agis.model.Prova;
import org.equipealpha.agis.model.Tarefa;
import org.equipealpha.agis.model.Trabalho;
import org.equipealpha.agis.model.Turma;
import org.equipealpha.agis.view.CadastroAluno;
import org.equipealpha.agis.view.CadastroEscola;
import org.equipealpha.agis.view.CadastroTurma;
import org.equipealpha.agis.view.InterfaceCadastroAtividade;
import org.equipealpha.agis.view.InterfacePendencias;
import org.equipealpha.agis.view.SelectTurma;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GerenciamentoEscolar {

    //conexão banco de dados
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/agis";
    private static final String USER = "root";
    private static final String PASS = "123456";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(GerenciamentoEscolar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {

        closeConnection(con);

        try {

            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(GerenciamentoEscolar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(GerenciamentoEscolar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Classes
    private SelectTurma enviarSelectTurma;
    private InterfacePendencias enviarInterfacePendencias;
    private CadastroAluno enviarCadastroAluno;
    private CadastroEscola enviarCadastroEscola;
    private CadastroTurma enviarCadastroTurma;
    private InterfaceCadastroAtividade enviarInterfaceCadastroAtividades;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Turma> turmas = new ArrayList<Turma>();
    private ArrayList<Escola> escolas = new ArrayList<Escola>();
    private ArrayList<Trabalho> trabalhos = new ArrayList<Trabalho>();
    private ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
    private ArrayList<Prova> provas = new ArrayList<Prova>();

    //Métodos
    public void porcentProvaRealizadas(Prova prova) {

        if (prova.isConcluido() == true) {

        }
    }

    public void exibirInterfacePendencias() {

        enviarInterfacePendencias = new InterfacePendencias();
        enviarInterfacePendencias.setVisible(true);
    }

    public void exibirInterfaceSelectTurma() {
        enviarSelectTurma = new SelectTurma();
        enviarSelectTurma.setVisible(true);
    }

    public void exibirCadastroAluno() {
        enviarCadastroAluno = new CadastroAluno();
        enviarCadastroAluno.setVisible(true);
    }

    public void exibirCadastroEscola() {
        enviarCadastroEscola = new CadastroEscola();
        enviarCadastroEscola.setVisible(true);
    }

    public void exibirCadastroTurma() {
        enviarCadastroTurma = new CadastroTurma();
        enviarCadastroTurma.setVisible(true);
    }

    public void exibirCadastroAtividade() {
        enviarInterfaceCadastroAtividades = new InterfaceCadastroAtividade();
        enviarInterfaceCadastroAtividades.setVisible(true);
    }

}
