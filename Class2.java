
package theorie;

import java.util.HashMap;
import java.util.Map;

public class Class2 extends Class1{

	private double[] tab=new double[]{7,8.5,9};
	
	private double i =super.i+4;
	
	/*private int d;
	
	public void methode(){}

	private static final int i=5;
	
	private final static int k=2;
	
	private static int j;
	
	public Class2(int d){
		this.d=d;
	}
	
	public Class2(){
		j=3;
	}
	
	public Class2(int a, int b){
		//i=a;
		//=> impossible d'assigner un champ final
		j=b;
	}
	
	public void affiche(){
		System.out.println(i);
	}
	
	public void affiche(int n){
		System.out.println(n);
	}
	
	/* => marche pas 
	public int affiche(){
		return i;
	}
	*/

	
	
	public static void main (String[]args){
		Class2 c = new Class2();
		c.affiche();
		
	}
}
