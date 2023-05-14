/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.equipealpha.agis.model;

import java.awt.List;
import java.util.ArrayList;
import java.awt.*;

/**
 *
 * @author Pedro Davi
 */
public class ListaDeAtividades {
    
private ArrayList<Atividade> atividades;

    public ListaDeAtividades() {
        atividades = new ArrayList<>();
    }

    public void addAtividade(Atividade atividade) {
        atividades.add(atividade);
    }
    
}
