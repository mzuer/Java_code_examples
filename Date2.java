package ex6;

import java.util.Random;

public class Date2 {

	private int jour, mois, an;

	public Date2(int a, int b, int c){
		 jour = a;
		 mois = b;
		 an = c;
		
	}
	
	public String toString(){
		return "Date : "+jour+"."+mois+"."+an;
	}
	
	//retourne -1 si l'objet courant est antérieur
	public int before(Date2 d2){
		
		if(an<d2.an)
			return -1;
		else if(an==d2.an && mois<d2.mois)
			return -1;
		else if(an==d2.an && mois==d2.mois && jour<d2.jour)
			return -1;
		else if(an==d2.an && mois==d2.mois && jour==d2.jour)
			return 0;
		else
			return 1;
	}
	
	
	public static void tri(Date2[] dates){
		
		Random rand = new Random();
		Date2 temp;
		
		while(!estTrie(dates)){
			int a = rand.nextInt(dates.length);
			int b = rand.nextInt(dates.length);
		
			if(a<b && dates[a].before(dates[b])==1){
				temp = dates[a];
				dates[a]=dates[b];
				dates[b]=temp;
			}
			else if(a>b && dates[a].before(dates[b])==-1){
				temp = dates[a];
				dates[a]=dates[b];
				dates[b]=temp;
			}	
			
		}
		
		for(Date2 i : dates)
			System.out.println(i);
		
	}
	
	public static boolean estTrie(Date2[] dates){
		
		for(int i=0; i<dates.length-1;i++){
			if(dates[i].before(dates[i+1])==1)
				return false;
		}
		
		return true;
	}
	
}
