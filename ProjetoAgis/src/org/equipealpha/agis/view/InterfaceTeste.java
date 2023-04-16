//EXEMPLO DE COMO MUDAR O O CONTEUDO DA INTERFACE BASE
//NÃO MEXER NO PAINEL SIDEBAR, SOMENTE NO CONTEUDO

package org.equipealpha.agis.view;

import java.awt.*;
import javax.swing.*;


public class InterfaceTeste extends InterfaceBase{

    private JButton botao;

    public InterfaceTeste() {
        addConteudo();
    }
    
    
    @Override
    public void addConteudo() {
        botao = new JButton("Ola");
        botao.setSize(100,50);
        botao.setLocation(10,10);
        botao.setBackground(Color.RED);
        conteudo.add(botao);
        
    }
    
}
