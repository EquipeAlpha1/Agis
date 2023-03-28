package org.equipealpha.agis.model;

import java.time.LocalDate;

public class Atividade {

    private String nome;

    private LocalDate dataEntrega;

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
