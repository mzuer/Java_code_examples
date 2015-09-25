//OCTOBRE 2006
package ex4;

/*Modéliser un polynôme du 1er degré
 * avec méthodes d'addition et multiplication
 */

public class Poly1 {

	private double a;
	private double b;
	 
	public Poly1(double a, double b){
		this.a=a;
		this.b=b;
	}
	
	public double getA(){
		return a;
	}
	
	public double getB(){
		return b;
	}
	
	public Poly1 add(Poly1 poly2){
		return new Poly1(a+poly2.a,b+poly2.b);
	}
	
	public Poly1 mult(double n){
		return new Poly1(a*n,b*n);
	}
	
	public String toString(){
		return a+"x + "+b;
	}
}
