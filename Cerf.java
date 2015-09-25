package polymorphisme;

public class Cerf extends Animaux implements Foret{
	
	public Cerf (String nom, int nbrePattes){
		super(nom, nbrePattes);
	}

	public void typeForet(){
		System.out.println("Feuillus");
	}
}
