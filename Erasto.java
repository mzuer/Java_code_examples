	package erasto;

public class Erasto {

	/*Recherche des nombres tels qu'ils ne sont divisibles
	que par eux même (ou 1!)*/
	public static void main (String args[]) {
		
		tabPrem(40);
		Erasto2 e = new Erasto2(40);
		System.out.println();
		e.affichePrem();
		
	}
	public static void tabPrem (int d) {	

	    int TAILLE = d+1;  
		
		boolean[] tableau = new boolean[TAILLE];
	      
	      for(int i = 0; i < tableau.length; i++){
	         tableau[i] = false;
	      }
	    
	    for(int i=2;i<Math.sqrt(tableau.length+1);i++){
	    	
	    	int x=i;
	    	int n=2;
	    	
	    	while(x*n<TAILLE){
	    		tableau[x*n]=true;
	    		n++;
	    	}
	    }
	    
	    tableau[0]=true;
	    tableau[1]=true;
	    tableau[2]=false;
	    
	    //les nombres premiers ont maintenant la valeur false
	    
	for(int i=1;i<tableau.length;i++){
		if(!tableau[i])
			System.out.print(i+"\t");
	}
    }
}
