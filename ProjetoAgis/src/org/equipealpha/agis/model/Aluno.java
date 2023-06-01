package org.equipealpha.agis.model;

import java.util.ArrayList;

public class Aluno {

private int id_aluno;
    private String nome;
    private int fk_Escola_id;
    private int fk_Turma_id;
    private ArrayList<Turma> turmas = new ArrayList<>();
    private ArrayList<Prova> provas = new ArrayList<>();
    private ArrayList<Trabalho> trabalhos = new ArrayList<>();
    private ArrayList<Tarefa> tarefas = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public int getFk_Escola_id() {
        return fk_Escola_id;
    }

    public void setFk_Escola_id(int fk_Escola_id) {
        this.fk_Escola_id = fk_Escola_id;
    }

    public int getFk_Turma_id() {
        return fk_Turma_id;
    }

    public void setFk_Turma_id(int fk_Turma_id) {
        this.fk_Turma_id = fk_Turma_id;
    }
    
    

    public void addTurmaAluno(Turma turma) {
        turmas.add(turma);
    }

    public void addProvaAluno(Prova prova) {
        provas.add(prova);
    }

    public void addTrabalhoAluno(Trabalho trabalho) {
        trabalhos.add(trabalho);
    }

    public void addTarefaAluno(Tarefa tarefa) {
        tarefas.add(tarefa);
    }
}
