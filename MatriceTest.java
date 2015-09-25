package testMatrice;

public class MatriceTest {
	
	private int[][]matrice;

	public MatriceTest(int[][] matrice){
		this.matrice=matrice;
	}
	
	public boolean estSymetrique(){
	
		for(int i =0;i<matrice.length;i++){
			for(int j=0;j<i;j++){
				if(matrice[i][j]!=matrice[j][i]){
						return false;
				}
			}
		}
		return true;
		
	}
	
	
	public boolean estDiagonale(){
		
		for(int i =0;i<matrice.length;i++){
			for(int j=0;j<matrice.length;j++){
				if(i!=j){
					if(matrice[i][j]!=0)
						return false;
				}
			}
		}

		return true;
	
	}
	
	
}
