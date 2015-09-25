package ex95_eyrolles;

public class Chemin3 {

	public static void main (String[]args){
		
		f(true);System.out.println("après f(true)");
		f(false);System.out.println("après f(false)");
		
	}
	
	public static void f (boolean ret){
		
		try{
			A a = new A(1);
			System.out.println("ce message apparait-il");
			if(ret)
				return;
		}
		catch (Erreur e){
			System.out.println("**Dans f-exception Erreur");
			if(ret)return;
		}
		finally{
		System.out.println("suite f");
		}
	}
	
}
/*Resultat : 
**Dans f-exception Erreur
suite f
après f(true)
**Dans f-exception Erreur
suite f
après f(false)

*/

