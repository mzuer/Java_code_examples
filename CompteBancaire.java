package ex;

public class CompteBancaire {
	
	protected int montant;
	protected String propriétaire;
	protected int essai = 5;
	
	public CompteBancaire(int montant, String pro){
		this.montant=montant;
		propriétaire=pro;
	}
	
	public String toString(){
		return "Propriétaire : "+propriétaire+" montant : "+montant;
	}
	
	public void essai(){
		System.out.println(propriétaire);
	}
}
