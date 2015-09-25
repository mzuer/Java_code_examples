package ex6;



import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterfaceGraphique implements ActionListener{

	
	
	
	public void actionPerformed(ActionEvent e){		
		System.out.println("Vous avez cliqué sur le bouton du bas");
	}
	
	public InterfaceGraphique(){
		makeFrame();
	}
	
	
    public void makeFrame() {
    
    JFrame frame = new JFrame("Exercice 2");

	BoxLayout boxLayout = new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS);

	
	JPanel panel1 = new JPanel(new GridLayout(2,1));
	JPanel panel2 = new JPanel(new GridLayout(1,2));
	JPanel panel3 = new JPanel(new GridLayout(2,1));
	JPanel panel4 = new JPanel(new GridLayout(1,2));
	
	
	JButton jbut1 = new JButton("JButton");
    panel1.add(jbut1); 
    jbut1.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){
    		System.out.println("click bouton haut");
    	}
    });
    

    JTextField jlist= new JTextField("JList");
    
    JTextField textArea  = new JTextField("JTextArea");
    panel3.add(textArea);
    
    JTextField jtext= new JTextField("JTextField");
    panel4.add(jtext);
    
	JButton jbutBas = new JButton("JButton-Bas");
    panel4.add(jbutBas); 
    jbutBas.addActionListener(this);
    
    
    panel3.add(panel4);
    panel2.add(panel3);
    panel2.add(jlist);
    
	frame.add(panel1);
	frame.add(panel2);
   

    //frame.setLayout(flowLayout);
	frame.getContentPane().setLayout(boxLayout);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.pack(); //pour adapter la taille de la fenêtre à la taille de ses composants
    frame.setVisible(true);
    
    }
    

	  
}