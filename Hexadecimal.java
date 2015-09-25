//MAI 2013
package ex7;

/* représenter et afficher les nombres hexadécimaux */

public class Hexadecimal {

	private int num;
	private String hexa;
	
	//1er constructeur : à partir d'un nombre entier
	public Hexadecimal(int nombre){
		this.num = nombre;
		
		//conversion du nombre en chaine
		
		// For storing remainder
		int rem=0;
		   
		// For storing result
		String str2=""; 

		// Digits in hexadecimal number system
		char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		while(nombre>0){
		  rem=nombre%16; 
		  str2=hex[rem]+str2; 
		  nombre=nombre/16;
		}
		
		hexa=str2;
		
	}
	
	//2ème constructeur : à partir d'une chaine
	public Hexadecimal(String nombre){
		hexa = nombre;		
		
		//conversion de la chaine en nombre
	      int val = 1;
	      for (int i = 0; i < nombre.length(); i++) {
	            char c = nombre.charAt(i);
	            int d = nombre.indexOf(c);
	            val = 16*val + d;
	        }
		num=val;
		
	}
	
	//hexa -> dec
	public int toInt(){
	        return num;
	}
	
	//hexa -> dec (fonction existante)

	public int toIntAuto(){
		return Integer.parseInt(hexa, 16);
	}
	
	//dec -> hexa (version codée)
	public String toString(){
		return hexa;		
		
	}
	//dec -> hexa (fonction existante)
	public String toStringAuto(){
	      return Integer.toHexString(num);
	}
	
}


