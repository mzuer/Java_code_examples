package ex92_eyrolles;

import java.util.*;

//Quelle sortie à l'exécution pour les valeurs saisies : 0,1,2,?

public class Chemin {
	
	public static void main(String[] args){
			
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		try{
			System.out.println("début 1er bloc try");
			if(n!=0) 
				throw new Except(n);
			System.out.println("fin 1er bloc try");
		}
		catch (Except e){
			System.out.println("catch 1-n="+e.n);
		}
		System.out.println("Suite programme");
		try{
			System.out.println("début 2nd bloc try");
			if(n!=1) 
				throw new Except(n);
			System.out.println("fin 2nd bloc try");
		}
		catch (Except e){
			System.out.println("catch 2-n="+e.n);
			return;
		}
		finally{
		System.out.println("fin programme");
		}
	}

}
