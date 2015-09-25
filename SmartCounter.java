//JUIN 2005
package ex4;

/* Calculer moyenne et variance d'un ensemble de valeurs
 * au fur et à mesure qu'on les produits, sans les stocker
 * calcuer la moyenne et les variances sur les produits précédents 
 */

public class SmartCounter {

	private double moyenne;
	private double variance;
	private double enStock;
	
	public SmartCounter(){
		moyenne=0;
		variance=0;
		enStock=0;
	}
	
	public void addValue(double d){
		enStock++;
		double moyenne0=moyenne;
		moyenne+=(d-moyenne)/enStock;
		variance+=(d-moyenne0)*(d-moyenne);
	}
	
	public double mean(){
		return moyenne;
	}
	
	public double variance(){
		return variance;
	}
	
}
