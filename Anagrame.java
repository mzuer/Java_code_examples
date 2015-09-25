
public class Anagrame {
	
	
	private String s1;
	
	public Anagrame(String s){
		this.s1=s;
	}
	
	public boolean estAnagrame(String s2){
		
		String newS1=epure(s1);
		String newS2=epure(s2);
		
		System.out.println(newS1);
		System.out.println(newS2);
		
		if(newS1.length()!=newS2.length())
			return false;
		
		int trouve=0;
		
		for(int i=0;i<newS1.length();i++){
			for(int j=0;j<newS2.length();j++){
				if(newS1.charAt(i)==newS2.charAt(j)){
					trouve=1;
					break;
				}
			}
			if(trouve==0)
				return false;
		}
		
		return true;

		
	}
	
	public String epure(String s){
		
		String newS="";
		
		for(int i=0;i<s.length();i++){
			if(Character.isLetter(s.charAt(i))) 
				newS+=s.charAt(i);
		}
		
		return newS.toLowerCase();
		
	}

}
