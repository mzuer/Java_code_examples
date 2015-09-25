//OCTOBRE 2005
package ex4;

public class Line {
	
	private Point start;
	private Point end;
	
	public Line (int x1, int y1, int x2, int y2){
		start = new Point(x1,y1);
		end = new Point(x2,y2);
	}
	
	public void move (int dx, int dy){
		start.move(dx,dy);
		end.move(dx,dy);
	}
	
	public String toString(){
		return "("+start.toString()+";"+end.toString()+")";
	}

}
