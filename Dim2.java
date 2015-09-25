package tableaux;

public class Dim2 {

	private double[][] matrice;
	
	public Dim2 (double[][] matrice){
		this.matrice=matrice;
	}
	
	public int taille (){
		return matrice.length;
	}
	
	public void afficheTaille(){
		System.out.println("Matrice de taille "+taille());
		
	}
	
}
