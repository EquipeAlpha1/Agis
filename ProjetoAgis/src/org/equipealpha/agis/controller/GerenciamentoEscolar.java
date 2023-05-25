package org.equipealpha.agis.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.equipealpha.agis.DAO.*;
import org.equipealpha.agis.model.Aluno;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.equipealpha.agis.model.Escola;
import org.equipealpha.agis.model.Prova;
import org.equipealpha.agis.model.Tarefa;
import org.equipealpha.agis.model.Trabalho;
import org.equipealpha.agis.model.Turma;
import org.equipealpha.agis.view.*;

public class GerenciamentoEscolar {

    //BD
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/agis";
    private static final String USER = "root";
    private static final String PASS = "123456";
    //Classes
    private SelectTurma enviarSelectTurma;
    private ListaAtividades enviarInterfacePendencias;
    private CadastroAluno enviarCadastroAluno;
    private CadastroEscola enviarCadastroEscola;
    private CadastroTurma enviarCadastroTurma;
    private InterfaceCadastroProva interfaceCadastroProva;
    private InterfaceCadastroTrabalho interfaceCadastroTrabalho;
    private InterfaceCadastroTarefa interfaceCadastroTarefa;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Turma> turmas = new ArrayList<Turma>();
    private ArrayList<Escola> escolas = new ArrayList<Escola>();
    private ArrayList<Trabalho> trabalhos = new ArrayList<Trabalho>();
    private ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
    private ArrayList<Prova> provas = new ArrayList<Prova>();

    //metodos BD
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GerenciamentoEscolar.class.getName()).log(Level.SEVERE, "Driver JDBC não encontrado", ex);
            throw new RuntimeException("Erro na conexão: Driver JDBC não encontrado", ex);
        } catch (SQLException ex) {
            Logger.getLogger(GerenciamentoEscolar.class.getName()).log(Level.SEVERE, "Erro ao conectar ao banco de dados", ex);
            throw new RuntimeException("Erro na conexão: Erro ao conectar ao banco de dados", ex);
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

    //Metodos de exibicao de interfaces
    public void exibirListaAtividades() {

        enviarInterfacePendencias = new ListaAtividades();
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

    public void exibirCadastroProva() {
        interfaceCadastroProva = new InterfaceCadastroProva();
        interfaceCadastroProva.setVisible(true);
    }

    public void exibirCadastroTrabalho() {
        interfaceCadastroTrabalho = new InterfaceCadastroTrabalho();
        interfaceCadastroTrabalho.setVisible(true);
    }

    public void exibirCadastroTarefa() {
        interfaceCadastroTarefa = new InterfaceCadastroTarefa();
        interfaceCadastroTarefa.setVisible(true);
    }


    //Metodos de interacao entre as paginas
    public void criarProva(String nome, LocalDate dataAplicacao, String nomeTurma){
        Prova prova = new Prova();
        prova.setNome(nome);
        prova.setDataAplicacao(dataAplicacao);
        for (Turma t : turmas){
            if (t.getNome().equals(nomeTurma)){
                prova.setTurma(t);
            }
        }
        ProvaDAO DAO = new ProvaDAO();
        DAO.create(prova);
        provas.add(prova);
    }


    public void criarTarefa(String nome, LocalDate dataInic, LocalDate dataFinal, String nomeTurma){
        Tarefa tarefa = new Tarefa();
        tarefa.setNome(nome);
        tarefa.setDataInicio(dataInic);
        tarefa.setDataFim(dataFinal);
        for (Turma t : turmas){
            if (t.getNome().equals(nomeTurma)){
                tarefa.setTurma(t);
            }
        }
        TarefaDAO DAO = new TarefaDAO();
        DAO.create(tarefa);
        tarefas.add(tarefa);
    }


    public void criarTrabalho(String nome, LocalDate dataInic, LocalDate dataFinal, String nomeTurma){
        Trabalho trabalho = new Trabalho();
        trabalho.setNome(nome);
        trabalho.setDataInicio(dataInic);
        trabalho.setDataFim(dataFinal);
        for (Turma t : turmas){
            if (t.getNome().equals(nomeTurma)){
                trabalho.setTurma(t);
            }
        }
        TrabalhoDAO DAO = new TrabalhoDAO();
        DAO.create(trabalho);
        trabalhos.add(trabalho);
    }


    public void criarEscola(String nome){
        Escola e = new Escola();
        e.setNome(nome);
        EscolaDAO DAO = new EscolaDAO();
        DAO.create(e);
        escolas.add(e);
    }


    public void criarTurma(String nome, String nomeEscola){
        Turma t = new Turma();
        t.setNome(nome);
        for (Escola e : escolas){
            if (e.getNome().equals(nomeEscola)){
                t.setEscola(e);
            }
        }
        TurmaDAO DAO = new TurmaDAO();
        DAO.create(t);
        turmas.add(t);
    }


    public void criarAluno(String nome, String nomeEscola, String nomeTurma){
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        for (Turma t : turmas){
            if (t.getNome().equals(nomeTurma)) {
                aluno.addTurma(t);
            }
        }
        AlunoDAO DAO = new AlunoDAO();
        DAO.create(aluno);
        alunos.add(aluno);
    }
}
