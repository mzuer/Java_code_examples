package ex62;

import java.util.Scanner;

public class MatriceSymetrique implements MatriceEntiere{

	private int[][]matrice;
	private int dim;
	
	public MatriceSymetrique(int [][]matrice){
		this.matrice=matrice;
		this.dim=matrice.length;
	}
	
	public MatriceSymetrique(int dim){
		this.dim=dim;
		matrice = new int[dim][];
		for(int i=0;i<dim;i++){
			matrice[i]=new int[i+1];
		}
		
		
	}
	
	public int get(int i, int j){
		
		if(j<=i)
			return matrice[i][j];
		else
			return matrice[j][i];
	}
	
	public void initialise (int i, int j){
		
		Scanner scan = new Scanner(System.in);
		
		for(int a=0;i<dim;a++){
			for(int b=0;j<=i;b++){
				System.out.println("["+(i+1)+"]["+(j+1)+"] :");
				matrice[i][j] = scan.nextInt();
			}
		}
	}
	
	public void set(int i, int j){
	
		Scanner scan = new Scanner(System.in);	
		System.out.println("["+i+"]["+j+"] :");
	
			if(j<=i)
				matrice[i-1][j-1] = scan.nextInt();
			else
				matrice[j-1][i-1] = scan.nextInt();
	}
	
	public int getNbRows(){
		return dim;
	}
	
	public int getNbColumns(){
		return dim;
	}
		
	
}
