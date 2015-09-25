//MAI 2013
package ex6;

/* Déterminer si un carré est magique ou pas*/

public class Carré1 {
	
	private int n;
	private double[][] carre;
	
	public Carré1 (int n){
		this.n = n;
		carre = new double [n][n]; 
	}
	
	public Carré1 (double[][] carre, int n){
		this(n);
		this.carre = carre;
	}
	
	public int taille(){
		return n;
	}
	
	public double getN(int i, int j){
		return carre[i][j];
	}
	
	public double ligne(int i){
		int somme=0;
		
		for(int j=0;j<n;j++)
			somme+=carre[i][j];
		
		return somme;			
	}
	
	public double colonne(int j){
		int somme=0;
		
		for(int i=0;i<n;i++)
			somme+=carre[i][j];
		
		return somme;			
	}
	
	public double diago1(){
	
	double totDiago1=0;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(i==j)
				totDiago1+=carre[i][j];
		}
	}
		return totDiago1;
	}
	
	public double diago2(){
		
	double totDiago2=0;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(i+j==n-1)
				totDiago2+=carre[i][j];
		}
	}
		return totDiago2;
	}
	
	public boolean magique(){
		
		double somme = ligne(0);
		
		for(int i=1;i<n;i++){
			if(ligne(i)!=somme || colonne(i)!=somme)
				return false;
		}

		if(diago1()!=ligne(0)||diago2()!=ligne(0))
			return false;
		
		return true;
		
	}
	
	
}
