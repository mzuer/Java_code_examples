package polymorphisme;

public class Champignons extends Organisme {

	protected boolean comestible;
	
	public Champignons (String nom, boolean comestible){
		super(nom);
		this.comestible=comestible;
	}

	public void toxique(){
		if(comestible)
			System.out.println("non toxique");
		else
			System.out.println("TOXIQUE");
	}
	
}
