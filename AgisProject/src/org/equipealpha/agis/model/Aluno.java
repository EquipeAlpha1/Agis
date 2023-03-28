package org.equipealpha.agis.model;

import java.util.LinkedList;

public class Aluno {

    private String nome;
    private int idAluno;
    private String turma;

    public Atividade getEntrega() {
        return entrega;
    }

    public void setEntrega(Atividade entrega) {
        this.entrega = entrega;
    }

    private Atividade entrega;
    private LinkedList<Atividade> atividades = new LinkedList<>();
}
