package premier;

public class EstPremier {
	
	public static void main (String[] args){
		
		System.out.println(estPremier(28));
		
	}
	
	
	public static boolean estPremier(int x){
		for(int i=2;i<Math.sqrt(x)+1;i++){
			if(x%i==0)
				return false;
		}
		return true;		
	}

}
