package collection;

import java.util.*;

public class Personne {

	private HashSet<String> personnes;
	
	public Personne(){
		personnes = new HashSet<String>();
	}
	
	public void ajouter(String s){
		personnes.add(s);
	}
	
	public void affiche(){
		for(String nom : personnes)
			System.out.print(nom+"  ");
	}
	/*
	 * !!!! collection.get(int) => undefined for HashSet !!! 
	 * 
	public void affiche1(){
		for(int i=0;i<personnes.size();i++)
			System.out.print(personnes.get(i));
		
	}
	*/
	public void affiche2(){
		Iterator it = personnes.iterator();
		
		while(it.hasNext()){
			System.out.print(it.next()+"  ");
		}
	}
	
	public boolean estPresent(String s){
		return personnes.contains(s);
	}
}
