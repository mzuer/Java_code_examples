//JUIN 2010
package ex4;

public class Note {

	private double p;
	private double f;
	
	public Note(double p){
		this.p=p;
		this.f=Math.pow(2, (p-69)/12)*440;
	}
	
	public void getFrequency(){
		System.out.println(""+f);
	}

	public void getNbr(){
		System.out.println(""+p);
	}
	
	public boolean equals (Note note2){
		if(note2.f>f){
			if(note2.f%f==0)
				return true;
		}
		else if(note2.f<f){
			if(f%note2.f==0)
				return true;
		}
		
		else if(note2.f==f)
			return true;
		
		return false;
	}
}
