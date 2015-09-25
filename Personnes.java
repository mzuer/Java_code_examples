//MAI 2008
package ex6;

import java.util.HashSet;

public class Personnes {

	private HashSet<String> listePersonnes;
	
	public Personnes(){
		listePersonnes = new HashSet<String>();
	}
	
	public void ajouter(String personne){
		listePersonnes.add(personne);
	}
	
	public boolean present(String personne){
		return listePersonnes.contains(personne);
	}
	
	public int size(){
		int index = 0;
		for (String personne : listePersonnes)
			index++;
		return index;
	}
	
	public void affiche(){
		for (String personne : listePersonnes)
			System.out.println(personne);
	}
	
	
}
