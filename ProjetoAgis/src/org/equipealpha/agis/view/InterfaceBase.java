package org.equipealpha.agis.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;



public abstract class InterfaceBase extends JFrame implements ActionListener {

    //paineis
    protected JPanel sidebar;
    protected JPanel painelTituloSidebar;
    protected JPanel painelPendenciasSidebar;
    protected JPanel painelCadastroSidebar;
    protected JPanel painelEstatisticasTurmaSidebar;
    protected JPanel conteudo;
    //labels
    protected JLabel labelLogo;
    protected JLabel labelImgPendencias;
    protected JLabel labelTextoPendencias;
    protected JLabel labelImgCadastro;
    protected JLabel labelTextoCadastro;
    protected JLabel labelTextoEstatisticas;
    protected JLabel labelImgEstatisticas;
    //imagens
    protected ImageIcon imgLogo;
    protected ImageIcon imgPendenciasSidebar;
    protected ImageIcon imgCadastroSidebar;
    protected ImageIcon imgEstatisticasTurmaSidebar;
//outros
    protected GradientPanel degradeconteudo;

    InterfaceBase() {
        super();

//Customizando o painel da sidebar
        sidebar = new JPanel();
        sidebar.setPreferredSize(new Dimension(250,700));
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.PAGE_AXIS));
        sidebar.setBackground(Color.white);

//customizacao titulo sidebar
        painelTituloSidebar = new JPanel();
        painelTituloSidebar.setBackground(Color.white);
        painelTituloSidebar.setMaximumSize(new Dimension(250,100));
        painelTituloSidebar.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        imgLogo = new ImageIcon("C:/Users/natan/OneDrive/Área de Trabalho/Exercícios/" +
                "Java/testandoo/src/resources/logoteste (semfundo-redimensionada).png");
        labelLogo = new JLabel();
        labelLogo.setIcon(imgLogo);
        painelTituloSidebar.add(labelLogo);
        sidebar.add(painelTituloSidebar);

//customizacao pendencias sidebar
        painelPendenciasSidebar = new JPanel();
        painelPendenciasSidebar.setMaximumSize(new Dimension(250,80));
        painelPendenciasSidebar.setBackground(Color.white);
        painelPendenciasSidebar.setLayout(new BorderLayout(0,0));
        imgPendenciasSidebar = new ImageIcon("");
        labelImgPendencias = new JLabel();
        labelImgPendencias.setIcon(imgPendenciasSidebar);

        labelTextoPendencias = new JLabel("Pendências");
        labelTextoPendencias.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

            }
        });
        labelTextoPendencias.setCursor(new Cursor(Cursor.HAND_CURSOR));
        painelPendenciasSidebar.add(labelImgPendencias, BorderLayout.WEST);
        painelPendenciasSidebar.add(labelTextoPendencias, BorderLayout.CENTER);
        sidebar.add(painelPendenciasSidebar);

//customizacao cadastro sidebar
        painelCadastroSidebar= new JPanel();
        painelCadastroSidebar.setMaximumSize(new Dimension(250,80));
        painelCadastroSidebar.setBackground(Color.white);
        sidebar.add(Box.createRigidArea(new Dimension(0,10)));
        painelCadastroSidebar.setLayout(new BorderLayout(0,0));
        imgCadastroSidebar = new ImageIcon("");
        labelImgCadastro = new JLabel();
        labelImgCadastro.setIcon(imgCadastroSidebar);
        labelTextoCadastro = new JLabel("Cadastro");
        labelTextoCadastro.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

            }
        });
        labelTextoCadastro.setCursor(new Cursor(Cursor.HAND_CURSOR));
        painelCadastroSidebar.add(labelImgCadastro, BorderLayout.WEST);
        painelCadastroSidebar.add(labelTextoCadastro, BorderLayout.CENTER);
        sidebar.add(painelCadastroSidebar);


//customizando estatisticas sidebar
        painelEstatisticasTurmaSidebar = new JPanel();
        painelEstatisticasTurmaSidebar.setMaximumSize(new Dimension(250,80));
        painelEstatisticasTurmaSidebar.setBackground(Color.white);
        sidebar.add(Box.createRigidArea(new Dimension(0,10)));
        painelEstatisticasTurmaSidebar.setLayout(new BorderLayout(0,0));
        imgEstatisticasTurmaSidebar = new ImageIcon("");
        labelImgEstatisticas = new JLabel();
        labelImgEstatisticas.setIcon(imgEstatisticasTurmaSidebar);
        labelTextoEstatisticas= new JLabel("Estatísticas Da Turma");
        labelTextoEstatisticas.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

            }
        });
        labelTextoEstatisticas.setCursor(new Cursor(Cursor.HAND_CURSOR));
        painelEstatisticasTurmaSidebar.add(labelImgEstatisticas, BorderLayout.WEST);
        painelEstatisticasTurmaSidebar.add(labelTextoEstatisticas, BorderLayout.CENTER);
        sidebar.add(painelEstatisticasTurmaSidebar);


//customizacao conteudo
        conteudo = new JPanel();
        conteudo.setPreferredSize(new Dimension(750, 700));
        conteudo.setLayout(new BorderLayout());
        degradeconteudo = new GradientPanel();
        conteudo.add(degradeconteudo, BorderLayout.CENTER);

//Customização do frame
        setSize(1000,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Projeto Agis");
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout(0,0));
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