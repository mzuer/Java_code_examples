package kapre;

public class Kaprekar {
	
	
	public static void main (String[]args){
		System.out.println(sommeParties(2025, 2));
		System.out.println(nbreChiffre(1112));
		System.out.println(estKaprekar(4879));
		
	}
	//découpe n en 2 nombes dans le 2ème comport p chiffres
	//(12540,2 => 125+40)
	static int sommeParties(int n, int p){
		int gauche=n;
		int compteur=p;
		while(compteur>0){
			gauche/=10;
			compteur--;
		}
		//System.out.println(gauche);
		int droite = gauche;
		
		compteur=p;
		while(compteur>0){
			droite*=10;
			compteur--;
		}		

		droite=n-droite;
		//System.out.println(droite);
		return gauche+droite;
	}
	
	static boolean estKaprekar(int n){
		
		int carre=n*n;
		int i=1;
		while(i<nbreChiffre(carre)){
			System.out.println("i : "+i);
			System.out.println(sommeParties(carre, i));
			if(sommeParties(carre, i)==n)
				return true;
			i++;
		}
		
		return false;
	}
	
	static int nbreChiffre(int n){
		int compteur=0;
		while(n>0){
			n/=10;
			compteur++;
		}
		return compteur;
	}

}
