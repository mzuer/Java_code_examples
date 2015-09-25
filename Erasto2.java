package erasto;

public class Erasto2 {

	
	private boolean tab[];
	
	public Erasto2(int n){
		
	tab=new boolean[n+1];
		
	for(int i=0;i<tab.length;i++)
		tab[i]=true;
	tab[0]=false;
	tab[1]=false;

	}
	
	
	public void affichePrem(){

        for (int i = 2; i*i < tab.length; i++){
            if (tab[i]){ 
                for (int j = i; i*j <tab.length; j++)
                    tab[i*j] = false;
            }
        }

        for (int i = 2; i <tab.length; i++){
           if (tab[i])
              System.out.print(i+"\t");
        }
    }
	
}
