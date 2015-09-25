package swing2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame implements ActionListener{

	public Frame(){
	
	JFrame frame = new JFrame();
	
	JButton but1 = new JButton();
	frame.add(but1);
	but1.addActionListener(this);
	
	frame.setVisible(true);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("action");
		
	}
	
	}

	

