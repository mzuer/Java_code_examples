//JUIN 2006
package ex4;
//représenter et opérer sur les nombres complexes
public class NbreComp {

	private double reel;
	private double imag;

	public NbreComp(double reel, double imag){
		this.reel=reel;
		this.imag=imag;
	}
	
	public double getReel(){
		return reel;
	}
	
	public double getImag(){
		return imag;
	}
	
	public NbreComp add(NbreComp nbre2){
		return new NbreComp(reel+nbre2.reel,imag+nbre2.imag);
	}
	
	public NbreComp mult(NbreComp nbre2){
		return new NbreComp(reel*nbre2.reel-imag*nbre2.imag,imag*nbre2.reel+reel*nbre2.imag);
	}

	public String toString(){
		return ""+reel+"+"+imag+"i";
	}
	
}
