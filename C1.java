//MAI 2008
package ex4;

//public class C1 extends Object, I1{
//=> on implémente une interface, on en hérite pas, pas d'héritage multiple
public class C1 extends Object implements I1{
	//C1 doit implémenter toutes les méthodes déclarées dans I1
	
	private String string;
	//private integer entier;
	private int entier;
	
	//public static C1 (String s){
	public C1 (String s){
		super();
		this.string=s;
		this.entier=0;
	}

	//public boolean f1 (String s){
	//	this.string=s;
	//}
	public void f1 (String s){
		System.out.println(s);
	}	
	
	public void f1 (double d1, double d2){
		System.out.println(""+d1+d2);
	}
	
	public boolean f2(double d1, double d2){
		//boolean b=(d1==2);
		//return b;  
		//ou + simple : 
		return d1==d2;
	}
	
}
