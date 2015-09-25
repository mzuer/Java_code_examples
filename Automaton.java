package ex4;

public class Automaton {
	
	private boolean[] automate;
	
	public Automaton(boolean[] initial){
		automate = initial;
	}
	
	public void next(){
		boolean[] t1 = automate;
		
		for(int i=0;i<automate.length;i++){
			
			int indicePrécédent=(i+automate.length-1)%automate.length;
			boolean précédent = automate[indicePrécédent];
			int indiceSuivant=(i+automate.length+1)%automate.length;
			boolean suivant = automate[indiceSuivant];
			
			
			/*
			 * CASE COURANTE ACTIVE (true)
			 */

			if(automate[i]){
				//elle devient passive si ses 2 voisins sont ''true''
					if(précédent && suivant)
						t1[i]=false;
				
		//dans tous les autres cas, elle reste active
					else
						t1[i]=true;
			
			}
			/*
			 * CASE COURANTE INACTIVE (false)
			 */
			else if(!automate[i]){
		//si ces 2 voisins sont ''false'', elle reste inactive		
					if(!précédent && !suivant)
						t1[i]=false;
		//dans tous les autres cas, devient 'true'		
					else
						t1[i]=true;			
			}
			
			
			
		}
		automate=t1;
		return;
		
	}
	
	public void print(){

		for(boolean i : automate)
			System.out.print(i+"\t  ");
		
	}
	
	
	public Automaton nextAuto(){
		boolean[] t1 = automate;
		
		for(int i=0;i<automate.length;i++){
			
			int indicePrécédent=(i+automate.length-1)%automate.length;
			boolean précédent = automate[indicePrécédent];
			int indiceSuivant=(i+automate.length+1)%automate.length;
			boolean suivant = automate[indiceSuivant];
			
			
			/*
			 * CASE COURANTE ACTIVE (true)
			 */

			if(automate[i]){
				//elle devient passive si ses 2 voisins sont ''true''
					if(précédent && suivant)
						t1[i]=false;
				
		//dans tous les autres cas, elle reste active
					else
						t1[i]=true;
			
			}
			/*
			 * CASE COURANTE INACTIVE (false)
			 */
			else if(!automate[i]){
		//si ces 2 voisins sont ''false'', elle reste inactive		
					if(!précédent && !suivant)
						t1[i]=false;
		//dans tous les autres cas, devient 'true'		
					else
						t1[i]=true;			
			}
			
			
			
		}
		return new Automaton(t1);
		
	}

}
