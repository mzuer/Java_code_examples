package hexaVersNum;

public class BinNum {

	private int dec;
	private int[] bin;
	
	public BinNum(int n){
		dec=n;
		bin=toBin();
	}
	
	public BinNum(int[] bin){
		this.bin=bin;
		dec=toDec();
	}
	int toDec(){
		int[] binaire = bin;
		int coeff,nbre=0;
		
		for(int i=0;i<16;i++){
			coeff = binaire[15-i];
			int n=i;
			int base=1;
			while(n>0){
				base*=2;
				n--;
			}
		nbre +=coeff*base;				
		}
		
		return nbre;
			
	}
	
	public int[] toBin(){
		int nombre = dec;
		int[] binaire = new int[16];
		
		for(int i=15;i>=0;i--){
			binaire[i]=nombre%2;
			nombre/=2;
		}
		return binaire;		
	}
	
	public int[] getBin(){
		return bin;
	}
	
	public int distHam(BinNum b2){
		int distance=0;
		for(int i=0;i<bin.length;i++){
			if(bin[i]!=b2.getBin()[i])
				distance++;
		}
		return distance;	
	}
	
	public String toString(){
		String s="";
		for(int i=0;i<16;i++)
			s+=bin[i];
		
		return s;
	}
	
}
