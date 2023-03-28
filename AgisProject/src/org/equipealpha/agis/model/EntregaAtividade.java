package org.equipealpha.agis.model;

public class EntregaAtividade {

    private Atividade atividade;

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade novaAtividade) {
        this.atividade = atividade;
    }

    private double nota;

    public double getNota() {
        return nota;
    }

    public void setNota(double novaNota) {
        this.nota = nota;
    }
}
