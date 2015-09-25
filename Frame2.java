package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame2 {

	
	public static void main (String[] args){
	
	JFrame frame = new JFrame();
	
	JButton but1 = new JButton();

	
    frame.add(but1);
    
    but1.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){
    		System.out.print("Hello World");
    		
    	}
    });
	
	
    frame.setVisible(true);
	
	}

}
 