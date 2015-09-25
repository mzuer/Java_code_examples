//EXERCICE -> NE MARCHE PAS (CONSTRUCTEUR ??)
package ex1;

/* Dessiner le triangle de Pascal*/

public class Triangle {

	private int lignes;
	private int triangle[][];
	
	//Constructeur
	public Triangle (int n){
		this.lignes=n;
		int triangle[][] = new int[n][n];
		
		for(int i=0;i<lignes;i++){
			for(int j=0;j<=i;j++){
				if(i==j||j==0){
					triangle[i][j]=1;
				}
				else{
					triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
					//System.out.print(i+""+j);
				}
//				System.out.print(i+""+j);
			}
			System.out.println();
		}
		System.out.println(""+triangle[0][0]);

	}

	//Afficher le triangle avec 7 lignes  
	public static void print (Triangle t, int lignes){
		
		t = new Triangle (lignes);

		for(int i=0;i<lignes;i++){
			for(int j=0;j<=i;j++){
				//System.out.print(""+t.triangle[i][j]);
			}
			System.out.println();
		}
	}	
		
	}


