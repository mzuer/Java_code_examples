//MAI 2008
package ex5;

public class Vecteur {
	
	private double[] vecteur = new double[3];
	
	public Vecteur(double[] vecteur){
		this.vecteur = vecteur;
	}
	
	public double[] getVecteur(){
		return vecteur;
	}
	
	public Vecteur addition(Vecteur vecteur2){
		double[] result = new double[3];
		for(int i=0;i<result.length;i++){
			result[i]=vecteur[i]+vecteur2.getVecteur()[i];
		}	
		return new Vecteur(result);
	}
	
	public void ajout(Vecteur vecteur2){
		for(int i=0;i<vecteur.length;i++){
			vecteur[i]+=vecteur2.getVecteur()[i];
		}	
	}
	
	public void multiplicationScalaire(int n){
		for(int i=0;i<vecteur.length;i++){
			vecteur[i]*=n;
		}	
	}
	
	public Vecteur multiplication(Vecteur vecteur2){
		double[] result =  new double[vecteur.length];
		for(int i=0;i<vecteur.length;i++){
			result[i] = vecteur[i]*vecteur2.getVecteur()[i];
		}
		return new Vecteur(result);
	}
	
	public boolean equals (Vecteur vecteur2){
		for(int i=0;i<vecteur.length;i++){
			if(vecteur[i]!=vecteur2.getVecteur()[i])
				return false;
		}
		return true;
		}
	
	public String toString(){
		String s="";
		for(int i=0;i<vecteur.length;i++)
			s+=(""+vecteur[i]+"\t");
		return s;
	}
	
}
