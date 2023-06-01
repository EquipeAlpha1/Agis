package org.equipealpha.agis.view;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author nilber
 */
public class ExclusaoEscola extends InterfaceBase {

    private JLabel label1;

    public ExclusaoEscola() {
        addConteudo();
    }

    @Override
    public void addConteudo() {
        
        
        label1.setOpaque(true);
        label1.setBackground(Color.white);
        label1.setBounds(0, 0, 500, 500);

    }
}
