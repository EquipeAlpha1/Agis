package org.equipealpha.agis.model;

import java.util.LinkedList;
import java.lang.String;

public class Turma {

    private String nome;

    private LinkedList<Aluno> alunos = new LinkedList<Aluno>();

    public void cadastrarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    private LinkedList<Atividade> atividades = new LinkedList<>();

    public void cadastrarAtividade(Atividade ativ){atividades.add(ativ);
    }

    public LinkedList<Aluno> buscaAlunoDevedor(Aluno entrega){
        LinkedList<Aluno> alunoDevedor = new LinkedList<Aluno>();
        for(Aluno aluno: alunos){
            if (aluno.getEntrega().getDataEntrega(entrega))alunoDevedor.add(aluno);
        }
    }
}
