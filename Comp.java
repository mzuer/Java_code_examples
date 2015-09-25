package compareStr;

public class Comp {

	public static void main(String[] args){
		System.out.println(compareChaine("qaello","hellom"));
		
	}
	
	public static int compareChaine(String s1, String s2){
		
		for(int i=0;i<s1.length()&&i<s2.length();i++){
			if(s1.charAt(i)!=s2.charAt(i))
				return s1.charAt(i)-s2.charAt(i);
		}
		if(s1.length()==s2.length())
			return 0;
		if(s1.length()<s2.length())
			return -1;
		else 
			return 1;
		
	}
	
	
}
