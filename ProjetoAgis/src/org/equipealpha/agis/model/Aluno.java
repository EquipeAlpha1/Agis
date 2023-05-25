package org.equipealpha.agis.model;

import java.util.ArrayList;

public class Aluno {

    private int id_aluno;
    private String nome;
    private ArrayList<Turma> turmas = new ArrayList<>();
    private ArrayList<Prova> provas = new ArrayList<>();
    private ArrayList<Trabalho> trabalhos = new ArrayList<>();
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addTurma(Turma turma) {
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
