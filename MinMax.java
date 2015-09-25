package minMax;

public class MinMax {
	
	private int[] tab;
	
	public MinMax(int[]tab){
		this.tab=tab;
	}
	
	public void findMin(){
		
		int min=tab[0];
		
		for(int i:tab){
			if(i<min){
				min=i;
			}
		}
		System.out.println(min);
	}
	public void findMax(){
		
		int max=tab[0];
		
		for(int i:tab){
			if(i>max){
				max=i;
			}
		}
		System.out.println(max);
	}
}
