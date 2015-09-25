package ex;

import java.util.ArrayList;

import java.util.Iterator;

public class ListeAchats {
	
	private ArrayList<String> achats;
	
	public ListeAchats(){
		achats = new ArrayList<String>();
	}
	
	public ListeAchats(String[] achats){
		
		this.achats = new ArrayList<String>();
		
		for(String s : achats)
			this.achats.add(s);
		
	}
	
	public void affiche(){
		for(String s : achats)
			System.out.println(s);
	}
	
	public void ajouter (String s){
		achats.add(s);
	}
	
	public void supprimer (String s){
		achats.remove(s);
	}

	public void enlever (String s){
		s=s.toLowerCase();
		int supprime=0;
		
		Iterator it = achats.iterator();
		
		while(it.hasNext()){
			String n = (String)it.next();
			if(n.toLowerCase().equals(s)){
				System.out.println(n);
				it.remove();
				supprime++;
			}
		}
		System.out.println(supprime);
	}
}
