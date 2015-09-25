package tri_chaine;

public class TriString {

	private String[] tabStr;
	
	public TriString(String[] tab){
		tabStr = tab;
	}
	
	public void tri(){	
		String temp;
		
		while(!estTrie()){
			for(int i=0;i<tabStr.length-1;i++){
				if(compareStr(tabStr[i],tabStr[i+1])==1){
					temp=tabStr[i];
					tabStr[i]=tabStr[i+1];
					tabStr[i+1]=temp;
				}
			}			
		}		
	}
	

	public TriString triNonDestr(){	
		String temp;
		String[]t3 =new String[tabStr.length];   //t3 stocke tabStr non trié
	
		//Si on met seulement String[]t3 = tabStr; => ça ne marche pas !!!
		//t3 aura en référence le tabStr, donc il subit les mêmes modifications
		//que tabStr subit dans le while -> à la fin tabStr=t3 ne servira à rien !!!
		
		//pour utiliser t3[i] on ne peut pas mettre seulement String[] t3;
		for(int i=0;i<tabStr.length;i++)
			t3[i]=tabStr[i];
		
		String[] tempT;
		
		while(!estTrie()){
			for(int i=0;i<tabStr.length-1;i++){
				if(compareStr(tabStr[i],tabStr[i+1])==1){
					temp=tabStr[i];
					tabStr[i]=tabStr[i+1];
					tabStr[i+1]=temp;
				}
			}			
		}
		//temp stocke le tabStr trié
		tempT=tabStr;
		this.tabStr=t3;
		t3=tempT;
		
		return new TriString(t3);
	}
	
	public boolean estTrie(){
		
		for(int i=0;i<tabStr.length-1;i++){
			if(compareStr(tabStr[i],tabStr[i+1])==1)
				return false;
		}
		return true;
		
	}
	
	public void affiche(){
		for(String s : tabStr)
			System.out.print(s+"\t");
	}
	
	//renvoie -1 si s1<s2, 1 si s1>s2 et 0 si s1==s2
	public static int compareStr(String s1, String s2){
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
	
		for(int i=0;i<s1.length()&&i<s2.length();i++){
			if(s1.charAt(i)<s2.charAt(i))
				return -1;
			else if(s1.charAt(i)>s2.charAt(i))
				return 1;
		}
		
		if(s1.length()==s2.length())
			return 0;
		
		else if (s1.length()>s2.length())
			return 1;
		
		else 
			return -1;
		
	}
	
}