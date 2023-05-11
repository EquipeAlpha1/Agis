package org.equipealpha.agis.controller;

import org.equipealpha.agis.model.Aluno;
import java.util.ArrayList;
import org.equipealpha.agis.model.Escola;
import org.equipealpha.agis.model.Prova;
import org.equipealpha.agis.model.Tarefa;
import org.equipealpha.agis.model.Trabalho;
import org.equipealpha.agis.model.Turma;
import org.equipealpha.agis.view.InterfacePendencias;
import org.equipealpha.agis.view.SelectTurma;

public class GerenciamentoEscolar {
    //chamando as classes
    SelectTurma enviarSelectTurma;
    InterfacePendencias enviarInterfacePendencias;

    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Turma> turmas = new ArrayList<Turma>();
    private ArrayList<Escola> escolas = new ArrayList<Escola>();
    private ArrayList<Trabalho> trabalhos = new ArrayList<Trabalho>();
    private ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
    private ArrayList<Prova> provas = new ArrayList<Prova>();

    public void estatisticasTurma(){
        
    }

    public void estatiticaAluno(){

    }
    
    public void ExibirInterfacePendencias(){
        
        enviarInterfacePendencias = new InterfacePendencias();
        enviarInterfacePendencias.setVisible(true);
    }
    
    public void ExibirInterfaceSelectTurma(){
            
            enviarSelectTurma = new SelectTurma();
            enviarSelectTurma.setVisible(true);
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}