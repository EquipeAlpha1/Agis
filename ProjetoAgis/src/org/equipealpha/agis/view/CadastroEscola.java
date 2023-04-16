/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.equipealpha.agis.view;

/**
 *
 * @author Pedro Davi
 */
import javax.swing.*;
import java.awt.*;

public class CadastroEscola extends InterfaceBase{
    
    private JLabel txtCadastro;
    CadastroEscola(){super();}

    @Override
    protected void addconteudo() {

        txtCadastro = new JLabel();
        txtCadastro.setText("Cadastro de Escola");
        txtCadastro.setFont(new Font("Times new Roman", Font.BOLD, 25));
        txtCadastro.setHorizontalAlignment(450);
        txtCadastro.setVerticalAlignment(150);
        txtCadastro.setVisible(true);


        conteudo.add(txtCadastro);

    }
}
