package org.equipealpha.agis.model;

import java.time.LocalDate;

public class Tarefa {

    private int id_tarefa;
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private int fk_Turma_id;

    public int getId_tarefa() {
        return id_tarefa;
    }

    public void setId_tarefa(int id_tarefa) {
        this.id_tarefa = id_tarefa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public int getFk_Turma_id() {
        return fk_Turma_id;
    }

    public void setFk_Turma_id(int fk_Turma_id) {
        this.fk_Turma_id = fk_Turma_id;
    }

}
