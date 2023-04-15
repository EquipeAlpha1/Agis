package org.equipealpha.agis.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class InterfaceBase extends JFrame implements ActionListener {
    
    //paineis
    private JPanel sidebar;
    private JPanel painelTituloSidebar;
    private JPanel painelPendenciasSidebar;
    private JPanel painelAtividadesSidebar;
    private JPanel painelCadastroSidebar;
    private JPanel painelEstatisticasTurmaSidebar;
    private JPanel conteudo;
    //labels
    private JLabel tituloSidebar;
    private JLabel labelLogo;
    private JLabel labelImgPendencias;
    //imagens
    private ImageIcon logo;
    private ImageIcon imgPendenciasSidebar;
    private ImageIcon imgAtividadesSidebar;
    private ImageIcon imgCadastroSidebar;
    private ImageIcon imgEstatisticasTurmaSidebar;
    //botoes
    private JButton btnPendenciasSidebar;
    //outros
    
    public InterfaceBase(){
        super();

        //Customizando o painel da sidebar
        sidebar = new JPanel();
        sidebar.setPreferredSize(new Dimension(240,700));
        sidebar.setLayout(null);
        sidebar.setBackground(new Color(76, 84, 103));


        //Customizando os itens da sidebar
        painelTituloSidebar = new JPanel();
        painelTituloSidebar.setBackground(Color.CYAN);
        painelTituloSidebar.setPreferredSize(new Dimension(240,100));
        sidebar.add(painelTituloSidebar);


        conteudo = new JPanel();
        conteudo.setPreferredSize(new Dimension(750,700));
        conteudo.setBackground(Color.MAGENTA);


        //Customizando o frame
        setSize(1000,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Projeto Agis");
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10,0));
        setLocationRelativeTo(null);
        add(sidebar, BorderLayout.WEST);
        add(conteudo, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        }
}
