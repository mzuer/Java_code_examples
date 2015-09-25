//MAI 2012
package ex5;

public class Binaire {

	/* Permet de représenter et afficher des nombres binaires 
	 * et calculer la distance de Hamming */
	
	private int nbre_dec;
	private int[] bin_inv;
	
	public Binaire(int nbre){
		this.nbre_dec=nbre;
		
		int[] bin = new int[16];			
		int n=nbre;	
		for(int i=0;i<16;i++){
			bin[i]=n%2;
			n/=2;
		}		
		
		this.bin_inv = bin;
		
	}

	//renvoie le nombre converti en binaire, format String sur 16 bits
	public String toString(){
		
		String result="";
		
		for(int i=15;i>=0;i--){
			result+=bin_inv[i];
		}
		return result;				
	}
	
	
	public int getNbre(){
		return nbre_dec;
	}

	public int[] getTabDec(){
		return bin_inv;
	}
	

	public int hamming (Binaire nbre2){

		int difference=0;
		
		for(int i=0;i<16;i++){		
			if(bin_inv[i]!=nbre2.bin_inv[i])
				difference++;		
		}
		
		return difference;
	}
	

}
