/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.equipealpha.agis.model;

/**
 *
 * @author Pedro Davi
 */
public class Atividade {
    
    private String nome;
    private String dataInicio;
    private String dataTermino;
    private String turma;
    private String tipo;

    public Atividade(String nome, String dataInicio, String dataTermino, String turma, String tipo) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.turma = turma;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public String getTurma() {
        return turma;
    }

    public String getTipo() {
        return tipo;
    }
    
}
