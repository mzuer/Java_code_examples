package divEnt;

public class DivEnt {
	
	public static void main (String[]args){
		
		System.out.println(divisionEntiere(13,6));
		
	}
	
	public static String divisionEntiere(int a, int b){
		// resultat de a/b entière
		int i=0;
		while (a>=b){
			a-=b;
			i++;
		}
		return i+" et reste : "+a;
		
	}

}
