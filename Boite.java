//MAI 2009
package ex5;

public class Boite {

	private int[] sommet1 = new int[3];
	private int[] sommet2 = new int[3];

	
	public Boite(int[] sommet1, int[] sommet2){
		this.sommet1 = sommet1;
		this.sommet2 = sommet2;
	}
	
	
	public double volume(){
		return ((Math.abs(sommet1[0]-sommet2[0])*
				Math.abs(sommet1[1]-sommet2[1])*
				Math.abs(sommet1[2]-sommet2[2])));
	}
	
	public double perimetre(){
		return (4*(Math.abs(sommet1[0]-sommet2[0])+
				Math.abs(sommet1[1]-sommet2[1])+
				Math.abs(sommet1[2]-sommet2[2])));
	}
	
	public double surface(){
		return (2*(
				(Math.abs(sommet1[0]-sommet2[0])*
				Math.abs(sommet1[1]-sommet2[1]))
				+
				(Math.abs(sommet1[1]-sommet2[1])*
				Math.abs(sommet1[2]-sommet2[2]))
				+
				(Math.abs(sommet1[0]-sommet2[0])*
				Math.abs(sommet1[2]-sommet2[2]))
				));
	}
	
}

