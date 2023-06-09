/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.equipealpha.agis.model;

import java.time.LocalDate;

public class Trabalho {

    private int id_trabalho;
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private int fk_Turma_id;

    public int getId_trabalho() {
        return id_trabalho;
    }

    public void setId_trabalho(int id_trabalho) {
        this.id_trabalho = id_trabalho;
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
