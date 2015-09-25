//JUIN 2005
package ex5;

public class NbrRat {
	
	private int num;
	private int den;
	
	public NbrRat(int num, int den){
		this.num=num;
		this.den=den;
	}
	
	public String toString(){
		return num+"/"+den;
	}
	
	public NbrRat add(NbrRat nbr2){
		return new NbrRat(num*nbr2.den+den*nbr2.num,den*nbr2.den);
	}
	
	public NbrRat mult(NbrRat nbr2){
		return new NbrRat(num*nbr2.num,den*nbr2.den);
	}
	
}
