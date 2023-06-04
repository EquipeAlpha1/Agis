package org.equipealpha.agis.model;

import java.time.LocalDate;

public class Prova {
    
    private int id_prova;
    private String nome;
    private LocalDate dataAplicacao;
    private int fk_Turma_id;
    private Turma turma;

    public int getId_prova() {
        return id_prova;
    }

    public void setId_prova(int id_prova) {
        this.id_prova = id_prova;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public int getFk_Turma_id() {
        return fk_Turma_id;
    }

    public void setFk_Turma_id(int fk_Turma_id) {
        this.fk_Turma_id = fk_Turma_id;
    }
    
    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
