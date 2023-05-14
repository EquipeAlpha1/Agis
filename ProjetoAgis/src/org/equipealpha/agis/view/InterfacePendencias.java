//EXEMPLO DE COMO MUDAR O O CONTEUDO DA INTERFACE BASE
//NÃO MEXER NO PAINEL SIDEBAR, SOMENTE NO CONTEUDO

package org.equipealpha.agis.view;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.List;
import java.util.ArrayList;


public class InterfacePendencias extends InterfaceBase{
    
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    
     public InterfacePendencias() {addConteudo();}
    
    
    public void addConteudo(InterfaceCadastroAtividade atividade) {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        
        jLabel1.setFont(new Font("Courier New", 1, 16)); // NOI18N
        jLabel1.setText("Nome da Atividade: " + atividade.getjTextField1());
        
        jLabel2.setFont(new Font("Courier New", 1, 16)); // NOI18N
        jLabel2.setText("Data de Início: " + atividade.getjTextField2());
        
        jLabel3.setFont(new Font("Courier New", 1, 16)); // NOI18N
        jLabel3.setText("Data de término: " + atividade.getjTextField3());
        
        jLabel4.setFont(new Font("Courier New", 1, 16)); // NOI18N
        jLabel4.setText("Turma: " + atividade.getjTextField4());
        
        jLabel5.setFont(new Font("Courier New", 1, 16)); // NOI18N
        jLabel5.setText("Tipo: " + atividade.getjComboBox1());
        
        
        degradeconteudo.add(jLabel1);
        degradeconteudo.add(jLabel2);
        degradeconteudo.add(jLabel3);
        degradeconteudo.add(jLabel4);
        degradeconteudo.add(jLabel5);
    }
    
        //public void exibirDados(InterfaceCadastroAtividade atividade) {
        //String texto = "Nome da Atividade: " + atividade.getjTextField1() + " | Data de Início: " + atividade.getjTextField2() + " | Data de término: "
            //     + atividade.getjTextField3() + "Turma: " + atividade.getjTextField4() + "Tipo: " + atividade.getjComboBox1();

    @Override
    protected void addConteudo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
    
}

