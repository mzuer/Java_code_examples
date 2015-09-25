//OCTOBRE 2006
package ex6;

import java.util.ArrayList;
import java.util.Iterator;

public class Dessinateur {
	
	private ArrayList list;
	
	public Dessinateur(){
		list = new ArrayList();
	}

	public void ajouterElement(Object element){
		list.add(element);		
	}
	
	public void dessinerTousLesElements(){
		
		Iterator it = list.iterator();
		
		while(it.hasNext()){
			if(it.next() instanceof Triangle){
				Triangle t = (Triangle)it.next();
				Graphics.drawTriangle(t.getX0(), t.getY0(), 
						t.getX1(), t.getY1(), t.getX2(), t.getY2());
			}
			else if(it.next() instanceof Carre){
					Carre c = (Carre)it.next();
					Graphics.drawSquare(c.getX0(), c.getY0(), 
							c.getX1(), c.getY1());
			}
		}
		
	}
	
}
