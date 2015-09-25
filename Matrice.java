package ex72;

import java.util.Scanner;

public class Matrice {

	private int dim;
	private int[][]matrice;
	private static Scanner scan = new Scanner(System.in);
	
	public Matrice(int n){
		dim=n;
		matrice = new int[dim][dim];
	}
	
	public Matrice(int[][]mat){
		matrice = mat;
		dim=mat.length;
	}
	
	public void affiche(){
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				System.out.print(matrice[i][j]+"\t");
			}
			System.out.println();
		}
	}
		
	public void set(int i, int j, int n){
		matrice[i][j]=n;
	}
	
	public void initialiser(){
		int valeur;
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				System.out.print("Element ["+(i+1)+"]["+(j+1)+"] :");
				valeur = scan.nextInt();System.out.println();
				matrice[i][j]=valeur;
			}
		}
	}
	
	public Matrice mutliplie(Matrice m2){
		
		int[][] m1=matrice;
		int[][]m3=new int[dim][dim];
		
		if(m2.dim!=dim){
			System.out.println("Multiplication impossible");
			return null;
		}
		
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				for(int k=0;k<dim;k++){
					m3[i][j]+=m1[i][k]*m2.matrice[k][j];
				}
			}
		}
		return new Matrice(m3);
	}
}
