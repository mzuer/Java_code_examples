package tableaux;

public class PetitDiviseur {

	public static int ppd (int n){
		
		for(int d=2;d<=n;d++){
			if(n%d==0)
				return d;
		}
		return 0;
			}
	
	public static int ppd2 (int n){
		int d;
		for(d=2;d<=n;d++){
				if(n%d==0){
					break;
				}
		}
		return d;
	}
	
}
