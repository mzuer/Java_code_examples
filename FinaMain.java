package catch_return;

public class FinaMain {


	public static void main (String[]args){
		
		
		int[][]tab=new int[5][];
		tab[0][1]=5;
		
		boolean ret=true;
		boolean ret2=true;
		
		try{
			if(ret){
			A a = new A(1);
			}
		}
		catch (Erreur e){
			System.out.println("**Dans f-exception Erreur");
			if(ret2)return;
		}

		System.out.println("Après catch");
	}
}
	
/*Resultat pour ret=false, ret2=false

Après catch

 */

/*Resultat pour ret=false, ret2=true

Après catch

 */

/*Resultat pour ret=true, ret2=false

**Dans f-exception Erreur
Après catch
 
 */

/*Resultat pour ret=true, ret2=true

**Dans f-exception Erreur
 
 */
