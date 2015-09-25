//JUIN 2007
package ex6;

import java.util.Random;

public class Date {

	private int jour;
	private int mois;
	private int an;
	
	public Date(int jour, int mois, int an){
		this.jour=jour;
		this.mois=mois;
		this.an=an;
	}
	
	public int getAn(){
		return an;
	}
	public int getMois(){
		return mois;
	}
	public int getJour(){
		return jour;
	}
	//retourne "true" si date courante vient avant date2
	public boolean before(Date date2){
		if(an<date2.getAn() || (an==date2.getAn()&&mois<date2.getMois())
				||(an==date2.getAn()&&mois==date2.getMois()&&jour<date2.getJour()))
			return true;

		else
			return false;			
	}
	
	public String toString(){
		return ""+jour+"."+mois+"."+an;
	}
	
	public static boolean estTrie (Date[] dates){
		
		for(int i=0;i<dates.length-1;i++){
			if(!(dates[i].before(dates[i+1])))
				return false;
		}
		return true;
	}
	
	public static void tri (Date[] dates){
		
		Random randN = new Random();
		Date temp;
		
		while(!estTrie(dates)){
			 int r1 = randN.nextInt(dates.length);
			 int r2 = randN.nextInt(dates.length);	 
			 if(r2<r1&&dates[r1].before(dates[r2])){
				 temp=dates[r1];
				 dates[r1]=dates[r2];
				 dates[r2]=temp;
			 }
		}
		
		for(Date date:dates){
			System.out.println(date);
		}
		
	}
}
