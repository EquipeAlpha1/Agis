package org.equipealpha.agis.model;

import java.time.LocalDate;

public class Prova {
    
    private int id_prova;
    private String nome;
    private LocalDate dataAplicacao;

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
}
