package org.equipealpha.agis.model;

import java.time.LocalDate;
import java.util.LinkedList;

public class Aluno {

    private String nome;
    private int idAluno;
    private String turma;
    private Atividade entrega;

    public Atividade getEntrega() {
        return entrega;
    }

    public void setEntrega(Atividade entrega) {
        this.entrega = entrega;
    }

    private LinkedList<Atividade> atividades = new LinkedList<>();


}
