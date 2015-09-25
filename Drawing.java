package ex5;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Drawing extends JPanel{
	
	public void painComponent(Graphics g){
		
		g.setColor(Color.BLACK);
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if((i+j)%2!=0){
					g.fillRect(i*10,j*10,10,10);
				}
			}
		}
	
		g.setColor(Color.RED);
		g.fillOval(10,10,10,10);
		g.fillRect(25,5,10,10);
		g.setColor(Color.GREEN);
		g.drawRect(25,25,10,10);
				
	}
}
