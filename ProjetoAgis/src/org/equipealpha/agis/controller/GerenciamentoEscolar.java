package org.equipealpha.agis.controller;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.equipealpha.agis.model.Aluno;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.equipealpha.agis.DAO.AlunoDAO;
import org.equipealpha.agis.DAO.EscolaDAO;
import org.equipealpha.agis.DAO.ProvaDAO;
import org.equipealpha.agis.DAO.TarefaDAO;
import org.equipealpha.agis.DAO.TrabalhoDAO;
import org.equipealpha.agis.DAO.TurmaDAO;
import org.equipealpha.agis.model.Escola;
import org.equipealpha.agis.model.Prova;
import org.equipealpha.agis.model.Tarefa;
import org.equipealpha.agis.model.Trabalho;
import org.equipealpha.agis.model.Turma;
import org.equipealpha.agis.view.CadastroAluno;
import org.equipealpha.agis.view.CadastroEscola;
import org.equipealpha.agis.view.CadastroTurma;
import org.equipealpha.agis.view.InterfaceCadastroAtividade;
import org.equipealpha.agis.view.InterfaceCadastroProva;
import org.equipealpha.agis.view.InterfaceCadastroTarefa;
import org.equipealpha.agis.view.InterfaceCadastroTrabalho;
import org.equipealpha.agis.view.InterfacePendencias;
import org.equipealpha.agis.view.ListaAtividades;
import org.equipealpha.agis.view.SelectTurma;

public class GerenciamentoEscolar {

    //formato do localDate
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //Conexões Banco de dados
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/agis";
    private static final String USER = "root";
    private static final String PASS = "123456";

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

}

//    //Metodos de interacao entre as paginas
//    public void criarProva(String nome, LocalDate dataAplicacao, String nomeTurma) {
//        Prova prova = new Prova();
//        prova.setNome(nome);
//
//        // Formata a data no formato "dd/MM/yyyy"
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String formattedDate = dataAplicacao.format(formatter);
//        prova.setDataAplicacao(LocalDate.parse(formattedDate, formatter));
//
//        for (Turma t : turmas) {
//            if (t.getNome().equals(nomeTurma)) {
//                prova.setTurma(t);
//            }
//        }
//        ProvaDAO DAO = new ProvaDAO();
//        DAO.create(prova);
//        provas.add(prova);
//    }

//    public void criarTarefa(String nome, LocalDate dataInic, LocalDate dataFinal, String nomeTurma) {
//        Tarefa tarefa = new Tarefa();
//        tarefa.setNome(nome);
//        // Formata a data de início no formato "dd/MM/yyyy"
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String formattedDataInic = dataInic.format(formatter);
//        tarefa.setDataInicio(LocalDate.parse(formattedDataInic, formatter));
//
//        // Formata a data final no formato "dd/MM/yyyy"
//        String formattedDataFinal = dataFinal.format(formatter);
//        tarefa.setDataFim(LocalDate.parse(formattedDataFinal, formatter));
//
//        for (Turma t : turmas) {
//            if (t.getNome().equals(nomeTurma)) {
//                tarefa.setTurma(t);
//            }
//        }
//        TarefaDAO DAO = new TarefaDAO();
//        DAO.create(tarefa);
//        tarefas.add(tarefa);
//    }
//
//    public void criarTrabalho(String nome, LocalDate dataInic, LocalDate dataFinal, String nomeTurma) {
//        Trabalho trabalho = new Trabalho();
//        trabalho.setNome(nome);
//
//        // Formata a data de início no formato "dd/MM/yyyy"
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String formattedDataInic = dataInic.format(formatter);
//        trabalho.setDataInicio(LocalDate.parse(formattedDataInic, formatter));
//
//        // Formata a data final no formato "dd/MM/yyyy"
//        String formattedDataFinal = dataFinal.format(formatter);
//        trabalho.setDataFim(LocalDate.parse(formattedDataFinal, formatter));
//
//        for (Turma t : turmas) {
//            if (t.getNome().equals(nomeTurma)) {
//                trabalho.setTurma(t);
//            }
//        }
//        TrabalhoDAO DAO = new TrabalhoDAO();
//        DAO.create(trabalho);
//        trabalhos.add(trabalho);
//    }
//
//    public void criarEscola(String nome) {
//        Escola e = new Escola();
//        e.setNome(nome);
//        EscolaDAO DAO = new EscolaDAO();
//        DAO.create(e);
//        escolas.add(e);
//    }
//
//    public void criarTurma(String nome, String nomeEscola) {
//        Turma t = new Turma();
//        t.setNome(nome);
//        for (Escola e : escolas) {
//            if (e.getNome().equals(nomeEscola)) {
//                t.setEscola(e);
//            }
//        }
//        TurmaDAO DAO = new TurmaDAO();
//        DAO.create(t);
//        turmas.add(t);
//    }
//
//    public void criarAluno(String nome, String nomeEscola, String nomeTurma) {
//        Aluno aluno = new Aluno();
//        aluno.setNome(nome);
//        for (Turma t : turmas) {
//            if (t.getNome().equals(nomeTurma)) {
//               // aluno.addTurma(t);
//            }
//        }
//        AlunoDAO DAO = new AlunoDAO();
//        DAO.create(aluno);
//        alunos.add(aluno);
//    }
