package ex62;

public class Carré {

	private int dim;
	private int[][]carré;
	
	public Carré(int[][]carré){
		this.carré=carré;
		dim = carré.length;
	}
	
	public int sommeLigne(int n){
		int somme=0;
		
		for(int i=0;i<dim;i++)
			somme+=carré[n][i];
		
		return somme;
	}
	
	public int sommeColonne(int n){
		int somme=0;
		
		for(int i=0;i<dim;i++)
			somme+=carré[i][n];
		
		return somme;
	}
	
	public int diagoHB(){
		int somme=0;
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				if(i==j)
					somme+=carré[i][j];
			}
		}
		return somme;
	}
	
	public int diagoBH(){
		int somme=0;
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				if(i+j==dim-1)
					somme+=carré[i][j];
			}
		}
		return somme;
	}
	
	public void affiche(){
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				System.out.print(carré[i][j]+" ");
			}
		System.out.println();
		}
	}
	
	public boolean estMagique(){
	
		int reference = sommeLigne(0);
		
		for(int i=0;i<dim;i++){
			///System.outprint(sommeLigne(i)+sommeColonne(i))
			if(sommeLigne(i)!=reference || sommeColonne(i)!=reference)
				return false;
		}
		
		if(diagoHB()!=reference || diagoBH()!=reference)
			return false;
		
		return true;
	}
}
