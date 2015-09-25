//MAI 2009
package ex6;

public class Circle {

	private double radius;

	//private Circle (double radius) {
	public Circle (double radius) {
		//radius=radius;
		this.radius=radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double findArea(){
		return radius*radius*Math.PI;
	}

}
