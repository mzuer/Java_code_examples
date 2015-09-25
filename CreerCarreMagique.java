package creerCM;

public class CreerCarreMagique {
	
	private int n;
	private int[][]carre;
	
	public CreerCarreMagique(int n){
		this.n=n;
		carre = new int[n][n];
		
	}
	
	public void remplirCarre(){
		
		//mettre 1 dans la ligne en-dessous de la case centrale
		int j=n/2;
		int i = j+1;
		carre[i][j]=1;
		
		int taille = n*n;
		
		for(int k=2;k<=taille;k++){
			
		if(i+1==n)
			i=0;
		else
			i++;
		if(j+1==n)
			j=0;
		else j++;
			
			if(carre[i][j]!=0){
				if(i+1==n)
					i=0;
				else
					i++;
				if(j-1<0)
					j=n-1;
				else
					j--;
			}
			carre[i][j]=k;	
		}
	}
	
	public void affiche(){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(carre[i][j]);
			}
		System.out.println();
		}
	}

}
