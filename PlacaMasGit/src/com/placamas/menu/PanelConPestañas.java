package com.placamas.menu;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.FlowLayout;


public class PanelConPesta�as extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTabbedPane tabbedPane;
    private JButton agregar;
    private JPanel panellistado;
    private JPanel ingresar;
    
    
    private JMenu  mnArchivo	  	 = new JMenu("Archivo");
    
    private JMenuItem mnArcList    = new JMenuItem("Listado de Piezas");
    
    
 
    
    public PanelConPesta�as() {
       	
    	
    	
        tabbedPane = new JTabbedPane();
        tabbedPane.setPreferredSize(new Dimension(800, 700));//tama�o de la ventana
        getContentPane().add(tabbedPane);
        
        //primera Pesta�a
        panellistado = new JPanel();
        tabbedPane.add(panellistado, "Listado");//crea la pesta�a()JMenu
        panellistado.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));//
        	agregar= new JButton("Agregar");
        	
        	
        	
		    panellistado.add(agregar);
	       /* ///////
	        JPanel panel_1 = new JPanel();//cuerpo pesta�a ()J
	        
		        
		        
		        JLabel lblControlDeUsuarios = new JLabel("Ingresar el Listado");//campo dentro de la primera pesta�a
		        panellistado.add(panel_1);
		        panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));//
		        panel_1.add(lblControlDeUsuarios);
		        
	        ////////////////////////////
        */
        
        
        JTextField one = new JTextField("");//pesta�a mostrada
        tabbedPane.add(one, "Administracion");
        tabbedPane.setTabPlacement(JTabbedPane.NORTH);
       
        JPanel Usuarios = new JPanel();
        tabbedPane.addTab("Control de Usuarios", null, Usuarios, null);
        
        JLabel lblUsuarios = new JLabel("USUARIOS");
        Usuarios.add(lblUsuarios);
    }

    
    
    
    public static void main(String args[]) {
      
    	
    	PanelConPesta�as frame = new PanelConPesta�as();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        
    }
}