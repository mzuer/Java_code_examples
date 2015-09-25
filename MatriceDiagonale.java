package ex62;

public class MatriceDiagonale implements MatriceEntiere{

	private int nDiago;
	private int dim;
	
	public MatriceDiagonale(int n, int dim){
		nDiago=n;
		this.dim=dim;
	}
	
	public int get(int i, int j){
		if(i==j)
			return nDiago;
		else
			return 0;
	}
	
	public void set (int i, int j){
		
	}
	
	public int getNbRows(){
		return dim;
	}
	
	public int getNbColumns(){
		return dim;
	}
	
	public int[][] remplit(){
		int[][] matrice = new int[dim][dim];
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				if(i==j)
					matrice[i][j]=nDiago;
				else
					matrice[i][j]=0;
			}
		}
		return matrice;
	}
	
	
}
