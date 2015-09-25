
public class Amis {
	
	
	public static void main (String[]args){
		System.out.println(sommeDiviseursStricts(10));
		System.out.println(sontAmis(1210, 1194));
		System.out.println(sommeDiviseursStricts(6));
		System.out.println(estParfait(6));
		
		
	}
	
	
	static int sommeDiviseursStricts(int n){
		int somme=0;
		for(int i=1;i<=n;i++){
			if(n%i==0&&i!=n)
				somme+=i;
		}
		return somme;
				
	}
	
	static boolean sontAmis(int a, int b){
		return (sommeDiviseursStricts(a)==b && sommeDiviseursStricts(b)==a);
	}
	
	
	static boolean estParfait(int n){
		return (sommeDiviseursStricts(n)==n);
	}

}
