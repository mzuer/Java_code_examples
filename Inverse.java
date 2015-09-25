package reverseNombre;

public class Inverse {
	
	private int n;
	
	public Inverse(int n){
		this.n=n;
	}
	
	public int inverse(){
		int x = n,result=0;
		int i = nbreChiffres();
		int a;
		
		while(x>0){
		a =	x%10;
		result+=a*Math.pow(10,i-1);
		x/=10;
		i--;
		}
		return result;
		
	}
	
	public int inverse2(){
		int x = n,result=0;
	
		while(x!=0){
			result*=10;
			result+=x%10;
			x/=10;
		}
		return result;
		
	}
	
	public int nbreChiffres(){
		int x = n,a=0;
		while(x>0){
			x/=10;
			a++;
		}
		return a;
	}

}
