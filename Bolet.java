package polymorphisme;

public class Bolet extends Champignons implements Foret{

	public Bolet (String nom, boolean comestible){
		super(nom, comestible);
	}
	
	
	public void typeForet(){
		System.out.println("feuillus");
	}
	
}
