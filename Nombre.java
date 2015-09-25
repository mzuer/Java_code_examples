//JUIN 2011
package ex4;

/* Classe avec méthode pour déterminer si un nombre est heureux*/

public class Nombre {

	int nbre;
	
	private static final int MAX=6;
	
	public Nombre (int nbre){
		this.nbre=nbre;
	}
	
	public static int sommeCarres(int n){
		
		int somme=0;
		
		do{
			somme+=(n%10)*(n%10);
			n/=10;
		} while(n>0);
		
		return somme;
	}

	public boolean heureux(){
		int i=0, n=nbre,somme=0;
		while(i<MAX && somme!=1){			
			somme = sommeCarres(n);
			n=somme;
		i++;
		}
		
		if(somme==1)
			return true;	
		else
			return false;
	}
	
	public int getNbre(){
		return nbre;
	}
		
}
