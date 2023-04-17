package org.equipealpha.agis.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public abstract class InterfaceBase extends JFrame implements ActionListener {

    //paineis
    protected JPanel sidebar;
    protected JPanel painelTituloSidebar;
    protected JPanel painelPendenciasSidebar;
    protected JPanel painelAtividadesSidebar;
    protected JPanel painelCadastroSidebar;
    protected JPanel painelEstatisticasTurmaSidebar;
    protected JPanel conteudo;
    protected JPanel painelBtnPendencias;
    //labels
    protected JLabel tituloSidebar;
    protected JLabel labelLogo;
    protected JLabel labelImgPendencias;
    //imagens
    protected ImageIcon imgLogo;
    protected ImageIcon imgPendenciasSidebar;
    protected ImageIcon imgAtividadesSidebar;
    protected ImageIcon imgCadastroSidebar;
    protected ImageIcon imgEstatisticasTurmaSidebar;
    //botoes
    protected JButton btnPendenciasSidebar;
    //outros

    InterfaceBase() {
        super();

        //Customizando o painel da sidebar
        sidebar = new JPanel();
        sidebar.setPreferredSize(new Dimension(240,700));
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(new Color(200, 206, 227));
        
        painelTituloSidebar = new JPanel();
        
        painelPendenciasSidebar = new JPanel();


        //customizando os itens da sidebar
        conteudo = new JPanel();
        conteudo.setPreferredSize(new Dimension(750,700));
        


        //Customização do frame
        setSize(1000,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Projeto Agis");
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(0,0));
        setLocationRelativeTo(null);
        add(sidebar, BorderLayout.WEST);
        add(conteudo, BorderLayout.CENTER);
        setVisible(true);
    }

    protected abstract void addConteudo();

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}