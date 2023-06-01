/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.equipealpha.agis.model;

/**
 *
 * @author natan
 */
public class Turma {

    private int id_turma;
    private String nome;
    private Escola escola;
    private int fk_Escola_id;


    public int getId_turma() {
        return id_turma;
    }

    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    public int getFk_Escola_id() {
        return fk_Escola_id;
    }

    public void setFk_Escola_id(int fk_Escola_id) {
        this.fk_Escola_id = fk_Escola_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

}

