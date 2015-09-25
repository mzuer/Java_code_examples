package collection;

import java.util.*;
import java.util.Map.Entry;

public class Telephone {

	private HashMap<String,Integer> annuaire;
	
	public Telephone(){
		annuaire = new HashMap<String,Integer>();
	}
	
	public void ajouterChanger (String s, int n){
		annuaire.put(s,n);
	}
	
	public boolean estPresentKey(String s){
		return annuaire.containsKey(s);
	}
	
	public boolean estPresentValue(int n){
		return annuaire.containsValue(n);
	}
	
	public int valeur (String s){
		return annuaire.get(s);
	}
	
	public String clé(int n){
		//retourne la 1ère clé correspondante trouvée
		for(String noms : annuaire.keySet()){
			if(annuaire.get(noms).equals(n))
					return noms;
		}
		return null;
		
	}
	
	public void affiche(){
		
		for(Entry<String, Integer> entrée : annuaire.entrySet()){
			System.out.println(entrée.getKey()+" : "+entrée.getValue());
		}
		return;
	}
	
	public void affiche2(){
		Iterator<String> it = annuaire.keySet().iterator();
		while(it.hasNext()){
			String entree = it.next();
			System.out.println(entree+" : "+annuaire.get(entree));
		}
		
	}
	
}
