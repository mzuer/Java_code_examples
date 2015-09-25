package ex4;

public class Automaton2 {
	
	private boolean[] automate;
	
	public Automaton2(boolean[] initial){
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
	
	public void erreur(){
		
		boolean[] t1 = automate;
		
		System.out.println("pos 5 :"+automate[5]);
		
		for(int i=0;i<automate.length;i++){
			
			System.out.println("tour"+i+" pos 5 :"+automate[5]);
			
			int indicePrécédent=(i+automate.length-1)%automate.length;
			boolean précédent = automate[indicePrécédent];
			int indiceSuivant=(i+automate.length+1)%automate.length;
			boolean suivant = automate[indiceSuivant];
			
			System.out.println(indicePrécédent+":"+précédent+"  "+indiceSuivant+":"+suivant);
			
			if(automate[i]){
		//elle devient passive si ses 2 voisins sont ''true''
					if(précédent && suivant){
						System.out.println("index"+i+"true à gauche et droite");
						t1[i]=false;
					}
		//dans tous les autres cas, elle reste active
					else{
						t1[i]=true;
					}
			
			}
			print();
		}
		automate=t1;
		
	}	
}
