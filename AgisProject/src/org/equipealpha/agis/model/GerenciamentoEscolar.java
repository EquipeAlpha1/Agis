package org.equipealpha.agis.model;

import java.util.LinkedList;

public class GerenciamentoEscolar {

    private String nome;

    private LinkedList<Turma> turmas = new LinkedList<>();

    public void cadastrarTurma(Turma turma){
        turmas.add(turma);
    }
    private String professor;

}
