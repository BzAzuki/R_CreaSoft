package com.placamas.menu;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Pesta�as extends JFrame{

	
    private static final long serialVersionUID = 1L;
    private JTabbedPane tabbedPane;
	
    
    public Pesta�as() {
    	
    	tabbedPane = new JTabbedPane();
        tabbedPane.setPreferredSize(new Dimension(800, 700));//tama�o de la ventana
        getContentPane().add(tabbedPane);
        
    	
        JButton herramientas = new JButton("herramentas");
    	
    }
	
}
