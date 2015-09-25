package collection;

import java.util.*;

public class Chiffre {

	private ArrayList<Integer> chiffres;
	
	public Chiffre(){
		chiffres = new ArrayList<Integer>();
		
	}
	
	public void ajouter(int d){
		chiffres.add(d);
	}
	
	public void affiche(){
		for(int i : chiffres)
			System.out.print(i+"  ");//chiffres.get(i));
	}
	
	
	public void affiche1(){
		for(int i=0;i<chiffres.size();i++)
			System.out.print(chiffres.get(i)+"  ");
	}
	
	public void affiche2(){
		Iterator it = chiffres.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}
	
	
	public void supprime (int n ){
		Iterator it = chiffres.iterator();
		while(it.hasNext()){
			int i = (int) it.next();
			if(i==n)
					it.remove();
		}
	}
	
	public boolean estPresent(int n){
		return chiffres.contains(n);
	}
	
	public int somme(){
		int somme = 0;
		for (Integer i : chiffres){
			somme+=i;
		}
		return somme;
	}
	
	public int somme1(){
		int somme = 0;
		Iterator<Integer> it = chiffres.iterator();
		while(it.hasNext()){
			somme+=it.next();
		}
		return somme;
	}
	
	public int somme2(){
		int somme=0;
		for(int i=0;i<chiffres.size();i++)
			somme+=chiffres.get(i);
		return somme;
	}
}
