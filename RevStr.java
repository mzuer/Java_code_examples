package reverse_string;

public class RevStr {
	
	private String s;
	
	public RevStr(String s){
		this.s=s;
	}
	
	public String reverse(){
		String s2="";
		
		for(int i=s.length()-1;i>=0;i--){
			s2+=s.charAt(i);
		}
		return s2;
		
	}

}
