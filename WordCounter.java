package wc;

import java.util.*;

public class WordCounter {
	
	private HashMap<String, Integer> tabOcc;
	private ArrayList<String> tabMots;
	
	
	public WordCounter(){
		tabOcc = new HashMap<String, Integer> ();
		tabMots = new ArrayList<String>();
	}
	
	public void consumeTexte(String s){
		
		StringTokenizer sT = new StringTokenizer(s);
		
		while(sT.hasMoreTokens()){
			tabMots.add(sT.nextToken());
		}
		
	}
	
	public void afficheAll(){
		for(String i:tabMots)
			System.out.println(i);			
	}
	
	public void consumeMot(String s){
		tabOcc.put(s, null);
	}
	
	public void mettreAJour(){
		
		Iterator<String> it = tabOcc.keySet().iterator();
		while(it.hasNext()){
			String s = it.next();
			int occurence=0;
			for(String i:tabMots){
				if(s.equals(i))
					occurence++;
			}
			tabOcc.put(s,occurence);
		}
	}
	
	public int getOccurences(String word){
		return tabOcc.get(word);
	}

}
