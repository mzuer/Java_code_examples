//MAI 2012
package ex7;

/* représenter une matrice carrée
 * et la multiplier par une matrice passée en paramètre
 */

public class MatriceCarree {

	private int ordre;
	private double[][] matrice;
	
	public MatriceCarree(int n){
		ordre=n;
		matrice=new double[n][n];
	}
	
	public MatriceCarree(double[][]matrice){
		this.matrice=matrice;
		ordre=matrice.length;
	}	
	
	public int taille(){
		return ordre;
	}
	
	public void setCoeff(int i, int j, double x){
		matrice[i][j] = x;
	}
	
	public double getCoeff(int i, int j){
		return matrice[i][j];
	}
	
	public void print(){
		for(int i=0;i<ordre;i++){
			for(int j=0;j<ordre;j++){
				System.out.print(""+matrice[i][j]+"\t");
			}
		System.out.println();	
		}
		System.out.println();			
	}
	
	public MatriceCarree multiplication(MatriceCarree matrice2){
		double[][]result=new double[ordre][ordre];
		double somme;
		for(int i=0;i<ordre;i++){
			for(int j=0;j<ordre;j++){
				somme=0;
				for(int k=0;k<ordre;k++){
					somme+=matrice[i][k]*matrice2.matrice[k][j];
				}
				result[i][j]=somme;
			}
		}
		
		return new MatriceCarree(result);
	}
	
	
}
