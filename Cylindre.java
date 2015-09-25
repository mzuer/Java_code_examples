//JUIN 2011
package ex5;

public class Cylindre implements Comparable<Cylindre>{

	private double rayon;
	private double hauteur;
	
	public Cylindre(double rayon, double hauteur){
		this.rayon=rayon;
		this.hauteur=hauteur;
	}
	
	public double getRayon(){
		return rayon;
	}
	
	public double getHauteur(){
		return hauteur;
	}
	
	public void setRayon(double rayon){
		this.rayon=rayon;
	}
	
	public void setHauteur(double hauteur){
		this.hauteur=hauteur;
	}
	
	public double volume(){
		return Math.PI*rayon*rayon*hauteur;
	}
	
	public double surface(){
		return (Math.PI*2*rayon*hauteur)+(2*Math.PI*rayon*rayon);
	}
	
	public int compareTo(Cylindre cylindre2){
		
		if(volume()<cylindre2.volume())
			return -1;
		else if (volume()>cylindre2.volume())
			return 1;
		else 
			return 0;
	}
}
