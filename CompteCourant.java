package ex;

public class CompteCourant extends CompteBancaire {
	
	private int limite;

	
	public CompteCourant(int montant, String propriétaire, int limite){
		super(montant, propriétaire);
		this.limite=limite;
	}
	
	public void ajouter(int somme){
		montant+=somme;
	}
	
	public void retirer(int somme){
		if(somme>montant)
			System.out.println("Impossible, pas autant d'argent sur le compte");
		else
			montant-=somme;
	}
	
	public String toString(){
		return super.toString()+" limite : "+limite;
	}
	
	public String essai(){
		return ""+limite;
	}
}
