package polymorphisme;

public abstract class Plantes extends Organisme{
	
	protected int nbreFleurs;
	
	abstract public void milieu ();
	
	public Plantes(String nom, int nbreFlles){
		super(nom);
		this.nbreFleurs=nbreFlles;
	}
	
	public void particularite(){
		System.out.println("plante!");
		return;
	}

}
