
public class Amstrong {
	
	
	private int nbre;
	
	public Amstrong(int n){
		nbre=n;
	}
	
	public boolean estAmstrong(){
		int x=nbre;
		int nbre2=0;
		while(x>0){
			nbre2+=Math.pow(x%10,nbreChiffres());
			x/=10;
		}
		
		return (nbre==nbre2);
	}
	
	public boolean estAmstrong2(){
		int x=nbre;
		int nbre2=0;
		while(x>0){
			int y=x%10,z=1;
			while(z<nbreChiffres()){
				y*=(x%10);
				z++;
			}
			nbre2+=y;
			x/=10;
		}
		return (nbre==nbre2);
	}
	
	public int nbreChiffres(){
		int n=0,x=nbre;
		while(x>0){
			x/=10;
			n++;
		}
		return n;
	}

}
