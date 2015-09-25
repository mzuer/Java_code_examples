//MAI 2009
package ex4;

import java.util.ArrayList;

public class Accumulator {
	
	private ArrayList<Double> nombres;
	
	public Accumulator(){
		nombres = new ArrayList<Double> ();
	}

	public void addNbres(double n){
		nombres.add(n);
	}
	
	public double mean(){
		double total=0;
		for(double nbre : nombres){
			total+=nbre;
		}
		return total/nombres.size();
	}
	
	public double min(){
		int index=0;
		double min = nombres.get(index);
		
		while(index<nombres.size()){
			if(min>nombres.get(index)){
				min=nombres.get(index);			
			}
			index++;
		}
		return min;
		}
	
	public double max(){
		int index=0;
		double max = nombres.get(index);
		
		while(index<nombres.size()){
			if(max<nombres.get(index)){
				max=nombres.get(index);			
			}
			index++;
		}
		return max;
		}

}

