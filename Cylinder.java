//MAI 2009
package ex6;

public class Cylinder extends Circle{


	private double length;
	
	public Cylinder (double radius, double length){
		//Circle(radius);
		super(radius);
		//length=length;
		this.length=length;
	}

	public double findArea(){
		//return findArea()*length;
		return super.findArea()*length;
	}

}
