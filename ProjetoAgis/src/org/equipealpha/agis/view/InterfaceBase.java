package org.equipealpha.agis.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.*;
import org.equipealpha.agis.controller.GerenciamentoEscolar;


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
    protected ImageIcon imgLogoCompleto;
    protected ImageIcon imgLogo;
    protected ImageIcon imgPendenciasSidebar;
    protected ImageIcon imgCadastroSidebar;
    protected ImageIcon imgEstatisticasTurmaSidebar;
//outros
    protected GradientPanel degradeconteudo;
    protected JComboBox opcoesCadastro;
    protected URL urlLogo;
    protected URL urlLogoCompleto;
    protected URL urlPendencias;
    protected URL urlEstatisticas;
    protected URL urlCadastro;


    InterfaceBase() {
        super();
        
        GerenciamentoEscolar gerenciamentoescolar = new GerenciamentoEscolar();

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
        urlLogoCompleto = ClassLoader.getSystemResource("org/equipealpha/agis/resources/logoCompleto.png");
        imgLogoCompleto = new ImageIcon(urlLogoCompleto);
        labelLogo = new JLabel();
        labelLogo.setIcon(imgLogoCompleto);
        painelTituloSidebar.add(labelLogo);
        sidebar.add(painelTituloSidebar);


//customizacao pendencias sidebar
        painelPendenciasSidebar = new JPanel();
        painelPendenciasSidebar.setMaximumSize(new Dimension(250,30));
        painelPendenciasSidebar.setBackground(Color.white);
        sidebar.add(Box.createRigidArea(new Dimension(0,30)));
        painelPendenciasSidebar.setLayout(new FlowLayout(FlowLayout.LEFT, 10,0));
        urlPendencias = ClassLoader.getSystemResource("org/equipealpha/agis/resources/pendencias.png");
        imgPendenciasSidebar = new ImageIcon (urlPendencias);
        labelImgPendencias = new JLabel();
        labelImgPendencias.setIcon(imgPendenciasSidebar);
        labelTextoPendencias = new JLabel("Pendências");
        labelTextoPendencias.setFont(new Font(" Courier New", Font.PLAIN,17));
        labelTextoPendencias.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                gerenciamentoescolar.ExibirInterfacePendencias();


            }
        });
        labelTextoPendencias.setCursor(new Cursor(Cursor.HAND_CURSOR));
        painelPendenciasSidebar.add(Box.createRigidArea(new Dimension(5,0)), BorderLayout.WEST);
        painelPendenciasSidebar.add(labelImgPendencias, BorderLayout.CENTER);
        painelPendenciasSidebar.add(labelTextoPendencias, BorderLayout.EAST);
        sidebar.add(painelPendenciasSidebar);


//customizacao cadastro sidebar
        painelCadastroSidebar= new JPanel();
        painelCadastroSidebar.setMaximumSize(new Dimension(250,30));
        painelCadastroSidebar.setBackground(Color.white);
        sidebar.add(Box.createRigidArea(new Dimension(0,50)));
        painelCadastroSidebar.setLayout(new FlowLayout(FlowLayout.LEFT, 10,0));
        urlCadastro = ClassLoader.getSystemResource("org/equipealpha/agis/resources/cadastro.png");
        imgCadastroSidebar = new ImageIcon (urlCadastro);
        labelImgCadastro = new JLabel();
        labelImgCadastro.setIcon(imgCadastroSidebar);
        labelTextoCadastro = new JLabel("Cadastrar");
        labelTextoCadastro.setFont(new Font(" Courier New", Font.PLAIN,17));
        String[] opcoes = {"" ,"Atividade", "Escola", "Turma", "Aluno"};
        opcoesCadastro = new JComboBox(opcoes);
        opcoesCadastro.setFont(new Font(" Courier New", Font.PLAIN,17));
        opcoesCadastro.setFocusable(false);
        opcoesCadastro.addActionListener(this);
        opcoesCadastro.setCursor(new Cursor(Cursor.HAND_CURSOR));
        painelCadastroSidebar.add(Box.createRigidArea(new Dimension(5,0)), BorderLayout.WEST);
        painelCadastroSidebar.add(labelImgCadastro, BorderLayout.CENTER);
        painelCadastroSidebar.add(labelTextoCadastro, BorderLayout.EAST);
        painelCadastroSidebar.add(opcoesCadastro);
        sidebar.add(painelCadastroSidebar);


//customizando estatisticas sidebar
        painelEstatisticasTurmaSidebar = new JPanel();
        painelEstatisticasTurmaSidebar.setMaximumSize(new Dimension(250,30));
        painelEstatisticasTurmaSidebar.setBackground(Color.white);
        sidebar.add(Box.createRigidArea(new Dimension(0,50)));
        painelEstatisticasTurmaSidebar.setLayout(new FlowLayout(FlowLayout.LEFT, 10,0));
        urlEstatisticas = ClassLoader.getSystemResource("org/equipealpha/agis/resources/estatisticas.png");
        imgEstatisticasTurmaSidebar = new ImageIcon (urlEstatisticas);
        labelImgEstatisticas = new JLabel();
        labelImgEstatisticas.setIcon(imgEstatisticasTurmaSidebar);
        labelTextoEstatisticas= new JLabel("Estatísticas Da Turma");
        labelTextoEstatisticas.setFont(new Font(" Courier New", Font.PLAIN,17));
        labelTextoEstatisticas.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
               gerenciamentoescolar.ExibirInterfaceSelectTurma();
                
            }
        });
        labelTextoEstatisticas.setCursor(new Cursor(Cursor.HAND_CURSOR));
        painelEstatisticasTurmaSidebar.add(Box.createRigidArea(new Dimension(5,0)), BorderLayout.WEST);
        painelEstatisticasTurmaSidebar.add(labelImgEstatisticas, BorderLayout.CENTER);
        painelEstatisticasTurmaSidebar.add(labelTextoEstatisticas, BorderLayout.EAST);
        sidebar.add(painelEstatisticasTurmaSidebar);


//customizacao conteudo
        conteudo = new JPanel();
        conteudo.setPreferredSize(new Dimension(750, 700));
        conteudo.setLayout(new BoxLayout(conteudo, BoxLayout.PAGE_AXIS));
        degradeconteudo = new GradientPanel();
        conteudo.add(degradeconteudo);

//Customização do frame
        setSize(1000,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        urlLogo = ClassLoader.getSystemResource("org/equipealpha/agis/resources/logo.png");
        imgLogo = new ImageIcon(urlLogo);
        setIconImage(imgLogo.getImage());
        setTitle("Projeto Agis");
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        add(sidebar, BorderLayout.WEST);
        add(conteudo, BorderLayout.CENTER);
        setVisible(true);
    }

    protected abstract void addConteudo();

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==opcoesCadastro){
            if (opcoesCadastro.getSelectedItem() == "Atividade"){
               

            }
            if (opcoesCadastro.getSelectedItem() == "Escola"){

            }
            if (opcoesCadastro.getSelectedItem() == "Turma"){

            }
            if (opcoesCadastro.getSelectedItem() == "Aluno"){

            }
        }
    }
}