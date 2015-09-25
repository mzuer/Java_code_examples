package ex;

import java.util.ArrayList;

public class Banque {

	private ArrayList<CompteBancaire>compteBancaires;
	
	public Banque(){
		compteBancaires = new ArrayList<CompteBancaire>();
	}
	
	public void ajouter (CompteBancaire a){
		compteBancaires.add(a);
	}
	
	public void affiche(){
		for(CompteBancaire i : compteBancaires)
			System.out.println(i.toString());
	}
	
	public void enlever(CompteBancaire a){
		compteBancaires.remove(a);
	}
}
