package hexaVersNum;

public class HexaNum {

	public int num;
	public String hex;
	
	private static final String digits = "0123456789ABCDEF";
	
	/*
	public HexaNum(int num){
		this.num=num;
		s = numToHexa(num);
	}
	*/
	public HexaNum(String s){
		this.hex=s;
		num = hexaToNum();
	}
	
	public HexaNum(int n){
		num = n;
		hex = numToHexa();
	}
	
	public int hexaToNum(){
		
		int coeff, puissance, dec=0;
	
		for(int i=0;i<hex.length();i++){			
			puissance = hex.length()-1-i;
			coeff=digits.indexOf(hex.charAt(i));
			int base=1;
			while(puissance>0){
				base*=16;
				puissance--;
			}
			
			dec+=coeff*base;
		}	
			return dec;		
	}
			
	public String numToHexa(){
		int dec=num;
		int index;
		char caract;
		String hex_inverse="";
		String hex="";
		
		while(dec>0){
			index = dec%16;
			caract = digits.charAt(index);
			hex_inverse+=caract;
			dec/=16;
		}
		

		for(int i=0;i<hex_inverse.length();i++){
			hex+=hex_inverse.charAt(hex_inverse.length()-1-i);
		}
		
		return hex;
	}	
}

